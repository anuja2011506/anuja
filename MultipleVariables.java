import java.util.Scanner;
publicclass MultipleVariables {

publicstaticvoid main(String[] args){
int First, Second, Third, largest, temp;
//object of the Scanner class
Scanner sc = new Scanner(System.in);
//reading input from the user
System.out.println(&quot;Enter the first number:&quot;);
First = sc.nextInt();
System.out.println(&quot;Enter the second number:&quot;);
Second = sc.nextInt();
System.out.println(&quot;Enter the third number:&quot;);
Third = sc.nextInt();
//comparing a and b and storing the largest number in a temp

variable

temp=First&gt;Second?First:Second;
//comparing the temp variable with c and storing the result in

the variable

largest=Third&gt;temp?Third:temp;
//prints the largest number 23
System.out.println(&quot;The largest number is: &quot;+largest);
}
}