import java.util.Scanner;

public class Converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency COnverter!");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. USD to EUR");
        System.out.println("4. EUR to USD");
        System.out.println("5. EUR to INR");
        System.out.println("6. INR to EUR");


        System.out.println("Enter Your choice (1 or 2 or 3 or 4 or 5 or 6):");
        int choice = sc.nextInt();



        if (choice == 1){
            System.out.println("Enter The Amount in USD: ");
            double USD = sc.nextDouble();
            double INR = USDToINR(USD);
            System.out.println("The Amount in INR is: "+INR);
            
        }
        else if (choice == 2){
            System.out.println("Enter The Amount in INR: ");
            double INR = sc.nextDouble();
            double USD = INRToUSD(INR);
            System.out.println("The Amount in USD is: "+USD);
        }
        else if (choice == 3){
            System.out.println("Enter The Amount in USD: ");
            double USD = sc.nextDouble();
            double EUR = USDToEUR(USD);
            System.out.println("The Amount in EUR is: "+EUR);
        }
        else if (choice == 4){
            System.out.println("Enter The Amount in EUR: ");
            double EUR = sc.nextDouble();
            double USD = EURToUSD(EUR);
            System.out.println("The Amount in USD is: "+USD);
        }
        else if (choice == 5){
            System.out.println("Enter The Amount in EUR: ");
            double EUR = sc.nextDouble();
            double INR = EURToINR(EUR);
            System.out.println("The Amount in INR is: "+INR);
        }
        else if (choice == 6){
            System.out.println("Enter The Amount in INR: ");
            double INR = sc.nextDouble();
            double EUR = INRToEUR(INR);
            System.out.println("The Amount in EUR is: "+EUR);
        }
        else{
            System.out.println("Invalid Choice! PLEASE TRY AGAIN BY ENTERING A VALID CHOICE");

        }
        sc.close();
        }

        public static double USDToINR(double USD){

            return USD*87.58; // DATE: 06/02/2025

        }
        public static double INRToUSD(double INR){

            return INR*0.0114; // DATE: 06/02/2025
        }
        public static double USDToEUR(double USD){

            return USD*0.9653; //DATE 06/02/2025
        } 
        public static double EURToUSD(double EUR){

            return EUR*1.0355; //DATE 06/02/2025        }

    }
    public static double EURToINR(double EUR){

        return EUR*90.75; //DATE 06/02/2025
    }
    public static double INRToEUR(double INR){

        return INR*0.0110; //DATE 06/02/2025
    }


}

