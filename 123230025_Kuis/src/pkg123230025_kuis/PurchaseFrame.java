
package pkg123230025_kuis;

import javax.swing.*;
import javax.swing.*;

public class PurchaseFrame extends JFrame {
    private JTextField kualitasField;
    private JTextField totalField;
   
    public PurchaseFrame(JButton beli, int harga, String kategori) {
        setTitle("Pembelian " + kategori);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Kategori: " + kategori));
        panel.add(new JLabel("Jumlah Beli: "));
        kualitasField = new JTextField();
        panel.add(kualitasField);
        
        totalField = new JLabel("Total Harga: -");
        JButton buyButton = new JButton ("Beli");
        JButton backButton = new JButton ("Kembali");
        
        panel.add(new JLabel("Total Harga: "));
        panel add(totalField);
        
        buyButton.addActionListener((ActionEvent e)-> {
            try{
                int quantity = Integer.parseInt(kualitasField.getText());
                int total = (int)(quantity * harga * 1.1);
                totalField.setText("Total Harga: " + total);
            } catch (NumberFormatException ex){
                totalField.setText("Input Tidak Valid");
            }
        });
        panel.add(buyButton);
        
        backButton.addActionListener((ActionEvent e)->{
           dispose(); 
        });
        panel.add(backButton);
        
        add(panel);
        setVisible(true);
    }
    
}
