import java.util.*;

public class SportsClubManagement {
    public static void main(String[] args) {
        // Create sports
        Sport boxing = new Sport("Бокс", "Бойцовский", "Вид спорта, где спортсмены сражаются кулаками.");
        Sport swimming = new Sport("Плавание", "Водный", "Скоростной вид спорта в воде.");
        Sport basketball = new Sport("Баскетбол", "Командный", "Игра с мячом и кольцами.");
        Sport football = new Sport("Футбол", "Командный", "Популярный спорт с мячом.");
        Sport tennis = new Sport("Теннис", "Индивидуальный", "Спорт с ракеткой и мячом.");
        Sport judo = new Sport("Дзюдо", "Бойцовский", "Вид борьбы на ковре.");
        Sport athletics = new Sport("Легкая атлетика", "Индивидуальный", "Спорт на скорость и выносливость.");
        Sport cycling = new Sport("Велоспорт", "Индивидуальный", "Гонки на велосипедах.");

        // Create athletes with corrected heights
        List<Athlete> athletes = Arrays.asList(
                new Athlete("Абжанов Нуржан", 20, boxing, 1.85, 78.0, 5),
                new Athlete("Сымбаткызы Ленара", 22, swimming, 1.75, 59.5, 3),
                new Athlete("Круглов Руслан", 25, basketball, 1.95, 85.0, 6),
                new Athlete("Карина Орынбасарова", 23, athletics, 1.68, 55.0, 4),
                new Athlete("Аруана Жаксылык", 27, football, 1.60, 74.0, 8),
                new Athlete("Аружан Картам", 21, tennis, 1.65, 60.0, 2),
                new Athlete("Умурзаков Елдар", 26, cycling, 1.90, 70.0, 5),
                new Athlete("Сарыкулов Амир", 22, judo, 1.85, 64.0, 3),
                new Athlete("Мирас Алимов", 28, football, 1.88, 80.0, 10),
                new Athlete("Гульнар Тастанова", 24, swimming, 1.62, 58.0, 3),
                new Athlete("Ерасыл Омаров", 23, boxing, 1.80, 72.0, 5),
                new Athlete("Айдана Умирзакова", 20, tennis, 1.75, 62.0, 1),
                new Athlete("Кайрат Касымов", 29, basketball, 1.98, 89.0, 9),
                new Athlete("Самал Шарипова", 22, athletics, 1.64, 56.0, 4),
                new Athlete("Азамат Есенов", 24, judo, 1.83, 77.0, 6)
        );

        // Create sports club
        SportsClub club = new SportsClub("Элитный спортивный клуб");
        athletes.forEach(club::addAthlete);

        // Output general club info
        System.out.println("======= Добро пожаловать в спортивный клуб =======");
        System.out.println(club);

        // Information table about sports
        System.out.println("\n=== Доступные виды спорта ===");
        List<Sport> sports = Arrays.asList(boxing, swimming, basketball, football, tennis, judo, athletics, cycling);
        sports.forEach(System.out::println);

        // Filter athletes by sport
        System.out.println("\n=== Атлеты, занимающиеся боксом ===");
        club.filterBySport("Бокс").forEach(System.out::println);

        // Search by name
        System.out.println("\n=== Поиск атлета по имени: Аруана Жаксылык ===");
        System.out.println(club.searchByName("Аруана Жаксылык"));

        // Sort athletes by name
        System.out.println("\n=== Атлеты, отсортированные по имени ===");
        club.sortByName().forEach(System.out::println);

        // Athletes sorted by experience
        System.out.println("\n=== Атлеты, отсортированные по опыту ===");
        club.sortByExperience().forEach(System.out::println);
    }
}
