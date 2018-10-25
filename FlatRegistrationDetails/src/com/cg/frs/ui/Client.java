package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.ClientException;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

 class Client {
	 static IFlatRegistrationService service = null;
	 static Scanner sc = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         service = new FlatRegistrationServiceImpl();
         sc=new Scanner(System.in);
         int choice=0;
     
         while(true){
        	 System.out.println("enter 1.Register\n 2.exit");
        	 choice=sc.nextInt();
        	 switch(choice){
        	 case 1: 
        	 ArrayList<Integer> arr = service.getAllOwnerIds();
//        	 System.out.println(arr);
        	 System.out.println("Existing omwer ids are :"+arr);
        	 System.out.println("please select your ownerid from above list");
        	 int ownid = sc.nextInt();
        	 System.out.println("Select flat type (1-1BHK,2-2BHK):");
        	 int in=sc.nextInt();
        	 String flat=null;
        	 switch(in){
        	 case 1:
        		 flat="1BHK";
        	 case 2:
        		 flat="2BHK";
        		 default:
        			 break;
        			 
        	 }
        	 System.out.println("enter flat area in sq ft:");
        	 int flatarea = sc.nextInt();
				try {
					if( service.validateFlatArea(flatarea)){
					 System.out.println("enter desired rent amount");
					 int rent = sc.nextInt();
					 
						if(service.validateRent(rent)) {
					 
					 System.out.println("enter desired deposit amount");
					 int deposit = sc.nextInt();
					 if(service.validateDeposit(deposit)){
					 
						int id = 0;
						FlatRegistrationDTO dispId = null;
						FlatRegistrationDTO dto = new FlatRegistrationDTO(id , ownid, flat, flatarea, rent, deposit);
					 for(Integer i:arr){
						 if(ownid==i){
							 dispId = service.registerFlat(dto);
						 }
					 }
					 id = dispId.getId();
					 System.out.println("Id = "+id);
					 }
						}
					 }
				} catch (ClientException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
        	 
        	 break;
        	 case 2:
        		 System.exit(0);
         }
	}

}
}