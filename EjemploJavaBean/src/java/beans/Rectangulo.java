/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author Ubaldo
 */
public class Rectangulo {

  private int base;

  private int altura;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  /**
   * Agregamos un metodo que no mapea con ninguna propiedad
   * sino que es el resultado de un calculo
   */
  public int getArea(){
    return this.base * this.altura;
  }

}
