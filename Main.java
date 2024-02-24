import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Linglis l1 = new Linglis();
        Scanner input = new Scanner(System.in);

        System.out.println("menu(masukan nomernya) : \n1. input data pegawai \n2.tampilkan data pegawai \n3.hapus data pegawai \4.keluar");
        int choice = input.nextInt();
       

        while (choice < 4) {
                switch (choice) {
                case 1:
                    System.out.println("pilih posisi data : \n1. depan \n2. belakang \nmemilih angka lain dianggap input di belakang");
                    int choice2 = input.nextInt();
                    if(choice2 == 1){
                        System.out.println("masukan nama :");
                        String name =input.nextLine();
                        System.out.println("masukan nip :");
                        int nip = input.nextInt();
                        System.out.println("masukan divisi :");
                        String divisi = input.next();
                        l1.addDataDepan(nip, name, divisi);
                        System.out.println("data berhasil ditambah");
                    }else{
                        System.out.println("masukan nama :");
                        String name =input.next();
                        System.out.println("masukan nip :");
                        int nip = input.nextInt();
                        System.out.println("masukan divisi :");
                        String divisi = input.next();
                        l1.addDataBelakang(nip, name, divisi);
                        System.out.println("data berhasil ditambah");
                    }
                    break;
                case 2:
                    l1.display();
                    break;

                case 3:   
                    System.out.println("pilih data yang mau dihapus \n1.data paling belakang \n2.data paling depan \nmemilih angka lain dianggap hapus paling belakang");
                    int choice3 = input.nextInt();
                    if(choice3 == 1){
                        l1.lastpop();
                        System.out.println("data paling belakang berhasil dihapus");
                    }else{
                        l1.firstpop();
                        System.out.println("data paling depan berhasil dihapus");
                    }
                    break;
                
            }
            
            System.out.println("menu(masukan nomernya) : \n1. input data pegawai \n2.tampilkan data pegawai \n3.hapus data pegawai \n4.keluar");
            choice = input.nextInt();
        }
        

        input.close();
    }
}
