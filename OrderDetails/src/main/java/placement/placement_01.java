package placement; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placements")
public class placement_01 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // primary key

    private String studentName;
    private String college;
    private String companyName;
    private String jobRole;
    private String packageOffered;
    private String status;

    // Constructors
    public placement_01() {}

    public placement_01(Long id, String studentName, String companyName, String jobRole, String status, String college, String packageOffered) {
        this.id = id;
        this.studentName = studentName;
        this.college = college;
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.packageOffered = packageOffered;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    
    public String getcollege() { return college; }
    public void setcollege(String college) { this.college = college; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }
    
    public String getpackageOffered() { return packageOffered; }
    public void setpackageOffered(String packageOffered) { this.packageOffered = packageOffered; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // toString()
    @Override
    public String toString() {
        return "Placement [id=" + id + ", studentName=" + studentName + ",college=" + college + ", companyName=" + companyName
                + ", jobRole=" + jobRole + ",packageOffered=" + packageOffered + ", status=" + status + "]";
    }
}
