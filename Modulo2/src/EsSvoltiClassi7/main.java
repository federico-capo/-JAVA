package EsSvoltiClassi7;

import java.util.ArrayList;
import java.util.List;

public class main {
        private  List<Trasloco> TraslocoArray = new ArrayList<>();

        public List<Trasloco> getTraslocoArray() {
            return TraslocoArray;
        }
        public void setTraslocoArray(List<Trasloco> traslocoArray) {
            TraslocoArray = traslocoArray;
        }

        public static void main(String[] args  ) {
            Trasloco t= new Trasloco("20/01/2023",3313,"Gig","Antonio");
            Trasloco t1= new Trasloco("20/01/2022",33,"Gig1","Antonio1");
            main  c = new main();
            c.getTraslocoArray().add(t);
            c.getTraslocoArray().add(t1);
            for (Trasloco trasloco : c.getTraslocoArray()) {
                System.out.println(trasloco);
            }


        }


}   
