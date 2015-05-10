package Juego;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Hanoi extends Applet implements Runnable
	{
	    Graphics g;
	 
	    static public Image fondo;
	 
	    static public int ancho;
	    static public int alto;
	 
	    static public int demora = 200;
	 
	    private boolean imagen_cargada = false;
	 
	    private int total_discos = 3;
	 
	    private Thread mi_hilo;
	 
	    private boolean hilo_iniciado = false;
	 
	    private Label label;
	 
	    private TextField resultado;
	 
	    String salida = "";
	    int contador = 0;
	 
	    torre t [];
	 
	    int torre_origen = 0;
	    int torre_destino = 2;
	}
