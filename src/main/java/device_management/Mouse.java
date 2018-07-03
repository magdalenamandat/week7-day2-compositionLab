package device_management;

public class Mouse {
    private String type;
    private int numOfButtons;


    public Mouse(String type, int numOfButtons){
        this.type = type;
        this.numOfButtons = numOfButtons;
    }

    public String getType(){
        return this.type;
    }

    public int getNumOfButtons(){
        return this.numOfButtons;
    }
}
