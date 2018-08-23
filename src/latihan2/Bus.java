/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2Enkapsulasi.latihan2;

/**
 *
 * @author Mikedhanny
 */
public class Bus {
   private int penumpang;
    private int maxPenumpang;
    
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    Bus(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void addPenumpang(int penumpang) {
           
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");            
        }else {
            this.penumpang = temp;       
    }
    
        }
    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah"+ maxPenumpang);
    }
    }

