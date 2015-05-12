/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;

/**
 *
 * @author Kevin Matamoros
 */
public class Cola<T> {

    public Nodo front;
    public Nodo rear;
    public int size;

    public Cola() {
        front = null;
        rear = front;
        size = 0;
    }
    
    public void Devolverse(Nodo Mamon){
        Mamon.setNext(front);
        front=Mamon;
        size++;
    }

    public void enqueue(T element) {
        if (size == 0) {
            Nodo newN = new Nodo(element);
            front = newN;
            System.out.println(newN.getElemento());
            rear = front;
            size++;
        } else {
            Nodo newN = new Nodo(element);
            System.out.println(newN.getElemento());
            rear.setNext(newN);
            rear = rear.getNext();
            size++;
        }
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Cola se encuentra vacia");
            return null;
        } else {
            Nodo temp = front;
            front = front.getNext();
            size--;
            System.out.println(temp.getElemento());
            return (T) temp.getElemento();
        }
    }

    public T first() {
        if (size == 0) {
            System.out.println("Cola vacia");
            return null;
        } else {
            System.out.println(front.getElemento());
            return (T) front.getElemento();
        }
    }

    public int size() {
        System.out.println(size);
        return size;
    }

    public void clear() {
        front = new Nodo();
        rear = front;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        Cola a = new Cola();
        System.out.println("*********ENQUE**********");
        a.enqueue(12);
        System.out.println("**********VACIA************");
        a.isEmpty();
        System.out.println("***********TAMAÑO***********");
        a.size();
        System.out.println("**********DEQUE***********");
        a.dequeue();
        System.out.println("*********DEQUE************");
        a.dequeue();
        System.out.println("*********ENQUE 2************");
        a.enqueue(13);
        a.enqueue(14);
        System.out.println("*********PRIMERO***********");
        a.first();
        System.out.println("*********VACIA************");
        a.isEmpty();

    }

}
