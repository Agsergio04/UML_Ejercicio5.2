data class Cliente(
    val id: String,
    val nombre: String,
    val direccion: String,
    val pedidos: MutableList<Pedido> = mutableListOf()){

    fun realizarPedido(pedido : Pedido){

    }

    fun recibirPedido(pedido : Pedido){

        for (registro in pedidos)
            if (!registro.equals(pedido)){
                pedidos.add(pedido)
            } else {
                println("Es el mismo pedido")
            }
        pedido.estado = EstadoPedido.ENTREGADO
    }
}