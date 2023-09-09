package org.example;

class ArmstrongNumber{
    public static void main(String[] args)  {
        int sumOfCube=0,a,temp;
        int number=153;
        temp=number;
        while(number>0)
        {
            a=number%10; //Getting last digit a - 3
            number=number/10;  //Removing last digit from number  - 15
            sumOfCube=sumOfCube+(a*a*a); //Calculating sum of cubes of digits
            System.out.println("no:" +number);
        }
        if(temp==sumOfCube)
            System.out.println(temp+" is an armstrong number");
        else
            System.out.println(temp+ "is not an armstrong number");
    }
}
