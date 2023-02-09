public class Main {

    public static void main(String[] args) {

        Espada espada = new Espada(4,23,"Excalibur", 7.3,6.4, 13.3,1.6);
        Lanza lanza = new Lanza(3,42, "LanzaRitual", 10.5, 8.2, 11.1, 2.5);
        Hacha hacha = new Hacha(5, 56,"Shadowmourne", 8.6, 5.5,5.6, 3.5);
        Casco casco = new Casco(8,13,"Diamante",9.5, 8.2);
        Botas botas = new Botas(9, 65, "Acero", 8.5, 9.4);

        Equipo [] equipos = {espada, lanza, hacha, casco, botas};

        for (Equipo equipo : equipos){
            if (equipo instanceof Arma) {
                double damage = ((Arma) equipo).doing_damage(5.6);
                System.out.println("El daño realizado por " + equipo.getNombre() + " es: " + damage);
            }
            if (equipo instanceof Armadura){
                boolean proyectil = false;

                if (equipo instanceof Casco){
                    ((Casco) equipo).accion_especial(proyectil);
                    System.out.println("La acción especial de " + equipo.getNombre() + " es: " + proyectil);
                }
                if (equipo instanceof Botas){
                    int distancia = 6;
                    boolean melee = true;
                    ((Botas) equipo).accion_especial(melee,distancia);
                    System.out.println("La acción especial de " + equipo.getNombre() + " es: " + melee + " y " + distancia);
                }
            }
        }


    }




}