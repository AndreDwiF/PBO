
package Andre07118_View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Andre07118_GUI {

    private JFrame Log= new JFrame();
    private JLabel loginlabel,top;
    private JRadioButton radioadmin,radiopegawai;
    private JTextField textnamalogin;
    private JLabel labelnamalogin,labelpasswordlogin;
    private JButton login;
    private JPasswordField passwordlogin;
    private boolean ceklogin=false;
    


public Andre07118_GUI()
{
    Log.setSize(1000, 700);
    Log.setLayout(null);
    Log.getContentPane().setBackground(Color.LIGHT_GRAY);
    top=new JLabel("APLIKASI LAPORAN KERJA PEGAWAI");
    top.setBounds(100, 10, 5000,50);
    top.setFont(new Font("Tahoma",Font.BOLD,40));
    Log.add(top);
    
    loginlabel=new JLabel("LOGIN");
    loginlabel.setBounds(450, 50, 200, 100);
    loginlabel.setFont(new Font("Comic Sans MS",Font.BOLD,30));
    Log.add(loginlabel);
    
    
    radiopegawai=new JRadioButton("Pegawai");
    radiopegawai.setBounds(400, 150, 100, 30);
    radiopegawai.setFont(new Font("Times New Roman",Font.BOLD,15));
    Log.add(radiopegawai);
    
    radioadmin=new JRadioButton("Admin");
    radioadmin.setBounds(510, 150, 100, 30);
    radioadmin.setFont(new Font("Times New Roman",Font.BOLD,15));
    Log.add(radioadmin);
    
    labelnamalogin=new JLabel("Nama");
    labelnamalogin.setBounds(400,180,50,30);
    Log.add(labelnamalogin);
    
    textnamalogin=new JTextField();
    textnamalogin.setBounds(400, 210, 200, 30);
    textnamalogin.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
    Log.add(textnamalogin);
    
    labelpasswordlogin=new JLabel("Password");
    labelpasswordlogin.setBounds(400, 240, 100, 30);
    Log.add(labelpasswordlogin);
    
    passwordlogin=new JPasswordField();
    passwordlogin.setBounds(400, 270, 200, 30);
    Log.add(passwordlogin);
    
    login=new JButton("Login");
    login.setBounds(450, 320, 100, 40);
    login.setBackground(Color.CYAN);
    Log.add(login);
    
    
    Log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Log.setVisible(true);
    Log.setLocationRelativeTo(null);
    
   
    
    radioadmin.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(radioadmin.isSelected()){
                radiopegawai.setSelected(false);
                
                ceklogin=true;
            }
        }
    });
    
    radiopegawai.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(radiopegawai.isSelected()){
                radioadmin.setSelected(false);
                
                ceklogin=false;
            }
        }
    });
    
    login.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(ceklogin==true)
            {
                
                    Andre07118_allobjctrl.admin.Andre07118_dataAdmin();
                    try{
                       Andre07118_allobjctrl.admin.Andre07118_login(textnamalogin.getText(), passwordlogin.getText());
                    
                    String nama=Andre07118_allobjctrl.admin.Andre07118_Adminentity().getNama();
                    JOptionPane.showMessageDialog(null,"Welcome "+nama,"Information",JOptionPane.INFORMATION_MESSAGE);
                    Andre07118_GUIAdmin admin= new Andre07118_GUIAdmin();
                    Log.dispose();
                }catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Nama Atau Password Anda Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                    Andre07118_kosong();
                }
            }else
            {
                try{
                     Andre07118_allobjctrl.pegawai.Andre07118_login(textnamalogin.getText(), passwordlogin.getText());
                     String nama= Andre07118_allobjctrl.pegawai.pegawaiEntity().Andre07118_getNama();
                     JOptionPane.showMessageDialog(null, "Welcome "+nama,"Information",JOptionPane.INFORMATION_MESSAGE);
                     Andre07118_GUIPegawai pegawai=new Andre07118_GUIPegawai();
                     Log.dispose();
                }catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Nama atau Password Anda Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                    Andre07118_kosong();
                    
                     
                    
                }
            }
        }
    });
}
    void Andre07118_kosong()
{
    
   
    textnamalogin.setText(null);
    passwordlogin.setText(null);
    
    
}
}


