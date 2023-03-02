//Celso Seguel Iglesias Ejercicio 2

    public class Main {
        public static void main(String[] args) {

            float ingresos =0;
            int vehiculos = 1;
            int antiguedadVehiculos = 11;
            int inmuebles = 2;
            boolean economPlena=false;

            if ( (ingresos >= 489.083) &&
                    ( vehiculos >= 3) &&
                    (antiguedadVehiculos <5) &&
                    (inmuebles >= 3) &&
                    (economPlena==true)){
                System.out.println("Categoria iii");
            }


            else if( (ingresos < 489.083) &&
                    (vehiculos >= 3) &&
                    (antiguedadVehiculos <5) &&
                    (inmuebles >= 3) &&
                    (economPlena==false)){
                System.out.println("Categoría ii");
            }

            else
                System.out.println("Categoría i");
        }
    }
