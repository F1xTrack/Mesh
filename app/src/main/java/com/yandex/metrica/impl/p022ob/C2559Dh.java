package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3687w;
import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;

/* renamed from: com.yandex.metrica.impl.ob.Dh */
/* loaded from: classes2.dex */
public class C2559Dh {

    /* renamed from: a */
    private final C3783zh f21032a;

    /* renamed from: b */
    private final C2876Q9 f21033b;

    /* renamed from: c */
    private final C2893R2 f21034c;

    /* renamed from: d */
    private final InterfaceExecutorC3607sn f21035d;

    /* renamed from: e */
    private final C3687w.c f21036e;

    /* renamed from: f */
    private final C3687w f21037f;

    /* renamed from: g */
    private final C3757yh f21038g;

    /* renamed from: h */
    private boolean f21039h;

    /* renamed from: i */
    private C2560Di f21040i;

    /* renamed from: j */
    private boolean f21041j;

    /* renamed from: k */
    private long f21042k;

    /* renamed from: l */
    private long f21043l;

    /* renamed from: m */
    private long f21044m;

    /* renamed from: n */
    private boolean f21045n;

    /* renamed from: o */
    private boolean f21046o;

    /* renamed from: p */
    private boolean f21047p;

    /* renamed from: q */
    private final Object f21048q;

    public C2559Dh(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(new C3783zh(context, null, interfaceExecutorC3607sn), InterfaceC2777Ma.b.m14608a(C2584Eh.class).mo14606a(context), new C2893R2(), interfaceExecutorC3607sn, C2842P0.m14728i().m14729a());
    }

    /* renamed from: a */
    public void m14007a() {
        if (this.f21039h) {
            return;
        }
        this.f21039h = true;
        if (!this.f21047p) {
            this.f21037f.m17102a(this.f21040i.f21051c, this.f21035d, this.f21036e);
        } else {
            this.f21032a.m17336a(this.f21038g);
        }
    }

    /* renamed from: b */
    public void m14009b() {
        C2584Eh c2584Eh = (C2584Eh) this.f21033b.m14814b();
        this.f21044m = c2584Eh.f21119c;
        this.f21045n = c2584Eh.f21120d;
        this.f21046o = c2584Eh.f21121e;
    }

    public C2559Dh(C3783zh c3783zh, C2876Q9 c2876q9, C2893R2 c2893r2, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3687w c3687w) {
        this.f21047p = false;
        this.f21048q = new Object();
        this.f21032a = c3783zh;
        this.f21033b = c2876q9;
        this.f21038g = new C3757yh(c2876q9, new C2509Bh(this));
        this.f21034c = c2893r2;
        this.f21035d = interfaceExecutorC3607sn;
        this.f21036e = new C2534Ch(this);
        this.f21037f = c3687w;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x003b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m14010b(com.yandex.metrica.impl.p022ob.C2885Qi r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            goto L3b
        L3:
            boolean r0 = r8.f21041j
            r1 = 1
            if (r0 != 0) goto L10
            com.yandex.metrica.impl.ob.si r0 = r9.m14880f()
            boolean r0 = r0.f24712e
            if (r0 == r1) goto L3c
        L10:
            com.yandex.metrica.impl.ob.Di r0 = r8.f21040i
            if (r0 == 0) goto L3c
            com.yandex.metrica.impl.ob.Di r2 = r9.m14862K()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3c
            long r2 = r8.f21042k
            long r4 = r9.m14853B()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r2 = r8.f21043l
            long r4 = r9.m14890p()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            com.yandex.metrica.impl.ob.zh r0 = r8.f21032a
            boolean r0 = r0.m17337b(r9)
            if (r0 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            java.lang.Object r0 = r8.f21048q
            monitor-enter(r0)
            if (r9 == 0) goto L5e
            com.yandex.metrica.impl.ob.si r2 = r9.m14880f()     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.f24712e     // Catch: java.lang.Throwable -> L5c
            r8.f21041j = r2     // Catch: java.lang.Throwable -> L5c
            com.yandex.metrica.impl.ob.Di r2 = r9.m14862K()     // Catch: java.lang.Throwable -> L5c
            r8.f21040i = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.m14853B()     // Catch: java.lang.Throwable -> L5c
            r8.f21042k = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.m14890p()     // Catch: java.lang.Throwable -> L5c
            r8.f21043l = r2     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto Lb2
        L5e:
            com.yandex.metrica.impl.ob.zh r2 = r8.f21032a     // Catch: java.lang.Throwable -> L5c
            r2.m17335a(r9)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lb1
            java.lang.Object r9 = r8.f21048q
            monitor-enter(r9)
            boolean r0 = r8.f21041j     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            com.yandex.metrica.impl.ob.Di r0 = r8.f21040i     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            boolean r1 = r8.f21045n     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L9f
            boolean r1 = r8.f21046o     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8d
            com.yandex.metrica.impl.ob.R2 r2 = r8.f21034c     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.f21044m     // Catch: java.lang.Throwable -> L8b
            long r5 = r0.f21052d     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = "should retry sdk collecting"
            boolean r0 = r2.m14969a(r3, r5, r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.m14007a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L8b:
            r0 = move-exception
            goto Laf
        L8d:
            com.yandex.metrica.impl.ob.R2 r1 = r8.f21034c     // Catch: java.lang.Throwable -> L8b
            long r2 = r8.f21044m     // Catch: java.lang.Throwable -> L8b
            long r4 = r0.f21049a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "should collect sdk as usual"
            boolean r0 = r1.m14969a(r2, r4, r6)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.m14007a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L9f:
            long r1 = r8.f21042k     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.f21043l     // Catch: java.lang.Throwable -> L8b
            long r1 = r1 - r3
            long r3 = r0.f21050b     // Catch: java.lang.Throwable -> L8b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Lad
            r8.m14007a()     // Catch: java.lang.Throwable -> L8b
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2559Dh.m14010b(com.yandex.metrica.impl.ob.Qi):void");
    }

    /* renamed from: a */
    public void m14008a(C2885Qi c2885Qi) {
        C2584Eh c2584Eh = (C2584Eh) this.f21033b.m14814b();
        this.f21044m = c2584Eh.f21119c;
        this.f21045n = c2584Eh.f21120d;
        this.f21046o = c2584Eh.f21121e;
        m14010b(c2885Qi);
    }
}
