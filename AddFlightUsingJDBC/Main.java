import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flightId=sc.nextInt();
        String source=sc.next();
        String destination=sc.next();
        int noOfSeats=sc.nextInt();
        double flightFare=sc.nextDouble();
        
        Flight fObj=new Flight(flightId,source,destination,noOfSeats,flightFare);
			FlightManagementSystem fms = new FlightManagementSystem();
			if(fms.addFlight(fObj)){
			    System.out.println("Flight details added successfully");
			    
			}
			else{
			    System.out.println("Addition not done");
			}
    }
}