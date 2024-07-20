package OOP._06_Reflection_Exersise._02_Black_Box_Integer;

import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class boxClass = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = boxClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);

        Field innerValueField = boxClass.getDeclaredField("innerValue");
        innerValueField.setAccessible(true);

        BlackBoxInt box = constructor.newInstance(0);

        Scanner scanner = new Scanner( System.in );
        String[] command = scanner.nextLine().split("_");

        while (!command[0].equals("END")) {
            String action = command[0];
            int value = Integer.parseInt(command[1]);
            invokeMethodByName(action, value, box, boxClass);
            System.out.println(innerValueField.get(box));

            command = scanner.nextLine().split("_");
        }

    }
    private static void invokeMethodByName(String methodName, int value, BlackBoxInt box, Class boxClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = boxClass.getDeclaredMethod(methodName, int.class);
        method.setAccessible(true);
        method.invoke(box, value);
    }
}
