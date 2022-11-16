package Exception;

import java.io.*;


public class CheckedExp {
    public static void main(String[] args) {
        readFile("C:\\Users\\Oraib.Maswadeh\\IdeaProjects\\untitled\\src\\test.txt");
    }

    //automatically need throws FileNotFoundException
    static void readFile (String path)  {

        try {
            FileInputStream reader = new FileInputStream(path);
            System.out.println("file content : ");
            int i =0;
            while ((i=reader.read())!= -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
