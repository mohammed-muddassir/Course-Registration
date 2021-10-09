package onlineReservationSystem;
import java.util.*;
public class database implements updateMethods{
    ArrayList<String> course=new ArrayList<>();
    HashMap<Integer,String> listofCourses=new HashMap<>(); //list of courses
    static HashMap<String,String> reg=new HashMap<>(); //user and corresponding registered course name
    HashMap<String,ArrayList<String>> user=new HashMap<>(); //user details
    
    public void fillCourses() {
        course.add("Intro to java");
        course.add("Intro to kubernetes");
        course.add("Exploring AI and ML");
        course.add("Entering the world of Competitive programming");
        course.add("Application Security");
        int start=0;
       
        while(start<course.size()){
            listofCourses.put(start, course.get(start));
            start++;
          
        }
       
        
    }

    

    
}
