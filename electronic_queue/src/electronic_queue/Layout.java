/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue;

import electronic_queue.Ui.ActionExit;
import electronic_queue.Ui.ActionListeners;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Layout {
    private ArrayList<Button> list;
    private int number;
    public static ArrayList<Layout> listLayout=new ArrayList<Layout>();
    public static int count=0;
    private int buttonCount;
     static private int sr10procwidth,sr4procr2heigh,sr2width,sr2height,srheight,srwidth;
    public Layout(int number, int sr10procwidth, int sr4procr2heigh, int sr2width, int sr2height,int srheight,int srwidth) {
    this.sr10procwidth=sr10procwidth;
    this.sr2height=sr2height;
    this.sr2width=sr2width;
    this.sr4procr2heigh=sr4procr2heigh;
    this.srwidth=srwidth;
    this.srheight=srheight;
     this.buttonCount=0;
        this.number=number;
        list=new ArrayList<Button>();
    }
    
    public void addButton(Button b){
        System.out.print("count");
    list.add(b);
    System.out.print("=");
    buttonCount++;
    System.out.println(buttonCount);
    
    }
    
    public Layout(int number){
        this.buttonCount=0;
        this.number=number;
        list=new ArrayList<Button>();
    }

    public ArrayList<Button> getListButton() {
        return list;
    }
 public Button getListButtonIndex(int index) {
        return list.get(index);
    }

    public int getNumber() {
        return number;
    }

    public int getButtonCount() {
        return buttonCount;
    }

    public void setList(ArrayList<Button> list) {
        this.list = list;
    }

   

    public void setButtonCount(int buttonCount) {
        this.buttonCount = buttonCount;
    }
    
    private static Button  createButton(int i){
        switch(i){
    case 1:
    {Button  j= new Button("knopka 1 ",sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
    
    case 2:
       {Button  j= new Button("knopka 2 ",sr10procwidth-(int)(sr10procwidth*0.5), srheight-1, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
      
    case 3:
       {Button  j= new Button("knopka 3 ",sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
         case 4:
       {Button  j= new Button("knopka 4 ",srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
         case 5:
       {Button  j= new Button("knopka 5 ",srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), srheight-1, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
        case 6:
       {Button  j= new Button("knopka 6 ",srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
        case 7:
       {Button  j= new Button("knopka 7 ",srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
        case 8:
       {Button  j= new Button("knopka 8 ",srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), srheight-1, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
        case 9:
       {Button  j= new Button("knopka 9 ",srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
        ActionListeners  a=new ActionListeners();
       j.addActionListener(a);
       return j; }
       
    default : return null;
}
    
    }
    
    
    
    public static void createLayout(){
    listLayout.clear();
    Layout l=new Layout(1);
    //l.setButtonCount(9);
       
    for(int i=0;i<9;i++){
        int k=i+1;
       l.addButton(createButton(k));
    }
    listLayout.add(l);
     
    
    
    
    
    
    
   
    
    }
    
    
}
