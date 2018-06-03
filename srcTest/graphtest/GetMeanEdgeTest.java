package graphtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;
import junit.framework.Assert;

public class GetMeanEdgeTest {
	
	
	
	/*Graph grafo22 = library.readGraph("grafo2.txt");
	Graph grafo11 = library.readGraph("grafo1.txt");
	
	*/

	@Test
	public void test() {
		Graph<Integer> grafo1 = new GraphImpl<>();
		Graph<Integer> grafo2 = new GraphImpl<>();
		Graph<Integer> grafo3 = new GraphImpl<>();
		
		try {
			grafo1.readGraph("grafo1.txt");
			grafo2.readGraph("grafo2.txt");
			grafo3.readGraph("grafo3.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DecimalFormat df = new DecimalFormat("0.#");
		String mean1= df.format(grafo1.getMeanEdge());
		String mean2 = df.format(grafo2.getMeanEdge());
		
		Assert.assertEquals("2,4", mean1);
		Assert.assertEquals("2", mean2);
		
	}

}
