public class Finalkeyworld {
    //public static final int age = 30;
    public final int age =30;
    public static void main(String[] args) {
        //Khai báo vừa khởi tạo giá trị
        final String name = "anna";
        //Khai báo trước khởi tạo giá trị
        final double PI;
        PI=3.14;
        //khai báo bằng hằng số nên viết hoa
        final String FIRST_NAME ="bob";
        System.out.println(name);
        System.out.println(PI);
        System.out.println(FIRST_NAME);
        //tham chiếu đến biến global
        //System.out.println(age);
        Finalkeyworld f= new Finalkeyworld();
        System.out.println(f.age);
        System.out.println(f.sum(10,20));
    }
    public static final int sum(int a,int b) {
        return a + b;
    }
}
