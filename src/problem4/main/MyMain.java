/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Mar-20
 *  Time: 2:52 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(3);
        obj.insert(30);
        obj.insert(36);
        obj.insert(13);
        obj.insert(18);
        obj.insert(7);

        MyQueue mq = new MyQueue();
        mq.preSuccessor(obj.getroot());
        mq.getPreSucc();
    }
}
