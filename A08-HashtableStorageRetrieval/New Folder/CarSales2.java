import java.util.*;
public class CarSales2{
   public static void main(String arg[ ])throws Exception{
   
   
   int size = 11;
   String makeModel = "Honda";
   int serialNumber =100;
   int year=1999;
   Car c = new Car(makeModel, year, serialNumber);
   CarInventory vehArray = new CarInventory(size);
   
   makeModel = "Honda";
   serialNumber =100;
   year=1999;
   
   c = new Car(makeModel, year, serialNumber);

   vehArray.addCar(c);
   
   makeModel = "Honda";
   serialNumber =200;
   year=1998;
   
   c = new Car(makeModel, year, serialNumber);
   
   vehArray.addCar(c);
   
   makeModel = "Honda";
   serialNumber =300;
   year=1999;
   
   c = new Car(makeModel, year, serialNumber);
   
   vehArray.addCar(c);
   
   makeModel = "Honda";
   serialNumber =199;
   year=1999;
   
   c = new Car(makeModel, year, serialNumber);
   
   vehArray.addCar(c);
   
   serialNumber = 200;
   
   //might not work well between using menu options-possibly create another Car(serialNumber) method
   c = new Car(makeModel, year, serialNumber);
   
   vehArray.viewCar(c);
   
   serialNumber = 200;
   c = new Car(makeModel, year, serialNumber);
   //might not work well between using menu options-possibly create another Car(serialNumber) method
   
   vehArray.removeCar(serialNumber);
   
   vehArray.printInventory();
   vehArray.getNumberOfCars();
   }
   
   
   
   
   
   }