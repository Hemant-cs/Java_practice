
//class phone{
//    @Deprecated
//    void call(String name){
//        System.out.println("Calling... "+name);
//    }
//}
//
//interface myInt{
//    void display();
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PsAdvanceJava{
//    @SuppressWarnings("Deprecated")
    public static void main(String[] args) throws IOException {
//        phone callMom = new phone();
//        callMom.call("Maa");
//        myInt i = new myInt() {
//            @Override
//            public void display() {
//                System.out.println("Displaying....");
//            }
//        };
//        myInt i = new myInt() {
//            @Override
//            public void display() {
//                System.out.println("display");
//            }
//        };
//
////        myInt i = ()-> System.out.println("Displaying again....");
//        i.display();

//        File file = new File("table.txt");
//        try{
//            file.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        String table = "";

        for(int i =2; i<=9;i++){
        try{
            FileWriter fileWriter = new FileWriter("table.txt");
            for(int j = 1; j<=10; j++){
                table += i + " X " + j +" = "+i*j;
                table += "\n";
            }
            fileWriter.write(table);
            fileWriter.close();


        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Unable to write");
        }
            table += "\n\n  ";


        }




    }
}
