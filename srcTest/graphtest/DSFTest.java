/**
 * 
 */
package graphtest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;

/**
 * @author Danielle de Lima Vieira
 *
 */
public class DSFTest {

	private Graph<Integer> grafo1;
	private Graph<Integer> grafo3;
	private Graph<Integer> grafoMaior;
	private Graph<Integer> grafoComPeso;
	private Graph<Integer> grafoComArestaNegativa;
	private final String path = "graph_txt/";

	private String representacaoDFSGrafo1 = "1 - 0 -" +  "\n" + 
											"2 - 1 1" + "\n" + 
											"3 - 3 5" + "\n" + 
											"4 - 3 5" + "\n" + 
											"5 - 2 2";
	
	private final String representacaoDFSGrafo3 ="1 - 0 -" + "\n" + 
												"2 - 1 1" + "\n" + 
												"3 - 2 2" + "\n" + 
												"4 - 2 2";
	
	private final String representacaoDFSGrafoMaior = 	"1 - 0 -" + "\n" +
														"2 - 1 1" + "\n" +
														"3 - 4 8" + "\n" +
														"4 - 5 3" + "\n" +
														"5 - 7 10" + "\n" +
														"6 - 2 2" + "\n" +
														"7 - 6 4" + "\n" +
														"8 - 3 6" + "\n" +
														"9 - 9 11" + "\n" +
														"10 - 6 4" + "\n" +
														"11 - 8 5" + "\n" +
														"12 - 7 7" + "\n" +
														"13 - 10 9" + "\n" +
														"14 - 11 13" + "\n" +
														"15 - 12 14" + "\n" +
														"16 - 12 14" + "\n" +
														"17 - 14 18" + "\n" +
														"18 - 13 15" + "\n" +
														"19 - 14 18" + "\n" +
														"20 - 15 19";
	
	private String representacaoDFSGrafoComPeso = "1 - 0 -" +  "\n" + 
												"2 - 1 1" + "\n" + 
												"3 - 3 5" + "\n" + 
												"4 - 4 3" + "\n" + 
												"5 - 2 2";
	
	private String representacaoDFSGrafoComArestaNegativa = "1 - 0 -" +  "\n" + 
															"2 - 1 1" + "\n" + 
															"3 - 2 2" + "\n" + 
															"4 - 3 3" + "\n" + 
															"5 - 4 4";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		grafo1 = new GraphImpl<>();
		grafo3 = new GraphImpl<>();
		grafoMaior = new GraphImpl<>();
		grafoComPeso= new GraphImpl<>();
		grafoComArestaNegativa= new GraphImpl<>();
	
		grafo1.readGraph(path + "grafo1.txt");
		grafo3.readGraph(path + "grafo3.txt");
		grafoMaior.readGraph(path + "grafoMaior.txt");
		grafoComPeso.readGraph(path + "grafoComPeso.txt");
		grafoComArestaNegativa.readGraph(path + "grafoComArestasNegativas2.txt");
	}

	/**
	 * Test method for {@link graph.p1.GraphImpl#DFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testDFS1() {
		assertEquals(representacaoDFSGrafo1, grafo1.DFS("grafo1", 1).trim());
	}
	
	/**
	 * Test method for {@link graph.p1.GraphImpl#DFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testDFS2() {
		assertEquals(representacaoDFSGrafo3, grafo3.DFS("grafo3", 1).trim());
	}
	
	/**
	 * Test method for {@link graph.p1.GraphImpl#DFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testDFSFGrafoMaior() {
		assertEquals(representacaoDFSGrafoMaior, grafoMaior.DFS("grafoMaior", 1).trim());
	}
	
	/**
	 * Test method for {@link graph.p1.GraphImpl#DFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testDFSFGrafoComPeso() {
		assertEquals(representacaoDFSGrafoComPeso, grafoComPeso.DFS("grafoComPeso", 1).trim());
	}
	
	/**
	 * Test method for {@link graph.p1.GraphImpl#DFS(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	public void testDFSFGrafoComArestaNegativa() {
		assertEquals(representacaoDFSGrafoComArestaNegativa, grafoComArestaNegativa.DFS("grafoComPeso", 1).trim());
	}
}
