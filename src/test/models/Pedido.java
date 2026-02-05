package test.models;

import java.util.List;

public class Pedido {
  String cliente;
  String codigoPostal;
  List<Integer> prioridades;
  
  public Pedido(String cliente, String codigoPostal, List<Integer> prioridades) {
    this.cliente = cliente;
    this.codigoPostal = codigoPostal;
    this.prioridades = prioridades;
  }

  public Pedido() {
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public List<Integer> getPrioridades() {
    return prioridades;
  }

  public void setPrioridades(List<Integer> prioridades) {
    this.prioridades = prioridades;
  }

  public int getZona(){
    

    return 1;
  }

  public int getUrgencia(){
    return 1;
  }


}
