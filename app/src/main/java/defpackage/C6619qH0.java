package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6619qH0 {
    public double a = 1.0d;
    public final HashMap b = new HashMap();

    public final synchronized AtomicReference a(Double d) {
        return (AtomicReference) this.b.get(d);
    }

    public final synchronized C2045Zz0 b() {
        double d;
        AtomicReference atomicReference;
        d = this.a;
        this.a = 1.0d + d;
        atomicReference = new AtomicReference(EnumC6428pH0.a);
        this.b.put(Double.valueOf(d), atomicReference);
        return new C2045Zz0(Double.valueOf(d), atomicReference);
    }

    public final synchronized void c(Double d) {
        this.b.remove(d);
    }
}
