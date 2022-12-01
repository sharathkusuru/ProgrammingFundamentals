package fundamentals.loop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int count =4;
        float totalMarks =0,percetage,average;
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};

        String[] students = {"sharath", "varun", "raghu"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");
        String selectedStudentName = scanner.nextLine();
       if (selectedStudentName.equals("sharath")){
           System.out.println("grades is :"+Arrays.toString(studentOneGrades));
           for(int i=0;i<count;i++){
               totalMarks += studentOneGrades[i];
           }
           System.out.println("totalMaraks is:"+totalMarks);
           percetage =(totalMarks/400)*100;
           System.out.println("percenatge is :"+ percetage);


       }
       if(selectedStudentName.equals("varun")){
           System.out.println("grade is :"+Arrays.toString(studentTwoGrades));
           for(int i=0;i<count;i++){
               totalMarks += studentTwoGrades[i];
           }
           System.out.println("totalMaraks is:"+totalMarks);
           percetage =(totalMarks/400)*100;
           System.out.println("percenatge is :"+ percetage);

       }
       if(selectedStudentName.equals("raghu")){
           System.out.println("grade is :"+Arrays.toString(studentThreeGrades));
           for(int i=0;i<count;i++){
               totalMarks += studentThreeGrades[i];
           }
           System.out.println("totalMaraks is:"+totalMarks);
           percetage =(totalMarks/400)*100;
           System.out.println("percenatge is :"+ percetage);
       }
        System.out.print("The student Grade is: ");
        percetage =(totalMarks/400)*100;
        if(percetage>=80)
        {
            System.out.print("A");
        }
        else if(percetage>=60 && percetage<80)
        {
            System.out.print("B");
        }
        else if(percetage>=40 && percetage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }

    }
}
