class Vehiculo {
  public static int tamano = 10;
  public static Vehiculo[] vehiculos = new Vehiculo[tamano];
  public static int posAnadir = 0;
  private int modelo;
  private String marca;
  private double valorComercial;
  private String color;

  public Vehiculo() {
    vehiculos[posAnadir] = this;
    posAnadir++;
  }

  public Vehiculo(int mo, String ma, double va, String co) {
    this();
    this.modelo = mo;
    this.marca = ma;
    this.valorComercial = va;
    this.color = co;
  }

  public Vehiculo(int mo, String ma, double va) {
    this(mo, ma, va, "verde");
  }

  public String toString() {
    return "La marca del vehiculo es " + this.marca + ", el modelo es " + this.modelo + ", el valor comercial del vehiculo es " + this.valorComercial + " y el color es " + this.color;
  }

  public static String toStringVehiculos() {
    String info = "";
    for(int i = 0; i < posAnadir; i++){
          info = info + Vehiculo.vehiculos[i].toString() + "\n";
      }
    return info;
  }

  public static int cantidadVehiculos() {
    return posAnadir;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public int getModelo() {
    return this.modelo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setValorComercial(double valorComercial) {
    this.valorComercial = valorComercial;
  }

  public double getValorComercial() {
    return this.valorComercial;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  public String getColor() {
    return this.color;
  }
}