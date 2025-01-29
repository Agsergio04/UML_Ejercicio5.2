data class Producto(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val impuestos: Double,
    var stock: Int){

    fun comprobarStock(){
        if (this.stock <= 0){
            print("Introduce una cantidad a reponer dado que no quedan mas ")
            var cantidad = readln().toIntOrNull()

            while (cantidad == null){
                println("Introduce un numero para reponer el stock ! ! ! ")
                var cantidad = readln().toIntOrNull()
            }


            agregarStock(cantidad)
        }
    }

    fun agregarStock(cantidad : Int){
        if (cantidad > 0){
            stock += cantidad
        } else {
            println("Por favor,aumenta el stock con una cantidad positiva")
        }

    }
}
