class Pieces{
    private char color;
    //getter and setter method of color
    public char getColor() {
        return color;
    }
    public void setColor(char color){
        this.color = color;
    }
}

public class ConnectBoard {
    private static int rows = 6;
    private static int columns = 7;

    //Pieces class declared as array
    Pieces[][] p = new Pieces[rows][columns];
    //pieces class object p is connect4 game-board

    //connect Board Constructor
    public ConnectBoard(){
        for(int i = 0;i< rows; i++){
            for (int j = 0;j<columns; j++){
                p[i][j] = null;
            }
        }
    }

    //i ==> row, And j==> column
    public void printGame(){

        for(int i = 0;i< rows; i++){
            System.out.print("|");
            for (int j = 0;j<columns; j++){
                if(p[i][j] == null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(p[i][j].getColor());
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    //insert color into the particular column
    boolean insertColorPieces(int rowNum, char color) {

        if (rowNum >= 0 && rowNum < rows) {
            //insert color
            if (p[rowNum][0] == null) {
                boolean colorInsert = false;
                for (int col = columns - 1; col >= 0; col--) {
                    if (p[rowNum][col] == null) {
                        p[rowNum][col] = new Pieces();
                        p[rowNum][col].setColor(color);
                        colorInsert = true;
                        break;
                    }
                }
                return colorInsert;
            } else {
                System.err.println("column is Full, choose another");
                return false;
            }
        } else {
            System.err.println("is not supported.");
            return false;
        }
    }


}
