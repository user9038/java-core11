import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
       // Khởi tạo đối tượng scanner
       Scanner sc = new Scanner(System.in);
         System.out.println("Nhập tên");
         String name=sc.nextLine();
         System.out.println("Nhập quê quán");
        String address= sc.nextLine();

         //System.out.println("nhập tuổi");
        //int age = sc.nextLine();
        //System.out.println("Nhập email");
       // String email= sc.nextLine();

        //System.out.println("Tôi tên là " + name + " Năm nay tôi " + age + " Tuổi,quê quán ở " + address+ "Email="+ email);
        //System.out.println("Nhập cân nặng (kg)");
        //double weight = sc.nextDouble();
        //System.out.println("Nhập chiều cao (m)");
       // double height = sc.nextDouble();
        //System.out.println(" Với weight = " + weight + " và height = " + height + " thì chỉ số BMI = " + calculateBMI(weight, height));

    }


}
