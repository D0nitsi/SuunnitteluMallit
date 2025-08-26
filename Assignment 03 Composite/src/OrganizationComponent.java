public abstract class OrganizationComponent {
    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Cannot add to this component.");
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Cannot remove from this component.");
    }

    public abstract double getSalary();

    public abstract String toXML(int indentLevel);
}