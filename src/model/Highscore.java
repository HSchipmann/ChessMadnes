package model;
//Braucht man, um Text Dokumente zu lesen.
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import akkgframework.model.abitur.datenstrukturen.List;

public class Highscore <Contenttyp> {
    //Path is der Name und Ort des TextDoc
    private String path;
    // Bestimmt, ob alles im TextDoc. überschreitet wird oder appended.
    private boolean appendToFile = false;


    // Erlaubt es einen zu bestimmen, ob appendToFile true oder false ist. Erstes ist appendToFile = false und Zweites ist appendToFile = true
    public Highscore (String filepath, boolean appendvalue){
        path = filepath;
        appendToFile = appendvalue;
    }

    public Highscore (String filepath){
        path = filepath;
    }
    //Hier drin schreibt man ins Dokument
    public void writeToFile(String textLine) throws IOException{
        //Erlaubt eine sicheren und richtien Aufruf und speichern (in Bytes) vom Text ins TextDoc
        FileWriter write = new FileWriter(path, appendToFile);
        // Wenn es kein TextDoc existiert wird eins erstellt
        PrintWriter printline = new PrintWriter(write);
        //%s ist der Text von belibiger größe. %n ist eine neue Line die am ende erstellt wird
        printline.printf("%s"+"%n", textLine);
        // schließt dasd text document und befreit es von unbenutzen resourcen
        printline.close();

        //printline.print();
    }

    private class ListNode {
        private  Contenttyp contenttyp;
        private ListNode next;

        private  ListNode(Contenttyp pContent){
            contenttyp = pContent;
            next = null;
        }

        public Contenttyp getContentObject() {
            return getContentObject();
        }
        public void setContentObject(Contenttyp pContent){
            contenttyp = pContent;
        }
        public ListNode getNextNode() {
            return  this.next;
        }
        public void setNextNode(ListNode pNext) {
            this.next = pNext;
        }

        ListNode first;
        ListNode last;
        ListNode current;

        public void List() {
            first = null;
            last = null;
            current = null;
        }

        public boolean isEmpty() {
            return first == null;
        }
        public boolean hasAccess(){
            return current != null;
        }
        public void next() {
            if(hasAccess()){
                current = current.getNextNode();
            }
        }

        public void toFirst() {
            current = first;
        }
        public void toLast() {
            current = first;
        }
        public Contenttyp getContent(){
            if(hasAccess()){
                return current.getContentObject();
            }
            return null;
        }

        public void setContent(Contenttyp pContent){
            if(hasAccess() && pContent != null){
                current.setContentObject(pContent);
            }
        }

        public void insert (Contenttyp pConetnt){
            if(pConetnt != null){
                if(hasAccess()){
                    ListNode newNode = new ListNode(pConetnt);
                    if(current == first){
                        newNode.setNextNode(current);
                        first = newNode;
                    }else{
                        this.getPrevious(current).setNextNode(newNode);
                        newNode.setNextNode(current);
                    }
                }
                if(isEmpty()){
                    first = new ListNode(pConetnt);
                    last = first;
                }
            }
        }

        public void append(Contenttyp pContent){
            if (pContent != null){
                ListNode newNode = new ListNode(pContent);
                if(isEmpty()){
                    first = newNode;
                }else{
                    last.setNextNode(newNode);
                }
                last = newNode;
            }
        }
    /*
        public void concat (List<Contenttyp> pList){
            if( pList != null && !pList.isEmpty()){
                if(this.isEmpty()) {
                    this.first = pList.first;
                }else{
                    this.last.setNextNode(pList.toFirst());
                }
                this.last = pList.last;

                pList.first= null;
                pList.last = null;
                pList.current = null;
            }
        } */

        public void remove(){
            if(hasAccess()){
                if(current == first) {
                    first = first.getNextNode();
                    current = first;
                    if (isEmpty()) {
                        last = null;
                    }
                }else{
                    if (current == last) {
                        last = getPrevious(current);
                        last.setNextNode(null);
                        current = null;
                    }else{
                        getPrevious(current).setNextNode(current.getNextNode());
                        current = current.getNextNode();
                    }
                }
            }
        }

        private ListNode getPrevious(ListNode pNode){
            if (!isEmpty() && pNode != null && pNode != first){
                ListNode temp = current;
                ListNode previousNode = null;
                toFirst();
                while(current != last && previousNode == null){
                    if (current.getNextNode()== pNode){
                        previousNode = current;
                    }
                    next();
                }
                current = temp;
                if (previousNode != null){
                    return previousNode;
                }
            }
            return null;
        }
    }

    public ListNode saveTheScore() {

    }
}
