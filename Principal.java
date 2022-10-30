import java.util.Scanner;

public class Principal  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    mostrarMenu();
    int usuario = sc.nextInt();

    while (usuario != 0) {
      if (usuario == 1) {
        if (Vehiculo.cantidadVehiculos() == 10) {
          System.out.println("Error, base de datos llena");
        } else {
          System.out.println("Ingrese el modelo");
          int modelo = sc.nextInt();
          System.out.println("Ingrese la marca");
          String marca = sc.next();
          System.out.println("Ingrese el valor");
          double valor = sc.nextDouble();
          System.out.println("Ingrese el color");
          String color = sc.next();
          System.out.println("El vehículo ha sido agregado");
          Vehiculo ve = new Vehiculo(modelo, marca, valor, color);
        }
      }
      if (usuario == 2) {
        System.out.println("Los vehículos previamente agregados son:");
        System.out.println(Vehiculo.toStringVehiculos());
      }
      if (usuario == 3) {
        System.out.println("La cantidad de vehículos agregados es: ");
        System.out.println(Vehiculo.cantidadVehiculos());
      }
      if (usuario == 4) {
        for (int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
          if (Vehiculo.vehiculos[i].getColor().equals("verde")) {
            System.out.println("Los vehículos de color verde previamente agregados son: ");
            System.out.println(Vehiculo.vehiculos[i].toString());
          }
        }
      }
      if (usuario == 5) {
        System.out.println("Los vehículos de modelos entre 2000 y 2021 son:");
        for (int j = 0; j < Vehiculo.cantidadVehiculos(); j++) {
          if (Vehiculo.vehiculos[j].getModelo() > 1999 && Vehiculo.vehiculos[j].getModelo() < 2022) {
            System.out.println(Vehiculo.vehiculos[j].toString());
          }
        } 
      }
      if (usuario == 6) {
        if (Sensor.cantidadSensores() == 8) {
          System.out.println("Error, base de datos llena");
        } else {
        System.out.println("Ingrese el tipo de sensor");
          String tipo = sc.next();
          System.out.println("Ingrese el valor del sensor");
          double valor = sc.nextDouble();
          System.out.println("El sensor ha sido agregado");
          Sensor sen = new Sensor(tipo, valor);
        }
      }
      if (usuario == 7) {
        System.out.println("Los sensores agregados son: ");
        System.out.println(Sensor.toStringSensores());
      }
      if (usuario == 8) {
        System.out.println("La cantidad de sensores agregados es: ");
        System.out.println(Sensor.cantidadSensores());
      }
      if (usuario == 9) {
        System.out.println("Los sensores de tipo temperatura previamente agregados son: ");
        for (int i = 0; i < Sensor.cantidadSensores(); i++) {
          if (Sensor.sensores[i].getTipo().equals("temperatura")) {
            System.out.println(Sensor.sensores[i].toString());
          }
        }
      }
      if (usuario == 666) {
        Sensor[] arr = Sensor.ordenarSensores();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
      }
      System.out.println();
      System.out.println();
      System.out.println();
      mostrarMenu();
      usuario = sc.nextInt(); 
    }
  }

  public static void mostrarMenu() {
    System.out.println("Bienvenido usuario, ingrese 1 para agregar un vehiculo");
    System.out.println("Presione 2 para mostrar todos los vehiculos previamente agregados");
    System.out.println("Presione 3 para mostrar la cantidad de vehículos");
    System.out.println("Presione 4 para mostrar los vehículos verdes");
    System.out.println("Presione 5 para mostrar los vehículos de modelos entre 2000 y 2021");
    System.out.println("Presione 6 para agregar un nuevo sensor");
    System.out.println("Presione 7 para mostrar los sensores agregados");
    System.out.println("Presione 8 para mostrar la cantidad de sensores actuales");
    System.out.println("Presione 9 para mostrar los sensores de tipo temperatura");
    System.out.println("Presione 666 para imprimir los sensores de temperatura ordenados");
  }
}