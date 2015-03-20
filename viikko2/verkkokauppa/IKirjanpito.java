
package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 *
 * @author sariraut
 */
public interface IKirjanpito {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
