package freeit.lesson_12;

import java.io.File;

public class Task36_met {
    public static void main(String[] args) {

        File directory = new File("D:\\");

        File[] arrayOfFiles = directory.listFiles();

        System.out.println("Directories: ");
        for(int i = 0; i < arrayOfFiles.length; i++) {
            if(arrayOfFiles[i].isDirectory()) {
                System.out.println("\t" + arrayOfFiles[i]);
            }
        }

        System.out.println("Files: ");
        for(int i = 0; i < arrayOfFiles.length; i++) {
            if(arrayOfFiles[i].isFile()) {
                System.out.println("\t" + arrayOfFiles[i]);
            }
        }
    }
}
