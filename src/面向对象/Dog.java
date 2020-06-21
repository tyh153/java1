package 面向对象;

public class Dog {
    static String type = "狗";
    //定义属性
    String name;
    int age;

    //构造方法，方法名与类名保持一支，不需要指定返回值类型，不需要有返回值
    public Dog(){
        //作用：完成对类的初始化
        System.out.println("调用了Dog()");
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("调用了Dog(String name, int age)");
    }

    //定义行为
    public void bark(){
        System.out.println(name + "在叫");
    }
    public void chase(){
        System.out.println(name + "正在捉老鼠");
    }
}
