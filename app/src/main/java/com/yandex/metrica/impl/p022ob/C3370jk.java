package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.jk */
/* loaded from: classes2.dex */
class C3370jk extends AbstractC2910Rj {

    /* renamed from: a */
    private final TelephonyManager f23797a;

    /* renamed from: b */
    private PhoneStateListener f23798b;

    /* renamed from: c */
    private boolean f23799c;

    /* renamed from: d */
    private C2885Qi f23800d;

    /* renamed from: e */
    private C2978Uc f23801e;

    /* renamed from: f */
    private final C2816O<C2487Ak> f23802f;

    /* renamed from: g */
    private final C2816O<Collection<C3010Vj>> f23803g;

    /* renamed from: h */
    private final InterfaceExecutorC3607sn f23804h;

    /* renamed from: i */
    private final Context f23805i;

    /* renamed from: j */
    private final C3060Xj f23806j;

    /* renamed from: k */
    private final C3682vk f23807k;

    /* renamed from: l */
    private final C2935Sj f23808l;

    /* renamed from: m */
    private final C3416le f23809m;

    /* renamed from: n */
    private C3260fe f23810n;

    /* renamed from: o */
    private InterfaceC3448mk f23811o;

    /* renamed from: p */
    private final InterfaceC3286ge f23812p;

    /* renamed from: q */
    private final C2595F3 f23813q;

    /* renamed from: com.yandex.metrica.impl.ob.jk$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3370jk.this.f23798b = new d(C3370jk.this, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3370jk.this.f23799c) {
                return;
            }
            C3370jk.this.f23799c = true;
            if (C3370jk.this.f23798b == null || C3370jk.this.f23797a == null) {
                return;
            }
            try {
                C3370jk.this.f23797a.listen(C3370jk.this.f23798b, 256);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3370jk.this.f23799c) {
                C3370jk.this.f23799c = false;
                C3370jk.this.f23813q.m14058a(C3370jk.this);
                if (C3370jk.this.f23798b == null || C3370jk.this.f23797a == null) {
                    return;
                }
                try {
                    C3370jk.this.f23797a.listen(C3370jk.this.f23798b, 0);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$d */
    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C3370jk.m16196a(C3370jk.this, signalStrength);
        }

        public /* synthetic */ d(C3370jk c3370jk, a aVar) {
            this();
        }
    }

    public C3370jk(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, new C3416le(), interfaceExecutorC3607sn);
    }

    /* renamed from: e */
    public Context m16203e() {
        return this.f23805i;
    }

    /* renamed from: f */
    public TelephonyManager m16204f() {
        return this.f23797a;
    }

    /* renamed from: g */
    public synchronized C2487Ak m16205g() {
        C3010Vj c3010VjM13869b;
        try {
            if (this.f23802f.m14681b() || this.f23802f.m14683d()) {
                C2487Ak c2487Ak = new C2487Ak(this.f23806j, this.f23807k, this.f23808l);
                C3010Vj c3010VjM13869b2 = c2487Ak.m13869b();
                if (c3010VjM13869b2 != null && c3010VjM13869b2.m15343p() == null && !this.f23802f.m14681b() && (c3010VjM13869b = this.f23802f.m14678a().m13869b()) != null) {
                    c2487Ak.m13869b().m15328a(c3010VjM13869b.m15343p());
                }
                this.f23802f.m14680a(c2487Ak);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23802f.m14678a();
    }

    public C3370jk(Context context, C3416le c3416le, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, c3416le, new C3260fe(c3416le.m16387a()), interfaceExecutorC3607sn, C2968U2.m15243a(17) ? new C2960Tj() : new C2985Uj(), new C3118a2(), C2595F3.m14055a());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: b */
    public synchronized void mo15086b() {
        ((C3581rn) this.f23804h).execute(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m16201c() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.metrica.impl.ob.Uc r0 = r1.f23801e     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.f22450l     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3370jk.m16201c():boolean");
    }

    /* renamed from: d */
    public synchronized boolean m16202d() {
        C2885Qi c2885Qi;
        boolean z;
        synchronized (this) {
            c2885Qi = this.f23800d;
            z = false;
        }
        return z;
        if ((c2885Qi != null) && c2885Qi.m14880f().f24727t) {
            z = true;
        }
        return z;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public synchronized void mo15081a() {
        ((C3581rn) this.f23804h).execute(new b());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public synchronized void mo15082a(InterfaceC2512Bk interfaceC2512Bk) {
        if (interfaceC2512Bk != null) {
            interfaceC2512Bk.mo859a(m16205g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[Catch: all -> 0x0015, LOOP:0: B:34:0x0055->B:39:0x006c, LOOP_START, PHI: r5
  0x0055: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:33:0x0053, B:39:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0015, blocks: (B:5:0x0004, B:7:0x000c, B:51:0x0094, B:12:0x0018, B:14:0x0029, B:16:0x0033, B:25:0x0042, B:27:0x0045, B:32:0x004f, B:34:0x0055, B:36:0x005b, B:38:0x0069, B:39:0x006c, B:40:0x006f, B:41:0x0070, B:42:0x0071, B:44:0x0077, B:50:0x0091, B:47:0x0082, B:49:0x008c, B:17:0x0034, B:19:0x0039), top: B:64:0x0004, outer: #0, inners: #3 }] */
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo15084a(com.yandex.metrica.impl.p022ob.InterfaceC3035Wj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto La7
            monitor-enter(r8)     // Catch: java.lang.Throwable -> La1
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f23803g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.m14681b()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f23803g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.m14683d()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L94
            goto L18
        L15:
            r9 = move-exception
            goto La3
        L18:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f23803g     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.p022ob.C2968U2.m15243a(r2)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L71
            com.yandex.metrica.impl.ob.ge r2 = r8.f23812p     // Catch: java.lang.Throwable -> L15
            android.content.Context r5 = r8.f23805i     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.mo15433a(r5)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L71
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Uc r2 = r8.f23801e     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            if (r2 == 0) goto L41
            boolean r2 = r2.f22449k     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            r2 = r4
            goto L42
        L3f:
            r9 = move-exception
            goto L6f
        L41:
            r2 = r5
        L42:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L71
            android.telephony.TelephonyManager r2 = r8.f23797a     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L4e
            java.util.List r2 = r2.getAllCellInfo()     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            boolean r6 = com.yandex.metrica.impl.p022ob.C2968U2.m15249b(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L71
        L55:
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L15
            if (r5 >= r6) goto L71
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L15
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.mk r7 = r8.f23811o     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Vj r6 = r7.mo15199a(r6)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L6c
            r1.add(r6)     // Catch: java.lang.Throwable -> L15
        L6c:
            int r5 = r5 + 1
            goto L55
        L6f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
            throw r9     // Catch: java.lang.Throwable -> L15
        L71:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L15
            if (r2 >= r4) goto L8c
            com.yandex.metrica.impl.ob.Ak r1 = r8.m16205g()     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Vj r1 = r1.m13869b()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L82
            goto L91
        L82:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L15
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L15
        L8a:
            r3 = r1
            goto L91
        L8c:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L15
            goto L8a
        L91:
            r0.m14680a(r3)     // Catch: java.lang.Throwable -> L15
        L94:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f23803g     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.m14678a()     // Catch: java.lang.Throwable -> L15
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            r9.mo14775a(r0)     // Catch: java.lang.Throwable -> La1
            goto La7
        La1:
            r9 = move-exception
            goto La5
        La3:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            throw r9     // Catch: java.lang.Throwable -> La1
        La5:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            throw r9
        La7:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3370jk.mo15084a(com.yandex.metrica.impl.ob.Wj):void");
    }

    public C3370jk(Context context, C3416le c3416le, C3260fe c3260fe, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC3448mk interfaceC3448mk, C3118a2 c3118a2, C2595F3 c2595f3) {
        TelephonyManager telephonyManager;
        this.f23799c = false;
        C3392kg.c cVar = C2816O.f21831e;
        long j = cVar.f23980b;
        this.f23802f = new C2816O<>(j, j * 2);
        long j2 = cVar.f23980b;
        this.f23803g = new C2816O<>(j2, 2 * j2);
        this.f23805i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f23797a = telephonyManager;
        this.f23812p = m16195a(c3260fe, c3118a2);
        this.f23804h = interfaceExecutorC3607sn;
        ((C3581rn) interfaceExecutorC3607sn).execute(new a());
        this.f23806j = new C3060Xj(this, c3260fe);
        this.f23807k = new C3682vk(this, c3260fe);
        this.f23808l = new C2935Sj(this);
        this.f23809m = c3416le;
        this.f23810n = c3260fe;
        this.f23811o = interfaceC3448mk;
        this.f23813q = c2595f3;
    }

    /* renamed from: a */
    public static void m16196a(C3370jk c3370jk, SignalStrength signalStrength) {
        C3010Vj c3010VjM13869b;
        int evdoDbm;
        synchronized (c3370jk) {
            try {
                if (!c3370jk.f23802f.m14681b() && !c3370jk.f23802f.m14683d() && (c3010VjM13869b = c3370jk.f23802f.m14678a().m13869b()) != null) {
                    if (signalStrength.isGsm()) {
                        evdoDbm = 99 == signalStrength.getGsmSignalStrength() ? -1 : (r4 * 2) - 113;
                    } else {
                        int cdmaDbm = signalStrength.getCdmaDbm();
                        evdoDbm = signalStrength.getEvdoDbm();
                        if (-120 == evdoDbm) {
                            evdoDbm = cdmaDbm;
                        } else if (-120 != cdmaDbm) {
                            evdoDbm = Math.min(cdmaDbm, evdoDbm);
                        }
                    }
                    c3010VjM13869b.m15328a(Integer.valueOf(evdoDbm));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public void mo15083a(C2885Qi c2885Qi) {
        this.f23800d = c2885Qi;
        this.f23809m.m16388a(c2885Qi);
        this.f23810n.m15931a(this.f23809m.m16387a());
        this.f23811o.mo14954a(c2885Qi.m14880f());
        if (c2885Qi.m14878d() != null) {
            this.f23802f.m14679a(c2885Qi.m14878d().f24510a, c2885Qi.m14878d().f24510a * 2);
            this.f23803g.m14679a(c2885Qi.m14878d().f24510a, c2885Qi.m14878d().f24510a * 2);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3003Vc
    /* renamed from: a */
    public synchronized void mo15306a(C2978Uc c2978Uc) {
        this.f23801e = c2978Uc;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public void mo15085a(boolean z) {
        this.f23809m.m16389a(z);
        this.f23810n.m15931a(this.f23809m.m16387a());
    }

    /* renamed from: a */
    private static InterfaceC3286ge m16195a(C3260fe c3260fe, C3118a2 c3118a2) {
        if (C2968U2.m15243a(29)) {
            return c3118a2.m15597c(c3260fe);
        }
        return c3118a2.m15596b(c3260fe);
    }
}
