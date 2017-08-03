package resttest;

/**
 * Created by Slava on 02.08.2017.
 */
public class SomeEntity {

    private String entityName;

    private int entityNumber;

    //геттеры и сеттеры обязательно

    public SomeEntity setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    public SomeEntity setEntityNumber(int entityNumber) {
        this.entityNumber = entityNumber;
        return this;
    }

    public String getEntityName() {
        return entityName;
    }

    public int getEntityNumber() {
        return entityNumber;
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
                "entityName='" + entityName + '\'' +
                ", entityNumber=" + entityNumber +
                '}';
    }
}
