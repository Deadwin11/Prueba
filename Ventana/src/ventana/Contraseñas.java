package ventana;

import java.util.Random;

public class Contraseñas 
{
    private Random obr = new Random();
    private String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz.-_#$&+@[]{}¡?¿!=<>";
    private String clv, clave;
    
    public String Contraseña()
    {
		int x;
		clv = "";
		for (x = 0; x < 8; x++)
			clv += validos.charAt(obr.nextInt(validos.length()));
		return clv;
    }
}
