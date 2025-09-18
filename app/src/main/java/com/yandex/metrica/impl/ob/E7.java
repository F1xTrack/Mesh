package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class E7 implements InterfaceC2725ea<C2946n7, Qf> {
    private final B7 a;

    public E7() {
        this(new B7());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2946n7 a(Qf qf) {
        throw new UnsupportedOperationException();
    }

    public E7(B7 b7) {
        this.a = b7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Qf b(C2946n7 c2946n7) {
        Qf qf = new Qf();
        String strB = c2946n7.b();
        if (strB == null) {
            strB = "";
        }
        qf.b = strB;
        String strC = c2946n7.c();
        qf.c = strC != null ? strC : "";
        qf.d = this.a.b(c2946n7.d());
        if (c2946n7.a() != null) {
            qf.e = b(c2946n7.a());
        }
        List<C2946n7> listE = c2946n7.e();
        int i = 0;
        if (listE == null) {
            qf.f = new Qf[0];
        } else {
            qf.f = new Qf[listE.size()];
            Iterator<C2946n7> it = listE.iterator();
            while (it.hasNext()) {
                qf.f[i] = b(it.next());
                i++;
            }
        }
        return qf;
    }
}
