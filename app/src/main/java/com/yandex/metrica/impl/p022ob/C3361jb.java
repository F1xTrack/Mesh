package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jb */
/* loaded from: classes2.dex */
public class C3361jb implements InterfaceC3230ea<List<String>, C3621tb<C2906Rf.d, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C2964Tn f23714a;

    public C3361jb() {
        this(new C2964Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public List<String> mo13846a(C3621tb<C2906Rf.d, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3361jb(C2964Tn c2964Tn) {
        this.f23714a = c2964Tn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.d, InterfaceC2615Fn> mo13847b(List<String> list) {
        C2890Qn<List<Object>, C2665Hn> c2890QnMo15090a = this.f23714a.mo15090a((List<Object>) list);
        C2906Rf.d dVar = new C2906Rf.d();
        List<Object> list2 = c2890QnMo15090a.f22084a;
        int i = C2819O2.f21836a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                bArr[i2] = C2819O2.m14689c((String) list2.get(i2));
            }
        }
        dVar.f22143b = bArr;
        return new C3621tb<>(dVar, c2890QnMo15090a.f22085b);
    }
}
