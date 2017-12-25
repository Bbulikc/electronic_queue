/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.ClassTable;

/**
 *
 * @author User
 */
public class AUDIO {
    private int id;
    private String url;
    private String value;

    public AUDIO(int id, String url, String value) {
        this.id = id;
        this.url = url;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
            
}
