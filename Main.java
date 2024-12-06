import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an Adjective: ");
        String adj =  input.nextLine();

        System.out.print("Enter a Noun: ");
        String noun = input.nextLine();

        
        int user2 = 1;
      
 
        while(user2 == 1){

            System.out.println("You can choose between 5 different themes\n 1: Action \n 2: Sad \n 3: Horror \n 4: Funny \n 5: Fantasy \n 0: EXIT");
            int user = input.nextInt();
        
            if(user == 1){
                Action aStory = new Action();
                aStory.action(noun, verb, adj); 
            }
            else if(user == 2){
                Sad sStory = new Sad();
                sStory.sad(noun, verb, adj);
            }
            else if(user == 3){
                Horror hStory = new Horror();
                hStory.Horror(noun, verb, adj);
            }
            else if(user == 4){
                Funny fStory = new Funny();
                fStory.Funny(noun, verb, adj);
            }
            else if(user == 5){
                Fantasy fanStory = new Fantasy();
                fanStory.Fantasy(noun, verb, adj);
            }
            else if(user == 0){
                System.out.println("BYE BYE");
                break;
            }
            else{
                System.out.println("Invalid option choose another please");
                continue;
            }

            System.out.println("Would you like to generate another story? \n If so type 1 \n If not type 2");
            user2 = input.nextInt();
            input.nextLine(); 
        }
        
        System.out.println("Thank you for taking the time to use my Story Maker!!!");
        input.close();
    }  
}