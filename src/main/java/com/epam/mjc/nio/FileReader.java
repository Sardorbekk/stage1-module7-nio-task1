package com.epam.mjc.nio;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class FileReader {
    public Profile getDataFromFile(File file) {
        try(BufferedReader bufferedReader=new BufferedReader(new java.io.FileReader(file))) {
            String nameLine = bufferedReader.readLine();
            String ageLine = bufferedReader.readLine();
            String emailLine = bufferedReader.readLine();
            String phoneLine = bufferedReader.readLine();
            String name = nameLine.split(": ")[1];
            Integer age = Integer.parseInt(ageLine.split(": ")[1]);
            String email = emailLine.split(": ")[1];
            Long phone = Long.parseLong(phoneLine.split(": ")[1]);
            return new Profile(name,age,email,phone);
        } catch (IOException e) {
            e.printStackTrace();
        }return new Profile();}}
