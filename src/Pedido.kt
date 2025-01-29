class Pedido(
    var precio_pedido: Double = 0.0,
    val id: String,
    val cliente: Cliente,
    val fecha: String,
    var listaPedidos: MutableList<Producto> = mutableListOf(),
    var estado: EstadoPedido = EstadoPedido.PENDIENTE
) {

    fun precioPedido(){
        for (elemento in listaPedidos){
            precio_pedido += elemento.precio * elemento.impuestos
        }
    }

    fun aniadirProducto(producto: Producto){
        this.listaPedidos.add(producto)
    }

    fun eleminarProducto(producto : Producto,cantidad : Int){
        listaPedidos.remove(producto)
    }

    fun entregarProducto(){
        estado = EstadoPedido.PAGADO
    }

    fun verificarPago(realizarPago : MetodoPago){

    }
}
