package wecancatchit.werehooked.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Bait {

    @Id
    @GeneratedValue
    private Long id;

    private String baitName;
    private String image;

    @ManyToMany
    private Collection<Fish> fish;

    protected Bait(){}

    public Bait(String baitName, String image){
        this.baitName = baitName;
        this.image = image;
    }

    public Long getId(){
        return id;
    }

    public String getBaitName(){
        return baitName;
    }

    public String getImage(){
        return image;
    }

    public Collection<Fish> getFish(){
        return fish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bait bait = (Bait) o;
        return Objects.equals(id, bait.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
