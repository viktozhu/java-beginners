package com.goit.Lesson8;

import java.io.*;

/**
 * Created by 1 on 24.05.2015.
 */
public class Main {

    public static final String IN_FILE_PATH = "src\\com\\goit\\Lesson8\\input.txt";
    public static final String OUT_FILE_PATH = "src\\com\\goit\\Lesson8\\output.txt";

    public static void readTheFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
// Read File
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(IN_FILE_PATH));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }

// handle exception here, because we have not handled it before
        try {
            readTheFile(IN_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

// Write to file
        String firstLine = "The first line\n";
        String secondLine = "The second line\n";
        Writer writer =  new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(OUT_FILE_PATH)));
        writer.append(firstLine);
        writer.append(secondLine);
        writer.close();

//File path
        // get current dir
        String currentDir = System.getProperty("user.dir");
        String linuxStyle = "dir/somefile.txt";
        String windowsStyle = "dir\\somefile.txt";
        File file = new File(currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());

        file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());

    }
}
