package com.streambox.prefstest;

import java.util.prefs.*;

/**
 * Hello world!
 *
 */
public class App 
{
  private Preferences prefs;

  public static void main( String[] args )
  {
    App a = new App();
    a.setPrefs();
    System.out.println( "Hello World!" );
  }

  public void setPrefs()
  {
    // declare my variable at the top of my Java class
    
    // create a Preferences instance (somewhere later in the code)
    prefs = Preferences.userNodeForPackage(this.getClass());
    prefs.put("LAST_OUTPUT_DIR1", "test");
  }
}
