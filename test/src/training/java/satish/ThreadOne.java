/*
 * ThreadOne class is one of Runnable iterface implemented class and this thread can access only odd indexed data
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
public class ThreadOne implements Runnable {

    public void run() {

        //get data from SetDataInList
        SetDataInList da = SetDataInList.getInstance();
        List<String> data = da.getMyData();

        //now read data using iterator
        Iterator itr = data.iterator();

        //for indexing, use this
        int j = 0;
        while (itr.hasNext()) {
            //read next element of list
            Object obj = itr.next();

            //check index is even , if yes process next
            if (j % 2 == 0) {

                /*
                 *This is for just sample using thread sleep() feature to showcase in this prog
                 *If index is 2, sleep current running thread for 2 seconds
                */
                 if(j==2)
                {
                    try {
                        System.out.println("---------current thread "+Thread.currentThread().getName() +" is sleep for 2 sec");
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                 System.out.println("from ThreadOne  index =" + j + " and data is " + obj.toString());
                }

            j++;
        }
    }
}
