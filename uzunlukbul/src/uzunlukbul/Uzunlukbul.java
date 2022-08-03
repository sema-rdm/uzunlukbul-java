
package uzunlukbul;

import javax.swing.JOptionPane;

public class Uzunlukbul {
    
    public static void main(String[] args) {
      String y = JOptionPane.showInputDialog("bir yazı giriniz:");
      Uzunlukbul uzsinifi = new Uzunlukbul();
     uzsinifi.uzBul(y);
    }
    public void uzBul(String yazi)
    {
        int uz = yazi.length();
        System.out.print(uz);
    }
}
