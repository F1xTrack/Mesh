package p000;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10757qH0 {

    /* renamed from: a */
    public double f40716a = 1.0d;

    /* renamed from: b */
    public final HashMap f40717b = new HashMap();

    /* renamed from: a */
    public final synchronized AtomicReference m23961a(Double d) {
        return (AtomicReference) this.f40717b.get(d);
    }

    /* renamed from: b */
    public final synchronized C8664Zz0 m23962b() {
        double d;
        AtomicReference atomicReference;
        d = this.f40716a;
        this.f40716a = 1.0d + d;
        atomicReference = new AtomicReference(EnumC10629pH0.f39996a);
        this.f40717b.put(Double.valueOf(d), atomicReference);
        return new C8664Zz0(Double.valueOf(d), atomicReference);
    }

    /* renamed from: c */
    public final synchronized void m23963c(Double d) {
        this.f40717b.remove(d);
    }
}
