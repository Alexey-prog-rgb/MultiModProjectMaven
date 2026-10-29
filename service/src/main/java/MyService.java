import java.util.UUID;

public class MyService {
    private DBSetting dbSetting = new DBSetting("name", "password");
    private String name = "MyService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }
}
