public class Botas extends Armadura{


    public Botas(){}

    @Override
    public boolean accion_especial(boolean proyectil) {

        return proyectil;
    }


    public Botas(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador){
        super(nivel_rareza, nivel, nombre,defensa, multiplicador);
    }


    @Override
    public void accion_especial (boolean melee, int distancia){

    }
}
