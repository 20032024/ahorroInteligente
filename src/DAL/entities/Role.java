package DAL.entities;

public class Role {
    private Long id;
    private String description;

    public Role(Long id, String desc) {
        this.id = id;
        this.description = desc;
    }

    public Role(String desc) {
        this.id = (long) 0;
        this.description = desc;
    }

    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Role valueOf(String rol) {
        return new Role(rol);
    }
}
