public class EmployeeAdapterLDAP implements Employee {
    private EmployeeLDAP employeeLDAP;

    public EmployeeAdapterLDAP(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getSurName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLDAP{" +
                "ID=" + employeeLDAP.getCn() +
                '}';
    }
}
