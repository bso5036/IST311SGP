/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bso5036
 */
public class CanvasWrapper {

    private static CanvasWrapper theCanvasWrapper;
    private ArrayList<Assignment> assignmentList;
    private ArrayList<Course> hardcodedList;
    private final String fileName;
    private final Gson gson;
    private final Type type;

    private CanvasWrapper() {
        gson = new Gson();
        type = new TypeToken<ArrayList<Course>>() {
        }.getType();
        fileName = "CanvasGrades.txt";
        hardcodedList();
        setAssignments();
    }

    private void hardcodedList() {
        hardcodedList = new ArrayList<>();
        hardcodedList.add(new Course("IST 311", "Steven Haynes", 95.34));
        hardcodedList.add(new Course("IST 242", "Fred Fonseca", 86.63));
        hardcodedList.add(new Course("IST 420", "David Fusco", 87.36));
        hardcodedList.add(new Course("CMPSC 122", "Roger Christman", 69.51));
        hardcodedList.add(new Course("IST 440W", "Michael Hills", 92.23));
        System.out.println(hardcodedList);
    }

    public static CanvasWrapper getCanvasWrapper() {
        if (theCanvasWrapper == null) {
            theCanvasWrapper = new CanvasWrapper();
        }
        return theCanvasWrapper;
    }

    //reads the course JSON list from CanvasGrades.txt and adds the the list to the user profile of the called user
    public void captureGrades(UserProfile userProfile) {
        final File inputFile = new File(fileName);
        String nextLine;
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                nextLine = in.nextLine();
                ArrayList<Course> fromJson = gson.fromJson(nextLine, type);
                userProfile.getCourseList().setCourses(fromJson);
                addAssignments(userProfile);
                PersistentDataCntl.getPersistentDataCntl().saveUserList();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("StudentList Error: " + ex.getMessage());
        }
    }

    //use this method to make a file with the JSON from the hardcoded list
    public void createJson() {
        String json = gson.toJson(hardcodedList, type);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "utf-8"))) {
            writer.write(json);
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    private void setAssignments(){
        assignmentList = new ArrayList<>();
        assignmentList.add(new Assignment("Assignment1", 100.0, 97.0));
        assignmentList.add(new Assignment("Assignment2", 100.0, 87.0));
        assignmentList.add(new Assignment("Assignment3", 100.0, 84.0));
        assignmentList.add(new Assignment("Assignment4", 100.0, 92.0));
        assignmentList.add(new Assignment("Assignment5", 100.0, 90.0));
        assignmentList.add(new Assignment("Assignment6", 100.0, 94.0));
        assignmentList.add(new Assignment("Assignment7", 100.0, 83.0));
        assignmentList.add(new Assignment("Assignment8", 100.0));
        assignmentList.add(new Assignment("Assignment9", 100.0));
        assignmentList.add(new Assignment("Assignment10", 100.0));
    }
    
    private void addAssignments(UserProfile userProfile){
        for(Course course : userProfile.getCourses()){
            course.setAssignments(assignmentList);
        }
    }
}
