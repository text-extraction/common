package textextraction.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * An enumeration of all available document element classes.
 *
 * @author Claudius Korzen
 */
public enum ElementClass {
  /**
   * The class "characters".
   */
  CHARACTERS("characters"),

  /**
   * The class "figures".
   */
  FIGURES("figures"),

  /**
   * The class "shapes".
   */
  SHAPES("shapes");

  // ==============================================================================================

  /**
   * The name of this element class.
   */
  protected String name;

  /**
   * The element classes per name.
   */
  protected static Map<String, ElementClass> index;

  static {
    index = new HashMap<>();

    // Fill the map of element classes per name.
    for (ElementClass clazz : values()) {
      index.put(clazz.getName(), clazz);
    }
  }

  /**
   * Creates a new element class.
   * 
   * @param name The name of the element class.
   */
  private ElementClass(String name) {
    this.name = name;
  }

  // ==============================================================================================

  /**
   * Returns the name of this element class.
   * 
   * @return The name of this element class.
   */
  public String getName() {
    return this.name;
  }

  // ==============================================================================================

  /**
   * Returns a set of the names of all element classes.
   * 
   * @return A set of the names of all element classes.
   */
  public static Set<String> getNames() {
    return index.keySet();
  }

  /**
   * Returns a collection of all available element classes.
   * 
   * @return A collection of all available element classes.
   */
  public static Collection<ElementClass> getElementClasses() {
    return index.values();
  }

  /**
   * Checks if the given name is a name of an existing element classe.
   * 
   * @param name The name to check.
   * 
   * @return True, if the given name is a name of an existing element class.
   */
  public static boolean isValidElementClass(String name) {
    return index.containsKey(name.toLowerCase());
  }

  /**
   * Returns a set of the element classes that are associated with the given names.
   * 
   * @param names The names of the element classes to fetch.
   *
   * @return The set of the fetched element classes.
   */
  public static Set<ElementClass> fromStrings(String... names) {
    return fromStrings(Arrays.asList(names));
  }

  /**
   * Returns a set of the element classes that are associated with the given names.
   * 
   * @param names The names of the element classes to fetch.
   *
   * @return A set of the fetched element classes.
   */
  public static Set<ElementClass> fromStrings(List<String> names) {
    if (names == null || names.isEmpty()) {
      return null;
    }

    Set<ElementClass> clazzes = new HashSet<>();
    for (String name : names) {
      ElementClass clazz = fromString(name);
      if (clazz != null) {
        clazzes.add(clazz);
      }
    }
    return clazzes;
  }

  /**
   * Returns the element class that is associated with the given name.
   * 
   * @param name The name of the element class to fetch.
   *
   * @return The element class that is associated with the given name.
   */
  public static ElementClass fromString(String name) {
    if (!isValidElementClass(name)) {
      throw new IllegalArgumentException(name + " isn't a valid element class.");
    }
    return index.get(name.toLowerCase());
  }
}
