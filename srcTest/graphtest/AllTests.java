package graphtest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ReadGraphTest.class, VertexEdgeMeanTest.class, GraphRepresentationTest.class, BSFTest.class, DSFTest.class,
		SCCTest.class, ShortestPathTest.class, MstTest.class })
public class AllTests {

}
