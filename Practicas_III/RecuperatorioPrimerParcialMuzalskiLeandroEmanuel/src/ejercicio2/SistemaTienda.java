package ejercicio2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SistemaTienda {
    Map<String,Producto> catalogoProductos;
    Map<String,Pedido> listaPedidos;
    private int contadorPedidos = 000;

    public SistemaTienda() {
        this.catalogoProductos = new HashMap<>();
        this.listaPedidos = new HashMap<>();
    }

    public void agregarProducto(Producto producto){
        if (!(catalogoProductos.containsKey(producto))) {
            catalogoProductos.put(producto.getCondigo(),producto);
        } else {
            System.out.println("porducto ya en el catalogo");
        }

    }

    public Producto obtenerProducto(String codigo)throws ProductoNoEncontradoException{
        for (Producto p : catalogoProductos.values()) {
            if (catalogoProductos.containsKey(codigo)) {
                System.out.println(p);
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto con codigo: "+ codigo+" no encontrado en el " + "catalogo");
    }

    public Pedido crearYProcesarPedido(String idPedido,Map<String,Integer> productosCantidades)throws PedidoExistenteException{
        contadorPedidos += 001;
        if(!(listaPedidos.containsKey(idPedido))){
            idPedido= "PED"+contadorPedidos;
            Pedido pedido = new Pedido(idPedido, LocalDate.now());
            for (Pedido p: listaPedidos.keySet()){
                if ()
            }
            listaPedidos.put(idPedido,pedido);

            return pedido;
        }
        throw new PedidoExistenteException("Ya existe un pedido con ID "+idPedido);

    }

    public void listarTodosLosProductos(){
        System.out.println("--- Lista Actual de todos los Productos---");
        for (Producto p : catalogoProductos.values()) {
            System.out.println(p);
        }

    }

    public void listarTodosLosPedidos(){
        System.out.println("--- Lista Actual de todos los Pedidios---");
        for (Pedido p : listaPedidos.values()) {
            System.out.println("ID: "+ p.getIdPedido()+ ", Fecha: "+ p.getFechaPedido() + ", Producto: "+ p);
        }
    }
}
