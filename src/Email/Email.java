package Email;

import java.util.Scanner;

public class Email {
private String fname,lname,password,department,email;
private String cname="tcs.com";
private int len =10,mailcap=500;

//constructor to recieve the first and last name
public Email(String fname,String lname)
{
	this.fname=fname;
	this.lname=lname;

//call a method asking for dept and it return a method
this.department=setdept();

//setting up Email
email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department+"."+cname;

//generate a random password
this.password=randompassword(len);
}

//ask for dept
private String setdept() {
	System.out.print("dept code \n1 Sales\n2 Development\n3 Accounting\n0 None\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Dept Code");
	int deptchoice=sc.nextInt();
	if(deptchoice==1){	return "Sales";	}
	else if(deptchoice==2){	return "Development";	}
	else if(deptchoice==3){	return "Accounting";	}
	else {	return "";	}
}

//set the random password
private String randompassword(int length)
{
	String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
	char password[]=new char[length];
	for(int i=0;i<length;i++)
	{
		int rand = (int)(Math.random()*passwordset.length());
		password[i]=passwordset.charAt(rand);
	}
	return new String(password);
}

//set the mailbox capacity
public void setmailboxcap(int mailcap)
{
	this.mailcap=mailcap;
}
public int getmailcap() { return mailcap; }


public String showinfo()
{
		return "Name: "+fname+" "+lname+"\n"
				+"dept :"+department+"\n"
				+"Email: "+email+"\n"
				+"password: "+password+"\n"
				+"capacity= "+mailcap;
}

}
