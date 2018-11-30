public class Person {
    public void say(String sentence) {
        System.out.println(sentence);
    }

    public static void main(String[] args) {
        Person x = new Person();
        Person y = new Person();
        x.say("你是什么人？");
        y.say("大王叫我来巡山！");
        x.say("说出口令,天王盖地虎");
        try {
            y.say("大王一米五");
            throw new Defult("口令错误");    //抛出异常
        } catch (Exception e) {                 //捕获异常
            System.out.println("错误");          //处理异常
        }
    }
}

class Defult extends Exception {                 //自定义异常
    public Defult(String msg) {
        super(msg);
    }
}