package ailabs;

import ailabs.client.gwtcorehellomavenTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class gwtcorehellomavenSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for gwtcorehellomaven");
    suite.addTestSuite(gwtcorehellomavenTest.class);
    return suite;
  }
}
