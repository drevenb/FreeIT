package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) {

        if(MyService.class.isAnnotationPresent(Version.class)) {
            MyService service = new MyService();

            try {
                Field nameField = service.getClass().getDeclaredField("name");
                Field versionField = service.getClass().getDeclaredField("version");
                Method method = service.getClass().getDeclaredMethod("thisClassInfo");

                nameField.setAccessible(true);
                versionField.setAccessible(true);
                method.setAccessible(true);

                nameField.set(service, "MyServiceName");
                versionField.set(service, 41259);
                method.invoke(service);

            } catch(NoSuchFieldException | NoSuchMethodException |
                    InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
