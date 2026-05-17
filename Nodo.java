public class Nodo {

    // Objeto pizza almacenado en el nodo
    Pizza pizza;

    // Puntero al siguiente nodo de la lista ligada
    Nodo siguiente;

    public Nodo(Pizza pizza) {

        this.pizza = pizza;

        // El nodo inicia sin apuntar a otro nodo
        this.siguiente = null;
    }
}
