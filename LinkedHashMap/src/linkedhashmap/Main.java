/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmap;

/**
 *
 * @author Abdullah Shublaq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> list = new HashMap<>();

        list.put("ps", "Palestine");
        list.put("EGY", "Egypt");
        list.put("ksa", "Sudia");

        System.out.println(list.get("ps"));
    }

}
