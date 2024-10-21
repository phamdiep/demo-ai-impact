package com.example.filecreation;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateFile {
    private static final Logger logger = Logger.getLogger(CreateFile.class.getName());
    private static final boolean DEBUG = false; // Ensure this is false before production

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                if (DEBUG) {
                    logger.log(Level.INFO, "File created: " + myObj.getName());
                }
            } else {
                if (DEBUG) {
                    logger.log(Level.INFO, "File already exists.");
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred.", e);
        }
    }
}
