package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nb */
/* loaded from: classes2.dex */
public class C3465nb implements InterfaceC3230ea<Map<String, String>, C3621tb<C2906Rf.i, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3014Vn f24312a;

    public C3465nb() {
        this(new C3014Vn(20480, 100, 1000));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Map<String, String> mo13846a(C3621tb<C2906Rf.i, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3465nb(C3014Vn c3014Vn) {
        this.f24312a = c3014Vn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.i, InterfaceC2615Fn> mo13847b(Map<String, String> map) {
        C2890Qn<Map<String, String>, C2665Hn> c2890QnMo15090a = this.f24312a.mo15090a(map);
        C2906Rf.i iVar = new C2906Rf.i();
        iVar.f22156c = ((C2665Hn) c2890QnMo15090a.f22085b).f21381b;
        Map<String, String> map2 = c2890QnMo15090a.f22084a;
        if (map2 != null) {
            iVar.f22155b = new C2906Rf.i.a[map2.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                iVar.f22155b[i] = new C2906Rf.i.a();
                iVar.f22155b[i].f22158b = C2819O2.m14689c(entry.getKey());
                iVar.f22155b[i].f22159c = C2819O2.m14689c(entry.getValue());
                i++;
            }
        }
        return new C3621tb<>(iVar, c2890QnMo15090a.f22085b);
    }
}
