package punto4;

public class Producto {
    private Double precio;
    private Integer stock;
    public Producto(Double precio, Integer stock) {
        this.precio = precio;
        this.stock = stock;
    }
    public Double getPrecio(){return precio;}
    public void setPrecio(Double precio){this.precio = precio;}
    public Integer getStock(){return stock;}
    public void setStock(Integer stock){this.stock = stock;}
    public void reducirStock(){stock--;}
    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
