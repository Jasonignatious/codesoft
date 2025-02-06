import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Welcome Sir!");
        System.out.println("Hi Sir you have about "+chances+" to  win this game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chance"+(i + 1)+" Enter your guess sir:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You Won It Sir!");
                    break;
                }
                else if(user>rand){
                    System.out.println("Your Guess is too high Sir!");
                }
                else{
                    System.out.println("Your guess is too Low Sir!");
                }
            }
            if(guess==false){
                System.out.println("Sorry Sir! You Lost the game.The Number was "+rand);
            }
            System.out.println("Do you want to play again Sir?(Y/N)");
            String playA=sc.next();
            playAgain=playA.equalsIgnoreCase("Y");
        

                }
                System.out.println("Thats it Sir!,Hope you enjoyed the game");
                System.out.println("This is your final score Sir:"+finals);
    }
                public static int getrandN(int min,int max){
                    return (int)(Math.random()*(max-min+1)+min);
            }
        }
        
        
    
