
package datastructure;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author Prasad Kankatala
 */

public class ProductAttributeGroup extends Attribute{
	private final ArrayList<Attribute> _children = new ArrayList<Attribute>();
	public ProductAttributeGroup(String name, Object value)
	{
		super(name, value);

	}

	public final void AddChild(Attribute Product)
	{
		_children.add(Product);
	}
        
	public final void RemoveChild(Attribute Product)
	{
		_children.remove(Product);
	}
        
	@Override

	public void Display(int depth)
	{
		for (Map.Entry<String, Object> prop : properties.entrySet())
		{
                   System.out.println("-"+ prop.getKey().toString() + " " + String.valueOf(prop.getValue()));
		}

		for (Attribute Product : _children)
		{
			Product.Display(depth + 2);
		}
	}
}