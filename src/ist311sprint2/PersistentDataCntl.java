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
public class PersistentDataCntl {

    private static PersistentDataCntl thePersistentDataCntl;
    private static UserList userList;
    private User loggedInUser;
    private final String fileName;
    private final Gson gson;
    private final Type type;

    private PersistentDataCntl() {
        gson = new Gson();
        type = new TypeToken<ArrayList<User>>() {
        }.getType();
        fileName = "UserList.txt";
        makeUserList();
        //saveUserList();
    }

    public static PersistentDataCntl getPersistentDataCntl() {
        if (thePersistentDataCntl == null) {
            thePersistentDataCntl = new PersistentDataCntl();
        }
        return thePersistentDataCntl;
    }

    public void setLoggedInUser(User userLoggingIn) {
        loggedInUser = userLoggingIn;
    }

    private void makeUserList() {
        if (userList == null) {
            userList = new UserList();
            //getSavedUserList();
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void getSavedUserList() {
        final File inputFile = new File(fileName);
        String nextLine;
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                nextLine = in.nextLine();
                ArrayList<User> fromJson = gson.fromJson(nextLine, type);
                userList.setUserList(fromJson);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("StudentList Error: " + ex.getMessage());
        }
    }

    public final void saveUserList() {
        String json = gson.toJson(userList.getUserList(), type);
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

    public UserList getUserList() {
        return userList;
    }
}
