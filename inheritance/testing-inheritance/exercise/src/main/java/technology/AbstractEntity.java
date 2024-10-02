package technology;
import java.util.UUID;

public class AbstractEntity {
    private final String id;

    protected AbstractEntity() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
