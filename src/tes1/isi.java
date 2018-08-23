/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes1;

/**
 *
 * @author Mikedhanny
 */
public class isi {
    public static void main(String[] args){
      tes1 biodata = new   tes1();
    biodata.setnamaAyah("aa");
    biodata.setnamaIbu("bb");
    biodata.setnamaSendiri("Mike");
    biodata.setnamaSaudara("Oxztaviano");
    biodata.setalamat("jln.Danau Tempe f4.B1");
    biodata.sethobi("Berolahraga");
    biodata.setcitacita("Bekerja di Perusaaan ternama dan membahagiakan keluarga");
    biodata.setumur(16);
     
    
    System.out.println("namaAyah    :" + biodata.getnamaAyah());
    System.out.println("namaIbu     : " + biodata.getnamaIbu());
    System.out.println("namaSendiri : " + biodata.getnamaSendiri());
    System.out.println("namaSaudara : " + biodata.getnamaSaudara());
    System.out.println("alamat      : " + biodata.getalamat());
    System.out.println("hobi        : " + biodata.gethobi());
    System.out.println("citacita    : " + biodata.getcitacita());
    System.out.println("umur        : " + biodata.getumur());
     }
}

