package textextraction.model;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A document.
 * 
 * @author Claudius Korzen
 */
public class Document {
  /**
   * The path to the document on disk.
   */
  protected Path path;

  /**
   * The pages of this document.
   */
  protected List<Page> pages;

  // ==============================================================================================

  /**
   * Creates a new document.
   * 
   * @param path The path to the document on disk.
   */
  public Document(String path) {
    this(Paths.get(path));
  }

  /**
   * Creates a new document.
   * 
   * @param path The path to the document on disk.
   */
  public Document(File path) {
    this(path.toPath());
  }

  /**
   * Creates a new document.
   * 
   * @param path The path to the file.
   */
  public Document(Path path) {
    this.pages = new ArrayList<>();
    this.path = path;
  }

  // ==============================================================================================

  /**
   * Returns the path to the file.
   * 
   * @return The path to the file.
   */
  public Path getPath() {
    return this.path;
  }

  /**
   * Sets the path to the file.
   * 
   * @param path The path to the file.
   */
  public void setPath(Path path) {
    this.path = path;
  }

  // ==============================================================================================

  /**
   * Returns the path to the file.
   * 
   * @return The path to the file.
   */
  public File getFile() {
    return this.path != null ? this.path.toFile() : null;
  }

  /**
   * Sets the path to the file.
   * 
   * @param file The path to the file.
   */
  public void setFile(File file) {
    this.path = file != null ? file.toPath() : null;
  }

  // ==============================================================================================

  /**
   * Returns the pages of this document.
   * 
   * @return The pages of this document.
   */
  public List<Page> getPages() {
    return this.pages;
  }

  /**
   * Returns the first page of this document.
   * 
   * @return The first page of this document, or null if this document contains no pages.
   */
  public Page getFirstPage() {
    if (this.pages == null || this.pages.isEmpty()) {
      return null;
    }
    return this.pages.get(0);
  }

  /**
   * Returns the last page of this document.
   * 
   * @return The last page of this document, or null if this document contains no pages.
   */
  public Page getLastPage() {
    if (this.pages == null || this.pages.isEmpty()) {
      return null;
    }
    return this.pages.get(this.pages.size() - 1);
  }

  /**
   * Sets the pages of this document.
   * 
   * @param pages The pages to set.
   */
  public void setPages(List<Page> pages) {
    this.pages = pages;
  }

  /**
   * Adds the given page to this document.
   * 
   * @param page The page to add.
   */
  public void addPage(Page page) {
    this.pages.add(page);
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Document(" + this.path + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Document) {
      Document otherDocument = (Document) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getPath(), otherDocument.getPath());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getPath());
    return builder.hashCode();
  }
}
