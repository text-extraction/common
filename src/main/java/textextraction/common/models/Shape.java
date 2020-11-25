package textextraction.common.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A shape (e.g., a line or a curve) in a document.
 * 
 * @author Claudius Korzen
 */
public class Shape extends Element {
  /**
   * The position of this shape.
   */
  protected Position position;

  /**
   * The color of this shape.
   */
  protected Color color;

  // ==============================================================================================

  /**
   * Returns the position of this shape in the document.
   * 
   * @return The position of this shape in the document.
   */
  public Position getPosition() {
    return this.position;
  }

  /**
   * Sets the position of this shape in the document.
   * 
   * @param position The position of this shape in the document.
   */
  public void setPosition(Position position) {
    this.position = position;
  }

  // ==============================================================================================

  /**
   * Returns the color of this shape.
   * 
   * @return The color of this shape.
   */
  public Color getColor() {
    return this.color;
  }

  /**
   * Sets the color of this shape.
   * 
   * @param color The color of this shape.
   */
  public void setColor(Color color) {
    this.color = color;
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Shape(pos: " + getPosition() + ", color: " + getColor() + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Shape) {
      Shape otherShape = (Shape) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getPosition(), otherShape.getPosition());
      builder.append(getColor(), otherShape.getColor());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getPosition());
    builder.append(getColor());
    return builder.hashCode();
  }
}
