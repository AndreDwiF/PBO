
package Andre07118_Model;

import Andre07118_Entity.Andre07118_Laporan;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Andre07118_LaporanModel implements Andre07118_ModelInterfaces{
    public ArrayList <Andre07118_Laporan> Andre07118_datalaporan;
    
    
    public Andre07118_LaporanModel(){
        Andre07118_datalaporan = new ArrayList<Andre07118_Laporan>();
    }
    
    public void Andre07118_insert(Andre07118_Laporan laporan)
    {
        Andre07118_datalaporan.add(laporan);
         
    }
     
    public ArrayList<Andre07118_Laporan> alldatalap()
    {
        return Andre07118_datalaporan;
    }
    
    public ArrayList<Andre07118_Laporan> getDaftarLaporan(){
        return Andre07118_datalaporan;
    }
   
    public int Andre07118_view(){
            int loop = 0;
        if(Andre07118_datalaporan.size() == 0){
            loop = -1; //data masih tidak ada / kosong
        }else{
            
        for(Andre07118_Laporan pegawai : Andre07118_datalaporan ){
            System.out.println("=========================================");
            System.out.println("Nama: "+pegawai.Andre07118_getPegawai().Andre07118_getNama());
            System.out.println("Password: "+pegawai.Andre07118_getPegawai().Andre07118_password);
            System.out.println("Umur: "+pegawai.Andre07118_getPegawai().Andre07118_getUmur());
            System.out.println("Laporan: "+pegawai.Andre07118_getLaporan());
            System.out.println("Tanggal: "+pegawai.Andre07118_gettgl());
             if (pegawai.Andre07118_isApprove()== false) {
                System.out.println("Belum Di Approve Oleh Admin");
            } else {
                System.out.println("Telah Di Approve Admin");
            }
        }
        }return loop;
    }
    
    public void Andre07118_Update(int index,Andre07118_Laporan laporandata)
    {
        Andre07118_datalaporan.set(index, laporandata);
    }
    
    public void Andre07118_delete(String nama)
    {
        for(int i=0;i<Andre07118_datalaporan.size();i++)
        {
       if(Andre07118_datalaporan.get(i).Andre07118_getPegawai().Andre07118_getNama().equals(nama))
       {
       
       Andre07118_datalaporan.remove(i);
       }
       else
       {
           
       }
        
        }
    }
    
    @Override
    public int Andre07118_Cekdata(String laporan,String pw){
        int loop = 0;
        if(Andre07118_datalaporan.size() == 0){
            loop = -1; //data masih tidak ada / kosong
        }else{
            for(int i=0;i<Andre07118_datalaporan.size();i++){
                if(Andre07118_datalaporan.get(i).Andre07118_getLaporan().equals(laporan)){
                    loop = i;
                    break;
                }else{
                    loop = -2;
                }
            }
        }return loop;
    }
     
    public Andre07118_Laporan Andre07118_showDaftarlap(int index){
        return Andre07118_datalaporan.get(index);
    }
   
}
