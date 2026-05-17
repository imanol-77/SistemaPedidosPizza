public class PilaPedidos {

    // Variable que apunta al nodo que está en la cima de la pila
    private Nodo cima;

    public PilaPedidos() {

        // Inicialmente la pila está vacía
        cima = null;
    }

    // Método PUSH
    // Inserta una pizza en la cima de la pila
    public void push(Pizza pizza) {

        // Se crea un nuevo nodo con la pizza
        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta hacia la antigua cima
        nuevo.siguiente = cima;

        // Ahora el nuevo nodo se convierte en la cima
        cima = nuevo;
    }

    // Método POP
    // Elimina el nodo de la cima y devuelve su pizza
    public Pizza pop() {

        // Verifica si la pila está vacía
        if (isEmpty()) {
            return null;
        }

        // Guarda la pizza de la cima
        Pizza pizzaEliminada = cima.pizza;

        // La cima avanza al siguiente nodo
        // El nodo anterior queda fuera de la lista
        cima = cima.siguiente;

        // Retorna la pizza eliminada
        return pizzaEliminada;
    }

    // Método PEEK
    // Muestra la pizza en la cima sin eliminarla
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return cima.pizza;
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {

        return cima == null;
    }
}
