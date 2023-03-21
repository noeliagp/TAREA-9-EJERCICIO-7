package org.example;

import java.util.*;


/**
 * Class Lugar
 */
public class Lugar {

  //
  // Fields
  //

  private int Id;
  private String direccion;
  private String provincia;
  private String localidad;
  
  //
  // Constructors
  //
  public Lugar () { };

  // constructor con atributos

  public Lugar(int id, String direccion, String provincia, String localidad) {
    Id = id;
    this.direccion = direccion;
    this.provincia = provincia;
    this.localidad = localidad;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Id
   * @param newVar the new value of Id
   */
  public void setId (int newVar) {
    Id = newVar;
  }

  /**
   * Get the value of Id
   * @return the value of Id
   */
  public int getId () {
    return Id;
  }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of provincia
   * @param newVar the new value of provincia
   */
  public void setProvincia (String newVar) {
    provincia = newVar;
  }

  /**
   * Get the value of provincia
   * @return the value of provincia
   */
  public String getProvincia () {
    return provincia;
  }

  /**
   * Set the value of localidad
   * @param newVar the new value of localidad
   */
  public void setLocalidad (String newVar) {
    localidad = newVar;
  }

  /**
   * Get the value of localidad
   * @return the value of localidad
   */
  public String getLocalidad () {
    return localidad;
  }

  //
  // Other methods
  //

}
