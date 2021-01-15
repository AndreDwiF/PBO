
package Andre07118_View;

import Andre07118_Controller.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.*;

public class Andre07118_GUIAdmin {
    
   
    
    private JFrame Admin=new JFrame();
    private JTable tabeldatapegawai=new JTable();
    private JScrollPane scroll=new JScrollPane(tabeldatapegawai);
    private JButton back,approve,create,delete,edit;
    private JLabel admin,namalabel,deletelabel,nama,pass,umur,editlabel,editlabel1;
    private JTextField namatext,namapegawai,umurpegawai,deletetext,edittext,edittext1;
    private JPasswordField passwordpegawai;
    
    public Andre07118_GUIAdmin()
    {
         Admin.setSize(1000,5000);
         Admin.setLayout(null);
         Admin.getContentPane().setBackground(Color.LIGHT_GRAY);
         admin=new JLabel("WELCOME ADMIN");
         admin.setBounds(250, 30, 500, 30);
         admin.setFont(new Font("Times New Roman",Font.BOLD,40));
         Admin.add(admin);
         
         scroll.setBounds(30, 100, 570, 200);
         tabeldatapegawai.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
         Admin.add(scroll);
         
         namalabel=new JLabel("Nama Laporan");
         namalabel.setBounds(50, 320, 100, 30);
         Admin.add(namalabel);
         
         namatext=new JTextField();
         namatext.setBounds(50, 350, 150, 30);
         Admin.add(namatext);
       
         
         approve=new JButton("Approve");
         approve.setBounds(50, 400, 100, 30);
         approve.setBackground(Color.ORANGE);
         Admin.add(approve);
         
         deletelabel=new JLabel("Nama Pegawai");
         deletelabel.setBounds(250, 320, 100, 30);
         Admin.add(deletelabel);
         
         deletetext=new JTextField();
         deletetext.setBounds(250, 350, 150, 30);
         Admin.add(deletetext);
       
         
         delete=new JButton("Delete");
         delete.setBounds(250, 400, 100, 30);
         delete.setBackground(Color.ORANGE);
         Admin.add(delete);
         
         editlabel=new JLabel("Nama Pegawai");
         editlabel.setBounds(450, 320, 100, 30);
         Admin.add(editlabel);
         
         edittext=new JTextField();
         edittext.setBounds(450, 350, 150, 30);
         Admin.add(edittext);
         
         
         editlabel1=new JLabel("Nama Pegawai Baru");
         editlabel1.setBounds(650, 320, 300, 30);
         Admin.add(editlabel1);
         
         edittext1=new JTextField();
         edittext1.setBounds(650, 350, 150, 30);
         Admin.add(edittext1);
       
         
         edit=new JButton("Edit");
         edit.setBounds(450, 400, 100, 30);
         edit.setBackground(Color.ORANGE);
         Admin.add(edit);
         
         nama=new JLabel("Nama");
         nama.setBounds(700, 40, 100, 30);
         Admin.add(nama);
         
         namapegawai=new JTextField();
         namapegawai.setBounds(700, 70, 150, 30);
         Admin.add(namapegawai);
         
         pass=new JLabel("Password");
         pass.setBounds(700, 100, 200, 30);
         Admin.add(pass);
         
         passwordpegawai=new JPasswordField();
         passwordpegawai.setBounds(700, 130, 150, 30);
         Admin.add(passwordpegawai);
         
         umur=new JLabel("Umur");
         umur.setBounds(700, 160, 200, 30);
         Admin.add(umur);
         
         umurpegawai=new JTextField();
         umurpegawai.setBounds(700, 190, 150, 30);
         Admin.add(umurpegawai);
         
         create=new JButton("Create");
         create.setBounds(700, 240, 100, 30);
         create.setBackground(Color.ORANGE);
         Admin.add(create);
         
         back=new JButton("Kembali");
         back.setBounds(50, 600, 100, 30);
         back.setBackground(Color.WHITE);
         Admin.add(back);
         
         Admin.setLocationRelativeTo(null);
         Admin.setVisible(true);
         Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
          back.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent ae)
             {
                 Admin.dispose();
                 Andre07118_GUI men=new Andre07118_GUI();
             }
         });
          
           approve.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent ae)
             {
                 try{
                 String laporan=namatext.getText();
       
                 int index=Andre07118_AllObjectModel.laporanModel.Andre07118_Cekdata(laporan, null);
                 Andre07118_allobjctrl.admin.Andre07118_updateIsVerified(index,
                         Andre07118_allobjctrl.pegawai.Andre07118_showDaftarlap(index).Andre07118_getLaporan(), 
                        Andre07118_allobjctrl.pegawai.Andre07118_showDaftarlap(index).Andre07118_gettgl(),Andre07118_allobjctrl.pegawai.Andre07118_showDaftarlap(index).Andre07118_getPegawai());
                  JOptionPane.showMessageDialog(null,"Telah Di Approve","Information",JOptionPane.INFORMATION_MESSAGE);
                 tabeldatapegawai.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
                 
                  Andre07118_kosong1();
             }catch(Exception ex)
             {
           
                JOptionPane.showMessageDialog(null,"Nama Laporan Tidak Ada","Information",JOptionPane.INFORMATION_MESSAGE);
             }
             }
         });
           
            create.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
                String nama=namapegawai.getText();
                String pass=passwordpegawai.getText();
                String umur=umurpegawai.getText();
    
               Andre07118_allobjctrl.pegawai.Andre07118_insert(nama, pass, umur);
                JOptionPane.showMessageDialog(null, "Pegawai Telah Dibuat","Information",JOptionPane.INFORMATION_MESSAGE);
                
                Andre07118_kosong();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Format Pengisian Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    });
            delete.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae)
        {
        
            try{
                String n=deletetext.getText();
                Andre07118_allobjctrl.admin.Andre07118_delete(n);
                tabeldatapegawai.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
                JOptionPane.showMessageDialog(null,"Pegawai Di Hapus","Information",JOptionPane.INFORMATION_MESSAGE);

                Andre07118_kosong2();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Pegawai Tidak Ada","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        });
            
            
             edit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae)
        {
        
           
                String edit=edittext.getText();
                String edit1=edittext1.getText();
                
                  if(edit.equals(Andre07118_allobjctrl.pegawai.pegawaiEntity().Andre07118_getNama()))
                  {
                      Andre07118_allobjctrl.pegawai.pegawaiEntity().Andre07118_nama=edit1;
                tabeldatapegawai.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
                JOptionPane.showMessageDialog(null,"Nama Pegawai Telah Di Edit","Information",JOptionPane.INFORMATION_MESSAGE);
                 Andre07118_kosong3();
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(null,"Nama Pegawai Tidak Ada","Information",JOptionPane.INFORMATION_MESSAGE); 
                    Andre07118_kosong3();    
                  }
      
        }
        });
           
            tabeldatapegawai.addMouseListener(new MouseAdapter()
         {
             @Override
             public void mouseClicked(MouseEvent e){
                 int i=tabeldatapegawai.getSelectedRow();
                 namatext.setText(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai().getValueAt(i, 0).toString());
        
             }
         });
            
            
            
          
    }
    
    void Andre07118_kosong()
    {
        namapegawai.setText(null);
        passwordpegawai.setText(null);
        umurpegawai.setText(null);
        namatext.setText(null);
      
    }
    
    void Andre07118_kosong1()
    {
    namatext.setText(null);
    }
    
     void Andre07118_kosong2()
    {
   deletetext.setText(null);
    }
     
      void Andre07118_kosong3()
    {
   edittext.setText(null);
   edittext1.setText(null);
    }
}
