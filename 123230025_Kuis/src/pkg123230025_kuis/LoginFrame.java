
package pkg123230025_kuis;

import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel username = new JLabel ("Username");
    JLabel password = new JLabel ("Password");
    JPasswordField pass = new JPasswordField();
    JTextField user = new JTextField();
    
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    int logincounter;
    public LoginFrame() {
        setVisible(true);
        setSize(720, 480);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(username);
        add(password);
        add(user);
        add(pass);
        add(login);
        add(reset);
        
        username.setBounds(180, 100, 120, 25);
        password.setBounds(180, 160, 120, 25);
        user.setBounds(180, 130, 300, 30);
        pass.setBounds(180, 190, 300, 30);
        login.setBounds(180, 240, 300, 30);
        reset.setBounds(180, 300, 300, 30);
        
        login.addActionListener(this);
        reset.addActionListener(this);
    }
    @Override
 public void actionPerformed(ActionEvent e){
        try{
            String Username = user.getText();
            String Pass = new String(pass.getPassword());
            
            if(e.getSource() == login) {
                if(Username.equals("Vincent")&&Pass.equals("pass025")){
                    new HomeFrame(Username);
                    dispose();
                }else if(e.getSource() == reset){
                    pass.setText("");
                    user.setText("");
                }
            }
        }catch (Exception err){
            JOptionPane.showMessageDialog(this, err);
            logincounter++;
            if(logincounter >= 2){
                JOptionPane.showMessageDialog(this, "Akun Terkunci");
                login.setEnabled(false);
            }
        }
    }
    
}
