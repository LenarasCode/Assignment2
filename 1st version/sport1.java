
public class Sport {
    private String name;
    private String type;
    private String description;

    // Constructor
    public Sport(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-12s | %-50s |", name, type, description);
    }
}
