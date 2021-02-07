/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Mar-20
 *  Time: 2:52 PM
 */
package problem3.node;


public class Node {
    String name;
    int roll;
    Node next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
