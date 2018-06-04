package graphtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;

public class GraphRepresentationTest {

	private Graph<Integer> graph1;
	private Graph<Integer> graph2;
	private Graph<Integer> graph3;
	private Graph<Integer> graph4;
	private Graph<Integer> graph5;

	private final String AM = "AM";
	private final String AL = "AL";
	private final String PATH = "graph_txt/";
	private final String NAO_EXECUTAR = "NAO EXECUTAR ESSA LINHA";

	// Matriz Adijacente teste
	private Graph<Integer> AMTest1;
	private Graph<Integer> AMTest2;
	private Graph<Integer> AMTest3;
	private Graph<Integer> AMTest4;
	private Graph<Integer> AMTest5;

	// Lista Adijacente teste
	private Graph<Integer> ALTest1;
	private Graph<Integer> ALTest2;
	private Graph<Integer> ALTest3;
	private Graph<Integer> ALTest4;
	private Graph<Integer> ALTest5;

	@Before
	public void setUp() {
		try {
			graph1 = new GraphImpl<>();
			graph2 = new GraphImpl<>();
			graph3 = new GraphImpl<>();
			graph4 = new GraphImpl<>();
			graph5 = new GraphImpl<>();

			graph1.readGraph(PATH + "grafoSemPeso.txt");
			graph2.readWeightedGraph(PATH + "grafoComPeso.txt");
			graph3.readGraph(PATH + "grafoComArestasNegativas.txt");
			graph4.readWeightedGraph(PATH + "grafoComPesoNegativo.txt");
			graph5.readGraph(PATH + "grafoExtenco.txt");
			// Matriz Adjacente teste
			AMTest1 = new GraphImpl<>();
			AMTest2 = new GraphImpl<>();
			AMTest3 = new GraphImpl<>();
			AMTest4 = new GraphImpl<>();
			AMTest5 = new GraphImpl<>();

			AMTest1.readGraph(PATH + "grafoSemPeso.txt");
			AMTest2.readGraph(PATH + "grafoComPeso.txt");
			AMTest3.readGraph(PATH + "grafoComArestasNegativas.txt");
			AMTest4.readGraph(PATH + "grafoComPesoNegativo.txt");
			AMTest5.readGraph(PATH + "grafoExtenco.txt");
			// Liata Adjacente teste
			ALTest1 = new GraphImpl<>();
			ALTest2 = new GraphImpl<>();
			ALTest3 = new GraphImpl<>();
			ALTest4 = new GraphImpl<>();
			ALTest5 = new GraphImpl<>();

			ALTest1.readGraph(PATH + "grafoSemPeso.txt");
			ALTest2.readGraph(PATH + "grafoComPeso.txt");
			ALTest3.readGraph(PATH + "grafoComArestasNegativas.txt");
			ALTest4.readGraph(PATH + "grafoComPesoNegativo.txt");
			ALTest5.readGraph(PATH + "grafoExtenco.txt");

		} catch (Exception e) {
			fail(NAO_EXECUTAR);
		}
	}

	@Test
	public void grafoSemPesoAMTest() {
		assertArrayEquals(AMTest1.graphRepresentation(AM), graph1.graphRepresentation(AM));
	}

	@Test
	public void grafoComPesoAMTest() {
		assertArrayEquals(AMTest2.graphRepresentation(AM), graph2.graphRepresentation(AM));
	}

	@Test
	public void grafoComArestasNegativasAMTest() {
		assertArrayEquals(AMTest3.graphRepresentation(AM), graph3.graphRepresentation(AM));
	}

	@Test
	public void grafoComPesoNegativoAMTest() {
		assertArrayEquals(AMTest4.graphRepresentation(AM), graph4.graphRepresentation(AM));
	}

	@Test
	public void grafoExtencoAMTest() {
		assertArrayEquals(AMTest5.graphRepresentation(AM), graph5.graphRepresentation(AM));
	}

	@Test
	public void grafoSemPesoALTest() {
		assertArrayEquals(ALTest1.graphRepresentation(AL), graph1.graphRepresentation(AL));
	}

	@Test
	public void grafoComPesoAMLTest() {
		assertArrayEquals(ALTest2.graphRepresentation(AL), graph2.graphRepresentation(AL));
	}

	@Test
	public void grafoComArestasNegativasALTest() {
		assertArrayEquals(ALTest3.graphRepresentation(AL), graph3.graphRepresentation(AL));
	}

	@Test
	public void grafoComPesoNegativoALTest() {
		assertArrayEquals(ALTest4.graphRepresentation(AL), graph4.graphRepresentation(AL));
	}

	@Test
	public void grafoExtencoALTest() {
		assertArrayEquals(ALTest5.graphRepresentation(AL), graph5.graphRepresentation(AL));
	}

}
