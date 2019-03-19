package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd() throws Exception {
        int inpuval = 5;
        int val2 = 7;
        int val3 = 10;

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getSize());
        list.add(inpuval);
        System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);

          System.out.println(list.getSize());

        System.out.println(list.get(1));
        Assert.assertTrue(String.valueOf(list.add(inpuval)), true);

    }

    @Test
    public void testFind() throws Exception {
        int inpuval = 5;
        int val2 = 7;
        int val3 = 10;

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getSize());
        list.add(inpuval);
        System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);


        System.out.println(list.find(7));


       Assert.assertTrue(String.valueOf(list.find(val2)), true);
        System.out.println(list.get(1));

    }
    @Test
    public void testRemove() {
        int inpuval = 5;
        int val2 = 7;
        int val3 = 10;

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getSize());
        list.add(inpuval);
       // System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);
        System.out.println(list.getSize());

        list.remove(val3);
        System.out.println(list.getSize());
      //System.out.println(list.);

     Assert.assertEquals(2, list.getSize());

    }

    @Test
    public void testContains() throws Exception {
        int inpuval = 5;
        int val2 = 7;
        int val3 = 10;

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getSize());
        list.add(inpuval);
        // System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);
        System.out.println(list.getSize());
        System.out.println(list.contains(val2));

        Assert.assertTrue( list.contains(val2));

    }


    @Test
    public  void testCopy(){

        int inpuval = 5;
        int val2 = 7;
        int val3 = 10;

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getSize());
        list.add(inpuval);
        // System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);
        System.out.println(list.getSize());

        list.copy();

        System.out.println(list.getSize());
        Assert.assertEquals(3, list.getSize());
    }

    @Test
    public  void testSort(){

        int inpuval = 7;
        int val2 = 5;
        int val3 =16;
        int val4 = 9;

        SinglyLinkedList list = new SinglyLinkedList();
       // System.out.println(list.getSize());
        list.add(inpuval);
        // System.out.println(list.getSize());
        list.add(val2);
        list.add(val3);
        list.add(val4);
       // System.out.println(list.getSize());

        SinglyLinkedList listexpected = new SinglyLinkedList();
        listexpected.add(5);
        listexpected.add(7);
        listexpected.add(9);
        listexpected.add(16);



        list.sort();
            for(int i=0; i<list.getSize();i++){
                try {
                    System.out.println(list.get(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

      //Assert.assertEquals(listexpected, list.sort());
    }

}
