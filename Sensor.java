import java.util.ArrayList;
import java.util.*;

public class Sensor {
  public static int tamano = 8;

  public static Sensor[] sensores = new Sensor[tamano];
  public static int posAnadir = 0;
  private String tipo;
  private double valor;

  public Sensor() {
  }

  public Sensor(String t, double v) {
    this();
    this.tipo = t;
    this.valor = v;
    sensores[posAnadir] = this;
    posAnadir++;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }

  public String toString() {

    return "El tipo del Sensor es " + this.tipo + ", y el valor es " + this.valor;
  }

  public static String toStringSensores() {
    String info = "";
    for (int i = 0; i < posAnadir; i++) {
      info = info + Sensor.sensores[i].toString() + "\n";
    }
    return info;
  }

  public static int cantidadSensores() {
    return posAnadir;
  }

  public static Sensor[] ordenarSensores() {
    int cantidadSensoresTemperatura = 0;

    for (int i = 0; i < cantidadSensores(); ++i) {
      if (sensores[i].getTipo().equals("temperatura")) {
        cantidadSensoresTemperatura++;
      }
    }

    Sensor[] sensores2 = new Sensor[cantidadSensoresTemperatura];
    int cnt = 0;
    for (int i = 0; i < cantidadSensores(); ++i) {
      if (sensores[i].getTipo().equals("temperatura")) {
        sensores2[cnt] = sensores[i];
        cnt++;
      }
    }

    for (int i = 1; i < sensores2.length; i++) {
      for (int j = 0; j < sensores2.length - 1; j++) {
        if (sensores2[j].getValor() > sensores2[j + 1].getValor()) {
          Sensor temporal = sensores2[j];
          sensores2[j] = sensores2[j + 1];
          sensores2[j + 1] = temporal;
        }
      }
    }
    return sensores2;
  }
}
