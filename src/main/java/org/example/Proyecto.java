package org.example;

import java.util.*;


/**
 * Class Proyecto
 */
public class Proyecto {

  //
  // Fields
  //

  private String fecha_inicio;
  private String fecha_fin;
  private String descripcion;

  private ArrayList<Empleado> listaDeEmpleados;
  
  //
  // Constructors
  // contructor por defecto
  public Proyecto () { };
  // constructor con todos los atributos

  public Proyecto(String fecha_inicio, String fecha_fin, String descripcion) {
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
    this.descripcion = descripcion;
    this.listaDeEmpleados = new ArrayList<>();
  }


  //
  // Methods
  //
public void AgregarEmpleados(Empleado empleadoAgregar){
    listaDeEmpleados.add(empleadoAgregar);

  }
  //
  // Accessor methods
  //

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  //
  // Other methods
  //

}
