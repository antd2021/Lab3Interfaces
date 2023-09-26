import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;




public class ShortLister {

    public static Object[] collectAll(Object[] objects, Filter filter) {
        List<Object> FilterResults = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                FilterResults.add(obj);
            }
        }
        return FilterResults.toArray();
    }

    public static void main(String[] args) {
        // Use JFileChooser to select a text file
        JFileChooser chooser = new JFileChooser();
            //Creates the chooser object

        File workingDirectory = new File(System.getProperty("user.dir"));
            //sets a variable file to workingDirectory, and it is the directory that the user is in

        chooser.setCurrentDirectory(workingDirectory);
            //Sets the chooser to the workingDirectory variable which is the current directory

        int userChoice = chooser.showOpenDialog(null);

        if (userChoice == JFileChooser.APPROVE_OPTION) {
                //If the user selects an approved option the code int the if statement runs
            File selectedFile = chooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                List<String> words = new ArrayList<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] wordArray = line.split("\\s+");
                        //this regex is looking for spaces within a file
                    for (String word : wordArray) {
                        words.add(word);
                    }
                }

                //Calls the collectAll method to sort display the words and puts it into csv
                Object[] shortWords = collectAll(words.toArray(), new ShortWordFilter());
                System.out.println("The short words in the selected file are:");
                for (int i = 0; i < shortWords.length; i++) {
                    System.out.print(shortWords[i]);

                        //This loop prints a comma except for the last shortWord
                    if (i < shortWords.length - 1) {
                        System.out.print(", ");
                    }
                }

            }

            catch (FileNotFoundException e)
            {
                System.out.println("File not found!!!");
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
        else {
            System.out.println("Failed to choose a file to process");
            System.out.println("Run the program again!");
            System.exit(0);
                //Prints if the user doesn't select a file
        }
    }
}
