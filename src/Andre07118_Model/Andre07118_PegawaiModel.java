
package Andre07118_Model;
import Andre07118_Entity.Andre07118_Pegawai;
import java.util.ArrayList;

public class Andre07118_PegawaiModel implements Andre07118_ModelInterfaces{ 
    public ArrayList <Andre07118_Pegawai> Andre07118_datapegawai;
   
    public Andre07118_PegawaiModel(){
        Andre07118_datapegawai = new ArrayList<Andre07118_Pegawai>();
    }
    
    public  void Andre07118_insert(Andre07118_Pegawai pegawai)
    {
       Andre07118_datapegawai.add(pegawai);
    }
    
   
     public void Andre07118_view(){
        for(Andre07118_Pegawai pegawai : Andre07118_datapegawai ){
            System.out.println("=========================================");
            System.out.println("Nama: "+pegawai.Andre07118_getNama());
            System.out.println("Password: "+pegawai.Andre07118_getPassword());
            System.out.println("Umur: "+pegawai.Andre07118_getUmur());
            
        }
    }
     @Override
    public int Andre07118_Cekdata(String nama, String password){
        int loop = 0;
        for(Andre07118_Pegawai pegawaientity : Andre07118_datapegawai)
        {
            if(pegawaientity.Andre07118_getNama().equals(nama)&& pegawaientity.Andre07118_getPassword().equals(password))
            {
                break;
            }
            else
            {
                loop++;
            }
    }
        return loop;
    }
    public Andre07118_Pegawai Andre07118_getdatapegawai(int index)
     {
         return Andre07118_datapegawai.get(index);
     }
    
    public void Andre07118_delete(String nama)
    {
        for(int i=0;i<Andre07118_datapegawai.size();i++)
        {
       if(Andre07118_datapegawai.get(i).Andre07118_getNama().equals(nama))
       {
       Andre07118_datapegawai.remove(i);
       
       }
        
        }
    
    }
    

    
 public ArrayList<Andre07118_Pegawai> getpegawai() {
        return Andre07118_datapegawai;
    }
   
 }

