package graphtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;


public class GetMeanEdgeTest {

	
	private final String PATH = "graph_txt/";
	@Test
	public void test() {
		Graph<Integer> grafo1 = new GraphImpl<>();
		Graph<Integer> grafo2 = new GraphImpl<>();
		Graph<Integer> grafo3 = new GraphImpl<>();
		
		try {
			grafo1.readGraph(PATH + "grafo1.txt");
			grafo2.readGraph(PATH + "grafo2.txt");
			grafo3.readGraph(PATH + "grafo3.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DecimalFormat df = new DecimalFormat("0.#");
		String mean1 = df.format(grafo1.getMeanEdge());
		String mean2 = df.format(grafo2.getMeanEdge());
		
		Assert.assertEquals("2,4", mean1);
		Assert.assertEquals("2", mean2);
		
	}

}
