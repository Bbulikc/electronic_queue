/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import java.util.Date;

/**
 *
 * @author User
 */
public class Check {
    private int id;
 private int number;
    private int operatorid;
    private java.sql.Date Date;
    
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Check(int id, int number, int operatorid, java.sql.Date Date) {
        this.id = id;
        this.number = number;
        this.operatorid = operatorid;
        this.Date = Date;
    }

    
    
    public Check(int number, int operatorid, java.sql.Date Date) {
        this.number = number;
        this.operatorid = operatorid;
        this.Date = Date;
    }
 
  

    public int getNumber() {
        return number;
    }

    public int getOperatorid() {
        return operatorid;
    }

    public Date getDate() {
        return Date;
    }

  

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOperatorid(int operatorid) {
        this.operatorid = operatorid;
    }

    public void setDate(java.sql.Date Date) {
        this.Date = Date;
    }
    
}
