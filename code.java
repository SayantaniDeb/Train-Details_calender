import java.util.*;
import java.lang.*;
import java.io.*;
class train{ int
train_no,distance;
 String Train_name,source,destination; public
train(int a,int b,String c,String d,String e){
train_no= a; distance=b;
 Train_name=c; 
 source= d;
destination =e;
 }
 public void print(){
 System.out.println("The number,name,source,destinatio and distance are "+ train_no+" "+Train_name+" "+source+" "+destination+" "+distance);
 }
}
class Sortbyno implements Comparator<train>
{
 public int compare(train a,train b)
 {
 return a.train_no - b.train_no;
 }
}
class Sortbydis implements Comparator<train>
{
 // Used for sorting in ascending order of
 // roll number
 public int compare(train a,train b)
 {
 return a.distance - b.distance;
 }
}

class Sortbyname implements Comparator<train>
{ 
 // Used for sorting in ascending order of
 // roll name
 public int compare(train a,train b)
 {
 return a.Train_name.compareTo(b.Train_name);
 }
}
class Sortbysource implements Comparator<train>
{
 // Used for sorting in ascending order of
 // roll name
 public int compare(train a,train b)
 {
 return a.source.compareTo(b.source);
 }
}
class Main {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 ArrayList <train> list = new ArrayList<train>();
int c; for(;;){
 System.out.println("Enter 1 to enter new element into the list");
 System.out.println("Enter 2 to sort elements by name");
 System.out.println("Enter 3 to sort elements by source");
 System.out.println("Enter 4 to sort elements by number");
 System.out.println("Enter 5 to sort elements by distance");
 System.out.println("Enter 6 to print elements in the list");
  System.out.println("Enter 7 to exit the program"); c=sc.nextInt(); 
 switch (c) {
case 1:
 System.out.println("Enter number,distance,name,source and destination");
System.out.println("Press enter after every input"); int no=sc.nextInt();
int dis=sc.nextInt(); sc.nextLine();
 String name =sc.nextLine();
 String source =sc.nextLine();
String dest =sc.nextLine();
 list.add(new train(no,dis,name,source,dest));
break; case 2:
 Collections.sort(list,new Sortbyname());
break; case 3:
 Collections.sort(list,new Sortbysource());
break; case 4:
 Collections.sort(list,new Sortbyno());
break; case 5:
 Collections.sort(list,new Sortbydis());
break; case 6:
 for(train t:list)
{t.print();} break; case
7:
 System.exit(0);
 }
 }
 }
}