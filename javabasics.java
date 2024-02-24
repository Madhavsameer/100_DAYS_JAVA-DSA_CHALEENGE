import java.util.Scanner;

public class javabasics {
    public static void main(String[] args) {

        //sum revision
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println("sum of these numbers is "+c);

        //scanners revision
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your favourite number");
        int d=s.nextInt();
        System.out.println("Your favourite number is "+d);
        System.out.println("Enter your Name");
        String str=s.next();
        System.out.println("Your name is "+str);

        //if-else
       if(d==2){
        System.out.println("Your choice is same as madhav");
       }
       else if (d==7) {
        System.out.println("Your choice is same as Keshav");
       }
       else if (d==23) {
        System.out.println("Your choice is same as Nirjala");
       }
       else{
        System.out.println("Your choice is not same as sameer's sibblings");
       }

       //for loop practice
       System.out.println("for loop practice");
       for(int i=0; i<=10; i++){
        System.out.print(+i);
       }

       //while loop practice
       System.out.println("\nWhile loop practice");
       int j=0;
       while (j<=10) {
        System.out.print(+j);
        j++;
        
       }

       int arr[]={2,3,5,7,9,8};
       System.out.println("\nArray Elements are: ");
       for(int i=0; i<6; i++) {
        System.out.println(arr[i]);
        
       }
       System.out.println("Length of array is" + arr.length);

       //for-each loop practice
       System.out.print("Array using for each loop is: ");
       for(int num:arr){
        System.out.println(num);

       }

       //if else shortcut
       int x=4;
       String message=(x>2)? "You are greater" : "You are smaller";
       System.out.println(message);

       message();
       System.out.println("the sum of given number are " +sum(15, 17));
       System.out.println("The factorial of given number is "+recursion(5));
    }
    // java function
    public static void message(){
        System.out.println("You are inside message");
    }
    public static int sum(int num1, int num2){
        int value=num1+num2;
        return  value;

    }

    public static int recursion(int number){
        if(number==0)
        return 1;
        else
        return number*recursion(number -1);
        


    }



    
}