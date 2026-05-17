public class PilaPedidos {

    private Nodo cima;

    public PilaPedidos() {
        cima = null;
    }

    // PUSH
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al que era la cima
        nuevo.siguiente = cima;

        // Ahora el nuevo nodo es la cima
        cima = nuevo;
    }

    // POP
    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        Pizza pizzaEliminada = cima.pizza;

        // La cima avanza al siguiente nodo
        cima = cima.siguiente;

        return pizzaEliminada;
    }

    // PEEK
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return cima.pizza;
    }

    // ISEMPTY
    public boolean isEmpty() {
        return cima == null;
    }
}
