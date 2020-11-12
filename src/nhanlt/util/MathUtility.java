/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanlt.util;

/**
 *
 * @author DELL
 */
public class MathUtility {

    // class nay chứa các hàm tiện ích dùng chung cho mọi nên do đó nó phải nên xài static
    public static final double PI = 3.1415;

    // ham tinh n giai thua n >= 0 vaf n <= 20
    // neu 20 tran kieu long
    // 0! = 1, 1!=1, n!=1.2.3.4.5....n
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be n >= 0 & n <= 20");
        }
        // đưa đầu vào cà chớn mình ko trả về một giá trị để ám chỉ sai rồi 
        if (n == 0 || n == 1) {
            return 1;
        }
        // sống sót đên đây , thì n > 1 và  <= 20 rồi
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        //2 test hàm = mắt
        System.out.println("100" + getFactorial(20));
        System.out.println("5! " + getFactorial(-5));
    }
    
    // IllegalArgumentException nếu gt -5
}

// code viết ra thì Dev phải trước cái đã
// có vài hình thức test khác nhau
//1. TDD, test driven development
    // viết dàn khung của hàm getFactorial(int n)
    // sau đó dựng hàm test()
    // chạy thử coi xanh đỏ, đó nghĩa là lỗi, xanh nghĩa là ổn
    // cứ liên tục xanh đỏ như thế trong quá trình viết code
    // và sửa code thì ng ta gọi lập trình hướng theo thỏa mãn việc test TDD.
// 2. sout (hàm kèm data) để coi kết quả ra sao, có đúng như mình kì vọng
    // nó phải trả về như thế này hay ko --> xem kết quả test, = mắt
// 3 JOptionPane của bên JavaDesktop để popup kết quả lên màn hình
    // xem = măt
//4 Viết 1 trang web gọi hàm xử lí
// Sử dụng cách 1 và 2