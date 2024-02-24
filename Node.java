public class Node {
    private int nip;
    private String name;
    private String Divisi;
    Node next;

    public Node(int nip, String name, String divisi) {
        this.nip = nip;
        this.name = name;
        Divisi = divisi;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String divisi) {
        Divisi = divisi;
    }

    
    

    
}
