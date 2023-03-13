package com.epam.mjc.nio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReader {
    public Profile getDataFromFile(File file) {
        try {
            java.io.FileReader fileReader=new java.io.FileReader("C:\\Users\\Sardor.me\\IdeaProjects\\stage1-module7-nio-task1\\src\\main\\resources\\Profile.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String nameLine = bufferedReader.readLine();
            String ageLine = bufferedReader.readLine();
            String emailLine = bufferedReader.readLine();
            String phoneLine = bufferedReader.readLine();
            String name = nameLine.split(": ")[1];
            Integer age = Integer.parseInt(ageLine.split(": ")[1]);
            String email = emailLine.split(": ")[1];
            Long phone = Long.parseLong(phoneLine.split(": ")[1]);
            /*String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }*/
            bufferedReader.close();
            return new Profile(name,age,email,phone);
        } catch (FileNotFoundException e) {
            System.out.println("404 not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return new Profile();}}
