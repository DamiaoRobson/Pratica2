package graphtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;

import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;
import org.junit.Assert;
import org.junit.Before;

public class VertexEdgeMeanTest {
	//getMeanEdge
	Graph<Integer> grafo1;
	Graph<Integer> grafo2;
	
	//getVertexNumber
	Graph<Integer> grafo3;
	Graph<Integer> grafo4;
	Graph<Integer> grafo5;
	
	//getEdgeNumber
	Graph<Integer> grafo6;
	Graph<Integer> grafo7;
	Graph<Integer> grafo8;
	
	
	final String path = "graph_txt/";
	//(properties -> location)

	@Before
	public void setUp() throws IOException {
		grafo1 = new GraphImpl<>();
		grafo2 = new GraphImpl<>();
		
		grafo3 = new GraphImpl<>();
		grafo4 = new GraphImpl<>();
		grafo5 = new GraphImpl<>();
		
		grafo6 = new GraphImpl<>();
		grafo7 = new GraphImpl<>();
		grafo8 = new GraphImpl<>();
		
		grafo1.readGraph(path + "grafo1.txt");
		grafo2.readGraph(path + "grafo2.txt");
		
		grafo3.readGraph(path + "grafo1.txt");
		grafo4.readGraph(path + "grafo2.txt");
		grafo5.readGraph(path + "grafo3.txt");
		
		grafo6.readGraph(path + "grafo1.txt");
		grafo7.readGraph(path + "grafo2.txt");
		grafo8.readGraph(path + "grafo3.txt");
	}
	
	
	@Test
	public void getMeanEdgeTest() throws IOException {	
		DecimalFormat df = new DecimalFormat("0.#");
		String mean1= df.format(grafo1.getMeanEdge());
		String mean2 = df.format(grafo2.getMeanEdge());
		
		Assert.assertEquals("2,4", mean1);
		Assert.assertEquals("2", mean2);
		
	}
	
	@Test
	public void getVertexNumberTest() throws IOException {
		Assert.assertEquals(5, grafo3.getVertexNumber());
		Assert.assertEquals(5, grafo4.getVertexNumber());
		Assert.assertEquals(4, grafo5.getVertexNumber());
	}
	
	@Test
	public void getEdgeNumber() throws IOException {
		Assert.assertEquals(5, grafo6.getVertexNumber());
		Assert.assertEquals(6, grafo7.getVertexNumber());
		Assert.assertEquals(4, grafo8.getVertexNumber());
	}

}
