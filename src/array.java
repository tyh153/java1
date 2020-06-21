public class array {
    public static void main(String[] args) {
//        String[] arr = new String[10]; //创建一个10个格子的数据，有10个位置装数据，都是空的
        String[] games = {"LOL", "DNF", "绝地求生", "男友4"};
        String[] smallGames = new String[]{"cs", "红色警戒", "war3", "扫雷"};
        String[] arr = new String[5];
        arr[0] = "红色警戒";
        arr[1] = "war3";
        arr[2] = "CS";
        arr[3] = "英雄联盟";
        arr[4] = "男友5";

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        for (int i = 0; i < smallGames.length; i++){
            System.out.println(smallGames[i]);
        }
    }
}
