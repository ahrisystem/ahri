package funcoes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.funcoes.PropertiesModel;

/**
 *
 * @author Eduardo
 */
public class BuscarPropriedadesConfiguradas {
    public Properties getProp(){
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("C:\\AHRI\\ahri.properties"));
        } catch (IOException ex) {
            Logger.getLogger(BuscarPropriedadesConfiguradas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return props;
    }
    public void dado(PropertiesModel model){
        Properties prop = getProp();
        model.setLocalbin(prop.getProperty("local.bin"));
        model.setBasedriver(prop.getProperty("base.driver"));
        model.setBaseip(prop.getProperty("base.ip"));
        model.setBaseport(prop.getProperty("base.port"));
        model.setBasenome(prop.getProperty("base.nome"));
        model.setBaseuser(prop.getProperty("base.user"));
        model.setBasepass(prop.getProperty("base.pass"));
    }
}
