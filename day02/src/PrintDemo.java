public class PrintDemo {
    public static void main(String[] args) {
        System.out.println(" My name is Hiên ");
        System.out.println("My name is Hiên\n");
        System.out.println("\tI'm fine\n");

        System.out.printf("My name is %s. I'm %d years old. Point=%2f\n","Hiên",25,9.872829);
        // Bảng dữ liệu cơ bản
        // name - email - age
        System.out.printf("%-20s %-20s %-10s\n" , " Họ tên ","Email","Tuổi");
        System.out.printf("%-20s %-20s %-10d\n" , " Bùi Hiên ","hien@gmail.com",25);
        System.out.printf("%-20s %-20s %-10d\n" , "Nguyễn Văn a ","a@gmail.com",21);
        System.out.printf("%-20s %-20s %-10d\n" , " Minh duy ","duy@gmail.com",30);



    }
}
