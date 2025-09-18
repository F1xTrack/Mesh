package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.T4;

/* renamed from: com.yandex.metrica.impl.ob.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3243z0<C extends T4> extends Q2<C> {
    private final Z4 e;
    private final I8 f;

    public C3243z0(C c, Zi zi, Z4 z4, I8 i8) {
        super(c, zi);
        this.e = z4;
        this.f = i8;
    }

    public void a(C2864k0 c2864k0) {
        if (this.c) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.c) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        V4 v4 = new V4(e(), c2864k0, this.e, this.f);
        R1 r1L = P0.i().l();
        if (r1L != null) {
            r1L.b(v4);
        }
    }
}
