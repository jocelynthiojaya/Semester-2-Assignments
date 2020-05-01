import java.util.*;


public class Specimen{
    private String name;
    private int cageNumber;
    private Species toa; // "Type Of Animal"

    public Specimen( String a, int c, Species s)
    { setName(a); setCage(c); setTOA(s); }

    public void setName(String a){ name = a; }
    public void setCage(int c){ cageNumber = c; }
    public void setTOA(Species s){ toa = s; }

    public String getName(){ return name; }
    public int getCage(){ return cageNumber; }
    public Species getTOA(){ return toa; }

    @Override
    public String toString(){ return name + " is a " + toa + " in cage " + cageNumber;}

    void countSpecimens(Specimen[] animals, Species s){
        int sCount = 0;
        int i;
        for(i = 0; i < animals.length; i++){
            if (s.equals( animals[i].getTOA() )){
                sCount++;
            }
        }
        System.out.println(sCount);
    }

    LinkedList makeList(Specimen[] animals){
        LinkedList<Specimen> specimens=new LinkedList<Specimen>();
        for(int i = 0; i < animals.length; i++){
            specimens.add(animals[i]);
        }
        return specimens;
    }


}

