package graphtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import graph.p1.Graph;
import graph.p1.GraphImpl;

public class ReadGraphTest {

	private Graph<Integer> graph;
	private Graph<String> graph2;
	private Graph<Double> graph3;
	

	private final String PATH = "graph_txt/";
	private final String NAO_EXECUTAR = "NAO EXECUTAR ESSA LINHA";

	@Before
	public void setUp() {
		try {
			graph = new GraphImpl<>();
			graph2 = new GraphImpl<>();
			graph3 = new GraphImpl<>();
		} catch (Exception e) {
			fail(NAO_EXECUTAR);
		}
	}

	@Test
	public void readGraphSemPesoTest() {
		try {
			graph.readGraph(PATH + "grafoSemPeso.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}

	@Test
	public void readGraphComPesoTest() {
		try {
			graph.readWeightedGraph(PATH + "grafoComPeso.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
	
	@Test
	public void readGraphArestaNegativaTest() {
		try {
			graph.readGraph(PATH + "grafoComArestasNegativas.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
	
	@Test
	public void grafoComPesoNegativoTest() {
		try {
			graph.readWeightedGraph(PATH + "grafoComPesoNegativo.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
	
	@Test
	public void grafoArestaLetraTest() {
		try {
			graph2.readGraph(PATH + "grafoArestaLetra.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
	
	@Test
	public void grafoArestaDoubleTest() {
		try {
			graph3.readGraph(PATH + "grafoArestaDouble.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
	
	@Test
	public void grafoExtencoTest() {
		try {
			graph.readGraph(PATH + "grafoExtenco.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(NAO_EXECUTAR);
		}
	}
}
