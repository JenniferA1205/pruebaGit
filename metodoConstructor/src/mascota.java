public class mascota {
    String nombre;
    String tipo;
    int edad;

    public mascota (String nombre, String tipo, int edad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    private void saludar() {
        System.out.println("El nombre del animal es: "+nombre);
        System.out.println("El tipo de animal es: "+tipo);
        System.out.println("La edad del animal es: "+edad);
    }



}
