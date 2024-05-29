package EjercicioIterator;

public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    public Producto() {
        // Default constructor
    }

    public Producto(int id, String codigo, String nombre, String marca, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters (if needed)
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   @Override
  public String toString() {
      return "Datos del producto" + id + ", Codigo: " + codigo + ", Nombre: " + nombre + ", Marca: " + marca + ", Precio: " + precio + "";
   }
}

