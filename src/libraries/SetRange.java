
package libraries;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JComboBox;


public class SetRange {

    public SetRange(JComboBox tmp) {
   
    int itemSelect = tmp.getSelectedIndex();
    
      System.out.println(itemSelect);
    
    DefaultListSelectionModel model = new DefaultListSelectionModel();
    
    int x;
    
    for(x = 0; x < tmp.getItemCount(); x++) {
        System.out.println(x);
        
        model.setSelectionInterval(x, x);
        
        if(x == itemSelect){
            break;
        }
        
    
         }
   model.setSelectionInterval(x,tmp.getItemCount());
    
        EnabledJComboBoxRenderer enableRenderer = new EnabledJComboBoxRenderer(model);
        //tmp.setRenderer(enableRenderer);
   
    
}
    
}
