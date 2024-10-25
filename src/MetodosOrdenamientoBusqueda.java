import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getAge() < people[indice].getAge()) {
                    indice = j;
                }
            }
            Person aux = people[indice];
            people[indice] = people[i];
            people[i] = aux;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getHeight() < people[indice].getHeight()) {
                    indice = j;
                }
            }
            Person aux = people[indice];
            people[indice] = people[i];
            people[i] = aux;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by age
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person personaActual = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > personaActual.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = personaActual;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person personaActual = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > personaActual.getHeight()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = personaActual;
        }
    }

    // Binary search by age
    public int searchBinaryByAge (Person[] people, int age) {
        // TODO: Implement binary search by age
        int inicio = 0;
        int fin = people.length - 1;
        int mid;

        while (inicio <= fin) {
            mid = (inicio + fin) / 2;

            if (people[mid].getAge() == age) {
                return mid;
            } else if (people[mid].getAge() < age) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int inicio = 0;
        int fin = people.length - 1;
        int mid;

        while (inicio <= fin) {
            mid = (inicio + fin) / 2;

            if (people[mid].getHeight() == height) {
                return mid;
            } else if (people[mid].getHeight() < height) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] people) {
        for (Person persona : people) {
            System.out.println(persona);
        }
    }
}
