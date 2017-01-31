import java.util.Scanner; 


public class JavaApplication9 {

    
    public static void main(String[] args) {
        
        //Declerations
        
        String[] names = new String[5]; 
                
                 names[0] = "door one";
                 names[1] = "door two";
                 names[2] = "Sean Connery";       
                 names[3] = "Mr. Peanut"; 
                 names[4] = "Turd Ferggison";
                 
        
                 
       int [] codes = new int [5]; 
       
                codes[0] = 1989;
                codes[1] = 9;
                codes[2] = 6;
                codes[3] = 2;
                codes[4] = 7;
                 
        
        //Scanners and such
        Scanner Fname = new Scanner(System.in); 
        Scanner Lname = new Scanner(System.in);
        Scanner one = new Scanner(System.in); 
        Scanner two = new Scanner(System.in); 
        Scanner three = new Scanner(System.in);
        Scanner four = new Scanner(System.in);
        Scanner five = new Scanner(System.in);
        Scanner six = new Scanner(System.in);
        Scanner seven = new Scanner(System.in);
        Scanner eight = new Scanner(System.in);
        
        
        //Scanners and such 
       
        
        // Declerations
       
        //Story
        
        System.out.println("Don't fuck with the game answer 1 or 2. You have been warned oooooooooooooooooooo");
        System.out.println(" ");
        
        System.out.println("You cross the bridge and come to two doors"); 
        System.out.println("The first door greets you, and warns you of the trechory behind"+" "+names[1]);
        System.out.println(names[1]+" "+"turns without looking and says probably, then proceeds to ask which door you will take");
        System.out.println("You respond with");
        
            int door = one.nextInt();
            
          while (door != 2) {
            System.out.println("You fall to your death. You suckkkkkk!");
          }
        
          if (door == 2 && door != 1) {
            System.out.println("The door crakcs open and you are greeted by"+" "+names[2]+" "+"and"+" "+names[3]);
            
          } 
          
          System.out.println(" "); 
          System.out.println("You enter a massive mansion peaked on a cliff"); 
          System.out.println(names[2]+" "+"locks the door behind you, and slips the key in his pocket"); 
          System.out.println("You walk for while when suddenly"+" "+names[3]+" "+"falls to the ground and dies");
          System.out.println(names[2]+" "+"quickly runs away laughing hysterically, and accidentally drops his knife"); 
          System.out.println("Mr.Peneaut reaches his arm out and yells avenge me!");
          System.out.println(" "); 
          System.out.println("Do you 1 pick up the knife? or 2 turn around and run "); 
          
            int knife = two.nextInt();
            while (knife != 1 && knife != 2) {
                System.out.println("You suckkkkkkkkkkkkk!");
            }
                
              if (knife == 2) {
                System.out.println("You turn and run around the corner! down the hall you see a phone on a table.");
                System.out.println("you run to it, pick it up and dial out, it ringes shortly and is then answered by..");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(names[2]);
                System.out.println("Do you 1 tell him to eat shit or 2 hang up in a panic");
                
                
                int phone = four.nextInt(); 
                
                while (phone != 1 && phone != 2) { 
                    System.out.println("You suckkkkkkkkkkkkk!");
                    
                }
                if (phone == 1 || phone == 2) { 
                    System.out.println(); 
                    
                }
            
            if (knife == 1) {
                System.out.println(" ");
                System.out.println("You grab the knife, and go on a hunt for red October");
                System.out.println("You run around the corner, and up the stairs. You reach a door with peanut shells at the foot");
                System.out.println("Do you 1 pick the lock? or 2 continue walking ");
                int lock = three.nextInt(); 
                
               
                if (lock == 1) { 
                    System.out.println("You stick the knife in the lock and shake it. The lock opens!");
                    System.out.println(" "); 
                    System.out.println("You walk in the room and look around");
                    System.out.println("You see peanut shavings behind a curtain, and you also find a a lighter,show lace, and a monocle");
                    System.out.println("Do you 1 look behind the curtain or 2 grab the tools");
                    
                    int tools = five.nextInt();
                    
                while (tools != 1 && tools != 2) { 
                    
                     System.out.println("You suckkkkkkkkkkkkk!");
                }
                if (tools == 1) {
                    System.out.println(" "); 
                    System.out.println(names[2]+" "+"stabs you and runs away. You're dead"); 
                }    
                        
                
                if ( tools == 2) {
                    System.out.println(" "); 
                    System.out.println("You grab the tools and think of how to use them");
                    System.out.println("You put the tools in your pocket, and walk out of the room");
                    System.out.println("You walk around the mansion, and come across a bar"); 
                    System.out.println("You find a suspicious bar tender, who says his name is"+" "+names[4]);
                    System.out.println(" "); 
                    System.out.println("Do you 1 stab him or 2 ask for information about"+" "+names[2]);
                    
                    int bar = six.nextInt(); 
                    
                    while(bar != 1 && bar != 2) {
                        System.out.println("You suckkkkkkkkkkkkk!");
                    }
                    if (bar == 1){
                        System.out.println("You impulsively stab the bartender, he falls to the ground and his wig falls off!"); 
                        System.out.println("It turns out it was"+" "+names[2]+" "+"the whole time!");
                        System.out.println("You reach into his pocket and walk out the door");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("The end!");
                        
                    }
                    if (bar == 2) {
                        System.out.println(" ");
                        System.out.println("You ask for information, and he tells you that"+" "+names[2]+" "+"can be found in the master suit");
                        System.out.println("You walk upstairs to the suit and find a locked keypad");
                        System.out.println("You fuck with it, and find it out ir requires 4 numbers to unlock");
                        System.out.println("You look to your left and find a painting of"+" "+names[2]);
                        System.out.println("You look closely and see the words the third best adventure");
                        System.out.println(" ");
                        System.out.println("You ponder for a while, and then you..");
                        System.out.println("1 enter the code, or 2 push the eyes of the painting");
                        
                        int code = seven.nextInt();   
                        
                        while (code != 1 && code != 2) {
                            System.out.println("Figure it out");
                            
                        }
                        
                        if (code == 1) {
                            System.out.println("Please enter the code:");
                            int pass = eight.nextInt(); 
                        
                        if (pass != 1989) {
                            System.out.println("Incorrect");
                            
                        }
                            
                        }
                        
                        
                    }
                    
                
                }
                    
            }
            
          
            
                
        
        
            
        
        
}
    
}
}
}
