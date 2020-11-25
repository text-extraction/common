package textextraction.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Any resource in a document (e.g., a font, or a color).
 * 
 * @author Claudius Korzen
 */
public class Resource {
  /**
   * The id of this resource (which is used for referencing purposes when serialized).
   */
  protected String id;

  // ==============================================================================================

  /**
   * Returns the id of this resource.
   * 
   * @return The id of this resource.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Sets the id of this resource.
   * 
   * @param id The id.
   */
  public void setId(String id) {
    this.id = id;
  }

  // ==============================================================================================

  @Override
  public String toString() {
    return "Resource(" + getId() + ")";
  }

  // ==============================================================================================

  @Override
  public boolean equals(Object other) {
    if (other instanceof Resource) {
      Resource otherResource = (Resource) other;

      EqualsBuilder builder = new EqualsBuilder();
      builder.append(getId(), otherResource.getId());

      return builder.isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getId());
    return builder.hashCode();
  }
}
