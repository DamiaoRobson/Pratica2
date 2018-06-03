package graphtest;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;
import graph.p1.Vertex;
import static org.junit.Assert.*;


public class ShortestPathTest {

	
	Graph<Integer> grafoComPeso = new GraphImpl<>();
	Graph<Integer> grafoSemPeso = new GraphImpl<>();
	Graph<Integer> grafoSemPeso2 = new GraphImpl<>();
	Graph<Integer> grafoComArestaNegativa = new GraphImpl<>();
	Graph<Integer> grafoComArestaNegativa2 = new GraphImpl<>();

	
	List<Vertex<Integer>> verticesGrafoSemPeso;
	List<Vertex<Integer>> verticesGrafoComPeso;
	List<Vertex<Integer>> verticesGrafoSemPeso2;
	List<Vertex<Integer>> verticesGrafoComArestaNegativa;
	List<Vertex<Integer>> verticesGrafoComArestaNegativa2;

	
	final String path = "C:\\Users\\Pedro\\Desktop\\pratica2\\graph_txt\\";
	//(properties -> location)
	
	
	
	@Before
	public void setUp() {
		try {
			grafoComPeso.readGraph(path + "grafoComPeso.txt"); 
			verticesGrafoComPeso = grafoComPeso.getVertices();
			
			grafoSemPeso.readGraph(path + "grafoSemPeso.txt");
			verticesGrafoSemPeso = grafoSemPeso.getVertices();
			
			grafoSemPeso2.readGraph(path + "grafoSemPeso2.txt");
			verticesGrafoSemPeso2 = grafoSemPeso2.getVertices();
			
			grafoComArestaNegativa.readGraph(path + "grafoComArestasNegativas.txt");
			verticesGrafoComArestaNegativa = grafoComArestaNegativa.getVertices();
			
			grafoComArestaNegativa2.readGraph(path + "grafoComArestasNegativas2.txt");
			verticesGrafoComArestaNegativa2 = grafoComArestaNegativa2.getVertices();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGrafoArestasNegativas() {
		Assert.assertEquals("4 3 2 1 ", grafoComArestaNegativa.shortestPath(verticesGrafoComArestaNegativa.get(3),
				verticesGrafoComArestaNegativa.get(0)));
	}
	
	
	
	@Test
	public void testGrafoSemPeso() {
		Assert.assertEquals("1 5 4", grafoSemPeso.shortestPath(verticesGrafoSemPeso.get(0), verticesGrafoSemPeso.get(4))); 
		
	}
	
	@Test
	public void testGrafoComPeso() {
		Assert.assertEquals("1 2 5 4 3", grafoComPeso.shortestPath(verticesGrafoComPeso.get(0), 
				verticesGrafoComPeso.get(3))); 
	}
	
	@Test
	public void secondTestGrafoComPeso() {
		Assert.assertEquals("1 2 5 ", grafoComPeso.shortestPath(verticesGrafoComPeso.get(0), 
				verticesGrafoComPeso.get(2))); 
	}
	
	@Test
	public void testGrafoSemPeso2() {
		Assert.assertEquals("3 2 4", grafoSemPeso2.shortestPath(verticesGrafoSemPeso2.get(2), verticesGrafoSemPeso2.get(3)));
	}
	
	@Test
	public void testGrafoComArestaNegativa2() {
		for (Vertex v : this.verticesGrafoComArestaNegativa2) {
			System.out.println(v.getData());
		}
		Assert.assertEquals("1 2 3 5", grafoComArestaNegativa2.shortestPath(verticesGrafoComArestaNegativa2.get(0), 
				verticesGrafoComArestaNegativa2.get(4)));
	}
	
	
}