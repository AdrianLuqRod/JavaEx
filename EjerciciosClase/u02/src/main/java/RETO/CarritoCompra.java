package RETO;

import e44.Articulo;

public class CarritoCompra {
    Articulo[] articulos;

    public CarritoCompra() {
        articulos = new Articulo[10];
    }

    public void guardarArticulo(Articulo art) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                articulos[i] = art;
                break;
            }
        }
    }

    public void mostrarArticulos() {
        boolean exist = false;
        for (int j = 0; j < articulos.length; j++) {
            if (articulos[j] != null) {
                System.out.println("Id = " + articulos[j].getIdArticulo() + ", nombre = " + articulos[j].getNombre()
                        + ", precio = " + articulos[j].getPrecio() + "€");
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("No hay articulos en el articulos");
        }
    }

    public Articulo buscarArticuloPorId(int id) {
        for (Articulo elemArticulos : articulos) {
            if (elemArticulos != null && elemArticulos.getIdArticulo() == id) {
                return elemArticulos;
            }
        }
        return null;
    }

    public double calcularPrecioTotalarticulos() {
        double total = 0;
        for (Articulo elemArticulos : articulos) {
            if (elemArticulos != null) {
                total += elemArticulos.getPrecio();
            }
        }
        return total;
    }
}