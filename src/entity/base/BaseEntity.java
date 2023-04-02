package entity.base;

public class BaseEntity {
    protected  long id;
    public  long getId() {
        return id;
    }

    public BaseEntity(long id) {
     setId(id);
    }

    public  void setId(long id) {
     this.id = id;
    }



}
