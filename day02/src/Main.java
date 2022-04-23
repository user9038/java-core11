public class Main {
    public static void main(String[] args) {
        String text = "Xin chào các bạn";
        System.out.println("in hoa chữ"+text.toUpperCase());
        System.out.println("in thường chữ"+text.toLowerCase());
        System.out.println("in dài chữ"+text.length());
        System.out.println("in ký tự đầu chữ"+text.charAt(0));
        System.out.println("ký tự cuối cùng của chữ chữ"+text.charAt(text.length()-1));
        System.out.println("chuỗi hi có chỉ số bắt đầu là : " + text.indexOf("hi"));
        System.out.println("chuoi ch co chi so bat dau la" + text.indexOf("ch"));
        System.out.println("chuoi hi co ton tai trong chuoi ban dau k" + text.contains("hi"));
        System.out.println("chuoi ch co ton tai trong chuoi ban dau k" + text.contains("ch"));
        System.out.println("cắt chuỗi xin :" +text.substring(0,3));
        System.out.println("Cắt chuỗi chào các bạn :" + text.substring(4));

    }

    // Khởi tạo = từ khóa new
    //Method string

}

