package DmatAccount;


import java.util.Scanner;

import CurrentAccount.Customer;
import CurrentAccount.StigentechBank;

public class DmatAccount implements DmartAccountContents, StigentechBank {
	Scanner sc=new Scanner(System.in);
    Customer cus=new Customer();
	@Override
	public void createNewAccount() {
		System.out.println("Please Enter Account Number");
		String accountno=sc.next();
           cus.setAccountno(accountno);	
        System.out.println("Please Enter Your First Name:");
          String Fname=sc.next();
          cus.setFirstName(Fname);
        System.out.println("Please Enter Your Second Name");
          String Lname=sc.next();
          cus.setLastName(Lname);
        System.out.println("Please Enter Your Address");
          String Addr=sc.next();
          cus.setAddress(Addr);
          System.out.println("Please Enter Gender");
          String gender=sc.next();
          cus.setGender(gender);
        System.out.println("Please Enter Age"); 
         int age=sc.nextInt();
         cus.setAge(age);
        System.out.println("Please Enter Mobile Number");
        long mobi=sc.nextLong();
        cus.setMobiNo(mobi);
        System.out.println("Your Account Is Created");
		
	}

	@Override
	public void customerDetails() {
		 System.out.println("The Account Number of Customer: "+cus.getAccountno());
		    System.out.println("The Full Name of Customer: "+cus.getFirstName()+" "+cus.getLastName());
		    System.out.println("The Address of Customer:"+cus.getAddress());
		    System.out.println("The Gender of Customer:"+cus.getGender());
		    System.out.println("The Age of Customer:"+cus.getAge());
		   
		    System.out.println("The Mobile Number of Customer:"+cus.getMobiNo());
		
	}




	@Override
	public void purchaseShares() {
		System.out.println("Purchase the shares");
		
	}

	@Override
	public void sellingShares() {
		System.out.println("Selling  the shares");
		
	}

}
