import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// The program's aim is to collect your favourite animals and store them in a text file.
// There is a given text file called '''favourites.txt''', it will contain the animals
// If ran from the command line without arguments
// It should print out the usage:
// ```java FavouriteAnimals [animal] [animal]```
// You can add as many command line arguments as many favourite you have.
// One animal should be stored only at once
// Each animal should be written in separate lines
// The program should only save animals, no need to print them
public class FavouriteAnimals {

    private final String FILE_NAME = "favourites.txt";
    private List<String> animalList = new ArrayList<>();
    public void printUsage() {
        System.out.println("```java FavouriteAnimals [animal] [animal]```");
    }

    public void addAnimal(String task) {
        Path path1 = Paths.get(FILE_NAME);

        try {
            animalList = Files.readAllLines(path1);
            animalList.add(task);
            Files.write(path1, animalList);

        } catch (Exception e) {
            System.out.println("Unable to add: no task provided");
        }
    }

    public static void main(String[] args) {

        FavouriteAnimals object = new FavouriteAnimals();

        if(args.length == 0) {
            object.printUsage();
        }
        else if (args.length== 1) {
            object.addAnimal(args[0]);
        }
        else if (args.length== 2) {
            object.addAnimal(args[0]);
            object.addAnimal(args[1]);
        }

    }
}
