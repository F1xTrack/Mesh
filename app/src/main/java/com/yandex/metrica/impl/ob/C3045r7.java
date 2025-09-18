package com.yandex.metrica.impl.ob;

import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3045r7 implements InterfaceC2725ea<C2722e7, If> {
    private D7 a;

    public C3045r7(D7 d7) {
        this.a = d7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2722e7 a(If r1) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If b(C2722e7 c2722e7) {
        If r0 = new If();
        C2921m7 c2921m7 = c2722e7.a;
        if (c2921m7 != null) {
            r0.b = this.a.b(c2921m7);
        }
        r0.c = new Pf[c2722e7.b.size()];
        Iterator<C2921m7> it = c2722e7.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            r0.c[i] = this.a.b(it.next());
            i++;
        }
        String str = c2722e7.c;
        if (str != null) {
            r0.d = str;
        }
        return r0;
    }
}
