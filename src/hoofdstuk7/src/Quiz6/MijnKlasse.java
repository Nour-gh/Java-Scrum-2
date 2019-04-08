package Quiz6;

public class MijnKlasse {

    StringBuffer sb = new StringBuffer();
    StringBuffer sb2 = new StringBuffer("Eva");

    public void mijnMethode() {
        sb.append("Sam ");
        sb2.append(" Lucas ");
        sb.append(22);
        sb.append(" muziek");
        sb2.append(2000);
        //Door .append wordt het volgende ingevoegd op volgorde.
        System.out.print(sb + ", " + sb2);
    }
}