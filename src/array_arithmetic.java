//import java.util.Scanner;
//
//public class array_arithmetic{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个正整数：");
//        int num = sc.nextInt();
//
//        int i;
//        boolean flag = true;
//        for (i = 2; i < num; i++){
//            if (num%i == 0){
//                System.out.println(num + "不是一个质数");
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag){
//            System.out.println(num + "是一个质数");
//        }
//    }
//}


public class array_arithmetic{
    public static void main(String[] args) {
        int[] arr = {1,55,2,17,8,12,5};
        for(int j = 0 ; j < arr.length; j++){
            for(int i = 0 ; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}



//public class array_arithmetic{
//    public static void main(String[] args) {
//        int[] arr = {1,55,2,17,8,12,5};
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        System.out.println("最大数是：" + max);
//    }
//}


//public class array_arithmetic{
//    public static void main(String[] args) {
//        int[] arr = {1,55,2,17,8,12,5};
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            int n = arr[i] * arr[i];
//            sum += n;
//        }
//
//        System.out.println(sum);
//    }
//}