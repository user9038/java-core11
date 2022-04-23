import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào cân nặng");
        double weight=sc.nextDouble();
        System.out.println("Nhập chiều cao");
        double height=sc.nextDouble();

        double bmi=weight/(height*height);
        if (bmi<18.5){
            System.out.println(" BMI Thiếu cân");
        } else if (bmi>24.9){
            System.out.println(" BMI Thừa cân");
        }else if (bmi>=18.5&&bmi<=24.9){
            System.out.println(" BMI bình thường");
        }


    }
}
