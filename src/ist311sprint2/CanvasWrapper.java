/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bso5036
 */
public class CanvasWrapper {

    private User user;
    private ArrayList<Course> courseList;
    private final String fileName;
    private Gson gson;
    private final Type type;

    public CanvasWrapper(User inUser) {
        user = inUser;
        gson = new Gson();
        type = new TypeToken<ArrayList<Course>>() {
        }.getType();
        fileName = "CanvasGrades.txt";
    }

    private void captureGrades() {
        final File inputFile = new File(fileName);
        String nextLine;
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                nextLine = in.nextLine();
                ArrayList<Course> fromJson = gson.fromJson(nextLine, type);
                //userList.setUserList(fromJson);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("StudentList Error: " + ex.getMessage());
        }
    }
}
