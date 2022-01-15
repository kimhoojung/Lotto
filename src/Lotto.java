package src;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args){
        System.out.println(">> 로또 프로그램  ");
        while (true) {

            System.out.println("숫자 6개를 입력해 주세요");
            int arr[] = new int[6];
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0 && arr[i] <= 65) {
                } else {
                    System.out.println("범위를 넘었습니다.");
                    i--;
                }
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("중복입니다.");
                        i--;
                    }
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("당신이 입력한 숫자는 : ");
            for (int i = 0; i < 6; i++) {
                System.out.print(arr[i] + " ");
            }

            Random ram = new Random();
            int comarr[] = new int[6];
            for (int i = 0; i < 6; i++) {
                comarr[i] = ram.nextInt(65) + 1;
                for (int j = 0; j < i; j++) {
                    if (comarr[i] == comarr[j]) {
                        i--;
                    }
                }
                for (int j = 0; j < 6; j++) {
                    if (comarr[i] < comarr[j]) {
                        int temp = comarr[i];
                        comarr[i] = comarr[j];
                        comarr[j] = temp;
                    }
                }
            }
            System.out.print("로또 당첨 번호는 : ");
            for (int i = 0; i < 6; i++) {
                System.out.print(comarr[i] + " ");
            }


            System.out.println("\n\n\n\n");
            int cont = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (arr[i] == comarr[j]) {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
                System.out.println("꼴등 !!!");
            } else if (cont == 1) {
                System.out.println("6등 !!!");
            } else if (cont == 2) {
                System.out.println("5등 !!!");
            } else if (cont == 3) {
                System.out.println("4등 !!!");
            } else if (cont == 4) {
                System.out.println("3등 !!!");
            } else if (cont == 5) {
                System.out.println("2등 !!!");
            } else if (cont == 6) {
                System.out.println("1등 !!!");
            } else {
                System.err.println("오류 !!!");
            }

            System.out.println("계속 진행하시겠습니까? y/n");
            String yn = sc.next();
            if (yn.equals("y") || yn.equals("Y")) {
                System.out.println(">> 계속 진행하겠습니다.");
                continue;
            } else if (yn.equals("n") || yn.equals("N")) {
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요 !!!");
                yn = sc.next();
            }
        }
    }

}
