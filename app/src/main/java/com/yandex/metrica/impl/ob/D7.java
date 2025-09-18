package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class D7 implements InterfaceC2725ea<C2921m7, Pf> {
    private final B7 a;

    public D7() {
        this(new B7());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2921m7 a(Pf pf) {
        throw new UnsupportedOperationException();
    }

    public D7(B7 b7) {
        this.a = b7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pf b(C2921m7 c2921m7) {
        Pf pf = new Pf();
        Integer num = c2921m7.e;
        pf.f = num == null ? -1 : num.intValue();
        pf.e = c2921m7.d;
        pf.c = c2921m7.b;
        pf.b = c2921m7.a;
        pf.d = c2921m7.c;
        B7 b7 = this.a;
        List<StackTraceElement> list = c2921m7.f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2896l7((StackTraceElement) it.next()));
        }
        pf.g = b7.b((List<C2896l7>) arrayList);
        return pf;
    }
}
