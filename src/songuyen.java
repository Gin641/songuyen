import java.sql.SQLOutput;
import java.util.Scanner;

public class songuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số: ");
        int num = sc.nextInt();
        if (num < 2)
            System.out.println(num + "k phải là số nguyên");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + " là số nguyên");
            else
                System.out.println(num + " k phải là số nguyên");
        }
    }
}
