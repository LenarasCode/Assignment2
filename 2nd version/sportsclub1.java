import java.util.*;

public class SportsClub {
    private String clubName;
    private List<Athlete> athletes;

    // Constructor
    public SportsClub(String clubName) {
        this.clubName = clubName;
        this.athletes = new ArrayList<>();
    }

    // Add athlete to the club
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    // Filter athletes by sport name
    public List<Athlete> filterBySport(String sportName) {
        List<Athlete> result = new ArrayList<>();
        for (Athlete athlete : athletes) {
            if (athlete.getSport().getName().equals(sportName)) {
                result.add(athlete);
            }
        }
        return result;
    }

    // Search athlete by name
    public Athlete searchByName(String name) {
        for (Athlete athlete : athletes) {
            if (athlete.getName().equals(name)) {
                return athlete;
            }
        }
        return null;
    }

    // Sort athletes by name
    public List<Athlete> sortByName() {
        athletes.sort(Comparator.comparing(Athlete::getName));
        return athletes;
    }

    // Sort athletes by experience
    public List<Athlete> sortByExperience() {
        athletes.sort(Comparator.comparingInt(Athlete::getExperience).reversed());
        return athletes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("| %-20s | %-3s | %-15s | %-5s | %-5s | %-4s |\n", 
                               "Имя", "Возраст", "Вид спорта", "Рост", "Вес", "Опыт"));
        sb.append(String.format("|----------------------|-----|-----------------|-------|-------|------|\n"));
        for (Athlete athlete : athletes) {
            sb.append(athlete).append("\n");
        }
        return sb.toString();
    }
}

