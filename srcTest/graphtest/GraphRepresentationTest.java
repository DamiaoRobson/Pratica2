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
	
	

	private final String PATH = "graph_txt/";
	private final String NAO_EXECUTAR = "NAO EXECUTAR ESSA LINHA";

	@Before
	public void setUp() {
		try {
			graph1 = new GraphImpl<>();
			graph2 = new GraphImpl<>();
			graph3 = new GraphImpl<>();
			graph4 = new GraphImpl<>();
			graph5 = new GraphImpl<>();
			
			//graph1.readGraph(PATH + "grafoSemPeso.txt");
			graph2.readWeightedGraph(PATH + "grafoComPeso.txt");
			graph3.readGraph(PATH + "grafoComArestasNegativas.txt");
			graph4.readWeightedGraph(PATH + "grafoComPesoNegativo.txt");
			graph5.readGraph(PATH + "grafoExtenco.txt");
			
		} catch (Exception e) {
			fail(NAO_EXECUTAR);
		}
	}

	@Test
	public void grafoSemPesoMATest() {
		System.out.println(graph1.graphRepresentation(PATH + "grafoSemPeso.txt"));
	}

}
