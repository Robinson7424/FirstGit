import java.util.Scanner; 
import javax.swing.*;
import java.text.DecimalFormat; 


public class Money {

    
    public static void main(String[] args) {
        
         String[] currency = new String[6]; 
                    
            currency[0] = "Can dollar"; // default 
            currency[1] = "euro"; 
            currency[2] = "Chinese Yen";
            currency[3] = "pounds";
            currency[4] = "Swiss Franc";
            currency[5] = "US dollar";
       
       Scanner UI = new Scanner(System.in); 
       Scanner UI2 = new Scanner(System.in); 
       Scanner location = new Scanner(System.in); 
       Scanner curry = new Scanner(System.in); 
       Scanner curry2 = new Scanner(System.in);
       Scanner people = new Scanner(System.in);
       Scanner choice = new Scanner(System.in);
       
       System.out.println("How much have you budgeted for travel");
       
        Scanner allocate = new Scanner(System.in); 
        
            double ally; 
                ally = allocate.nextDouble(); 
        
        System.out.println("How many days are you travelling for");
        
            Scanner days = new Scanner(System.in); 
            
                double travel; 
                    travel = days.nextDouble();

        System.out.println("Enter the amount you spend in a week at home in $");
        
            double amount;
                amount = UI.nextDouble();      
                
                
            double percent; 
                percent = amount / ally; 
                
                    DecimalFormat all = new DecimalFormat("0.00");
                        String allForm = all.format(percent);
                        
        System.out.println("If you spend as much on vacation a week,");        
        System.out.println("you will allocate"+" "+allForm+"% of your travel budget for food"); 
        
        if (travel > 7) { 
            
            double newTravel; 
                newTravel = travel / 7; // travel time in weeks 
                
            double newAmount; 
                newAmount = newTravel * amount; 
                
                    DecimalFormat amounts = new DecimalFormat("0.00");
                        String amountss = amounts.format(newAmount);
                        
                        System.out.println("You will need"+" "+newTravel+" "+"weeks of grocer money,");
                        System.out.println("and a total of $"+amountss);
                        
                        // if travel > 7 use amountss instead of amount 
                        }
         
        System.out.println("");
             System.out.println("Enter the number of meals a day you wish to eat on your trip:");
        
            double meals;
                meals = UI2.nextDouble(); 
            
            double avgCost = 13.25; 
            // this will computed, set value for now. algorithm of its own 
        
        System.out.println(" ");    
                System.out.println("How many people are travelling in total?");
            
            int ppl = people.nextInt();      
            
            double numMeals = Math.round(amount/avgCost); 
            double mealRe = amount/avgCost; 
     
                DecimalFormat dFormat = new DecimalFormat("0.00");
                             String formatted = dFormat.format(mealRe);
            
                                 double mealRemain = Math.abs(mealRe - numMeals);
            
                                      DecimalFormat dFormat2 = new DecimalFormat("0.00");
                                                
                                                String formatted2 = dFormat2.format(mealRemain); 
            
            double left = mealRemain*avgCost;
            
                DecimalFormat dFormat3 = new DecimalFormat("0.00");
                             String formatted3 = dFormat3.format(left); 
                             
                             double mealsTotal = numMeals/meals;  
            
                                    DecimalFormat dFormat4 = new DecimalFormat ("0.00");
                                         String formatted4 = dFormat4.format(mealsTotal);
             
             
        System.out.println(" ");
               System.out.println("based on how much you spend a week you can afford exactly"+" "+formatted+ " "+"meals");
               System.out.println("From one weeks grocery money you can get"+" "+formatted4+ " " + "days of meals");
                        System.out.println("Therefore you can afford "+numMeals);
                                System.out.println("and have an extra"+" "+formatted2+"% of a meal");
                                         System.out.println("You will have $"+formatted3+" "+"left.");

           double weekly = meals * 7; 
                    System.out.println(" ");

                         double WeekCost = weekly * avgCost; 
           
                                if (ppl > 0 && travel > 7) { 
                                    
                                     double newTravels = travel / 7; 
                                     double fCost; 
                                             fCost = (weekly*ppl);
                                     
                 
                    System.out.println("You will eat"+" "+fCost+" "+"meals a week at $"+avgCost+" "+"per meal"); 
                    
                        double fCost2; 
                            fCost2 = (WeekCost*ppl)*newTravels; 
                                
                                    System.out.println("You will spend $"+WeekCost+" "+"per person,");
                                        System.out.println("and you will spend $"+fCost2+" "+"in total.");
                                        
                                        
                                } else if (ppl > 0 && travel <= 7) {
                                    
                                         double fCost; 
                                             fCost = (weekly*ppl);
                                     
                 
                    System.out.println("You will eat"+" "+fCost+" "+"meals a week at $"+avgCost+" "+"per meal"); 
                    
                        double fCost2; 
                            fCost2 = WeekCost*ppl; 
                                
                                    System.out.println("You will spend $"+WeekCost+" "+"per person,");
                                        System.out.println("and you will spend $"+fCost2+" "+"in total.");
                                        
                                    
                                } else if (ppl == 0 && travel > 7) {       
                                    
                                     double newTravels = travel / 7; 
                                     double fCost; 
                                             fCost = (weekly)*newTravels;
                                             
                                             System.out.println("You will spend $"+WeekCost+"");
                                        System.out.println("and you will spend $"+fCost+" "+"in total.");
                                    
                                } else { 
                                    
                        System.out.println("You will eat"+" "+weekly+" "+"meals"+" "+"a week at $"+avgCost+" "+"per meal,");
                        System.out.println("and you will spend $"+WeekCost+" "+"in total.");
               
                                        }
                System.out.println("Would you like to see your exchange values?");

                    String eXchoice = curry.nextLine(); 
                    
                if (eXchoice.equals("yes")) {     
                                         
                System.out.println(" ");
                System.out.println("Currency Exchange: ");
                System.out.println("Your currency will be changed to the following: ");
                System.out.println(" ");
                System.out.println(currency[1]);
                System.out.println(currency[2]);
                System.out.println(currency[3]);
                System.out.println(currency[4]);
                System.out.println(currency[5]);
                System.out.println(" ");
                
                    double euro; 
                        euro = WeekCost * 0.71; 
                            DecimalFormat euro2 = new DecimalFormat("0.00");
                                String neweuro = euro2.format(euro); 
                        
                    double yen; 
                        yen = WeekCost * 87.54; 
                            DecimalFormat yen2 = new DecimalFormat("0.00");
                                String newyen = yen2.format(yen); 
                          
                    double pound; 
                        pound = WeekCost * 0.61; 
                            DecimalFormat pound2 = new DecimalFormat("0.00");
                                String newpound = pound2.format(pound);
                                
                    double franc; 
                        franc = WeekCost * 0.76; 
                            DecimalFormat franc2 = new DecimalFormat("0.00"); 
                                String newfranc = franc2.format(franc); 
                             
                System.out.println("Your exchange values are: ");
                System.out.println(" ");
                System.out.println(neweuro+" "+"euros");
                System.out.println(newyen+" "+"Chinese yen");
                System.out.println(newpound+" "+"pounds");
                System.out.println(newfranc+" "+"Swiss francs");
                System.out.println(newfranc+" "+"US dollars");
                   
                } 
                         
                System.out.println("Would you like to spend this much?");
                
                    String choice1 = choice.next(); 
                    
                    if (choice1.equals("yes")){
                        System.out.println("End of Run");
                            
                    }
                    
                    if (choice1.equals("no")) { 
                        System.out.println("Okay");
                        System.out.println(" ");
                        System.out.println("How much would you like to spend ?");
                        
                            Scanner usrSpend = new Scanner(System.in);
                            
                                double fCost3 = WeekCost*ppl; 
                            
                                double usrSpnd; 
                                    usrSpnd = usrSpend.nextDouble(); 
                                        
                                double extra; 
                                    extra = usrSpnd - WeekCost; 
                                
                                double extra2; 
                                    extra2 = WeekCost - usrSpnd; 
                                
                                double extra3; 
                                    extra3 = fCost3 - usrSpnd; 
                                 
                                double extra4; 
                                    extra4 = usrSpnd - fCost3; 
                                        
                    if (usrSpnd > fCost3 && ppl > 0){
                        
                        System.out.println("You will have an extra $"+extra4);
                        
                            double extraMeal; 
                                extraMeal = extra4 / avgCost;
                                    
                                    DecimalFormat dFormat5 = new DecimalFormat ("0.00");
                                        String formatted5 = dFormat5.format(extraMeal);
                                        
                            double dayz; 
                                dayz = extraMeal / ppl;
                                    
                                    DecimalFormat dFormat6 = new DecimalFormat ("0.00");
                                        String formatted6 = dFormat6.format(days);
                            
                            double down; 
                                down = dayz / meals; 
                                    
                                    DecimalFormat dFormat8 = new DecimalFormat("0.00");
                                        String formatted8 = dFormat8.format(down);
                                            
                                            
                                            System.out.println("You can afford an extra"+" "+formatted5+" "+"meals,");
                                            System.out.println("and"+" "+Math.round(down)+" "+"days of meals");
                        
                    } else if (usrSpnd > WeekCost && ppl == 0) {
                        
                            // extra = usrSpnd - WeekCost;  
                                
                            double extraMeals2;
                                extraMeals2 = extra / avgCost; 
                            
                                    DecimalFormat dFormat7 = new DecimalFormat("0.00");
                                        String formatted7 = dFormat7.format(extraMeals2); 
                             
                            double extraMeals3; 
                                extraMeals3 = Math.round(extra / avgCost); 
                            
                            double finalMeal; 
                                finalMeal = extraMeals2 - extraMeals3; 
                            
                            double WeekCost2; 
                                WeekCost2 = WeekCost; 
                                
                                    DecimalFormat dFormat8 = new DecimalFormat("0.00");
                                        String formatted8 = dFormat8.format(WeekCost2);
                                        
                                            System.out.println("You will have an extra $"+extra+" "+"and,");
                                            System.out.println("you will have an extra " +" " + formatted7+" "+"meals.");
                        
                    } else if (usrSpnd < fCost3 && ppl > 0) { 
                        
                        System.out.println("You need to cut $"+extra3);
                        System.out.println("To do this would you like to eat less?");
                        System.out.println(" ");
                        
                            Scanner time = new Scanner(System.in); 
                            
                                String times = time.nextLine(); 
                     
                     if (times.equals("no")){
                         
                         System.out.println("End Run");
                           
                     } else if (times.equals("yes")) { 
                         
                         System.out.println("If you need to cut $" + extra3+",");
                         
                            double mealCut; 
                                mealCut = extra3 / avgCost; 
                                
                        System.out.println("You will need to cut"+" "+mealCut+" "+"meals.");
                              
                     }

                    } else if (usrSpnd < WeekCost && ppl == 0) {
                        
                    } else { 
                        System.out.println("Idk what the fuck you did");
                    }
                                    
                                    
                                        

}
}
}          

// add weeks travelling to all shit 