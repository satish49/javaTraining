/*
 * This programe is to create two threads and read alternatinve data in list 
 */
package training.java.satish;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class ThreadConceptExample {
    public static void main(String[] args) {

        System.out.println("************Create two threads and read list data alternative index*************");
        System.out.println("---------------------------------------------------------------------------------");


        //get obj og SetDataInList and call insertData() to intialize some data to list
        SetDataInList list = SetDataInList.getInstance();

        List<String> data =new ArrayList<String>();
        for(int i=0; i< 5 ;i++)
            data.add("data"+i);

        //
        list.setMyData(data);
        //list.insertData();


        //Create objects for Runnable implemented threads and create Thread for those objects
        ThreadOne tOne = new ThreadOne(); //ThreadOne runnable object
        ThreadTwo tTwo = new ThreadTwo(); //ThreadTwo runnable object

        Thread t1 = new Thread(tOne); // create thread for ThreadOne runnable object
        Thread t2 = new Thread(tTwo); // create thread for ThreadTwo runnable object

        t1.start(); //start ThreadOne related thread

        t2.start(); //start ThreadTwo related thread
    }
}
