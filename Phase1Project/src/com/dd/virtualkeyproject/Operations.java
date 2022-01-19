package com.dd.virtualkeyproject;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.dd.virtualkeyproject.FileUtility;
public class Operations implements FileUtility {
 List<String> retrieve= new ArrayList<String>();
 File[] files = new File("C:\\Users\\k\\eclipse-workspace\\Phase1Project").listFiles();
 @Override
 public void showAllFiles() {
  for(File file : files) {
   if(file.isFile()) {
    retrieve.add(file.getName());
    System.out.println(file.getName());
   }
  }
  retrieve.forEach(System.out::println);
 }
 @Override
 public void addFile() {
  System.out.println("Enter the file that you want to add in directory:");
  //sc.next();
  Scanner scan=new Scanner(System.in);
  String filename=scan.nextLine();
  File F= new File(filename);
  try {
   if(F.createNewFile()) {
    System.out.println(filename+" file is added to the directory");
    Desktop.getDesktop().edit(F);
   }
   else {
    System.out.println("This file is already in the directory");
   }
  } catch (IOException e) {
   e.printStackTrace();
  } 
 }
 @Override
 public void deleteFile() {
  System.out.println("Enter the file that you want to delete in the directory : ");
  //sc.next();
  Scanner scan=new Scanner(System.in);
  String filename=scan.nextLine();
  File F= new File(filename);
  if(F.delete())
   System.out.println(filename+" is Deleted");
  else
   System.out.println("File Not Found in the directory");
 }
 @Override
 public void searchFile() {
  try { 
   Scanner scan= new Scanner(System.in);
   File directory = new File("C:\\Users\\k\\eclipse-workspace\\Phase1Project");
   System.out.println("Enter the file name that you want to search in the directory : ");
   String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                //System.out.println(name);
                if (name.equals(fileName)) {
                       System.out.println("The filename "+fileName+" is present in the directory");
            File f= new File(fileName);
            Scanner sc1 = new Scanner(f);
            while(sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
            }
           flag=1; 
                }
   }
        if(flag==0) {
         System.out.println("File not found in the directory");
        }
  }catch(FileNotFoundException ex) {
   System.out.println("File not found");
  }
 }
 }