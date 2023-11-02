package RETO;

import e44.Articulo;

// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
// !!!!!!!!!!!PREGUNTAR MARIO
public class CarritoCompra {
    Articulo[] carrito = new Articulo[10];
    // public Articulo[] creaArray() {
    // Articulo[] carrito = new Articulo[10];
    // return carrito;
    // }

    public void guardarArticulo(Articulo art) {
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] == null) {
                carrito[i] = art;
                break;
            }

        }
    }

    public void mostrarArticulos() {
        for (int j = 0; j < carrito.length; j++) {
            int cont = 0;
            if (carrito[j] != null) {
                System.out.println("Id = " + carrito[j].getIdArticulo() + ", nombre = " + carrito[j].getNombre()
                        + ", precio = " + carrito[j].getPrecio() + "€");
                cont++;
            } else if (cont == 0) {
                System.out.println("No hay articulos en el carrito");
            }
        }
    }

    // public Articulo buscarArticuloPorId(int id) {
    // boolean cond = false;
    // for (Articulo elemCarrito : carrito) {
    // if (elemCarrito.getIdArticulo() == id) {
    // return elemCarrito;
    // }
    // }

    // }
    public double calcularPrecioTotalCarrito() {
        double total = 0;
        for (Articulo elemCarrito : carrito) {
            total += elemCarrito.getPrecio();
        }
        return total;
    }
}