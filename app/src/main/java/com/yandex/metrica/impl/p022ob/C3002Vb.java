package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.Vb */
/* loaded from: classes2.dex */
public class C3002Vb {

    /* renamed from: a */
    private final List<InterfaceC2952Tb> f22532a;

    /* renamed from: b */
    private final InterfaceC3027Wb f22533b;

    /* renamed from: c */
    private final AtomicBoolean f22534c = new AtomicBoolean(true);

    public C3002Vb(List<InterfaceC2952Tb> list, InterfaceC3027Wb interfaceC3027Wb) {
        this.f22532a = list;
        this.f22533b = interfaceC3027Wb;
    }

    /* renamed from: a */
    public void m15303a() {
        this.f22534c.set(false);
    }

    /* renamed from: b */
    public void m15304b() {
        this.f22534c.set(true);
    }

    /* renamed from: c */
    public void m15305c() {
        if (this.f22534c.get()) {
            if (this.f22532a.isEmpty()) {
                ((C3250f4) this.f22533b).m15904c();
                return;
            }
            Iterator<InterfaceC2952Tb> it = this.f22532a.iterator();
            boolean zMo15114a = false;
            while (it.hasNext()) {
                zMo15114a |= it.next().mo15114a();
            }
            if (zMo15114a) {
                ((C3250f4) this.f22533b).m15904c();
            }
        }
    }
}
