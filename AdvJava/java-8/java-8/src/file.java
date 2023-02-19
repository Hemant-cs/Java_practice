import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        File file = new File("Hemant.txt");

        //code to create file

//        try{
//            file.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("unable to Create file");
//        }

        //code to write to a file

//        try {
//            FileWriter fileWriter = new FileWriter("Hemant.txt");
//            fileWriter.write("this is our first line \nskflsdfsjsdhjkfjsdfkjshfksdfsdhkjsdkfhskhksdbshsksdkjsdg\njkcsdgkugskcgdskjcbskjgsdkucsdjkgsdkjhsdksdhkjsdbksdjjkdskjjsjsdkcshscsckjsdgckjsgkcsdgcksgkjk");
//            fileWriter.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //code to read a file

        File myFile = new File("Hemant.txt");
        try{
            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

//        delete any file

//        File myFile1 = new File("Hemant.txt");
//        if(myFile1.delete()){
//            System.out.println("Deleted Successfully : "+myFile1.getName());
//        }else{
//            System.out.println("some problem occured while deleting");
//        }


    }
}
