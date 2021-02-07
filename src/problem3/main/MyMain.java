/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Mar-20
 *  Time: 2:52 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("aryan", 1);
        obj.insert("nikhil", 4);
        obj.insert("shukl", 3);
        obj.insert("prateek", 2);
        obj.insert("ritik", 5);
        obj.display();
    }
}
