package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3179wb implements InterfaceC2900lb<Jb> {
    private final C3000pb a;
    private final C3074sb b;

    public C3179wb() {
        this(new C3000pb(), new C3074sb());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(List<C3099tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C3099tb<Rf, Fn>> b(Object obj) {
        C3099tb<Rf.m, Fn> c3099tbB;
        Jb jb = (Jb) obj;
        Rf rf = new Rf();
        rf.b = 3;
        rf.e = new Rf.p();
        C3099tb<Rf.k, Fn> c3099tbB2 = this.a.b(jb.b);
        rf.e.b = c3099tbB2.a;
        Gb gb = jb.c;
        if (gb != null) {
            c3099tbB = this.b.b(gb);
            rf.e.c = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        return Collections.singletonList(new C3099tb(rf, En.a(c3099tbB2, c3099tbB)));
    }

    public C3179wb(C3000pb c3000pb, C3074sb c3074sb) {
        this.a = c3000pb;
        this.b = c3074sb;
    }
}
