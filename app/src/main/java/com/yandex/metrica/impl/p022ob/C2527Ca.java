package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3366jg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ca */
/* loaded from: classes2.dex */
public class C2527Ca implements InterfaceC3230ea<C2584Eh, C3366jg> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2584Eh mo13846a(C3366jg c3366jg) {
        C3366jg c3366jg2 = c3366jg;
        ArrayList arrayList = new ArrayList(c3366jg2.f23724b.length);
        int i = 0;
        while (true) {
            C3366jg.a[] aVarArr = c3366jg2.f23724b;
            if (i >= aVarArr.length) {
                return new C2584Eh(arrayList, c3366jg2.f23725c, c3366jg2.f23726d, c3366jg2.f23727e, c3366jg2.f23728f);
            }
            C3366jg.a aVar = aVarArr[i];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f23731c;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f23731c.length);
                int i2 = 0;
                while (true) {
                    String[] strArr2 = aVar.f23731c;
                    if (i2 < strArr2.length) {
                        arrayList2.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            arrayList.add(new C2659Hh(C2819O2.m14688b(aVar.f23730b), arrayList2));
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3366jg mo13847b(C2584Eh c2584Eh) {
        C2584Eh c2584Eh2 = c2584Eh;
        C3366jg c3366jg = new C3366jg();
        c3366jg.f23724b = new C3366jg.a[c2584Eh2.f21117a.size()];
        for (int i = 0; i < c2584Eh2.f21117a.size(); i++) {
            C3366jg.a[] aVarArr = c3366jg.f23724b;
            C2659Hh c2659Hh = c2584Eh2.f21117a.get(i);
            C3366jg.a aVar = new C3366jg.a();
            aVar.f23730b = c2659Hh.f21364a;
            List<String> list = c2659Hh.f21365b;
            aVar.f23731c = new String[list.size()];
            Iterator<String> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                aVar.f23731c[i2] = it.next();
                i2++;
            }
            aVarArr[i] = aVar;
        }
        c3366jg.f23725c = c2584Eh2.f21118b;
        c3366jg.f23726d = c2584Eh2.f21119c;
        c3366jg.f23727e = c2584Eh2.f21120d;
        c3366jg.f23728f = c2584Eh2.f21121e;
        return c3366jg;
    }
}
