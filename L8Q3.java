/*Create an interface called “sports” with methods getNumberOfGoals and dispTeam. 
Create classes Hockey and football that uses the interface “sports”. 
Write the appropriate code for the methods.*/

package lab8;

interface sports{
    int getNumberOfGoals();
    void dispTeam();
}

class Hockey implements sports{
    public int getNumberOfGoals(){
        return 5;
    }
    public void dispTeam(){
        System.out.println("6 players of the team are: ");
        for(int i=1;i<7;i++)
            System.out.print("Player "+i+"\t");
        System.out.println();
    }
}

class Football implements sports{
    public int getNumberOfGoals(){
        return 3;
    }
    public void dispTeam(){
        System.out.println("11 players of the team are: ");
        for(int i=1;i<12;i++)
            System.out.print("Player "+i+"\t");
        System.out.println();
    }
}

public class L8Q3 {
    public static void main(String[] args){
    sports h=new Hockey();
    sports f=new Football();
    h.dispTeam();
    System.out.println("The number of goals scored in this Hockey game are "+h.getNumberOfGoals());
    f.dispTeam();
    System.out.println("The number of goals scored in this Football game are "+f.getNumberOfGoals());
    }
}
