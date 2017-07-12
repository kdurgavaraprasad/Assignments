
package datastructure;
import java.util.*;
/**
 *
 * @author Prasad Kankatala
 */

public class ProductAttribute extends Attribute
{
    public ProductAttribute(String name, Object value)
    {
        super(name,value);

    }

@Override

    public void Display(int depth)
    {
        for (Map.Entry<String, Object> prop : properties.entrySet())
        {
            System.out.println("-"+ prop.getKey().toString() + " " + String.valueOf(prop.getValue()));
        }
    }
}
