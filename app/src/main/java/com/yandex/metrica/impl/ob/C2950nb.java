package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2950nb implements InterfaceC2725ea<Map<String, String>, C3099tb<Rf.i, Fn>> {
    private final Vn a;

    public C2950nb() {
        this(new Vn(20480, 100, 1000));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Map<String, String> a(C3099tb<Rf.i, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C2950nb(Vn vn) {
        this.a = vn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.i, Fn> b(Map<String, String> map) {
        Qn<Map<String, String>, Hn> qnA = this.a.a(map);
        Rf.i iVar = new Rf.i();
        iVar.c = ((Hn) qnA.b).b;
        Map<String, String> map2 = qnA.a;
        if (map2 != null) {
            iVar.b = new Rf.i.a[map2.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                iVar.b[i] = new Rf.i.a();
                iVar.b[i].b = O2.c(entry.getKey());
                iVar.b[i].c = O2.c(entry.getValue());
                i++;
            }
        }
        return new C3099tb<>(iVar, qnA.b);
    }
}
