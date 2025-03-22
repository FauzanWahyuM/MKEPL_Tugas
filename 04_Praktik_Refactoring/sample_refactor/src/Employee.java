import java.util.Date;

public class Employee {
    private String name;
    private String phone;
    private String address;
    private String birthCity;
    private Date birthDate;
    private String emergencyContactName;
    private String emergencyContactAddress;
    private String emergencyContactPhone;
    private String employeeId;
    private float salary;
    private Departement departement;
    private Date joinDate;

    public Employee(String name, String phone, String address, String birthCity, Date birthDate,
            String emergencyContactName, String emergencyContactAddress, String emergencyContactPhone,
            String employeeId, float salary, Departement departement, Date joinDate) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthCity = birthCity;
        this.birthDate = birthDate;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactAddress = emergencyContactAddress;
        this.emergencyContactPhone = emergencyContactPhone;
        this.employeeId = employeeId;
        this.salary = salary;
        this.departement = departement;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public float getSalary() {
        return salary;
    }

    public Departement getDepartement() {
        return departement;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    enum Departement {
        IT, HR, FINANCE, MARKETING
    }
}
