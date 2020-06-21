/*import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要喷的内容：");
            String content = sc.nextLine();
            if (content.equals("Q")) { //判断输入的是不是Q
                System.out.println("老子不和你们玩了!!!");
                break; //终止循环
            }
            System.out.println("您输入的内容是：" + content);
        }
        System.out.println("我是循环外面");
    }
}
*/



public class break_continue{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 7){
                continue;//我不喜欢7
            }
            System.out.println(i);
        }
    }
}