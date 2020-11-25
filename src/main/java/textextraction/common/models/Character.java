package textextraction.common.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A character in a document.
 * 
 * @author Claudius Korzen
 */
public class Character extends Element {
  /**
   * The text of this character.
   */
  protected String text;

  /**
   * The position of this character in the document.
   */
  protected Position position;

  /**
   * The font face (= font and font size) of this character.
   */
  protected FontFace fontFace;

  /**
   * The color of this character.
   */
  protected Color color;

  // ==============================================================================================

  /**
   * Returns the text of this character.
   * 
   * @return The text of this character.
   */
  public String getText() {
    return this.text;
  }

  /**
   * Sets the text of this character.
   * 
   * @param text The text of this character.
   */
  public void setText(String text) {
    this.text = text;
  }

  // ==============================================================================================

  /**
   * Returns the position of this character in the document.
   * 
   * @return The position of this character in the document.
   */
  public Position getPosition() {
    return this.position;
  }

  /**
   * Sets the position of this character in the document.
   * 
   * @param position The position of this character in the document.
   */
  public void setPosition(Position position) {
    this.position = position;
  }

  // ==============================================================================================

  /**
   * Returns the font face of this character.
   * 
   * @return The font face of this character.
   */
  public FontFace getFontFace() {
    return this.fontFace;
  }

  /**
   * Sets the font face of this character.
   * 
   * @param fontFace The font face of this character.
   */
  public void setFontFace(FontFace fontFace) {
    this.fontFace = fontFace;
  }

  // ==============================================================================================

  /**
   * Returns the color of this character.
   * 
   * @return The color of this character.
   */
  public Color getColor() {
    return this.color;
  }

  /**
   * Sets the color of this character.
   * 
   * @param color The color of this character.
   */
  public void setColor(Color color) {
    this.color = color;
  }



  // ==============================================================================================

  @Override
  public String toString() {
    return "Character(" + getText() + ", " + getPosition() + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Character) {
      Character otherCharacter = (Character) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getText(), otherCharacter.getText());
      builder.append(getPosition(), otherCharacter.getPosition());
      builder.append(getFontFace(), otherCharacter.getFontFace());
      builder.append(getColor(), otherCharacter.getColor());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getText());
    builder.append(getPosition());
    builder.append(getFontFace());
    builder.append(getColor());
    return builder.hashCode();
  }
}
