package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D7 */
/* loaded from: classes2.dex */
public class C2549D7 implements InterfaceC3230ea<C3435m7, C2857Pf> {

    /* renamed from: a */
    private final C2499B7 f21008a;

    public C2549D7() {
        this(new C2499B7());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3435m7 mo13846a(C2857Pf c2857Pf) {
        throw new UnsupportedOperationException();
    }

    public C2549D7(C2499B7 c2499b7) {
        this.f21008a = c2499b7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2857Pf mo13847b(C3435m7 c3435m7) {
        C2857Pf c2857Pf = new C2857Pf();
        Integer num = c3435m7.f24249e;
        c2857Pf.f21959f = num == null ? -1 : num.intValue();
        c2857Pf.f21958e = c3435m7.f24248d;
        c2857Pf.f21956c = c3435m7.f24246b;
        c2857Pf.f21955b = c3435m7.f24245a;
        c2857Pf.f21957d = c3435m7.f24247c;
        C2499B7 c2499b7 = this.f21008a;
        List<StackTraceElement> list = c3435m7.f24250f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3409l7((StackTraceElement) it.next()));
        }
        c2857Pf.f21960g = c2499b7.mo13847b((List<C3409l7>) arrayList);
        return c2857Pf;
    }
}
