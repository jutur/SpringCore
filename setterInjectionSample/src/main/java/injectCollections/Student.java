package injectCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private List<String> courses;
    private Set<Long> mobileNo;
    private Map<String, String> feeDetails;
    private Properties properties;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Set<Long> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Set<Long> mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Map<String, String> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(Map<String, String> feeDetails) {
        this.feeDetails = feeDetails;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
