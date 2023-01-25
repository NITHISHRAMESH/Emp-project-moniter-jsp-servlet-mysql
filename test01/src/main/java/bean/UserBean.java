package bean;


public class UserBean {
    private int id;
    private String name;
    private String email;
    private String project;
    public UserBean() {}

    public UserBean(String name, String email, String project) {
        super();
        this.name = name;
        this.email = email;
        this.project = project;
    }

    public UserBean(int id, String name, String email, String project) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.project = project;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
    
    
   
}
