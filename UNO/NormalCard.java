public class NormalCard extends Card{
    protected int num; //0-9

    public NormalCard(int i,int color1){
	color = color1; // 1: red, 2: blue, 3: yellow, 4: green
	num = i;
	pointVal = i; //Number cards count their face value
    }//end overloaded constructor
    
}//end class
