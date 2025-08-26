import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        return components.stream().mapToDouble(OrganizationComponent::getSalary).sum();
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = " ".repeat(indentLevel);
        StringBuilder xml = new StringBuilder(String.format("%s<Department name=\"%s\">\n", indent, getName()));
        for (OrganizationComponent component : components) {
            xml.append(component.toXML(indentLevel + 2));
        }
        xml.append(String.format("%s</Department>\n", indent));
        return xml.toString();
    }
}