import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Tiền đang có
        int money = 11000;
        //Menu
        switch (money){
            case 12000:
            case 15000:
            case 20000: {
                System.out.println("Cafe đá");
                break;
            }
            case 10000:{
                System.out.println("Sting dâu");
                break;
            }
            case 2000:{
                System.out.println("Trà đá");
                break;
            }
            default:{
                System.out.println("Không có đồ uống nào phù hợp");
                break;
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào ngày");
        int day=sc.nextInt();
        switch (day){
            case 0:{
                System.out.println("Hôm nay là thứ 2");
                break;
            }
            case 1:{
                System.out.println("Hôm nay là thứ 3");
                break;
            }
            case 3:{
                System.out.println("Hôm nay là thứ 4");
                break;
            }
            case 4:{
                System.out.println("Hôm nay là thứ 5");
                break;
            }
            case 5:{
                System.out.println("Hôm nay là thứ 6");
                break;
            }
            case 6:{
                System.out.println("hôm nay là thứ 7");
                break;
            }
        }


    }
}
