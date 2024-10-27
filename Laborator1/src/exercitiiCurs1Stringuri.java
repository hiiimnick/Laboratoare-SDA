public class exercitiiCurs1Stringuri {
    public static void main(String[] args) {
        String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of",
                "their", "country"};

        String arrSort[] = new String[arr.length];

        arrSort = arr.clone();

        for (int i = 0; i < arrSort.length; i++) {
            for (int j = 0; j < arrSort.length - 1 - i; j++) {
                if (arrSort[j].compareToIgnoreCase(arrSort[j + 1]) > 0) {
                    String aux = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = aux;
                }
            }
        }

        //for (int i = 0; i < arrSort.length; i++) {
        //    System.out.println(arrSort[i]);
        //}

        /*
        String test1 = "";
        for (int i = 0; i < arr.length; i++) {
            test1 += arr[i];
            if (i < arr.length - 1) {
                test1 += ",";
            }
        }
        System.out.println(test1);

        String test2 = String.join(",", arr);
        System.out.println(test2);

        String str = "Now,is,the,time,for,all,good,men,to, come,to,the,aid,of,their,country";

        String[] test3 = str.split(",");
        for (String s : arr) {
            System.out.print(s);
        }

         */

        double d = 102939939.939E+20;
        boolean b = true;
        long l = 1232874;
        char[] test4 = {'a', 'b', 'c', 'd', 'e', 'f','g' };

        String u = String.valueOf(d);
        System.out.println(u);
        String i = String.valueOf(l);
        System.out.println(i);
        String o = String.valueOf(l);
        System.out.println(o);
        String p = String.valueOf(test4);
        System.out.println(p);

        double dd = Double.valueOf(u);
        System.out.println(dd);
        boolean bb = Boolean.valueOf(i);
        System.out.println(bb);
        long ll = Long.valueOf(o);
        System.out.println(ll);
        char[] test44 = p.toCharArray();
        System.out.println(test44);

    }
}
