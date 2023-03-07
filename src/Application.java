// import Polymorphism.Polymorphism;
// import Encapsulation.Encapsulation;
// import CastingNumericalValues.CastingNumericalValues;
// import Interfaces.Interfaces;
// import AnonymousClass.AnonymousClass;
// import ScannerClass.ScannerClass;
// import StringBuilderClass.StringBuilderClass;
// import ToStringClass.ToStringClass;
// import EqualsClass.EqualsClass;
// import TernaryOperator.TernaryOperator;
// import Exceptions.Exceptions;
// import Game.Game;
// import MultipleException.MultipleException;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.text.ParseException;
// import RuntimeExceptionClass.RuntimeExceptionClass;
// import AbstractClass.AbstractClass;
// import InnerClasses.InnerClasses;
// import PassingByValue.PassingByValue;
// import LambdaExpressions.LambdaExpressions;
// import EnumsAdvancedUsage.EnumsAdvancedUsage;
// import Serialization.Serialization;
// import ArrayListClass.ArrayListClass;
// import HashMapClass.HashMapClass;
// import LinkedHashMapClass.LinkedHashMapClass;
// import HashSetClass.HashSetClass;
// import SortingLists.SortingLists;

import Threads.Threads;
import Threads.RunnableClass;
import Threads.MultiThreads;

public class Application {
    public static void main(String[] args) {
        // Variable variableObj = new Variable();
        // variableObj.printVariable();
        // StringClass stringObj = new StringClass();
        // stringObj.printString();
        // While whileObj = new While();
        // whileObj.printWhile();
        // For forObj = new For();
        // forObj.printFor();
        // If ifObj = new If();
        // ifObj.printIf();
        // GettingUserInput gettingUserInput = new GettingUserInput();
        // gettingUserInput.print();
        // Switch switchClass = new Switch();
        // switchClass.print();
        // Array newArray = new Array();
        // newArray.print();
        // MultiDimensionalArray newMultiDimensionalArray = new MultiDimensionalArray();
        // newMultiDimensionalArray.print();
        // Objects newObjects = new Objects();
        // newObjects.print();
        // Car car = new Car();
        // Truck truck = new Truck();
        // Constructors constructors = new Constructors();
        // constructors.print();
        // StudentApp studentApp = new StudentApp();
        // studentApp.print();
        // CarApp carApp = new CarApp();
        // carApp.print();
        // Polymorphism polymorphism = new Polymorphism();
        // polymorphism.print();
        // Encapsulation encapsulation = new Encapsulation();
        // encapsulation.print();
        // CastingNumericalValues castingNumericalValues = new CastingNumericalValues();
        // castingNumericalValues.print();
        // Interfaces interfaces = new Interfaces();
        // interfaces.print();
        // AnonymousClass anonymousClass = new AnonymousClass();
        // anonymousClass.print();
        /** try {
            ScannerClass.getScannerClass().print();
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e);
        }*/
        // StringBuilderClass builder = StringBuilderClass.getStringBuilderClass();
        // builder.print();
        // ToStringClass toStringClass = ToStringClass.getToStringClass();
        // toStringClass.print();
        // EqualsClass equalsClass = EqualsClass.getEqualsClass();
        // equalsClass.print();
        // TernaryOperator ternaryOperator = TernaryOperator.getTernaryOperator();
        // ternaryOperator.print();
        // Game game = Game.getGame();
        // game.start();
        // Exceptions exceptions = Exceptions.getExceptions();
        // try {
        //    exceptions.print();
        // } catch (FileNotFoundException e) {
        //    System.out.println("File not found");
        // }
        // MultipleException multipleException = MultipleException.getMultipleException();
       /** try {
            multipleException.start();
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (ParseException e) {
            System.out.println("ParseException");
        } */
        /** try {
            multipleException.start();
        } catch (IOException|ParseException e) {
            System.out.println("ParseException or IOException");
        }*/

        /** try {
            multipleException.example();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        } */
        // RuntimeExceptionClass runtimeExceptionClass = RuntimeExceptionClass.getRuntimeExceptionClass();
        // runtimeExceptionClass.start();
        // AbstractClass ac = AbstractClass.getAbstractClass();
        // ac.start();
        // InnerClasses ic = InnerClasses.getInnerClasses();
        // ic.start();
        // PassingByValue pbv = new PassingByValue();
        // pbv.print();
        // LambdaExpressions le = new LambdaExpressions();
        // le.print();
        // EnumsAdvancedUsage eau = new EnumsAdvancedUsage();
        // eau.print();
        // Serialization serialization = new Serialization();
        // serialization.print();
        // ArrayListClass alc = new ArrayListClass();
        // alc.print();
        // HashMapClass hmc = new HashMapClass();
        // hmc.print();
        // LinkedHashMapClass lhm = new LinkedHashMapClass();
        // lhm.print();
        // HashSetClass hsc = new HashSetClass();
        // hsc.print();
        // SortingLists sl = new SortingLists();
        // sl.print();
        // Threads threads1 = new Threads();
        // Thıs will make sure code runs on its separate thread
        // threads1.start();
        // Threads threads2 = new Threads();
        // This will run on a 2nd thread thus can work simultaneously with thread 1
        // threads2.start();

        // Thread thread1 = new Thread(new RunnableClass());
        // Thread thread2 = new Thread(new RunnableClass());
        // thread1.start();
        // thread2.start();

        MultiThreads mt = new MultiThreads();
        mt.start();
    }
}
