package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2656bg;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class X9 implements InterfaceC2725ea<C2629ae, C2656bg> {
    private final C2625aa a;

    public X9() {
        this(new C2625aa());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2629ae a(C2656bg c2656bg) {
        C2656bg c2656bg2 = c2656bg;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C2656bg.b[] bVarArr = c2656bg2.b;
            if (i2 >= bVarArr.length) {
                break;
            }
            C2656bg.b bVar = bVarArr[i2];
            arrayList.add(new C2829ie(bVar.b, bVar.c));
            i2++;
        }
        C2656bg.a aVar = c2656bg2.c;
        H hA = aVar != null ? this.a.a(aVar) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c2656bg2.d;
            if (i >= strArr.length) {
                return new C2629ae(arrayList, hA, arrayList2);
            }
            arrayList2.add(strArr[i]);
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2656bg b(C2629ae c2629ae) {
        C2629ae c2629ae2 = c2629ae;
        C2656bg c2656bg = new C2656bg();
        c2656bg.b = new C2656bg.b[c2629ae2.a.size()];
        int i = 0;
        int i2 = 0;
        for (C2829ie c2829ie : c2629ae2.a) {
            C2656bg.b[] bVarArr = c2656bg.b;
            C2656bg.b bVar = new C2656bg.b();
            bVar.b = c2829ie.a;
            bVar.c = c2829ie.b;
            bVarArr[i2] = bVar;
            i2++;
        }
        H h = c2629ae2.b;
        if (h != null) {
            c2656bg.c = this.a.b(h);
        }
        c2656bg.d = new String[c2629ae2.c.size()];
        Iterator<String> it = c2629ae2.c.iterator();
        while (it.hasNext()) {
            c2656bg.d[i] = it.next();
            i++;
        }
        return c2656bg;
    }

    public X9(C2625aa c2625aa) {
        this.a = c2625aa;
    }
}
