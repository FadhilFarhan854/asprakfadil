public class Linglis {
    Node head;
    Node tail;



    public void addDataBelakang(int nip, String name, String divisi){
        Node newNode = new Node(nip, name, divisi);
        if(head == null && tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public void addDataDepan(int nip, String name, String divisi){
        Node newNode = new Node(nip, name, divisi);
        if(head == null && tail == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node Iterator = head;
        while (Iterator != null) {
            System.out.println("Name : " + Iterator.getName() + "\nNIP : " + Iterator.getNip() + "\nDivisi: " + Iterator.getDivisi() +"\n");
            Iterator = Iterator.next;
        }

        
    }

    public void lastpop(){
        Node Iterator = head;
        while (Iterator.next != tail) {
            Iterator = Iterator.next;
        }
        tail = Iterator;
        tail.next = null;

    }
    public void firstpop(){
        Node Iterator = head;
        head = head.next;
        Iterator.next = null;
    }

}
