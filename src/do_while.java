import java.util.Random;
import java.util.Scanner;

public class do_while{
    public static void main(String[] args) {
        //随机数生成器
        Random rd = new Random();
        //创建一个整数随机数 [0,100)
        int n = rd.nextInt(100);

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("请输入一个0-99之间的数字：");
            int you = sc.nextInt();
            if (you > n){
                System.out.println("猜大了：");
            }else if (you < n){
                System.out.println("猜小了：");
            }else {
                System.out.println("猜对了!");
                flag = false;
            }
        }while (flag);
    }
}

