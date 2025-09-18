package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3158bg;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.X9 */
/* loaded from: classes2.dex */
public class C3050X9 implements InterfaceC3230ea<C3130ae, C3158bg> {

    /* renamed from: a */
    private final C3126aa f22780a;

    public C3050X9() {
        this(new C3126aa());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3130ae mo13846a(C3158bg c3158bg) {
        C3158bg c3158bg2 = c3158bg;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C3158bg.b[] bVarArr = c3158bg2.f23137b;
            if (i2 >= bVarArr.length) {
                break;
            }
            C3158bg.b bVar = bVarArr[i2];
            arrayList.add(new C3338ie(bVar.f23143b, bVar.f23144c));
            i2++;
        }
        C3158bg.a aVar = c3158bg2.f23138c;
        C2641H c2641hMo13846a = aVar != null ? this.f22780a.mo13846a(aVar) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c3158bg2.f23139d;
            if (i >= strArr.length) {
                return new C3130ae(arrayList, c2641hMo13846a, arrayList2);
            }
            arrayList2.add(strArr[i]);
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3158bg mo13847b(C3130ae c3130ae) {
        C3130ae c3130ae2 = c3130ae;
        C3158bg c3158bg = new C3158bg();
        c3158bg.f23137b = new C3158bg.b[c3130ae2.f23048a.size()];
        int i = 0;
        int i2 = 0;
        for (C3338ie c3338ie : c3130ae2.f23048a) {
            C3158bg.b[] bVarArr = c3158bg.f23137b;
            C3158bg.b bVar = new C3158bg.b();
            bVar.f23143b = c3338ie.f23647a;
            bVar.f23144c = c3338ie.f23648b;
            bVarArr[i2] = bVar;
            i2++;
        }
        C2641H c2641h = c3130ae2.f23049b;
        if (c2641h != null) {
            c3158bg.f23138c = this.f22780a.mo13847b(c2641h);
        }
        c3158bg.f23139d = new String[c3130ae2.f23050c.size()];
        Iterator<String> it = c3130ae2.f23050c.iterator();
        while (it.hasNext()) {
            c3158bg.f23139d[i] = it.next();
            i++;
        }
        return c3158bg;
    }

    public C3050X9(C3126aa c3126aa) {
        this.f22780a = c3126aa;
    }
}
