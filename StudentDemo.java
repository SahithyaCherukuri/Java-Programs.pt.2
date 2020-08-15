/*. Write a java program to read the student details using Scanner class 
and print the details of the student. sample input and output as follows:

input:

Enter your branch: computer science and engineering
Enter your roll num: 101                                                                                               
Enter your name: ram                                                                                                
Enter your CGPA: 9.8

output:

computer science                                                                                                        
Roll no:101     Name:ram        CGPA:9.8 */

import java.util.Scanner;

class Student{
    String branch;
    int rollNum;
    String name;
    float cgpa;
    //declare instance variables branch, rollno, name and grade   
}
public class StudentDemo{
        public static void main(String []args){
                Student s=new Student();
            // create an object for Student class 
                Scanner in=new Scanner(System.in);
                
       	  // Create a scanner class object
        	
            System.out.println("Enter your branch:");
        	//read branch using scanner object
        	s.branch=in.nextLine();
        	System.out.println("Enter your roll num:");
        	// read rollno using scanner object
        	s.rollNum=in.nextInt();
        	System.out.println("Enter your name:");
        	//read name using scanner object
        	s.name=in.next();
        	s.name=in.next();
        	s.name=in.next();
        	System.out.println("Enter your CGPA:");
        	// read grade using scanner object
        	s.cgpa=in.nextFloat();
        	System.out.println(s.branch+"\nRoll no:"+s.rollNum+"\tName:"+s.name+"\tCGPA:"+s.cgpa);
     }
}