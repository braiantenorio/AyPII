package net.datastructures;

public class Test {
    public static void main(String[] args) {

        Vuelo s = new Vuelo(5565, "PMY", "AEP", 8000);
        Vuelo t = new Vuelo(2335, "PMY", "CRD", 4500);
        Vuelo r = new Vuelo(2447, "AEP", "PMY", 7500);
        Vuelo q = new Vuelo(5778, "PMY", "AEP", 8500);
        Vuelo p = new Vuelo(7889, "AEP", "IGR", 6500);

        List<Vuelo> lista = new ArrayList<Vuelo>();
        lista.add(0, s);
        lista.add(1, t);
        lista.add(2, r);
        lista.add(3, q);
        lista.add(4, p);

        List<String> l;
        Map<String, List<String>> m = new ChainHashMap<String, List<String>>();
        for (Vuelo v : lista) {
            l = m.get(v.getCodigoOrigen());
            if (l == null) {
                l = new ArrayList<String>();
                m.put(v.getCodigoOrigen(), l);
            }
            if(!l.contains(v.getCodigoDestino()))
                l.add(l.size(), v.getCodigoDestino());
        }

        for (Entry<String, List<String>> e : m.entrySet())
            System.out.println(e);
    }
}
