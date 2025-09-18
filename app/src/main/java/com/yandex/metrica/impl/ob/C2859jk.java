package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.impl.ob.C2880kg;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.jk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2859jk extends Rj {
    private final TelephonyManager a;
    private PhoneStateListener b;
    private boolean c;
    private Qi d;
    private Uc e;
    private final O<Ak> f;
    private final O<Collection<Vj>> g;
    private final InterfaceExecutorC3086sn h;
    private final Context i;
    private final Xj j;
    private final C3163vk k;
    private final Sj l;
    private final C2903le m;
    private C2754fe n;
    private InterfaceC2934mk o;
    private final InterfaceC2779ge p;
    private final F3 q;

    /* renamed from: com.yandex.metrica.impl.ob.jk$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2859jk.this.b = new d(C2859jk.this, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2859jk.this.c) {
                return;
            }
            C2859jk.this.c = true;
            if (C2859jk.this.b == null || C2859jk.this.a == null) {
                return;
            }
            try {
                C2859jk.this.a.listen(C2859jk.this.b, 256);
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
            if (C2859jk.this.c) {
                C2859jk.this.c = false;
                C2859jk.this.q.a(C2859jk.this);
                if (C2859jk.this.b == null || C2859jk.this.a == null) {
                    return;
                }
                try {
                    C2859jk.this.a.listen(C2859jk.this.b, 0);
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
            C2859jk.a(C2859jk.this, signalStrength);
        }

        public /* synthetic */ d(C2859jk c2859jk, a aVar) {
            this();
        }
    }

    public C2859jk(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, new C2903le(), interfaceExecutorC3086sn);
    }

    public Context e() {
        return this.i;
    }

    public TelephonyManager f() {
        return this.a;
    }

    public synchronized Ak g() {
        Vj vjB;
        try {
            if (this.f.b() || this.f.d()) {
                Ak ak = new Ak(this.j, this.k, this.l);
                Vj vjB2 = ak.b();
                if (vjB2 != null && vjB2.p() == null && !this.f.b() && (vjB = this.f.a().b()) != null) {
                    ak.b().a(vjB.p());
                }
                this.f.a(ak);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f.a();
    }

    public C2859jk(Context context, C2903le c2903le, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, c2903le, new C2754fe(c2903le.a()), interfaceExecutorC3086sn, U2.a(17) ? new Tj() : new Uj(), new C2617a2(), F3.a());
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void b() {
        ((C3061rn) this.h).execute(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean c() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.metrica.impl.ob.Uc r0 = r1.e     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.l     // Catch: java.lang.Throwable -> Lb
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2859jk.c():boolean");
    }

    public synchronized boolean d() {
        Qi qi;
        boolean z;
        synchronized (this) {
            qi = this.d;
            z = false;
        }
        return z;
        if ((qi != null) && qi.f().t) {
            z = true;
        }
        return z;
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a() {
        ((C3061rn) this.h).execute(new b());
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Bk bk) {
        if (bk != null) {
            bk.a(g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[Catch: all -> 0x0015, LOOP:0: B:34:0x0055->B:39:0x006c, LOOP_START, PHI: r5
  0x0055: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:33:0x0053, B:39:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0015, blocks: (B:5:0x0004, B:7:0x000c, B:51:0x0094, B:12:0x0018, B:14:0x0029, B:16:0x0033, B:25:0x0042, B:27:0x0045, B:32:0x004f, B:34:0x0055, B:36:0x005b, B:38:0x0069, B:39:0x006c, B:40:0x006f, B:41:0x0070, B:42:0x0071, B:44:0x0077, B:50:0x0091, B:47:0x0082, B:49:0x008c, B:17:0x0034, B:19:0x0039), top: B:64:0x0004, outer: #0, inners: #3 }] */
    @Override // com.yandex.metrica.impl.ob.Rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(com.yandex.metrica.impl.ob.Wj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto La7
            monitor-enter(r8)     // Catch: java.lang.Throwable -> La1
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L94
            goto L18
        L15:
            r9 = move-exception
            goto La3
        L18:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.g     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.ob.U2.a(r2)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L71
            com.yandex.metrica.impl.ob.ge r2 = r8.p     // Catch: java.lang.Throwable -> L15
            android.content.Context r5 = r8.i     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L71
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Uc r2 = r8.e     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            if (r2 == 0) goto L41
            boolean r2 = r2.k     // Catch: java.lang.Throwable -> L3f
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
            android.telephony.TelephonyManager r2 = r8.a     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L4e
            java.util.List r2 = r2.getAllCellInfo()     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            boolean r6 = com.yandex.metrica.impl.ob.U2.b(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L71
        L55:
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L15
            if (r5 >= r6) goto L71
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L15
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.mk r7 = r8.o     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Vj r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L15
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
            com.yandex.metrica.impl.ob.Ak r1 = r8.g()     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Vj r1 = r1.b()     // Catch: java.lang.Throwable -> L15
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
            r0.a(r3)     // Catch: java.lang.Throwable -> L15
        L94:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.g     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L15
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            r9.a(r0)     // Catch: java.lang.Throwable -> La1
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2859jk.a(com.yandex.metrica.impl.ob.Wj):void");
    }

    public C2859jk(Context context, C2903le c2903le, C2754fe c2754fe, InterfaceExecutorC3086sn interfaceExecutorC3086sn, InterfaceC2934mk interfaceC2934mk, C2617a2 c2617a2, F3 f3) {
        TelephonyManager telephonyManager;
        this.c = false;
        C2880kg.c cVar = O.e;
        long j = cVar.b;
        this.f = new O<>(j, j * 2);
        long j2 = cVar.b;
        this.g = new O<>(j2, 2 * j2);
        this.i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.a = telephonyManager;
        this.p = a(c2754fe, c2617a2);
        this.h = interfaceExecutorC3086sn;
        ((C3061rn) interfaceExecutorC3086sn).execute(new a());
        this.j = new Xj(this, c2754fe);
        this.k = new C3163vk(this, c2754fe);
        this.l = new Sj(this);
        this.m = c2903le;
        this.n = c2754fe;
        this.o = interfaceC2934mk;
        this.q = f3;
    }

    public static void a(C2859jk c2859jk, SignalStrength signalStrength) {
        Vj vjB;
        int evdoDbm;
        synchronized (c2859jk) {
            try {
                if (!c2859jk.f.b() && !c2859jk.f.d() && (vjB = c2859jk.f.a().b()) != null) {
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
                    vjB.a(Integer.valueOf(evdoDbm));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(Qi qi) {
        this.d = qi;
        this.m.a(qi);
        this.n.a(this.m.a());
        this.o.a(qi.f());
        if (qi.d() != null) {
            this.f.a(qi.d().a, qi.d().a * 2);
            this.g.a(qi.d().a, qi.d().a * 2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.Vc
    public synchronized void a(Uc uc) {
        this.e = uc;
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(boolean z) {
        this.m.a(z);
        this.n.a(this.m.a());
    }

    private static InterfaceC2779ge a(C2754fe c2754fe, C2617a2 c2617a2) {
        if (U2.a(29)) {
            return c2617a2.c(c2754fe);
        }
        return c2617a2.b(c2754fe);
    }
}
