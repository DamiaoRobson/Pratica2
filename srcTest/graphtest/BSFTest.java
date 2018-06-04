/**
 * 
 */
package graphtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;

/**
 * @author Danielle de Lima Vieira
 *
 */
public class BSFTest {

	private Graph<Integer> grafo1;
	private Graph<Integer> grafo3;
	private Graph<Integer> grafoMaior;
	private final String path = "graph_txt/";
	private String representacaoBFSGrafo1 = "1 - 0 -" +  "\n" + 
											"2 - 1 1" + "\n" + 
											"3 - 2 5" + "\n" + 
											"4 - 2 5" + "\n" + 
											"5 - 1 1";
	
	private final String representacaoBFSGrafo3 ="1 - 0 -" +  "\n" + 
											"2 - 1 1" + "\n" + 
											"3 - 1 1" + "\n" + 
											"4 - 2 2";
	
	private final String representacaoBFSGrafoMaior = "1 - 0 -" +  "\n" +
													"2 - 1 1" +  "\n" +
													"3 - 1 1" +  "\n" +
													"4 - 1 1" +  "\n" +
													"5 - 1 1" +  "\n" +
													"6 - 2 2" +  "\n" +
													"7 - 2 2" +  "\n" +
													"8 - 2 3" +  "\n" +
													"9 - 2 3" +  "\n" +
													"10 - 2 5" +  "\n" +
													"11 - 2 5" +  "\n" +
													"12 - 3 6" +  "\n" +
													"13 - 3 10" +  "\n" +
													"14 - 4 13" +  "\n" +
													"15 - 5 14" +  "\n" +
													"16 - 5 14" +  "\n" +
													"17 - 5 14" +  "\n" +
													"18 - 6 15" +  "\n" +
													"19 - 7 18" +  "\n" +
													"20 - 6 15";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		grafo1 = new GraphImpl<>();
		grafo3 = new GraphImpl<>();
		grafoMaior = new GraphImpl<>();
	
		grafo1.readGraph(path + "grafo1.txt");
		grafo3.readGraph(path + "grafo3.txt");
		grafoMaior.readGraph(path + "grafoMaior.txt");
	}

	/**
	 * Test method for {@link graph.p1.GraphImpl#BFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testBFS() {
		assertEquals(representacaoBFSGrafo1, grafo1.BFS("grafo1", 1).trim());
		assertEquals(representacaoBFSGrafo3, grafo3.BFS("grafo3", 1).trim());
		assertEquals(representacaoBFSGrafoMaior, grafoMaior.BFS("grafoMaior", 1).trim());
	}

}
