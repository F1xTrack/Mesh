package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2982Ug;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Wg */
/* loaded from: classes2.dex */
public class C3032Wg implements C2982Ug.a {

    /* renamed from: a */
    private final Set<InterfaceC2583Eg> f22698a;

    /* renamed from: b */
    private boolean f22699b;

    /* renamed from: c */
    private C2608Fg f22700c;

    public C3032Wg() {
        this(C2842P0.m14728i().m14744o());
    }

    @Override // com.yandex.metrica.impl.p022ob.C2982Ug.a
    /* renamed from: a */
    public synchronized void mo15281a(C2608Fg c2608Fg) {
        try {
            this.f22700c = c2608Fg;
            this.f22699b = true;
            Iterator<InterfaceC2583Eg> it = this.f22698a.iterator();
            while (it.hasNext()) {
                it.next().mo14002a(this.f22700c);
            }
            this.f22698a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3032Wg(C2982Ug c2982Ug) {
        this.f22698a = new HashSet();
        c2982Ug.m15279a(new C3133ah(this));
        c2982Ug.m15280b();
    }

    /* renamed from: a */
    public synchronized void m15392a(InterfaceC2583Eg interfaceC2583Eg) {
        this.f22698a.add(interfaceC2583Eg);
        if (this.f22699b) {
            interfaceC2583Eg.mo14002a(this.f22700c);
            this.f22698a.remove(interfaceC2583Eg);
        }
    }
}
