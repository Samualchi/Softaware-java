import patterns.*;

import java.util.Scanner;

public class main
 {
   public static void main(String[] args)
   {
       System.out.println("preparing pizza on margarita template");
       System.out.println("what type of toppings do you want to add ?: 1.Sausage, 2.Mushrooms, 3. Both of them 4.No");
       Scanner sc= new Scanner(System.in);
       Scanner sc2= new Scanner(System.in);
       Scanner sc3= new Scanner(System.in);
       System.out.print("Choice: ");
       int a= sc.nextInt();
       System.out.println("Need it to be spicy pizza ? 5.Y 6.N");
       System.out.print("Choice: ");
       int b=sc2.nextInt();
       System.out.println("Opened or closed pizza ? 7.Opened 8.Closed");
       System.out.print("Choice: ");
       int c=sc3.nextInt();
       switch (a)
       {
           case 1: {
               switch (b) {
                   case 5: {
                       switch (c) {
                           case 7: {
                               System.out.print("Opened spicy pizza with sausage\n");
                               Pizza_saugsau pizza1 = new Pizza_saugsau();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed spicy pizza with sausage\n");
                               saugsau_cl pizza1 = new saugsau_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
                   case 6: {

                       switch (c) {
                           case 7: {
                               System.out.print("Opened pizza with sausage\n");
                               Pizza_saug pizza1 = new Pizza_saug();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed pizza with sausage\n");
                               saug_cl pizza1 = new saug_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
               }
               break;
           }
           case 2: {
               switch (b) {
                   case 5: {
                       switch (c) {
                           case 7: {
                               System.out.print("Opened spicy pizza with mushrooms\n");
                               Pizza_mush pizza1 = new Pizza_mush();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed spicy pizza mushrooms\n");
                               musau_cl pizza1 = new musau_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
                   case 6: {

                       switch (c) {
                           case 7: {
                               System.out.print("Opened pizza mushrooms\n");
                               Pizza_mush pizza1 = new Pizza_mush();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed pizza mushrooms\n");
                               mu_cl pizza1 = new mu_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
               }
               break;
           }
           case 3: {
               switch (b) {
                   case 5: {
                       switch (c) {
                           case 7: {
                               System.out.print("Opened spicy pizza with sausage and mushrooms\n");
                               Pizza_musaugsau pizza1 = new Pizza_musaugsau();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed spicy pizza with sausage and mushrooms\n");
                               musaugsau_cl pizza1 = new musaugsau_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
                   case 6: {

                       switch (c) {
                           case 7: {
                               System.out.print("Opened pizza with sausage and mushrooms\n");
                               Pizza_musaug pizza1 = new Pizza_musaug();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed pizza with sausage and mushrooms\n");
                               musaug_cl pizza1 = new musaug_cl();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
               }
               break;
           }

           case 4:
           {
               switch (b)
               {
                   case 5: {
                       switch (c) {
                           case 7: {
                               System.out.print("Opened spicy margarita\n");
                               Spmar pizza1 = new Spmar();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed spicy margarita\n");
                               Clsp pizza1 = new Clsp();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
                   case 6: {

                       switch (c) {
                           case 7: {
                               System.out.print("Opened margarita\n");
                               Margarita pizza1 = new Margarita();
                               pizza1.preparePizza();
                               break;
                           }
                           case 8: {
                               System.out.print("Closed margarita\n");
                               Closed pizza1 = new Closed();
                               pizza1.preparePizza();
                               break;
                           }

                       }
                       break;
                   }
               }
               break;
           }
       }
   }
 }
