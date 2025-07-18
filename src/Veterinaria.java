
public class Veterinaria {
    public static void main(String[] args) {
    //String nombre, String especie, int edad, boolean vacunado
    Mascota mascota1 = new Mascota ("rufo", "pitbull", 3, true);
    Mascota mascota2 = new Mascota ("canelo", "Labrador", 1, true);
    Mascota mascota3 = new Mascota ("blanca", "pitbull", 6, false);
    
    mascota1.mostrarInformacion();
    mascota2.mostrarInformacion();
    mascota3.mostrarInformacion();
    
}
}