package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2855jg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class Ca implements InterfaceC2725ea<Eh, C2855jg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Eh a(C2855jg c2855jg) {
        C2855jg c2855jg2 = c2855jg;
        ArrayList arrayList = new ArrayList(c2855jg2.b.length);
        int i = 0;
        while (true) {
            C2855jg.a[] aVarArr = c2855jg2.b;
            if (i >= aVarArr.length) {
                return new Eh(arrayList, c2855jg2.c, c2855jg2.d, c2855jg2.e, c2855jg2.f);
            }
            C2855jg.a aVar = aVarArr[i];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.c;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.c.length);
                int i2 = 0;
                while (true) {
                    String[] strArr2 = aVar.c;
                    if (i2 < strArr2.length) {
                        arrayList2.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            arrayList.add(new Hh(O2.b(aVar.b), arrayList2));
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2855jg b(Eh eh) {
        Eh eh2 = eh;
        C2855jg c2855jg = new C2855jg();
        c2855jg.b = new C2855jg.a[eh2.a.size()];
        for (int i = 0; i < eh2.a.size(); i++) {
            C2855jg.a[] aVarArr = c2855jg.b;
            Hh hh = eh2.a.get(i);
            C2855jg.a aVar = new C2855jg.a();
            aVar.b = hh.a;
            List<String> list = hh.b;
            aVar.c = new String[list.size()];
            Iterator<String> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                aVar.c[i2] = it.next();
                i2++;
            }
            aVarArr[i] = aVar;
        }
        c2855jg.c = eh2.b;
        c2855jg.d = eh2.c;
        c2855jg.e = eh2.d;
        c2855jg.f = eh2.e;
        return c2855jg;
    }
}
