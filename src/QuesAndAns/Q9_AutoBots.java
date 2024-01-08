package QuesAndAns;

import java.lang.reflect.Field;

public class Q9_AutoBots {
    static {

        try {
            Field value =String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Jawan", value.get("Here's jawan"));
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) throws Exception{

        System.out.println("Hello Jawan");
    }
}
