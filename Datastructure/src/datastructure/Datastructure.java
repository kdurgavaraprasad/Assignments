
package datastructure;

/**
 *
 * @author Prasad Kankatala
 */
public class Datastructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ProductAttributeGroup root = new ProductAttributeGroup("ProductAttributes", "");
            ProductAttributeGroup Attributes1 = new ProductAttributeGroup("Attributes 1", "");
            Attributes1 = new ProductAttributeGroup("Attributes 1", "");
            Attributes1.AddChild(new ProductAttribute("Attribute 1", "value 1"));
            Attributes1.AddChild(new ProductAttribute("Attribute 2", "value 2"));
            root.AddChild(Attributes1);
            root.AddChild(new ProductAttribute("Attribute 3", ""));
            ProductAttributeGroup Attributes2 = new ProductAttributeGroup("Attributes 2", "");
            ProductAttributeGroup Attribute3 = new ProductAttributeGroup("Attributes 3", "");
            Attribute3.AddChild(new ProductAttribute("Attribute 4", "value 4"));
            Attributes2.AddChild(Attribute3);
            Attributes2.AddChild(new ProductAttribute("Attribute 5", "value5"));
            root.AddChild(Attributes2);
            root.Display(1);
    }
    
}
