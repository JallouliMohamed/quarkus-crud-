package service.dto;

import java.io.Serializable;

public class PublicationDTO implements Serializable {
    private String id;
    private String name;

    public PublicationDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public PublicationDTO() {
    }

    @Override
    public String toString() {
        return "PublicationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
