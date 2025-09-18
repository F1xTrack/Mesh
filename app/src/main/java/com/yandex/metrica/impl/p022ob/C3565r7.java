package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.r7 */
/* loaded from: classes2.dex */
public class C3565r7 implements InterfaceC3230ea<C3227e7, C2682If> {

    /* renamed from: a */
    private C2549D7 f24601a;

    public C3565r7(C2549D7 c2549d7) {
        this.f24601a = c2549d7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3227e7 mo13846a(C2682If c2682If) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2682If mo13847b(C3227e7 c3227e7) {
        C2682If c2682If = new C2682If();
        C3435m7 c3435m7 = c3227e7.f23327a;
        if (c3435m7 != null) {
            c2682If.f21430b = this.f24601a.mo13847b(c3435m7);
        }
        c2682If.f21431c = new C2857Pf[c3227e7.f23328b.size()];
        Iterator<C3435m7> it = c3227e7.f23328b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2682If.f21431c[i] = this.f24601a.mo13847b(it.next());
            i++;
        }
        String str = c3227e7.f23329c;
        if (str != null) {
            c2682If.f21432d = str;
        }
        return c2682If;
    }
}
