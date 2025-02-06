import java.util.Scanner;
class Grade{
    public String grade(int avgp){
        switch (avgp / 10){
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:     
                return "C"; 
            case 5:
                return "D";
            default:
                return "F";                                
        }
    }
}

  public class Main {
    public static void main(String[] args) {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);
        // taking input of total subjects
        System.out.println("Enter the amount of subjects:");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        // Taking and adding all the marks of the subjects
        for (int i = 0; i < tsubs; i++){
            System.out.println("Enter the marks of subject " + (i + 1) + ":");
            tmarks += sc.nextInt();
        }

        // Calculating the average percentage
        int avgp = tmarks / tsubs;

        // calculating the grade
        String grade = g.grade(avgp);

        // Displaying all the data
        System.out.println("The total marks Obtained: " + tmarks);
        System.out.println("The average percentage: " + avgp);
        System.out.println("The Grade Obtained: " + grade);

        sc.close();


    }
  } 