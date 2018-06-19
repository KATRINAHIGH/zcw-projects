package parsing_json;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class ElementCollectionInitializer {

    /**
     * @return
     */
    public static ElementCollection generate(){
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String json = null;
        try{
            json = IOUtils.toString(classLoader.getResourceAsStream("periodic_table.json"));
        }catch (IOException e){
            e.printStackTrace();
        }
        return ElementCollection.fromJSONString(json);
    }
}




