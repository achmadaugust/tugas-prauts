/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrybukualamat;

/**
 *
 * @author AT
 */
public class EntryBukuAlamat {
    private String[] name=new String [50];
    private String[] noAlamat=new String [50];
    private String[] noTelpon=new String [50];
    private String[] eMail=new String [50];

    private static int count;
    private static int indek;

    public EntryBukuAlamat(){//construktor
    count=0;
    }
    public String getName(int indek){
    return name[indek];
    }
    public String getAlamat(int indek){
    return noAlamat[indek];
    }
    public String getTelpon(int indek){
    return noTelpon[indek];
    }
    public String getEmail(int indek){
    return eMail[indek];
    }
    public void setName( String nama, int indek,String alamat,String telpon,String email){
    name[indek] = nama;
    noAlamat[indek] = alamat;
    noTelpon[indek] = telpon;
    eMail[indek] = email;
    count++;
    }

    public static int getStudentCount(){
    return count;
    }
}
