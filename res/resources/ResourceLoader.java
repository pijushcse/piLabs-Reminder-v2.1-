/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resources; 

import java.awt.Image;
import java.awt.Toolkit;
public class ResourceLoader {
 
    static ResourceLoader rl = new ResourceLoader();
     
    public static Image loadImage(String imageName)
    {
        return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("./images/"+imageName));
    }
}
