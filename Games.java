import core.data.*;
import java.util.ArrayList;

public class Games {
    
    public void GameThatPlayerSpendMostHours(){
        String filename = "Steamdata.csv";
        ArrayList<Steamgame> allGames = new ArrayList<Steamgame>(); 
        DataSource ds = DataSource.connect(filename);
        ds.load();
        allGames = ds.fetchList("Steamgame","userID","game","hoursThatPlayerPlay");
        
        
        double highestHour=0.0;
        String name =" ";
        int userName = 0;
        for(int i=0; i<allGames.size()-1; i++){
          if(allGames.get(i).getHoursThatPlayerPlay()>allGames.get(i+1).getHoursThatPlayerPlay()
          &&allGames.get(i).getHoursThatPlayerPlay()>highestHour){
              highestHour = allGames.get(i).getHoursThatPlayerPlay();
              name=allGames.get(i).getGame();
              userName = allGames.get(i).getUserID();
          }
      }
        System.out.println("What is the game on Steam that player spend most time?");
        System.out.println("");
        System.out.println("The game that player spend most time is "+name +"\n"+ "User "+ userName +" spends " +highestHour+" hours on it");
    
    }
}