import java.util.Random;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        // Thực hiện công việc "Thức dậy lúc 7h"lặp đi lặp lại"
        //for (int day = 1; day <=30; day++){
          //  System.out.println("Ngày"+day+"Thức dậy lúc 7h ");
       // }
        //thực hiện công việc 'thức dậy lúc 7h' vào những ngày lẻ,ngày chẵn
        //for (int day = 1; day <=30; day++){
          //  if (day%2==1){
              //  System.out.println("Ngày"+day+"thức dậy lúc 7h");
            //}
       // for (int day = 1; day <=30; day+=2){
         //   System.out.println("Ngày"+day+"Thức dậy lúc 7h");
        //}

        //Break
       // for (int day = 1; day <=30; day++){
         //   if (day==20){
           //     System.out.println("Chán quá k thực hiện nữa");
             //   break;
            //}
            //System.out.println("Ngày"+day+"Thức dậy lúc 7h");
        //}
        // Continu:nghỉ xả hơi vào những ngày cuối tuần
        //for (int day = 1; day <=30; day++){
          //  if (day%7==0){
            //    System.out.println("Nghỉ xả hơi");
              //  continue;
            //}
            //System.out.println("ngày"+day+"thức dậy lúc 7h");
        //}

        //TÍNH TỔNG TIỀN TIẾT KIỆM
        //TRONG VÒNG 10 NGÀY MỖI NGÀY TIẾT KIỆM 100K=>1000K
        //KHI CHƯA BẮT ĐẦU THÌ SỐ TIỀN ĐANG CÓ LÀ 0K
        //int money=0;
        //for (int day =1;day<=10;day++){
           // money = money + 100_000;
            //money +=100_000;
        //}
        //System.out.println("số tiền tiết kiệm được là :" +money);

        //Random n số ngẫu nhiên trong khoảng từ 0 ->100. Nhập vào từ bàn phím
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Bạn muốn random bao nhiêu số");
        int count = sc.nextInt();
        for (int i=0;i <count;i++){
            int numberRandom = rd.nextInt(101);
            System.out.println(numberRandom+"\t");
            if (numberRandom>90){
                break;
            }
            System.out.println(numberRandom+"\t");

        }
        }

    }

