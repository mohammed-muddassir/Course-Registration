package onlineReservationSystem;
import java.util.*;
import java.util.Map;
public class admin extends database{
    Scanner inp=new Scanner(System.in);
    public static void dashboard(){
        for(Map.Entry map:reg.entrySet()){
            if(map.getValue()==null){
                System.out.println("no users registered till now..");
                break;
            }
            else{
                System.out.println("The registered users are: ");
                System.out.println(map.getKey()+" : "+map.getValue());
            }
            

        }
        return;

    }

    protected void reply(){
        System.out.println("hello admin");
        System.out.println("enter any number or alphabet to see the registered users..");
        String s=inp.nextLine();
        dashboard();
        
    }
    
    
}
