package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZarriFoodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer, namefood;
    private int servingsize;

    public ZarriFoodModel() {
    }

    public ZarriFoodModel(Long id, String manufacturer, String namefood, int servingsize) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.namefood = namefood;
        this.servingsize = servingsize;
    }

    public ZarriFoodModel(String manufacturer, String namefood, int servingsize) {
        this.manufacturer = manufacturer;
        this.namefood = namefood;
        this.servingsize = servingsize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public int getServingsize() {
        return servingsize;
    }

    public void setServingsize(int servingsize) {
        this.servingsize = servingsize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
