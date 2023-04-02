package ir.maktab92.onlineshop.base.domain;

public class Entity {
    protected  long id;

    public  long getId() {
        return id;
    }

    public Entity(long id) {
        this.id = id;

    }

    public  void setId(long id) {
     this.id = id;
    }

    public Entity() {
    }


}
