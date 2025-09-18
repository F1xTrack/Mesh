package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Gk */
/* loaded from: classes2.dex */
public final class C4525Gk {

    /* renamed from: a */
    public final /* synthetic */ C4573Ik f30200a;

    public C4525Gk(C4573Ik c4573Ik) {
        this.f30200a = c4573Ik;
    }

    /* renamed from: a */
    public final void m19454a(String str, EnumC4621Kk enumC4621Kk, C5155gl c5155gl) {
        ArrayList arrayList;
        synchronized (this.f30200a.f30319b) {
            try {
                Collection collection = (Collection) this.f30200a.f30318a.f32190a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4788Rk) it.next()).mo19571a(enumC4621Kk, c5155gl);
        }
    }
}
