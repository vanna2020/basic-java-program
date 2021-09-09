package com.company;
import java.util.Scanner;

             public class Main {
          public static void main(String[] args) {
                      int number1, number2, number3;
                      System.out.println("We have to check largest among these three numbers below ");
                      Scanner sc = new Scanner(System.in);
                      System.out.print("Enter First number : ");
                      number1 = sc.nextInt();
                      System.out.print("Enter Second number : ");
                      number2 = sc.nextInt();
                      System.out.print("Enter Third number : ");
                      number3 = sc.nextInt();
                      //
                      if (number1>number2 && number1>number3){
                          System.out.println(number1 + "  is largest in " + number1 + "," + number2 + "," + number3);
                      }
                      else if (number2>number1 && number2>number3){
                          System.out.println(number2 + "  is largest in " + number1 + "," + number2 + "," + number3);
                      }
                      else {
                          System.out.println(number3 + "  is largest in " + number1 + "," + number2 + "," + number3);
                      }
                  }
              }