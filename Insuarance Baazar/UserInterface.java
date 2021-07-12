package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Bazaar b= new Bazaar();
		b.setPolicyMap(new TreeMap<>());
		System.out.println("Enter the no of Policy names you want to store");
		int num=sc.nextInt();
		for(int i=0;i<num;++i){
		    System.out.println("Enter the Policy ID");
		    int policyKey=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    String policyValue=sc.nextLine();
		    b.addPolicyDetails(policyKey,policyValue);
		}
		Map<Integer, String> printingStuff = b.getPolicyMap();
		for(Map.Entry<Integer, String> something :printingStuff.entrySet()){
		    System.out.println(something.getKey()+" "+something.getValue());
		}
		//Fill the UI code
		System.out.println("Enter the policy type to be searched");
		String name=sc.nextLine();
		List<Integer>printer =b.searchBasedOnPolicyType(name);
for(int i=0;i<printer.size();i++){
    System.out.println(printer.get(i));
}
	}

}
