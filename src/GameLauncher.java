import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        System.out.println("******Game Start******");//遊戲開始
        TicTacToe t = new TicTacToe();

        while (t.isgamestart){
            System.out.print("Player-"+t.who()+", enter your move (row[1-3],column[1-3]):");//請玩家輸入座標(row,column)決定劃記位置
            Scanner scanner = new Scanner(System.in);//請使用者輸入值
            String input = scanner.nextLine();//接收使用者輸入的值

            t.go(input);
            t.printooxx();
        }



    }
}
