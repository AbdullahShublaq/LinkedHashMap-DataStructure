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
public class HashMap<E, T> {

    int LIMIT = 11500;
    Object[] entries;
    Object[] keySet;
    Object[] values = new Object[LIMIT];

    public HashMap() {
        this.entries = new Object[LIMIT];
        this.keySet = new Object[LIMIT];
        this.values = new Object[LIMIT];
    }

    public boolean put(E key, T value) {
        Entry<E, T> entry = new Entry(key, value);
        int index = Math.abs(key.hashCode()) % LIMIT;

        for (int i = index; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = (Entry<E, T>) entry;
                keySet[i] = (E) key;
                values[i] = (T) value;
                setAfters();
                setBefores();
                return true;
            }
        }
        return false;
    }

    public T get(E key) {
        int index = Math.abs(key.hashCode()) % LIMIT;

        Entry<E, T> temp = (Entry<E, T>) entries[index];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return (T) values[index];
            }
            temp = temp.after;
        }
        return null;
    }

    public void setAfters() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                Entry<E, T> temp = (Entry<E, T>) entries[i];
                for (int j = i + 1; j < entries.length; j++) {
                    if (entries[j] != null) {
                        temp.after = (Entry<E, T>) entries[j];
                    }
                }
            }
        }
    }

    public void setBefores() {
        for (int i = entries.length - 1; i > 0; i--) {
            if (entries[i] != null) {
                Entry<E, T> temp = (Entry<E, T>) entries[i];
                for (int j = i - 1; j > 0; j--) {
                    if (entries[j] != null) {
                        temp.before = (Entry<E, T>) entries[j];
                    }
                }
            }
        }
    }
}
