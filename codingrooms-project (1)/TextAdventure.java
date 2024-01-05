import java.util.*;

public class TextAdventure 
{
    int health = 100;
    int health2 = 75;
    int health3 = 100;
    int health4 = 200;
    int health5 =  125;
    int deal = (int)(Math.random() * 10) + 30;
    int newHealth;
    

  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  String input;


  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    
    String zone;
    // start of adventure. You can change this if you like
    console.setImage("forest.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero.changeName(input);
    
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself on the edge of a shadowy forest with the sun nearly set. You see what looks like a city in the distance.What would you like to do? \ncity: \tgo towards the city \nforest: \tturn around and re-enter the forest\nnap: \tgo back to sleep\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();
    System.out.println("You would like to go to " + input);
    if(input.equals("forest")|| input.equals("Forest")){
        enterZone1();
    }
    else if(input.equals("city") || input.equals("City")){
        enterZone2();
    }
    else{
        gameEnd();
    }
    
    
    
    

  }

  private void enterZone1()//North // Forest
  {
      

    // change image
    // ADD CODE HERE
    console.setImage("forest.jpg");

    

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
            System.out.println("After a long and cold night in the dark forest. You have spent hours and hours looking for any kind of shelter or building, but you had no luck. It was so cold you felt like you were gonna freeze to death. Then out of no where, you see this jacket on the floor, your adrenaline rushes because of how excited you are to see this. As you walk up to it you hear noises in that direction. What do you want to do? \njacket: \ttry to get the jacket and check out the mysterious noise \nleave: \tdont risk it and keep walking straight\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();
    
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("jacket") || input.equals("jacket")){
        console.setImage("wolf2.jpeg");
                ourHero.setHealth(100);
                System.out.println("You have a health of " + health);
                System.out.println("The wolf has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The wolf has a health of " + health2);
                System.out.println("Your health is now at" + health);
                
                
                System.out.println("You have a health of " + health);
                System.out.println("The wolf has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The wolf has a health of " + health2);
                System.out.println("Your health is now at" + health);
                
                
                
                System.out.println("You have a health of " + health);
                System.out.println("The wolf has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The wolf has a health of " + health2);
                System.out.println("Your health is now at" + health);
                
                if(ourHero.health < 0){
                    gameEnd();
                
                }
                if(ourHero.health > 0){
                    gameEnd();
                }
                
    }
            

    if(input.equals("leave") || input.equals("Leave")){
        console.setImage("forest.jpg");
        System.out.println("After walking for about a half of an hour you see a city in the distant and mountains in on the right.What will you do? \ncity: \texplore the distant city to see if there is any loot \nmountains \texplore the mountains, seeing if there are any animals"+ ourHero.getName() + ": ");
        input = inScanner.nextLine();

    }
    if(input.equals("city") || input.equals("City")){
        enterZone2();
    }
    else{
        enterZone3();
    }
            


    

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("distantcity.jpeg");


    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You have decided to enter the city, when you arrived you see it has been a broken city. There are ruins everywhere, spray paint everywhere, and there is blood everywhere. You suddenly hear a noise above you, you get scared, What do you want to do? \nNoise \tfind out what is making that noise \nMountain \tleave the city and go to the mountains instead\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();
    if(input.equals("noise") || input.equals("Noise")){
        console.setImage("vig.jpeg");
                ourHero.setHealth(100);
                System.out.println("You have a health of " + health);
                System.out.println("The vigilante has a health of" + health3 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The vigilante has a health of " + health3);
                System.out.println("Your health is now at" + health);
                
                
                System.out.println("You have a health of " + health);
                System.out.println("The vigilante has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The vigilante has a health of " + health3);
                System.out.println("Your health is now at" + health);
                
                
                
                System.out.println("You have a health of " + health);
                System.out.println("The vigilante has a health of" + health3 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The vigilante has a health of " + health3);
                System.out.println("Your health is now at" + health);
                
                if(health < 0){
                    gameEnd();
                
                }
    else{
        enterZone3();
    }
    }
    
    
    

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE
    console.setImage("mountains.png");
    
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You have decided to enter the mountains, you are very thirsty from walking up. You reach behind trying to find your backpack, but have realized it fell off. You become worried, and retrace your steps. You see the backpack on the cliff, barely on the mountain. The edge as you see is not that stable,What would you like to do? \nbackpack: \trisk falling off the cliff to get the backpack \nignore \tignore the backpack and continue\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();
    if(input.equals("backpack") || input.equals("Backpack")){
        enterZone4();    
    }
    else if(input.equals("ignore") || input.equals("Ignore")){
            console.setImage("golem.jpeg");
            System.out.println("A golem has snuck up behind you, what would you like to do? \nattack \tattack the monster \nleave \tleave the monster alone and have a chance of getting hurt\n" + ourHero.getName() + ": ");
            input = inScanner.nextLine();
            if(input.equals("attack") || input.equals("Attack")){
                ourHero.setHealth(100);
                if(ourHero.health <= 0){
                    gameEnd();
                    
                
                }
                System.out.println("You have a health of " + health);
                System.out.println("The golem has a health of" + health4 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The golem has a health of " + health4);
                System.out.println("Your health is now at" + health);
                
                }
            }
    



    // Take action or go to another zone based on their choice
    // ADD CODE HERE
  }
    
  
  

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE
        console.setImage("graveyard.jpg");
        



    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("BAM!!, you didnt know the cliff was about to break, you fall down along with the rocks. But you survive? You are at a graveyard and wonder how did you survive at a fall that high. You stand up and suddenly realize that there are zombies below you. You landed on zombies which protected your fall. What do you want to do? \nattack \tattack the zombies and keep on passing through \ncity \tgo back to the city for loot\n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("attack") || input.equals("Attack")){
        console.setImage("zombie.jpeg");
                ourHero.setHealth(100);
                if(ourHero.health <= 0){
                    gameEnd();
                }
                System.out.println("You have a health of " + health);
                System.out.println("The zombie has a health of" + health5 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The zombie has a health of " + health5);
                System.out.println("Your health is now at" + health);
               
                
                System.out.println("You have a health of " + health);
                System.out.println("The zombie has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The zombie has a health of " + health2);
                System.out.println("Your health is now at" + health);
                if(ourHero.health <= 0){
                    gameEnd();
                }
                
                
                System.out.println("You have a health of " + health);
                System.out.println("The zombie has a health of" + health2 + "How much damage would you like to do? \n15 \tdeal 15 damage \n30 \tdeal 30 damage \n50 \tdeal 50\n" + ourHero.getName() + ": ");
                input = inScanner.nextLine();
                
                
                health = health - deal;
                
                System.out.println("The zombie has a health of " + health2);
                System.out.println("Your health is now at" + health);
                
                
                enterZone5();
        if(input.equals("city") || input.equals("City")){
            enterZone2();
        }
        }
        
        
    
    
    

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE
    console.setImage("dungeon.jpeg");
    


    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Wow, you have made it this far. Now that you are here, it means you have gotten the key. You walk into the dungeon, and suddenly realize there are two doors, which door do you take?\ndoor1 \ttake the key and unlock the door \ndoor2 \tcheck out this mysterious door, and where it leads to\n"+ ourHero.getName() + ": ");
    input = inScanner.nextLine();
    if(input.equals("door1") || input.equals("Door1")){
        console.setImage("treasure.jpg");
        System.out.println("CONGRATULATIONS YOU HAVE WON THE TREASURE!");
    }
    if(input.equals("door2") || input.equals("Door2")){
        enterZone6();
    }
        
  }
  
    

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE
        console.setImage("drag.jpeg");
        System.out.println("CONGRATULATIONS, YOU HAVE WON THE BIG TREASURE. YOU HAVE WON THE GAME COMPLETELY:)");


    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    
    

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE
    
    if(input.equals("nap") || input.equals("Nap")){
        console.setImage("gameover1.png");
        System.out.println("GAME OVER. Better luck next time.");
    }
    if(ourHero.health <= 0){
        console.setImage("gameover1.png");
    }

    inScanner.close();
  }
  
    
}
