
package other;

//Definition of the enum
enum NumberOfSystems {
  First("First choice"), Second("Second choice"), Third("Final choice");
  private final String display;
  private NumberOfSystems(String s) {
    display = s;
  }
  @Override
  public String toString() {
    return display;
  }
}

