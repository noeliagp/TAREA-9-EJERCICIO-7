package org.example;

import java.util.*;


/**
 * Class Empleado
 */
public class Empleado {

  //
  // Fields
  //

  private String nombre;
  private String Apellido1;
  private String Apellido2;
  private String rol_asignado;
  
  //
  // Constructors
  //
  public Empleado () { };

  // constructor con atributos

  public Empleado(String nombre, String apellido1, String apellido2, String rol_asignado) {
    this.nombre = nombre;
    Apellido1 = apellido1;
    Apellido2 = apellido2;
    this.rol_asignado = rol_asignado;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of Apellido1
   * @param newVar the new value of Apellido1
   */
  public void setApellido1 (String newVar) {
    Apellido1 = newVar;
  }

  /**
   * Get the value of Apellido1
   * @return the value of Apellido1
   */
  public String getApellido1 () {
    return Apellido1;
  }

  /**
   * Set the value of Apellido2
   * @param newVar the new value of Apellido2
   */
  public void setApellido2 (String newVar) {
    Apellido2 = newVar;
  }

  /**
   * Get the value of Apellido2
   * @return the value of Apellido2
   */
  public String getApellido2 () {
    return Apellido2;
  }

  /**
   * Set the value of rol_asignado
   * @param newVar the new value of rol_asignado
   */
  public void setRol_asignado (String newVar) {
    rol_asignado = newVar;
  }

  /**
   * Get the value of rol_asignado
   * @return the value of rol_asignado
   */
  public String getRol_asignado () {
    return rol_asignado;
  }

  //
  // Other methods
  //

}
