
package datastructure;
/**
 *
 * @author Prasad Kankatala
 */

import java.util.*;

public abstract class Attribute
{
    protected final HashMap<String, Object> properties = new HashMap<String, Object>();

    protected Attribute(String name, Object value)
    {
        Addproperty(name, value);
    }
    protected final void Addproperty(String name, Object value)
    {
         try
         {
            properties.put(name, value);
         }
         catch (IllegalArgumentException e)
         {
            System.out.println("An element with Key = " + name + "already exists."); 
         }

    }

public abstract void Display(int depth);
}
