package control;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;

    public ReadFile(String filepath){
        //Path == Name des Dokuments
        path = filepath;
    }
    //Methode die alles aus dem Doc ließt und als array wieder gibt
    public String[] OpenFile() throws IOException {
        //FileReader
        FileReader fr = new FileReader(path);
        //BufferedReader ist gebraucht, um ganze Lines zu lesen und einzuspeichern ins Buffer
        BufferedReader textReader = new BufferedReader(fr);
        //array benötigt. Ein Array == Eine Linie Text
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        //Loop der alles an text ins array packt
        int i;

        for (i= 0; i < numberOfLines; i++){
            textData[i] = textReader.readLine();
        }
        //Unötiges wird gelöscht aus dem Buffer
        textReader.close();
        //Arrar wird zurück gegeben
        return textData;
    }

    int readLines() throws IOException{
        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        String aLine;
        int numberOfLines = 0;
        //Loop der jede Line im doc absucht.
        while ((aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();

        return numberOfLines;
    }
}
