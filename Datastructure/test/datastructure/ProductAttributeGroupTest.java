
package datastructure;
import org.junit.Test;


/**
 *
 * @author Prasad Kankatala
 */
public class ProductAttributeGroupTest {
    
    public ProductAttributeGroupTest() {
    }
    
    
    /**
     * Test of AddChild method, of class ProductAttributeGroup.
     */
    @Test
    public void testAddChild() {
        
        System.out.println("AddChild");
        Attribute Product = new ProductAttributeGroup("Attributes 1", "");
        ProductAttributeGroup instance = new ProductAttributeGroup("ProductAttributes", "");
        instance.AddChild(Product);
       
    }

    /**
     * Test of RemoveChild method, of class ProductAttributeGroup.
     */
    @Test
    public void testRemoveChild() {
        System.out.println("RemoveChild");
        Attribute Product = new ProductAttributeGroup("Attributes 1", "");
        ProductAttributeGroup instance = new ProductAttributeGroup("ProductAttributes", "");
        instance.RemoveChild(Product);
       
    }

    /**
     * Test of Display method, of class ProductAttributeGroup.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        int depth = 0;
        ProductAttributeGroup instance = new ProductAttributeGroup("ProductAttributes", "");
        instance.Display(depth);
       
    }
    
}
