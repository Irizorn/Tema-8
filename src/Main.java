public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Amaia");
        persona.setEdad(47);
        persona.setnTelefono(987654321);

        System.out.println( persona.getNombre());
        System.out.println( persona.getEdad());
        System.out.println( persona.getnTelefono());



    }
}


       class Persona {
            private String nombre;

           public void setNombre(String nombre) {

               this.nombre = nombre;
           }

           public String getNombre() {

               return nombre;
           }
            private Integer edad;

           public void setEdad(Integer edad) {
               this.edad = edad;
           }

           public Integer getEdad() {
               return edad;
           }
            private Integer nTelefono;


            public void setnTelefono(Integer nTelefono) {

                this.nTelefono = nTelefono;
            }

            public Integer getnTelefono() {

                return nTelefono;
            }
        }
