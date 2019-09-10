import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var studentList = new ArrayList<String>();
        String student = "";
        Scanner reader = new Scanner (System.in);

        while (!student.toUpperCase().equals("DONE")){
            System.out.println("Enter the name of the name of a student or type 'done' to close the list:");
            student = reader.nextLine();
            if (!student.toUpperCase().equals("DONE"))
            studentList.add(student);
        }

        for (String studentPrint: studentList){
            System.out.println(studentPrint);
        }

    }
}
