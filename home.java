package onlineReservationSystem;
import java.util.*;
import VoterProject.main;
import java.io.*;
public class home extends database{
    public static void main(String[] args) { 
        admin obj=new admin();
        student stud=new student();
        database db=new database();
        Scanner inp=new Scanner(System.in);
        db.fillCourses();
        System.out.println("welcome to futureWorks....");
       
         do{
            try{
                System.out.print("Enter your choice\n 1. Admin \n 2. User\n");
                int choice=inp.nextInt();
                if(choice==1){
                    obj.reply();
    
                }
                else if(choice==2){
                    stud.reply();
    
                }
            }
            catch(InputMismatchException e){
                System.out.println(e);
                return;
            }
    
         }
         while(true);
    }
    
}
