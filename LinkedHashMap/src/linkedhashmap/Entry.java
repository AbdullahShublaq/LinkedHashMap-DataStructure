/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmap;

/**
 *
 * @author Abdullah Shublaq
 * @param <E>
 * @param <T>
 */
public class Entry<E, T> {

    E key;
    T value;
    Entry<E, T> after = null;
    Entry<E, T> before = null;

    public Entry(E key, T value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
