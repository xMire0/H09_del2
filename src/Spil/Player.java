package Spil;

public class Player {
    private String name;
    public Account account;
    private int position = 0;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
        this.account = new Account();
        this.position = 0;
    }

    public void setPosition(int pos){
        this.position = ((pos)%13);

    }

    public int getPosition(){
        return position;
    }

}
