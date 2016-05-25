/*
 * this class contatin actual data with setter and getter methods
 */

package training.java.satish;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class SetDataInList {

    private List<String> myList=new ArrayList<String>();
    private static SetDataInList me=null;

    //for singlton implementation
    public static SetDataInList getInstance()
    {
        if(me==null)
            me=new SetDataInList();

        return me;
    }

    //return MyData
     public List getMyData()
    {
        return myList;
    }

     //set MyData
    public void setMyData(List data)
    {
        myList=data;
    }
}
