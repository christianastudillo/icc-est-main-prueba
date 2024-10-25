
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator personaGenerator = new PersonasGenerator();
        MetodosOrdenamientoBusqueda ordenamiento = new MetodosOrdenamientoBusqueda();

        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();

        System.out.println("Listado de personas generadas:");
        ordenamiento.showPeople(personas);

        // Ordenar por edad usando selección
        ordenamiento.sortByAgeWithSelection(personas); 
        System.out.println("------------------------------------------------");
        System.out.println("Listado de personas ordenadas por edad (selección):");
        ordenamiento.showPeople(personas);

        // Ordenar por altura usando selección
        ordenamiento.sortByHeightWithSelection(personas);
        System.out.println("------------------------------------------------");
        System.out.println("Listado de personas ordenadas por altura (selección):");
        ordenamiento.showPeople(personas);

        // Ordenar por edad usando inserción
        ordenamiento.sortByAgeWithInsertion(personas);
        System.out.println("------------------------------------------------");
        System.out.println("Listado de personas ordenadas por edad (inserción):");
        ordenamiento.showPeople(personas);

        // Ordenar por altura usando inserción
        ordenamiento.sortByHeightWithInsertion(personas);
        System.out.println("------------------------------------------------");
        System.out.println("Listado de personas ordenadas por altura (inserción):");
        ordenamiento.showPeople(personas);

        // Búsqueda binaria por edad
        int edadBuscada = 27;
        int indiceEdad = ordenamiento.searchBinaryByAge(personas, edadBuscada);
        if (indiceEdad != -1) {
            System.out.println("Persona con edad " + edadBuscada + " encontrada en índice: " + indiceEdad);
        } else {
            System.out.println("Persona con edad " + edadBuscada + " no encontrada.");
        }

        // Búsqueda binaria por altura
        int alturaBuscada = 163;
        int indiceAltura = ordenamiento.searchBinaryByHeight(personas, alturaBuscada);
        if (indiceAltura != -1) {
            System.out.println("Persona con altura " + alturaBuscada + " encontrada en índice: " + indiceAltura);
        } else {
            System.out.println("Persona con altura " + alturaBuscada + " no encontrada.");
        }
    }
}