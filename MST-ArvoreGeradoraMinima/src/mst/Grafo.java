package mst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collection;

public class Grafo {

    private Set<Aresta> arestas = new HashSet<>();
    private int totalarestas;

    private Set<Vertice> vertices = new HashSet<>();
    private int totalVertices;

    private final List<Aresta> ordenadas = new ArrayList<>();
	private int totalArestas;

    public Grafo() {
    }

    public final Set<Aresta> getArestas() {
        return arestas;
    }

    public final int getTotalArestas() {
        return totalArestas;
    }

    public final void setTotalArestas(int totalArestas) {
        this.totalArestas = totalArestas;
    }

    public final Set<Vertice> getVertices() {
        return vertices;
    }

    public final int getTotalVertices() {
        return totalVertices;
    }

    public final void setTotalVertices(int totalVertices) {
        this.totalVertices = totalVertices;
    }

    public void add(Aresta aresta) {
        this.arestas.add(aresta);
        this.vertices.add(aresta.getOrigem());
        this.vertices.add(aresta.getDestino());
    }

    public Grafo getArvoreGeradoraMinima() {

        Grafo arvoreMinima = new Grafo();
        Grafo galhos = new Grafo();

        this.criandoPontos(arvoreMinima, galhos);
        this.conectandoPontos(arvoreMinima, galhos);

        return arvoreMinima;
    }

    private void criandoPontos(Grafo arvoreMinima, Grafo galhos) {

        boolean contendoOrigem, contendoDestino, contendoAmbos, contendoApenasUm;

        for (Aresta aresta : this.getArestasOrdenadas()) {

            contendoOrigem = arvoreMinima.contendoVertice(aresta.getOrigem());
            contendoDestino = arvoreMinima.contendoVertice(aresta.getDestino());
            contendoApenasUm = contendoOrigem ^ contendoDestino;
            contendoAmbos = contendoOrigem && contendoDestino;

            if (!contendoAmbos || contendoApenasUm) {
                arvoreMinima.add(aresta);
            } else {
                galhos.add(aresta);
            }
        }
    }

    private void conectandoPontos(Grafo arvoreMinima, Grafo galhos) {

        int indiceOrigem = 0, indiceDestino = 0;
        
        for (Aresta novaAresta : galhos.getArestasOrdenadas()) {

            if (arvoreMinima.validaArestasArvoreGeradoraMinima()) {

                for (Aresta aresta : arvoreMinima.getArestasOrdenadas()) {

                    if (novaAresta.contendoVertice(aresta.getDestino())) {
                        indiceOrigem = aresta.getOrigem().getIndice();
                    } 
                    
                    if (novaAresta.contendoVertice(aresta.getOrigem())) {
                        indiceDestino = aresta.getDestino().getIndice();
                    }
                }
                
                if (indiceOrigem != indiceDestino){
                    arvoreMinima.add(novaAresta);
                }
            } 
        }
    }

    private boolean validaArestasArvoreGeradoraMinima() {
        return (this.arestas.size() - this.vertices.size()) < -1;
    }

    private boolean contendoVertice(Vertice vertice) {
        return this.vertices.contains(vertice);
    }

    private List<Aresta> getArestasOrdenadas() {
        if (ordenadas.isEmpty()) {
            OrdenarArestas();
        }
        return ordenadas;
    }

    private Grafo OrdenarArestas() {
        List<Aresta> list = new ArrayList<>(arestas);
        Collections.sort(list);
        this.ordenadas.addAll(list);
        return this;
    }
}
