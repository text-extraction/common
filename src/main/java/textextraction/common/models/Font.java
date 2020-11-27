package textextraction.common.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A font in a document.
 * 
 * @author Claudius Korzen
 */
public class Font extends Resource {
  /**
   * The name of this font.
   */
  protected String name;

  /**
   * The boolean flag that indicates whether or not this font is a bold-faced font.
   */
  protected boolean isBold;

  /**
   * The boolean flag that indicates whether or not this font is an italic-faced font.
   */
  protected boolean isItalic;

  // ==============================================================================================

  /**
   * Returns the name of this font.
   * 
   * @return The name of this font.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name of this font.
   * 
   * @param name The name of this font.
   */
  public void setName(String name) {
    this.name = name;
  }

  // ==============================================================================================

  /**
   * Returns true, if this font is a bold-faced font.
   * 
   * @return True, if this font is a bold-faced font; false otherwise.
   */
  public boolean isBold() {
    return this.isBold;
  }

  /**
   * Sets the boolean flag that indicates whether or not this font is a bold-faced font.
   * 
   * @param isBold The boolean flag that indicates whether or not this font is a bold-faced font.
   */
  public void setIsBold(boolean isBold) {
    this.isBold = isBold;
  }

  // ==============================================================================================

  /**
   * Returns true, if this font is an italic-faced font.
   * 
   * @return True, if this font is an italic-faced font, false otherwise.
   */
  public boolean isItalic() {
    return this.isItalic;
  }

  /**
   * Sets the boolean flag that indicates whether or not this font is an italic-faced font.
   * 
   * @param isItalic The boolean flag that indicates whether or not this font is an italic-faced
   *                 font.
   */
  public void setIsItalic(boolean isItalic) {
    this.isItalic = isItalic;
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Font(" + this.name + ", id: " + this.id + ", isBold: " + this.isBold + ", isItalic: "
            + this.isItalic() + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Font) {
      Font otherFont = (Font) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getName(), otherFont.getName());
      builder.append(isBold(), otherFont.isBold());
      builder.append(isItalic(), otherFont.isItalic());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getName());
    builder.append(isBold());
    builder.append(isItalic());
    return builder.hashCode();
  }
}
