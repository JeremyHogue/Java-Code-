import java.io.*;

import java.net.*;

import java.util.*;

public class ProcessLargeDataset {

public static void main(String[] args) {

try{


URL urlObj = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");

InputStream in = urlObj.openStream();

Scanner scannerobj = new Scanner(in);

float associate=0;

float full=0;

float assistant=0;

int associateCount=0;

int fullCount=0;

int assistantCount=0;

int allCount=0;

while (scannerobj.hasNext())

{

String temp[] = scannerobj.nextLine().split(" ");

if(temp[2].equals("associate")) {associate+=Float.parseFloat(temp[3]);associateCount++;}

else if(temp[2].equals("full")) {full+=Float.parseFloat(temp[3]);fullCount++;}

else if(temp[2].equals("assistant")) {assistant+=Float.parseFloat(temp[3]);assistantCount++;}

  

}


float all=associate+full+assistant;

allCount=associateCount+fullCount+assistantCount;


System.out.printf("Total salary for assistant professors is \t$%.2f\n",assistant);

System.out.printf("Total salary for associate professors is \t$%.2f\n",associate);

System.out.printf("Total salary for full professors is \t\t$%.2f\n",full);

System.out.printf("Total salary for all professors is \t\t$%.2f\n",all);

System.out.println("Average salary for assistant professors is \t$"+assistant/assistantCount);

System.out.println("Average salary for associate professors is \t$"+associate/associateCount);

System.out.println("Average salary for full professors is \t\t$"+full/fullCount);

System.out.println("Average salary for all professors is \t\t$"+all/allCount);

scannerobj.close();

}catch(Exception e){System.out.println("Url is not working check once");}

}

}