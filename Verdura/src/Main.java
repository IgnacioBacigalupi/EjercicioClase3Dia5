public class Main {
    public static void main(String[] args) {

        //Crear vector verdura e inicializar los objetos

        Verduras [] verdura = new Verduras[5];

        verdura[0] = new Verduras(1,"pepino","verde",50.5,false);
        verdura[1] = new Verduras(2,"patata","amarillo",40.5,true);
        verdura[2] = new Verduras(3,"zanahoria","naranja",20.5,false);
        verdura[3] = new Verduras(4,"brocoli","verde",30.5,true);
        verdura[4] = new Verduras(5,"coliflor","blanco",46.5,true);

        //Recorrer vector y mostrar nombre y calorias de las verduras

        System.out.println("----NOMBRE Y CALORIAS------");

        for (int i = 0; i < verdura.length; i++) {
            System.out.println("Nombre: " +verdura[i].getNombre() + " Calorias: " +verdura[i].getCalorias());
        }

        // Cambiar el nombre de dos personas y mostrar antes y después

        verdura[2].setNombre("remolacha");
        verdura[2].setColor("rojo");
        verdura[2].setCalorias(35.6);
        verdura[2].setDebeCocinarse(true);
        verdura[4].setNombre("pimiento");
        verdura[4].setColor("verde");
        verdura[4].setCalorias(25);
        verdura[4].setDebeCocinarse(true);

        //Recorrer vector y mostrar las verduras con el cambio

        System.out.println("-----VERDURAS------");

        for (int i = 0; i < verdura.length; i++) {
            System.out.println("Id: " +verdura[i].getId()+" Nombre: "+verdura[i].getNombre() +" Color: "+verdura[i].getColor()+ " Calorias: "+verdura[i].getCalorias() + " ¿Debe cocinarse?: " +verdura[i].isDebeCocinarse());
        }

        //Recorrer el vector y mostrar las verduras de color verde.

        System.out.println("-----VERDURAS DE COLOR VERDE------");

        for (int i = 0; i < verdura.length; i++) {
            if (verdura[i].getColor().equalsIgnoreCase("Verde")) {
                System.out.println("Id: " + verdura[i].getId() + " Nombre: " + verdura[i].getNombre() + " Color: " + verdura[i].getColor() + " Calorias: " + verdura[i].getCalorias() + " ¿Debe cocinarse?: " + verdura[i].isDebeCocinarse());
            }
        }
        }

    }