package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C3167w;
import com.yandex.metrica.impl.ob.Ma;

/* loaded from: classes2.dex */
public class Dh {
    private final C3260zh a;
    private final Q9 b;
    private final R2 c;
    private final InterfaceExecutorC3086sn d;
    private final C3167w.c e;
    private final C3167w f;
    private final C3235yh g;
    private boolean h;
    private Di i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Object q;

    public Dh(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(new C3260zh(context, null, interfaceExecutorC3086sn), Ma.b.a(Eh.class).a(context), new R2(), interfaceExecutorC3086sn, P0.i().a());
    }

    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        if (!this.p) {
            this.f.a(this.i.c, this.d, this.e);
        } else {
            this.a.a(this.g);
        }
    }

    public void b() {
        Eh eh = (Eh) this.b.b();
        this.m = eh.c;
        this.n = eh.d;
        this.o = eh.e;
    }

    public Dh(C3260zh c3260zh, Q9 q9, R2 r2, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3167w c3167w) {
        this.p = false;
        this.q = new Object();
        this.a = c3260zh;
        this.b = q9;
        this.g = new C3235yh(q9, new Bh(this));
        this.c = r2;
        this.d = interfaceExecutorC3086sn;
        this.e = new Ch(this);
        this.f = c3167w;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.yandex.metrica.impl.ob.Qi r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            goto L3b
        L3:
            boolean r0 = r8.j
            r1 = 1
            if (r0 != 0) goto L10
            com.yandex.metrica.impl.ob.si r0 = r9.f()
            boolean r0 = r0.e
            if (r0 == r1) goto L3c
        L10:
            com.yandex.metrica.impl.ob.Di r0 = r8.i
            if (r0 == 0) goto L3c
            com.yandex.metrica.impl.ob.Di r2 = r9.K()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3c
            long r2 = r8.k
            long r4 = r9.B()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r2 = r8.l
            long r4 = r9.p()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            com.yandex.metrica.impl.ob.zh r0 = r8.a
            boolean r0 = r0.b(r9)
            if (r0 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            java.lang.Object r0 = r8.q
            monitor-enter(r0)
            if (r9 == 0) goto L5e
            com.yandex.metrica.impl.ob.si r2 = r9.f()     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.e     // Catch: java.lang.Throwable -> L5c
            r8.j = r2     // Catch: java.lang.Throwable -> L5c
            com.yandex.metrica.impl.ob.Di r2 = r9.K()     // Catch: java.lang.Throwable -> L5c
            r8.i = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.B()     // Catch: java.lang.Throwable -> L5c
            r8.k = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.p()     // Catch: java.lang.Throwable -> L5c
            r8.l = r2     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto Lb2
        L5e:
            com.yandex.metrica.impl.ob.zh r2 = r8.a     // Catch: java.lang.Throwable -> L5c
            r2.a(r9)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lb1
            java.lang.Object r9 = r8.q
            monitor-enter(r9)
            boolean r0 = r8.j     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            com.yandex.metrica.impl.ob.Di r0 = r8.i     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            boolean r1 = r8.n     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L9f
            boolean r1 = r8.o     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8d
            com.yandex.metrica.impl.ob.R2 r2 = r8.c     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.m     // Catch: java.lang.Throwable -> L8b
            long r5 = r0.d     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = "should retry sdk collecting"
            boolean r0 = r2.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L8b:
            r0 = move-exception
            goto Laf
        L8d:
            com.yandex.metrica.impl.ob.R2 r1 = r8.c     // Catch: java.lang.Throwable -> L8b
            long r2 = r8.m     // Catch: java.lang.Throwable -> L8b
            long r4 = r0.a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "should collect sdk as usual"
            boolean r0 = r1.a(r2, r4, r6)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L9f:
            long r1 = r8.k     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.l     // Catch: java.lang.Throwable -> L8b
            long r1 = r1 - r3
            long r3 = r0.b     // Catch: java.lang.Throwable -> L8b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
        Lad:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb1
        Laf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r0
        Lb1:
            return
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Dh.b(com.yandex.metrica.impl.ob.Qi):void");
    }

    public void a(Qi qi) {
        Eh eh = (Eh) this.b.b();
        this.m = eh.c;
        this.n = eh.d;
        this.o = eh.e;
        b(qi);
    }
}
