package ailabs.client;

import ailabs.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtcorehellomaven implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    helloWorld();
  }

  private native void helloWorld() /*-{
    $wnd.alert("Hello World Core in Maven");
  }-*/;
}
