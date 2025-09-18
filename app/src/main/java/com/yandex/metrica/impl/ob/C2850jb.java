package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2850jb implements InterfaceC2725ea<List<String>, C3099tb<Rf.d, Fn>> {
    private final Tn a;

    public C2850jb() {
        this(new Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<String> a(C3099tb<Rf.d, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C2850jb(Tn tn) {
        this.a = tn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.d, Fn> b(List<String> list) {
        Qn<List<Object>, Hn> qnA = this.a.a((List<Object>) list);
        Rf.d dVar = new Rf.d();
        List<Object> list2 = qnA.a;
        int i = O2.a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                bArr[i2] = O2.c((String) list2.get(i2));
            }
        }
        dVar.b = bArr;
        return new C3099tb<>(dVar, qnA.b);
    }
}
