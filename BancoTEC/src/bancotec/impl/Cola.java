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
    public int size;
    public int pos;
    
    public Cola(){
        front = new Nodo();
        rear =front;
        size=0;
    }
    
    public void enqueue(T element) {
        if (size==0){
            Nodo newN = new Nodo(element);
            rear=front=newN;
            size++;
        }
        else{
            Nodo newN = new Nodo(element);
            
        }
    }

    public T dequeue() {
        if (size==0){
            System.out.println("Cola se encuentra vacia");
            return null;
        }
        else{      
            System.out.println(front.getElemento());
            Nodo Temp = front;
            front=front.getNext();
            size--;
            return (T) Temp.getElemento();
        } 
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
        front = null;
        rear = front;
        size=0;
    }

    public boolean isEmpty() {
        return size==0;
    }

}
