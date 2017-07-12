/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import org.junit.Test;

/**
 *
 * @author Prasad Kankatala
 */
public class ProductAttributeTest {
    
    public ProductAttributeTest() {
    }
    
    /**
     * Test of Display method, of class ProductAttribute.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        int depth = 0;
        ProductAttribute instance = new ProductAttribute("Attribute 1", "Value 1");
        instance.Display(depth);
        
    }
    
}
