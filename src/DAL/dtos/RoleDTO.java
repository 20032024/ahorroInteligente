package DAL.dtos;

public class RoleDTO {
    private Long id;
    private String description;

    public RoleDTO() {
    }

    public RoleDTO(Long id, String desc) {
        this.id = id;
        this.description = desc;
    }

    public RoleDTO(String desc) {
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

    
}
