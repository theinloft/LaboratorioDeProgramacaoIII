package mst;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import mst.Grafo;
import mst.Aresta;



public class FileReaderHelper {

    public static Grafo readFile(String database) {

        try (Scanner file = new Scanner(new FileReader(database))) {

            Grafo grafo = new Grafo();
            boolean loadFirtLine = false;

            while (file.hasNext()) {
                try (Scanner sc = new Scanner(file.nextLine())) {

                    if (loadFirtLine) {
                        Aresta aresta = new Aresta(sc.nextInt(), sc.nextInt(), sc.nextInt());
                        grafo.add(aresta);
                    } else {
                        grafo.setTotalVertices(sc.nextInt());
                        grafo.setTotalArestas(sc.nextInt());
                        loadFirtLine = true;
                    }
                }
            }
            return grafo;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

	
}