
package pkg123230025_kuis;

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class HomeFrame extends JFrame implements ActionListener{
    JLabel labelJudul = new JLabel();
    JLabel labelGitar = new JLabel("Gitar (Rp.500.000");
    JLabel labelPiano = new JLabel("Piano (Rp.2.000.000)");
    JLabel labelDrum = new JLabel("Drum (Rp.1.500.000");
    
    JTextField gitar = new JTextField();
    JTextField piano = new JTextField();
    JTextField drum = new JTextField();
    
    JButton beli = new JButton("Beli");
    JButton logout = new JButton("LogOut");
    String user;
    
    HomeFrame(String user){
        this.user = user;
        setVisible(true);
        setSize(720, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(labelJudul);
        add(labelGitar);
        add(labelPiano);
        add(labelDrum);
        
        add(gitar);
        add(piano);
        add(drum);
        add(beli);
        add(logout);
        
        labelJudul.setText("Selamat Datang, " + user);
        labelJudul.setBounds(20, 20, 300, 30);
        
        labelGitar.setBounds(20, 70, 150, 30);
        labelPiano.setBounds(20, 120, 150, 30);
        labelDrum.setBounds(20, 170, 150, 30);
        
        gitar.setBounds(190, 70, 150, 30);
        piano.setBounds(190, 120, 180, 30);
        drum.setBounds(190, 170, 180, 30);
        beli.setBounds(20, 220, 420, 40);
        logout.setBounds(20, 280, 420, 40);
        
        beli.addActionListener(this);
        logout.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource() == beli){
                int Gitar = Integer.parseInt(gitar.getText());
                int Piano = Integer.parseInt(piano.getText());
                int Drum = Integer.parseInt(drum.getText());
                
                if(Gitar <= 0 || Piano <= 0 || Drum <= 0) {
                    throw new Exception("Masukkan Jumlah yang Benar!");
                }else if(Gitar + Piano + Drum >= 5){
                    throw new Exception("Kebanyakan bjir");
                }else{
                    new PurchaseFrame(beli);
                }
                
            }
        } catch (Exception ex) {
            Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
