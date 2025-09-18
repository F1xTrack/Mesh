package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class Vn extends Rn {
    private final Un b;
    private final Un c;
    private Comparator<Map.Entry<String, String>> d;

    public class a implements Comparator<Map.Entry<String, String>> {
        public a(Vn vn) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            String value = entry.getValue();
            String value2 = entry2.getValue();
            int length = O2.c(value).length;
            int length2 = O2.c(value2).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public Vn(int i, int i2, int i3) {
        this(i, new Un(i2), new Un(i3));
    }

    public Vn(int i, Un un, Un un2) {
        super(i);
        this.d = new a(this);
        this.b = un;
        this.c = un2;
    }

    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<Map<String, String>, Hn> a(Map<String, String> map) {
        HashMap map2;
        int iA;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.d);
            int length = entryArr.length;
            iA = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                Qn<String, Fn> qnA = this.b.a((String) entry.getKey());
                Qn<String, Fn> qnA2 = this.c.a((String) entry.getValue());
                int length2 = O2.c((String) entry.getKey()).length + O2.c((String) entry.getValue()).length;
                int length3 = O2.c(qnA.a).length + O2.c(qnA2.a).length;
                if (z || length3 + i3 > a()) {
                    i2++;
                    iA += length2;
                    z = true;
                } else {
                    iA = qnA2.b.a() + qnA.b.a() + iA;
                    int length4 = O2.c(qnA.a).length + O2.c(qnA2.a).length + i3;
                    map2.put(qnA.a, qnA2.a);
                    i3 = length4;
                }
                i++;
            }
            i = i2;
        } else {
            map2 = null;
            iA = 0;
        }
        return new Qn<>(map2, new Hn(i, iA));
    }
}
