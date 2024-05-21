/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mathebattles.Archivos;

/**
 * Frame principal en el que se van cambiando todos los paneles
 * @author aitor
 */
public class MFrame extends JFrame{
    public static CardLayout cl;
    public static JPanel pl;
    
    public MFrame(){
        setResizable(false);
        setTitle("MatheBattles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 750);
        
        // Creamos el CardLayout y el JPanel para contener las pantallas
        cl = new CardLayout();
        pl = new JPanel(cl);
        
        MMenu mm = new MMenu();
        pl.add(mm,"Menu");
        Puntuaciones sc = new Puntuaciones();
        pl.add(sc,"Score");
        RegScr rs = new RegScr();
        pl.add(rs,"Reg");
        LogScr ls = new LogScr();
        pl.add(ls,"Log");
        Panel_Juego fv = new Panel_Juego();
        pl.add(fv,"Batalla");
        Panel_ataques pa = new Panel_ataques();
        pl.add(pa,"Ataques");
        Panel_Cambio pc = new Panel_Cambio();
        pl.add(pc,"Cambio");
        Resultados res = new Resultados();
        pl.add(res,"Resultados");
        
        Archivos.Reset_Res();
        Archivos.Reset_Mejores();
        
        
        add(pl, BorderLayout.CENTER);
        
        
    }
}