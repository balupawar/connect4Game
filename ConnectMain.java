import java.util.Scanner;

public class ConnectMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ConnectBoard cb = new ConnectBoard();
//        cb.printGame();
//        cb.insertColorPieces(0,'r');
//        cb.insertColorPieces(1,'y');
//        cb.insertColorPieces(2,'r');
//        cb.insertColorPieces(3,'r');
//        cb.insertColorPieces(4,'r');
//        cb.insertColorPieces(5,'r');
//        cb.insertColorPieces(0,'r');
//        cb.printGame();


            char Player1choice;
            char Player2choice;
            System.out.println("Player 1 Choose the color either 'r' or 'y': ");
            System.out.println("1.red\n2.yellow");
            int choice = sc.nextInt();
            switch(choice){

                case 1:
                    Player1choice = 'r';
                    break;
                case 2:
                    Player1choice = 'y';
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            if(Player1choice=='r'){
                Player2choice = 'y';
            }
            else{
                Player2choice = 'r';
            }


        while(true) {
            cb.printGame();
            System.out.println();
            System.out.println("Player1 Enter the rowNumber between 0 to 5");
            int rowsNumber = sc.nextInt();
            cb.insertColorPieces(rowsNumber,Player1choice);
            cb.printGame();
            System.out.println("Player2 Enter the rowNumber between 0 to 5");
            int rowsNumber2 = sc.nextInt();
            cb.insertColorPieces(rowsNumber2,Player2choice);
        }


    }
}
