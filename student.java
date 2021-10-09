package onlineReservationSystem;
import java.util.*;
import java.util.Iterator;
import java.util.Map;

public class student extends database {
    Scanner input=new Scanner(System.in);
    protected void apply(){
        System.out.println("here are your list of courses.....");
        
        for(Map.Entry map:listofCourses.entrySet()){
            System.out.println((int)map.getKey()+" : "+map.getValue());
        }
        System.out.println("Enter your course id to register");
        int id=-1;
        String str="";
        do{
            try{
                id=input.nextInt();
                if(id>=0 && id<5){
                    System.out.println("Enter your username");
                    String name=input.next();

                    System.out.println("Thank you for registering\nHappy learning....");
                    reg.put(name,course.get(id));
                    System.out.println("enter any number to logout");
                    int log=input.nextInt();
                    return;
                }
                else{
                    System.out.println("wrong choice..\n try again");
                }
            }
            catch(Exception e){
                System.out.println(e);
                 return;
               
            }
            str=((Object)id).getClass().getSimpleName();

        }
        while(id<0 || id>4 );

    }
    protected void reply(){
        System.out.println("hello student...");
        apply();

    }
    
}
