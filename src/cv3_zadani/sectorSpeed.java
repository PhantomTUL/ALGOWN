/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv3_zadani;

/**
 *
 * @author Tandler-D-0f5f
 */
public class sectorSpeed {
    public static void main(String[] args) {
        int inHour;
        int inMin;
        int inSec;
        
        final int MIN_PART = 60;
        final int SEC_PART = 3600;
        
        double outHour = inHour + (inMin / MIN_PART) + (inSec / SEC_PART);
    }
}
