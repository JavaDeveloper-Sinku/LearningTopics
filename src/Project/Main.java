package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        //Total Number of Student
        System.out.print("Enter the total number of students :");
        long TotalStudents = sc.nextLong();

        //Total Number of Class
        System.out.print("Enter the total number of Class's :");
        long TotalClass = sc.nextLong();

        //Per Class Room Sheet Present
        System.out.print("Enter the Per Class Room Sheet Present :");
        Long PerClassSheet = sc.nextLong();


        System.out.println("Total class room allocated");

        long result = ClassRoomAllocationmethod(TotalStudents,TotalClass);
//        System.out.println(ClassRoomAllocationmethod(TotalStudents,TotalClass));






    }


    //Method is finding how many clas Room Allocated
    public static long ClassRoomAllocationmethod(long TotalStudent , long TotalClass ){

        return (TotalStudent / TotalClass);


    }

    //Method to Adding gap two students
    public static long addinggap(long result,long gap){
       long effective_capacity = (4 / ( 1 + 1 )) * 8;

       //{ (Columns / ( gap + 1 )) * row }


        return effective_capacity;
    }

}
