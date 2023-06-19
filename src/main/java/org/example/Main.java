package org.example;

import java.io.BufferedReader;
import java.nio.file.Files;

public class Main {
    void parseDishData() throws IOException {
        BufferedReader dishReader=
    }
}

void parseRestroData() throws IOExceptioon{
    BufferedReader restroReader= Files.newBufferedReader()
            String line;
    for(int restroCntr=0;(line = restroReader.readLine())!=null;restroCntr++)
    {
    String restroData=line.split(regec ",");
    restrolist.add(restroCntr, new Restro(restroData[0],restroData[1]));
    List<Dish> tempMenu=newArrayList<>();
    Location tempLocation =null;

    tempMenu=dishList.stream().filter(dish->dish.getRestroId().equals(restroData[0]))
            tempLocation=locationlist.stream().filter(location-> location.getId)

    }
}