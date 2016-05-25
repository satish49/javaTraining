/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package training.java.satish;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Satish
 */
public class ThreadTwo implements Runnable {

    public void run() {
        //get data from SetDataInList
        SetDataInList da = SetDataInList.getInstance();
        List<String> data = da.getMyData();

        //now read data using iterator
        Iterator itr = data.iterator();

        //for indexing, use this
        int k = 0;
        while (itr.hasNext()) {
            //read next element of list
            Object obj = itr.next();

            //check index is odd , if yes process next
            if (k % 2 == 0) {

                /*
                 *This is for just sample using thread sleep() feature to showcase in this prog
                 *If index is 1, sleep current running thread for 1 seconds
                */

               if(k==1)
               {
                   System.out.println("---------current thread "+Thread.currentThread().getName() +" is yield for next priority thread");
                   Thread.yield();
               }
                System.out.println("from ThreadTwo  index =" + k+ " and data is "+obj.toString());
           }
            
           k++;
        }
    }

}
