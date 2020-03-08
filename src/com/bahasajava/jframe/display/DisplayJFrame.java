/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bahasajava.jframe.display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author user
 */
public class DisplayJFrame {
    private JFrame frame; //sebagai container komponen lainnya
    private int lebar, tinggi; //dalam ukuran piksel
    private String judul;
    private Canvas canvas;
    
    //Constructor
    public DisplayJFrame(String judul, int lebar, int tinggi){
        this.judul = judul;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
        buatDisplayJFrame(); //call buatDisplayJFrame
    }
    
    private void buatDisplayJFrame(){
        frame = new JFrame(judul);//Mengatur judul
        frame.setSize(lebar, tinggi);//Mengatur ukuran lebar dan tinggi window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Agar window di close sempurna
        frame.setResizable(false);//Agar ukuran window tidak bisa di ubah
        frame.setLocationRelativeTo(null);//Agar window berada ditengah layar
        frame.setVisible(true);//Agar window terlihat saat ditampilkan
        
        canvas = new Canvas();//Membuat objek canvas
        canvas.setPreferredSize(new Dimension(lebar, tinggi));
        canvas.setMaximumSize(new Dimension(lebar, tinggi));
        canvas.setMinimumSize(new Dimension(lebar, tinggi));
        canvas.setBackground(Color.black);
        
        frame.add(canvas);
        frame.pack();
    }

}