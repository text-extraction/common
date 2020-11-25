package textextraction.common.models;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A page in a document.
 * 
 * @author Claudius Korzen
 */
public class Page {
  /**
   * The characters of this page.
   */
  protected List<Character> characters;

  /**
   * The figures of this page.
   */
  protected List<Figure> figures;

  /**
   * The shapes of this page.
   */
  protected List<Shape> shapes;

  /**
   * The number of this page in the document.
   */
  protected int pageNumber;

  /**
   * The width of this page (in pt).
   */
  protected float width;

  /**
   * The height of this page (in pt).
   */
  protected float height;

  // ==============================================================================================

  /**
   * Creates a new page.
   */
  public Page() {
    this.characters = new ArrayList<>();
    this.figures = new ArrayList<>();
    this.shapes = new ArrayList<>();
  }

  /**
   * Creates a new page.
   *
   * @param pageNumber The number of this page in the document.
   */
  public Page(int pageNumber) {
    this();
    this.pageNumber = pageNumber;
  }

  // ==============================================================================================

  /**
   * Returns the characters of this page.
   *
   * @return The characters of this page.
   */
  public List<Character> getCharacters() {
    return this.characters;
  }

  /**
   * Returns the first character of this page.
   *
   * @return The first character of this page, or null if this page doesn't include any characters.
   */
  public Character getFirstCharacter() {
    if (this.characters != null && this.characters.isEmpty()) {
      return this.characters.get(0);
    }
    return null;
  }

  /**
   * Returns the last character of this page.
   *
   * @return The last character of this page, or null if this page doesn't include any characters.
   */
  public Character getLastCharacter() {
    if (this.characters != null && this.characters.isEmpty()) {
      return this.characters.get(this.characters.size() - 1);
    }
    return null;
  }

  /**
   * Sets the characters of this page.
   * 
   * @param characters The characters to set.
   */
  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }

  /**
   * Adds the given characters to this page.
   * 
   * @param characters The characters to add.
   */
  public void addCharacters(List<Character> characters) {
    this.characters.addAll(characters);
  }

  /**
   * Adds the given character to this page.
   * 
   * @param character The character to add.
   */
  public void addCharacter(Character character) {
    this.characters.add(character);
  }

  // ==============================================================================================

  /**
   * Returns the figures of this page.
   *
   * @return The figures of this page.
   */
  public List<Figure> getFigures() {
    return this.figures;
  }

  /**
   * Returns the first figure of this page.
   *
   * @return The first figure of this page, or null if this page doesn't include any figures.
   */
  public Figure getFirstFigure() {
    if (this.figures != null && this.figures.isEmpty()) {
      return this.figures.get(this.figures.size() - 0);
    }
    return null;
  }

  /**
   * Returns the last figure of this page.
   *
   * @return The last figure of this page, or null if this page doesn't include any figures.
   */
  public Figure getLastFigure() {
    if (this.figures != null && this.figures.isEmpty()) {
      return this.figures.get(this.figures.size() - 1);
    }
    return null;
  }

  /**
   * Sets the figures of this page.
   * 
   * @param figures The figures to set.
   */
  public void setFigures(List<Figure> figures) {
    this.figures = figures;
  }

  /**
   * Adds the given figures to this page.
   * 
   * @param figures The figures to add.
   */
  public void addFigures(List<Figure> figures) {
    this.figures.addAll(figures);
  }

  /**
   * Adds the given figure to this page.
   * 
   * @param figures The figure to add.
   */
  public void addFigure(Figure figure) {
    this.figures.add(figure);
  }

  // ==============================================================================================

  /**
   * Returns the shapes of this page.
   *
   * @return The shapes of this page.
   */
  public List<Shape> getShapes() {
    return this.shapes;
  }

  /**
   * Returns the first shape of this page.
   *
   * @return The first shape of this page, or null if this page doesn't include any shapes.
   */
  public Shape getFirstShape() {
    if (this.shapes != null && this.shapes.isEmpty()) {
      return this.shapes.get(0);
    }
    return null;
  }

  /**
   * Returns the last shape of this page.
   *
   * @return The last shape of this page, or null if this page doesn't include any shapes.
   */
  public Shape getLastShape() {
    if (this.shapes != null && this.shapes.isEmpty()) {
      return this.shapes.get(this.shapes.size() - 1);
    }
    return null;
  }

  /**
   * Sets the shapes of this page.
   * 
   * @param shapes The shapes to set.
   */
  public void setShapes(List<Shape> shapes) {
    this.shapes = shapes;
  }

  /**
   * Adds the given shapes to this page.
   * 
   * @param shapes The shapes to add.
   */
  public void addShapes(List<Shape> shapes) {
    this.shapes.addAll(shapes);
  }

  /**
   * Adds the given shape to this page.
   * 
   * @param shape The shape to add.
   */
  public void addShape(Shape shape) {
    this.shapes.add(shape);
  }

  // ==============================================================================================

  /**
   * Returns the page number of this page.
   * 
   * @return The page number of this page.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Sets the page number of this page.
   * 
   * @param pageNumber The page number of this page.
   */
  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  // ==============================================================================================

  /**
   * Returns the height of this page.
   *
   * @return The height of this page (in pt).
   */
  public float getHeight() {
    return this.height;
  }

  /**
   * Sets the height of this page.
   *
   * @param height The height of this page (in pt).
   */
  public void setHeight(float height) {
    this.height = height;
  }

  // ==============================================================================================

  /**
   * Returns the width of this page.
   *
   * @return The width of this page (in pt).
   */
  public float getWidth() {
    return this.width;
  }

  /**
   * Sets the width of this page.
   *
   * @param width The width of this page (in pt).
   */
  public void setWidth(float width) {
    this.width = width;
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Page(" + this.pageNumber + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Page) {
      Page otherPage = (Page) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getCharacters(), otherPage.getCharacters());
      builder.append(getFigures(), otherPage.getFigures());
      builder.append(getShapes(), otherPage.getShapes());
      builder.append(getPageNumber(), otherPage.getPageNumber());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getCharacters());
    builder.append(getFigures());
    builder.append(getShapes());
    builder.append(getPageNumber());
    return builder.hashCode();
  }
}
