//java program to implement student priority queue based on token value
//import *.*;
import java.util.*;
class stupriority
{
public static void main(String args[])
{
// creating queue

PriorityQueue<String> pQueue=new PriorityQueue<String>();
PriorityQueue<String> pQueue1=new PriorityQueue<String>();
PriorityQueue<String> pQueue2=new PriorityQueue<String>();


pQueue.add("hema");
pQueue.add("sasi");
pQueue.add("kavi");
pQueue.add("kavi");
pQueue.add("Pradip");
//pQueue.peek();

pQueue1.add("3.7");
pQueue1.add("3.8");
pQueue1.add("3.6");
pQueue1.add("3.5");
pQueue1.add("3.7");
//pQueue1.peek();

pQueue2.add("45");
pQueue2.add("42");
pQueue2.add("40");
pQueue2.add("48");
pQueue2.add("40");
//pQueue2.peek();


Iterator token = pQueue.iterator();
Iterator token1 = pQueue1.iterator();
Iterator token2 = pQueue2.iterator();
   
System.out.println("\nServed order\n");

while(token.hasNext())
{

System.out.println(token.next());
System.out.println(token1.next());
System.out.println(token2.next());
System.out.println("served\n");

}


if(pQueue.isEmpty())
{
System.out.println("Queue is Empty");

}


/*

	class stu implements Comparable<stu> {
    private String name;
    private double cgpa;
	private int priority;

    public stu(String name, double cgpa, int priority) {
        this.name = name;
        this.cgpa = cgpa;
	this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getcgpa() {
        return cgpa;
    }

    public void setcgpa(double cgpa) {
        this.cgpa = cgpa;
    }

	public int getpriority() {
        return priority;
    }

    public void setpriority(double priority) {
        this.priority = priority;
    }

	}


    public int compare(stu s1, stu s2, stu s3, stu s4, stu s5) {
        if(this.getcgpa() < s1.getcgpa()) {
            return s1.getcgpa();
	}
	else if(this.getcgpa() < s2.getcgpa()) {
            return s2.getcgpa(); }


	else if(this.getcgpa() < s3.getcgpa()) {
            return s3.getcgpa(); }
        

	else if(this.getcgpa() < s4.getcgpa()) {
            return s4.getcgpa();
                } 
	else {
            return s5.getcgpa();
        }
    }


	public boolean compare(stu s1, stu s2, stu s3, stu s4, stu s5) {
     	if(stu.equals(name, s1.getName() || s2.getName() || s3.getName() 
	||s4.getName() || s5.getName())
 
        return(stu.getName());
}   */
  

}}
