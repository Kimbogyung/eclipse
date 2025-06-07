
package rsp;
import java.util.Random;
import java.util.Scanner;

public class rsp_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int lose = 0;

        System.out.print("게임을 몇 판 할까요? (숫자만 입력) : ");
        int game = sc.nextInt();
        System.out.println("게임을 " + game + "판 진행하겠습니다.");
        System.out.println();


        for (int i = 1; i <= game; i++ ) {

            System.out.print("가위 바위 보! (가위:2 바위:0 보:5 숫자로 입력) : ");
            int user = sc.nextInt();

            Random rand = new Random();
            int [] rsp = {2, 0, 5};
            int java = rsp[rand.nextInt(3)];
            System.out.println("java : " + java);

            switch (user) {
                case 2:
                    if (java == 5) {
                        win++;
                        System.out.println("이겼습니다 !");
                    } else if (java == 0) {
                        lose++;
                        System.out.println("졌습니다~");
                    } else if (java == 2) {
                        System.out.println("비겼습니다");
                    }
                    break;

                case 0:
                    if (java == 2) {
                        win++;
                        System.out.println("이겼습니다 !");
                    } else if (java == 5) {
                        lose++;
                        System.out.println("졌습니다~");
                    } else if (java == 0) {
                        System.out.println("비겼습니다");
                    }
                    break;

                case 5:
                    if (java == 0) {
                        win++;
                        System.out.println("이겼습니다!");
                    } else if (java == 2) {
                        lose++;
                        System.out.println("졌습니다~");
                    } else if (java == 5) {
                        System.out.println("비겼습니다");
                    } 
                    break;
                default:
                    System.out.println("2,0,5 중에서 다시 입력");
                    i--;

            }   System.out.println("(" + (game-i)+ "판 남았습니다)");
            System.out.println();
        }
        System.out.println(win + "승" + lose + "패");
    }

}
