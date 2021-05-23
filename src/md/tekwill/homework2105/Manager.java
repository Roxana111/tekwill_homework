package md.tekwill.homework2105;

public class Manager {
    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Manager) {
            Manager other = (Manager) obj;
            return this.name != null
                    && this.name.equals(other.name)
                    && this.department != null
                    && this.department.equals(other.department);
        }

        return false;

    }
}
