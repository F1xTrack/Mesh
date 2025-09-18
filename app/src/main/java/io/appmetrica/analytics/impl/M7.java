package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class M7 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final O7 c;
    public final Xm d;
    public final Kl e;
    public final InterfaceC4675ki f;
    public final InterfaceC4627ii g;
    public final InterfaceC5022z6 h;
    public N7 i;

    public M7(Context context, ProtobufStateStorage protobufStateStorage, O7 o7, Xm xm, Kl kl, InterfaceC4675ki interfaceC4675ki, InterfaceC4627ii interfaceC4627ii, InterfaceC5022z6 interfaceC5022z6, N7 n7) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = o7;
        this.d = xm;
        this.e = kl;
        this.f = interfaceC4675ki;
        this.g = interfaceC4627ii;
        this.h = interfaceC5022z6;
        this.i = n7;
    }

    public final synchronized N7 a() {
        return this.i;
    }

    public final synchronized boolean b(Q7 q7) {
        boolean z;
        try {
            if (q7.a() == P7.b) {
                return false;
            }
            if (q7.equals(this.i.b())) {
                return false;
            }
            List listA = (List) this.d.invoke(this.i.a(), q7);
            boolean z2 = listA != null;
            if (listA == null) {
                listA = this.i.a();
            }
            if (this.c.a(q7, this.i.b())) {
                z = true;
            } else {
                q7 = (Q7) this.i.b();
                z = false;
            }
            if (z || z2) {
                N7 n7 = this.i;
                N7 n72 = (N7) this.e.invoke(q7, listA);
                this.i = n72;
                this.b.save(n72);
                AbstractC4938vi.a("Update distribution data: %s -> %s", n7, this.i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized Q7 c() {
        try {
            if (!this.g.a()) {
                Q7 q7 = (Q7) this.f.invoke();
                this.g.b();
                if (q7 != null) {
                    b(q7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Q7) this.i.b();
    }

    public final Q7 a(Q7 q7) {
        Q7 q7C;
        this.h.a(this.a);
        synchronized (this) {
            b(q7);
            q7C = c();
        }
        return q7C;
    }

    public final Q7 b() {
        this.h.a(this.a);
        return c();
    }
}
