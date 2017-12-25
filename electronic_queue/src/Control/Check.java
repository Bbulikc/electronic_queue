/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Date;

/**
 *
 * @author User
 */
public class Check {
    private int chek=-1;

    public Check(int number, int operatorid, Date Date) {
        this.number = number;
        this.operatorid = operatorid;
        this.Date = Date;
    }
    private int number;
    private int operatorid;
    private Date Date;

    public int getChek() {
        return chek;
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

    public void setChek(int chek) {
        this.chek = chek;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOperatorid(int operatorid) {
        this.operatorid = operatorid;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }
    
}
