public class Athlete {
    private String name;
    private int age;
    private Sport sport;
    private double height;
    private double weight;
    private int experience;

    // Constructor
    public Athlete(String name, int age, Sport sport, double height, double weight, int experience) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-3d | %-15s | %-5.1f | %-5.1f | %-4d |", 
                              name, age, sport.getName(), height, weight, experience);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Athlete athlete = (Athlete) obj;
        return name.equals(athlete.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

