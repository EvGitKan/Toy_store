package com.company.Model;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTXT implements WriteFile {

    @Override
    public void writePrizeInFile(Toy toy) {
        try (FileWriter writer = new FileWriter("prizes.txt", true)) {
            writer.write(toy.getId() + ". " + toy.getTitle() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
