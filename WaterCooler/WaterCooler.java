//Sasha and Chloe
import java.util.*;
import java.io.*;

public class WaterCooler{
  public static void main(String[] args) {
    ArrayList<String> low = new ArrayList<>();
    ArrayList<String> high = new ArrayList<>();


    try{
      Scanner il = new Scanner(new File("topics.txt"));

    for(int i=0;i<6;i++){
        low.add(il.nextLine());}
    for(int i=5;i<11;i++){
        high.add(il.nextLine());}}

      catch(FileNotFoundException oops){
        System.out.println("ezg");}

      catch(NoSuchElementException oops){
        System.out.println("ezfg");}
          //added each topic to an ArrayList



    System.out.println("You find yourself stranded at the watercooler with Michael Scott");
    System.out.println("and Dwight Shrute. The conversation will only end once you reach \"The End\".");
    System.out.println("");//situation

    System.out.println("What is your confidence level? 1 being lowest, 3 being highest.");
    System.out.println("");
    Scanner scann = new Scanner(System.in);
    String con = scann.nextLine();//get response

    Random rand = new Random();
    int n = rand.nextInt(4);
    String a = "";//to pick a random topic

    if (con.equals("1")){//low confidence only gets low risk topics
      System.out.println("This is your topic: "+ low.get(n));
      a = low.get(n);}
    else if (con.equals("2")){//medium gets both options
      System.out.println("Low or high risk topic?(Please reply with \"low\" or \"high\")");
      Scanner risk = new Scanner(System.in);
      String riskk = risk.nextLine();
        if(riskk.equals("low")){
          System.out.println("This is your topic: "+ low.get(n));
          a = low.get(n);}
        else{
          System.out.println("This is your topic: "+ high.get(n));
          a = high.get(n);}}
        else if(con.equals("3")){//high only gets high risk topics
      System.out.println("This is your topic: "+ high.get(n));}

      System.out.println("");

      if(a.equals("watercooler")){
        System.out.println("You: This watercooler is very...cool.");
        System.out.println("");
        System.out.println("Dwight:{stares into your eyes deeply}");
        System.out.println("It’s actually a real shame because studies have shown that");
        System.out.println("more information gets passed through water cooler");
        System.out.println("gossip than through official memos.");
        System.out.println("");
        System.out.println("You: Oh...okay");
        System.out.println("");
        System.out.println("Michael:{Looks down at his shoes then back at Dwight} Please stop.");
        System.out.println("");
          }
      else if(a.equals("pets")){
        System.out.println("You: So, do you guys have any pets?");
        System.out.println("");
        System.out.println("Dwight: I grew up on a farm and as a farmer I know that when");
        System.out.println("an animal is sick sometimes the right thing to do it put it");
        System.out.println("out of its misery. With the electricity we are using to keep");
        System.out.println("Meredith alive, we could power a small fan for two days.");
        System.out.println("");
        System.out.println("Michael: At least it was only Meredith, thank God. But did");
        System.out.println("you see the way they looked at me? Like I was a murderer or something.");
        System.out.println("");
        System.out.println("You: Wait, you ran over Meredith?");
        System.out.println("");
        System.out.println("{Michael retreats to his office and Dwight walks back to his desk.}");
        System.out.println("");
        System.out.println("The End");
      }

      else if(a.equals("work")){
        System.out.println("You: How do you guys like working here?");
        System.out.println("");
        System.out.println("Dwight: I'm actually trying to be Regional Manager so that");
        System.out.println("I can demote Jim Halpert. Then I'll need a new number two.");
        System.out.println("My ideal choice? Jack Bauer. But he is unavailable. Fictional. And overqualified.");
        System.out.println("");
        System.out.println("Michael: That's never going to happen.");
      }

      else if(a.equals("weather")){
        System.out.println("You:The weather decent today.");
        System.out.println("");
        System.out.println("{Michael and Dwight leave}");
        System.out.println("");
        System.out.println("The End");
      }

      else if(a.equals("weekend plans")){
        System.out.println("You: So, what are you guys up to this weekend?");
        System.out.println("");
        System.out.println("Dwight: Probably just hunting vampires. I don't have a lot of");
        System.out.println("experience with vampires, but I have hunted werewolves. I shot");
        System.out.println("one once, but by the time I got to it, it had turned back");
        System.out.println("into my neighbor's dog.");
        System.out.println("");
        System.out.println("Michael: Jesus, Dwight!");
        }

      else if(a.equals("flirt")){
        System.out.println("You: Michael, you're lookin' pretty nice today.");
        System.out.println("");
        System.out.println("Michael: That's what she said.");
        System.out.println("");
        System.out.println("Dwight: That's not how it works, Michael.");
        System.out.println("You: So, do you wanna go out sometime? ;)");
        System.out.println("");
        System.out.println("Michael: No.");
      }

      else if(a.equals("poverty")){
        System.out.println("Poverty is bad.");
        System.out.println("");
        System.out.println("Michael: Yeah, povety sucks.");
        System.out.println("");
        System.out.println("Dwight: There are too many people on this earth.");
        System.out.println("We need a new plague.");
        System.out.println("");
        System.out.println("{You and Michael leave.}");
        System.out.println("");
        System.out.println("The End");
      }

      else if(a.equals("come at me bro")){
        System.out.println("You: COME AT ME, BRO!");
        System.out.println("");
        System.out.println("{Michael flees into the bathroom. Dwight pulls out}");
        System.out.println("his hunting knife from his boot.}");
        System.out.println("");
        System.out.println("Dwight: HYYYAAHHHH!");
        System.out.println("");
        System.out.println("{You die.}");
        System.out.println("");
        System.out.println("The End");
      }

      else if(a.equals("loan")){
        System.out.println("You: Can you guys lend me like $200? I need it to buy some bread.");
        System.out.println("");
        System.out.println("Dwight: Sure, that's reasonable.");
        System.out.println("");
        System.out.println("Michael: Hmm, I think you need more than that for bread.");
        System.out.println("");
        System.out.println("{Dwight hands you $200 and Michael hands you $100}");
        System.out.println("");
        System.out.println("Michael: That should do it!");
      }

      else if(a.equals("end conversation")){
        System.out.println("You: I have to go home now.");
        System.out.println("");
        System.out.println("Michael: Can you tell something to Jim for me?");
        System.out.println("");
        System.out.println("You: Sure, what is it?");
        System.out.println("");
        System.out.println("Michael: Well, Just tell him to call me as ASAP as possible.");
        System.out.println("");
        System.out.println("You: Uh, sure. Bye.");
        System.out.println("");
        System.out.println("Michael and Dwight: Bye!");
        System.out.println("");
        System.out.println("The End");
      }//topics and responses

    while(a.equals("watercooler")||a.equals("work")||a.equals("weekend plans")||a.equals("flirt")||a.equals("loan")){ //while the convo doesn't end, repeat
    System.out.println("What is your confidence level? 1 being lowest, 3 being highest.");
    Scanner scaann = new Scanner(System.in);

    String noc = scaann.nextLine();
    Random randdd = new Random();
    int i = randdd.nextInt(4);//to pick a random topic within an arraylist

    if (noc.equals("1")){//low confidence only gets low risk topics
      System.out.println("This is your topic: "+ low.get(i));
      a = low.get(i);}
    else if (noc.equals("2")){//medium gets both options
      System.out.println("Low or high risk topic?(Please reply with \"low\" or \"high\")");
      Scanner risk = new Scanner(System.in);
      String riskk = risk.nextLine();
        if(riskk.equals("low")){
          System.out.println("This is your topic: "+ low.get(i));
          a = low.get(i);}
        else{
          System.out.println("This is your topic: "+ high.get(i));
          a = high.get(i);}}
    else if(noc.equals("3")){//high only gets high risk topics
      System.out.println("This is your topic: "+ high.get(i));
      a = high.get(i);}

    if(a.equals("watercooler")){
      System.out.println("You: This watercooler is very...cool.");
      System.out.println("");
      System.out.println("Dwight:{stares into your eyes deeply}");
      System.out.println("It’s actually a real shame because studies have shown that");
      System.out.println("more information gets passed through water cooler");
      System.out.println("gossip than through official memos.");
      System.out.println("");
      System.out.println("You: Oh...okay");
      System.out.println("");
      System.out.println("Michael:{Looks down at his shoes then back at Dwight} Please stop.");
        }
    else if(a.equals("pets")){
      System.out.println("You: So, do you guys have any pets?");
      System.out.println("");
      System.out.println("Dwight: I grew up on a farm and as a farmer I know that when");
      System.out.println("an animal is sick sometimes the right thing to do it put it");
      System.out.println("out of its misery. With the electricity we are using to keep");
      System.out.println("Meredith alive, we could power a small fan for two days.");
      System.out.println("");
      System.out.println("Michael: At least it was only Meredith, thank God. But did");
      System.out.println("you see the way they looked at me? Like I was a murderer or something.");
      System.out.println("");
      System.out.println("You: Wait, you ran over Meredith?");
      System.out.println("");
      System.out.println("{Michael retreats to his office and Dwight walks back to his desk.}");
      System.out.println("");
      System.out.println("The End");

    }
    else if(a.equals("work")){
      System.out.println("You: How do you guys like working here?");
      System.out.println("");
      System.out.println("Dwight: I'm actually trying to be Regional Manager so that");
      System.out.println("I can demote Jim Halpert. Then I'll need a new number two.");
      System.out.println("My ideal choice? Jack Bauer. But he is unavailable. Fictional. And overqualified.");
      System.out.println("");
      System.out.println("Michael: That's never going to happen.");
    }
    else if(a.equals("weather")){
      System.out.println("You:The weather decent today.");
      System.out.println("");
      System.out.println("{Michael and Dwight leave}");
      System.out.println("");
      System.out.println("The End");
    }
    else if(a.equals("weekend plans")){
      System.out.println("So, what are you guys up to this weekend?");
      System.out.println("");
      System.out.println("Dwight: Probably just hunting vampires. I don't have a lot of");
      System.out.println("experience with vampires, but I have hunted werewolves. I shot");
      System.out.println("one once, but by the time I got to it, it had turned back");
      System.out.println("into my neighbor's dog.");
      System.out.println("");
      System.out.println("Michael: Jesus, Dwight!");

    }
    else if(a.equals("flirt")){
      System.out.println("You: Michael, you're lookin' pretty nice today.");
      System.out.println("");
      System.out.println("Michael: That's what she said.");
      System.out.println("");
      System.out.println("Dwight: That's not how it works, Michael.");
      System.out.println("");
      System.out.println("You: So, do you wanna go out sometime? ;)");
      System.out.println("");
      System.out.println("Michael: No.");
    }
    else if(a.equals("poverty")){
      System.out.println("You: Poverty is bad.");
      System.out.println("");
      System.out.println("Michael: Yeah, povety sucks.");
      System.out.println("");
      System.out.println("Dwight: There are too many people on this earth.");
      System.out.println("We need a new plague.");
      System.out.println("");
      System.out.println("{You and Michael leave.}");
      System.out.println("");
      System.out.println("The End");
    }
    else if(a.equals("come at me bro")){
      System.out.println("You: COME AT ME, BRO!");
      System.out.println("");
      System.out.println("{Michael flees into the bathroom. Dwight pulls out}");
      System.out.println("his hunting knife from his boot.}");
      System.out.println("");
      System.out.println("Dwight: HYYYAAHHHH!");
      System.out.println("");
      System.out.println("{You die.}");
      System.out.println("");
      System.out.println("The End");

    }
    else if(a.equals("loan")){
      System.out.println("You: Can you guys lend me like $200? I need it to buy some bread.");
      System.out.println("");
      System.out.println("Dwight: Sure, that's reasonable.");
      System.out.println("");
      System.out.println("Michael: Hmm, I think you need more than that for bread.");
      System.out.println("");
      System.out.println("{Dwight hands you $200 and Michael hands you $100}");
      System.out.println("");
      System.out.println("Michael: That should do it!");
    }
    else if(a.equals("end conversation")){
      System.out.println("You: I have to go home now.");
      System.out.println("");
      System.out.println("Michael: Can you tell something to Jim for me?");
      System.out.println("");
      System.out.println("You: Sure, what is it?");
      System.out.println("");
      System.out.println("Michael: Well, Just tell him to call me as ASAP as possible.");
      System.out.println("");
      System.out.println("You: Uh, sure. Bye.");
      System.out.println("");
      System.out.println("Michael and Dwight: Bye!");
      System.out.println("");
      System.out.println("The End");
    }//topics and responses
    }
  }
}
