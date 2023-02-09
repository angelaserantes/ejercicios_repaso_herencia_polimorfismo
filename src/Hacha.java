public class Hacha extends Arma{

    public Hacha(){

    }

    public Hacha(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia,double tiempo_para_damage) {
        super(nivel_rareza , nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo){
        if(getDistancia() == distancia_enemigo){
            return 3 * getDamage();
        }
        return 0.0;
    }
}
