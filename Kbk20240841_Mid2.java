package rsp2;
import java.util.Random;
import java.util.Scanner;

public class rsp_game2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int [] num = {1,2,3,4};
		
		int my_team = 0;
		int java_team = 0;
		boolean turn = true;
		int user = -1;
		
		System.out.println("\"참참참 게임으로 팀원 5명을 더 빨리 모으세요\"");
		System.out.println("이기면 게임을 계속 진행하고, 지면 상대에게 기회가 넘어갑니다");
		System.out.println();
		
		while (my_team < 5 && java_team < 5) {
			if (turn) {
				System.out.print("당신 차례 ~~참참참~~ (왼쪽(1) 오른쪽(2) 위(3) 아래(4) : ");
				user = sc.nextInt();
				int java = num[rand.nextInt(4)];
				System.out.println("java : " + java);
				
				
				if (user != java) {
					my_team += 1;
					System.out.println("축하합니다! 팀원 한 명을 데려옵니다. 현재 팀원 : " + my_team);
				} else {
					System.out.println("당신이 졌습니다. 컴퓨터에게 기회가 넘어갑니다.");
					System.out.println();
					turn = false;
				}				
			}
			else {
				System.out.println("컴퓨터 차례 ~~참참참~~");
				int java = num[rand.nextInt(4)];
				System.out.print("컴퓨터가 어떤 선택을 할지 맞춰보세요 (왼쪽(1) 오른쪽(2) 위(3) 아래(4) : ");
				user = sc.nextInt();
				
				if (java != user) {
					java_team += 1;
					System.out.println("컴퓨터가 이겼습니다! 컴퓨터 팀원 : " + java_team);
				} else {
					System.out.println("컴퓨터가 졌습니다. 당신에게 기회가 넘어갑니다.");
					System.out.println();
					turn = true;
				}
			}
			
			if (my_team >= 5) {
				System.out.println("축하합니다 먼저 팀원 5명을 모아서 승리했습니다 ! ");
				break;
			}
			if (java_team >= 5) {
				System.out.println("컴퓨터가 먼저 팀원 5명을 모아서 졌습니다...");
			}
			
			
		}
	
		
		
		
	}

}
