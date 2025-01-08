import java.util.*;
public class arraysAndOperations{
    public static void main(String[] args) {
        /*syntax to declare the array that contains marks of 5 students
        1. int [] marks=new int[5];-> first method to declare the array
        2. int [] marks;
           marks=new int[5];-> Second method to declare the array
        3. int [] marks={100,80,54,96,45}; -> third  method to declare the array
        i prefer third method because it is easy to understand 
*/
        int [] marks={100,80,54,96,45};
        System.out.println("The marks of the student 5 is:"+marks[4]);
       // System.out.println("The marks of the student 11 is:"+marks[11]); this statement throws an error because we cannot access the values beyond the size declared
       
        

        
    }
}