/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.FilesMap to edit this template
 */
package FilesMap;

import org.owasp.esapi.reference.RandomAccessReferenceMap;
import java.util.HashSet;
import java.util.Set;
import org.owasp.esapi.AccessReferenceMap;

/**
 *
 * @author B00129500
 */
public class FilesMap {
    
    public static AccessReferenceMap getFilesMap(){
        Set fileSet = new HashSet();
        fileSet.add("secretdoc1.pdf");
        fileSet.add("secretdoc2.pdf");
        return new RandomAccessReferenceMap(fileSet);
    }  
}
