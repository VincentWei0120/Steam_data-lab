public class Steamgame {
    private int userID;
    private String game;
    private String purchaseOrPlay;
    private double hoursThatPlayerPlay;
    private int refund;
    
    public Steamgame(int userID, String game, double hoursThatPlayerPlay)
    {
        this.userID = userID;
        this.game = game;
        this.hoursThatPlayerPlay = hoursThatPlayerPlay;
    }
    public Steamgame(int userID, String game, String purchaseOrPlay, double hoursThatPlayerPlay, int refund)
    {
        this.userID = userID;
        this.game = game;
        this.purchaseOrPlay = purchaseOrPlay;
        this.hoursThatPlayerPlay = hoursThatPlayerPlay;
        this.refund = refund;
    }
    public int getUserID()
    {
        return userID;
    }
    public String getGame()
    {
        return game;
    }
    public String getPurchaseOrPlay()
    {
        return purchaseOrPlay;
    }
    public double getHoursThatPlayerPlay()
    {
        return hoursThatPlayerPlay;
    }
    public int getRefund()
    {
        return refund;
    }
}