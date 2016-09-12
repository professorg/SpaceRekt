/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacerekt;

import engine.Core;

/**
 *
 * @author gvandomelen19
 */
public class SpaceRekt {
    
    public static void main(String[] args) {
        
        // Initialize Core
        Core.is3D = false;
        Core.init();
        
        // Open window
        Core.run();
    }
}
