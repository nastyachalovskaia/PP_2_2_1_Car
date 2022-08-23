package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "series")
    private int series;

    @Column(name = "color")
    private String color;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
    private User user;


    public User getUser() {
        return user;
    }


    @Override
    public String toString() {
        return color + " " + series;
    }

    public Car() {

    }

    public Car(int series, String color) {
        this.series = series;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
