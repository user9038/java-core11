public class OperatorDemo {
    public static void main(String[] args) {
        int a =30;
        int b =10;
        // toan tu ++
        // c=a ->c=30;
        int c=a++;
        System.out.println(c);
        System.out.println(a);
        // a tăng lên 1 ->a =32;
        // d=a=32;
        int d=++a;
        System.out.println(d);
        System.out.println(a);
        //b=10;a=32
        int e =a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        // a tăng lên 1->a=34
        // b tăng lên 1->b=12
        // f=a+b=46
        int f= ++a + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        // VÍ dụ &&
        boolean coTien =true;
        boolean troiDep=true;
        System.out.println(coTien&&troiDep);// true && true =>true
        //Toán tử hoặc ||
        System.out.println(!coTien||!troiDep);// false || false=>false

        int number=20;
        number=number+10;// 30,
        number+=10;
        number-=10;// number=number -10;
    }

}
