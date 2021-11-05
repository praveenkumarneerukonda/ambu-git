package Edureka;
import java.util.Scanner;
public class Factorial {
public static void main(String args[]){
//Scanner object for capturing the user input
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number:");
//Stored the entered value in variable
int num = scanner.nextInt();
//Called the user defined function fact dev01
Enter the number:
12
Factorial of entered number is: 47900160atic int fact(int n)
// modify by sub-dev002
int n = 100, t1 = 0, t2 = 1;
System.out.print("Upto " + n + ": ");
//while loop to calculate fibonacci series upto n numbers
while (t1<= n)