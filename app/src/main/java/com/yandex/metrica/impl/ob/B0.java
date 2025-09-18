package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C0;
import com.yandex.metrica.impl.ob.F0;
import java.util.List;

/* loaded from: classes2.dex */
public class B0<CANDIDATE, CHOSEN extends F0, STORAGE extends C0<CANDIDATE, CHOSEN>> {
    private final Context a;
    private final Q9 b;
    private final D0<CHOSEN> c;
    private final T2<CANDIDATE, CHOSEN> d;
    private final L2<CANDIDATE, CHOSEN, STORAGE> e;
    private final InterfaceC3140v2<CHOSEN> f;
    private final InterfaceC3065s2 g;
    private final InterfaceC2914m0 h;
    private STORAGE i;

    /* JADX WARN: Multi-variable type inference failed */
    public B0(Context context, Q9 q9, D0 d0, T2 t2, L2 l2, InterfaceC3140v2 interfaceC3140v2, InterfaceC3065s2 interfaceC3065s2, InterfaceC2914m0 interfaceC2914m0, C0 c0, String str) {
        this.a = context;
        this.b = q9;
        this.c = d0;
        this.d = t2;
        this.e = l2;
        this.f = interfaceC3140v2;
        this.g = interfaceC3065s2;
        this.h = interfaceC2914m0;
        this.i = c0;
    }

    public final CHOSEN a() {
        this.h.a(this.a);
        return (CHOSEN) b();
    }

    public final synchronized boolean b(CHOSEN chosen) {
        boolean z = false;
        if (chosen.a() == E0.UNDEFINED) {
            return false;
        }
        List<CANDIDATE> listA = (List) this.d.invoke(this.i.a(), chosen);
        boolean z2 = listA != null;
        if (listA == null) {
            listA = this.i.a();
        }
        if (this.c.a(chosen, this.i.b())) {
            z = true;
        } else {
            chosen = (CHOSEN) this.i.b();
        }
        if (z || z2) {
            STORAGE storage = (STORAGE) this.e.invoke(chosen, listA);
            this.i = storage;
            this.b.a(storage);
        }
        return z;
    }

    public final CHOSEN a(CHOSEN chosen) {
        CHOSEN chosen2;
        this.h.a(this.a);
        synchronized (this) {
            b(chosen);
            chosen2 = (CHOSEN) b();
        }
        return chosen2;
    }

    private final synchronized CHOSEN b() {
        try {
            if (!this.g.a()) {
                F0 f0 = (F0) this.f.invoke();
                this.g.b();
                if (f0 != null) {
                    b(f0);
                }
            }
            B2.a("Choosing distribution data: %s", this.i);
        } catch (Throwable th) {
            throw th;
        }
        return (CHOSEN) this.i.b();
    }
}
