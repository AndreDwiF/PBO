package Andre07118_Project;



import Andre07118_View.Andre07118_Loading;

public class Andre07118_Main {
    
    
    public static void main(String[] args)  {

    Andre07118_Loading loading=new Andre07118_Loading();
    }
}
    
    
    
    /*
    package Andre07118_Project;


import Andre07118_Controller.*;
import Andre07118_Entity.*;
import java.util.Date;
import java.util.Scanner;

public class Andre07118_Main {
    private static Andre07118_AdminController admin=new Andre07118_AdminController();
    private static Andre07118_PegawaiController pegawai=new Andre07118_PegawaiController();

    private static Scanner masuk=new Scanner(System.in);
    
    
   
    public static void main(String[] args) {
        
      int pil = 1;
      
      admin.Andre07118_dataAdmin();
      
     
      System.out.println("Sistem Pendataan & Penentuan Laporan Kerja Pegawai ");
      System.out.println("===================================== ");
      
      System.out.println(" LOGIN ");
      System.out.println("TEKAN 1 UNTUK LOGIN");
      int pil1=masuk.nextInt();
      if(pil1==1)
      { 
          do{
      System.out.println("1.LOGIN ADMIN ");
      System.out.println("2.LOGIN PEGAWAI ");
      System.out.println("3.EXIT ");
      System.out.println("Pilih login admin / pegawai ? ");
      pil=masuk.nextInt();
      switch(pil)
      {
          
          case 1:
          {
             
              Andre07118_loginAdmin();
              break;
          }
          case 2:
          {
             
              Andre07118_loginpegawai();
              break;
          }
          
          case 3:
          {
              System.out.println("Anda Telah Keluar");
              break;
          }
   
      
    
      }
          }while(pil<=2);
      }      
      else
      {
          System.out.println("SILAHKAN COBA LAGI");
      }
    }
      
      
    
    
    static void Andre07118_loginAdmin()
    {
        int pil2 = 0;
        System.out.print("Nama: ");
        String nama=masuk.next();
        System.out.print("Password: ");
        String pw=masuk.next();
        do{
        try{
        admin.Andre07118_login(nama, pw);
        System.out.println("Halo " + admin.Andre07118_Adminentity().getNama());
        
        
           System.out.println("1. Create ");
           System.out.println("2. View ");
           System.out.println("3. Approve ");
           System.out.println("4. Delete ");
           System.out.println("5. Edit ");
           System.out.println("TEKAN 0 UNTUK LOG OUT ");
           System.out.println("Masukkan pilihan: ");
           pil2=masuk.nextInt();
           switch (pil2){
           case 1:
           {
          Andre07118_createpegawai();
           break;
           }
           
           case 2:
           {
          Andre07118_view();
           break;
           }
           
           case 3:
           {
           Andre07118_Approve();
          
           break;
           }
           case 4:
           {
            
               Andre07118_Deletepegawai();
               break;
           }
           case 5:
           {
               Andre07118_Editpegawai();
               break;
           }
          
           }
        }catch(Exception ex)
        {
            System.out.println(" Nama Atau Password Anda Salah ");
        }
                }while(pil2<=5 && pil2>=1 );
        
        }
    static void Andre07118_loginpegawai()
    {
     
        int pil=0;
        System.out.print("Nama: ");
        String nama=masuk.next();
        System.out.print("Pw: ");
        String pw=masuk.next();
        try{
        pegawai.Andre07118_login(nama, pw);
        System.out.println("Halo " + pegawai.pegawaiEntity().Andre07118_getNama());
        
        do{
        System.out.println("1. Create laporan");
        System.out.println("2. View ");
        System.out.println("TEKAN 0 UNTUK LOG OUT ");
        System.out.println("Masukkan pilihan: ");
        pil=masuk.nextInt();
        switch(pil)
        {
            case 1:
            {
                Andre07118_createlaporan();
                break;
            }
            case 2:
            {
                Andre07118_view();
                break;
            }
        }
       
        }while(pil<=2 && pil>=1);
        }catch(Exception ex)
        {
            System.out.println("Nama Atau Password Anda Salah ");
        }
        
        
        
    }
    
    static void Andre07118_view()
    {
        admin.Andre07118_Listlaporanpegawai();
    }
   
    

    static void Andre07118_createpegawai()
    {
        try{
         System.out.print("Nama: ");
         String nama=masuk.next();
         System.out.print("Password: ");
         String pwd=masuk.next();
         System.out.print("Umur: ");
         int umur=masuk.nextInt();
         pegawai.Andre07118_insert(nama, pwd, umur);
         
          System.out.println("Data Pegawai telah dibuat");
        }
        catch(Exception ex)
        {
            System.out.println("Format pengisian salah");
        }
        
    }
    static void Andre07118_createlaporan()
    {
        
        System.out.print("Laporan: ");
        String laporan=masuk.next();
        System.out.print("Tanggal: ");
        Date tgl = new Date(masuk.next());
        pegawai.Andre07118_laporan(laporan,pegawai.getData(), false,tgl);
        
    }
    
    static void Andre07118_Deletepegawai()
    {
        
        System.out.println("Nama Pegawai: ");
        String nama =masuk.next();
        
        admin.Andre07118_delete(nama);
        
       
    }
    
    static void Andre07118_Editpegawai()
    {
        try{  
      Andre07118_view();
      
      System.out.print("Masukkan Data pegawai yg diedit: ");
      int edit=masuk.nextInt();
      
      if(edit==1)
      {
          System.out.print("Nama Sebelumnya: "+pegawai.pegawaiEntity().Andre07118_nama);
          System.out.print("Masukkan Nama Baru: ");
          String n=masuk.next();
          
          pegawai.pegawaiEntity().Andre07118_nama=n;
      }
        }catch(Exception ex)
                {
                System.out.println("Data Kosong ");
                }
    }

    static void Andre07118_Approve()
    {
        System.out.println("Nama Laporan: ");
        String laporan =masuk.next();
        int index = Andre07118_AllObjectModel.laporanModel.Andre07118_Cekdata(laporan, null);
        admin.Andre07118_updateIsVerified(index, pegawai.Andre07118_showDaftarlap(index).Andre07118_getLaporan(),pegawai.Andre07118_showDaftarlap(index).getAndre07118_tgl(), pegawai.Andre07118_showDaftarlap(index).Andre07118_getPegawai());
    }
}

    */

