public class GestionPedidos {

    private PilaPedidos pilaPrincipal;
    private PilaPedidos pilaSecundaria;

    public GestionPedidos() {
        pilaPrincipal = new PilaPedidos();
        pilaSecundaria = new PilaPedidos();
    }

    // Registrar pizza
    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        // Cuando se agrega una nueva pizza
        // se limpia el historial de rehacer
        pilaSecundaria = new PilaPedidos();

        System.out.println("Pedido registrado.");
    }

    // Undo
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();

        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    // Redo
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();

        pilaPrincipal.push(pizza);

        System.out.println("Pedido recuperado.");
    }

    // Mostrar actual
    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos activos.");
        } else {
            System.out.println(pizza);
        }
    }
}
