package textextraction.common.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A figure in a document.
 * 
 * @author Claudius Korzen
 */
public class Figure extends Element {
  /**
   * The position of this figure in the document.
   */
  protected Position position;

  // ==============================================================================================

  /**
   * Returns the position of this figure in the document.
   * 
   * @return The position of this figure in the document.
   */
  public Position getPosition() {
    return this.position;
  }

  /**
   * Sets the position of this figure in the document.
   * 
   * @param position The position of this figure in the document.
   */
  public void setPosition(Position position) {
    this.position = position;
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Fig(p: " + getPosition() + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Figure) {
      Figure otherFigure = (Figure) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getPosition(), otherFigure.getPosition());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getPosition());
    return builder.hashCode();
  }

}
