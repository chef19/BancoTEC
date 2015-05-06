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
public class Cola<T>{

    public Nodo front;
    public Nodo rear;
    public Nodo current;
    public int size;
    public int pos;
    
    public Cola(){
        front = new Nodo();
        current=front;
        rear = current;
        size=0;
        pos=0;
    }
    
    public void enqueue(T element) {
        if (size==0){
            Nodo newN = new Nodo(element);
            front.setNext(newN);
            System.out.println(newN.getElemento());
            rear=newN;
            size++;
        }
    }

    public T dequeue() {
         if (size==0){
            System.out.println("Cola se encuentra vacia");
        }
        else{      
            System.out.println(front.getElemento());
            front=front.getNext();
            size--;
            pos++;
        }
        return (T) front.getElemento();
    }
    
    public T first() {
        if(front.getElemento()==null){
            System.out.println(front.getNext().getElemento());
        }
        else{
            System.out.println(front.getElemento());
        }
        return (T) front.getElemento();
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = new Nodo();
        current=front;
        rear = current;
        size=0;
    }

    public boolean isEmpty() {
        return size==0;
    }
    public int posicion(){
        return pos;
    }
    
}
