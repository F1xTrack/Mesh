package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Sn extends Rn {
    private final Rn b;

    public Sn(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        throw null;
    }

    public Sn(int i, Rn rn) {
        super(i);
        this.b = rn;
    }

    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<List<Object>, Hn> a(List<Object> list) {
        int iB;
        int i = 0;
        if (list == null || (list.size() <= a() && this.b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < a()) {
                    Rn rn = this.b;
                    if (rn != null) {
                        Qn<Object, Fn> qnA = rn.a(obj);
                        Object obj2 = qnA.a;
                        iB += qnA.b.a();
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iB += b(obj);
                }
                i2++;
            }
            list = arrayList;
        }
        return new Qn<>(list, new Hn(i, iB));
    }
}
