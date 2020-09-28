package additionaltask4;

import java.io.*;

public class AddTask_4 {
    public static void main(String[] args) {
        Car car = new Car("BMW", 320, 54_500);

        File file = new File("src\\additionaltask4\\car.data");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(file);
            if(fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(car);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Car copyOfCar = null;

        try {
            fis = new FileInputStream(file);

            if(fis != null) {
                ois = new ObjectInputStream(fis);
                copyOfCar = (Car) ois.readObject();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(copyOfCar);
    }
}
