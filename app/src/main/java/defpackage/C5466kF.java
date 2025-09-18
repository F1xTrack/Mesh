package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: kF */
/* loaded from: classes.dex */
public final class C5466kF implements LL {
    public final List a;
    public final HQ b;
    public final C0999Mo1 c;
    public final QQ0 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final C6940rz h;
    public final C3547eG i;
    public final NB0 j;
    public final C1857Xo1 k;
    public final UUID l;
    public final Looper m;
    public final F3 n;
    public int o;
    public int p;
    public HandlerThread q;
    public HandlerC4308iF r;
    public InterfaceC5836mB s;
    public KL t;
    public byte[] u;
    public byte[] v;
    public EQ w;
    public GQ x;

    public C5466kF(UUID uuid, HQ hq, C0999Mo1 c0999Mo1, QQ0 qq0, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C1857Xo1 c1857Xo1, Looper looper, C3547eG c3547eG, NB0 nb0) {
        this.l = uuid;
        this.c = c0999Mo1;
        this.d = qq0;
        this.b = hq;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = c1857Xo1;
        this.h = new C6940rz();
        this.i = c3547eG;
        this.j = nb0;
        this.o = 2;
        this.m = looper;
        this.n = new F3(this, looper, 2);
    }

    @Override // defpackage.LL
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // defpackage.LL
    public final boolean b() {
        o();
        return this.e;
    }

    @Override // defpackage.LL
    public final KL c() {
        o();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.LL
    public final void d(OL ol) {
        o();
        int i = this.p;
        if (i <= 0) {
            AbstractC6789rA1.d("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            F3 f3 = this.n;
            int i3 = AbstractC0277Dh1.a;
            f3.removeCallbacksAndMessages(null);
            HandlerC4308iF handlerC4308iF = this.r;
            synchronized (handlerC4308iF) {
                handlerC4308iF.removeCallbacksAndMessages(null);
                handlerC4308iF.a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.o(bArr);
                this.u = null;
            }
        }
        if (ol != null) {
            this.h.d(ol);
            if (this.h.b(ol) == 0) {
                ol.e();
            }
        }
        QQ0 qq0 = this.d;
        int i4 = this.p;
        C6039nF c6039nF = (C6039nF) qq0.a;
        if (i4 == 1 && c6039nF.o > 0 && c6039nF.k != -9223372036854775807L) {
            c6039nF.n.add(this);
            Handler handler = c6039nF.t;
            handler.getClass();
            handler.postAtTime(new DE(2, this), this, SystemClock.uptimeMillis() + c6039nF.k);
        } else if (i4 == 0) {
            c6039nF.l.remove(this);
            if (c6039nF.q == this) {
                c6039nF.q = null;
            }
            if (c6039nF.r == this) {
                c6039nF.r = null;
            }
            C0999Mo1 c0999Mo1 = c6039nF.h;
            HashSet hashSet = (HashSet) c0999Mo1.a;
            hashSet.remove(this);
            if (((C5466kF) c0999Mo1.b) == this) {
                c0999Mo1.b = null;
                if (!hashSet.isEmpty()) {
                    C5466kF c5466kF = (C5466kF) hashSet.iterator().next();
                    c0999Mo1.b = c5466kF;
                    GQ gqH = c5466kF.b.h();
                    c5466kF.x = gqH;
                    HandlerC4308iF handlerC4308iF2 = c5466kF.r;
                    int i5 = AbstractC0277Dh1.a;
                    gqH.getClass();
                    handlerC4308iF2.getClass();
                    handlerC4308iF2.obtainMessage(1, new C5275jF(C4020gk0.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), gqH)).sendToTarget();
                }
            }
            if (c6039nF.k != -9223372036854775807L) {
                Handler handler2 = c6039nF.t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c6039nF.n.remove(this);
            }
        }
        c6039nF.k();
    }

    @Override // defpackage.LL
    public final void e(OL ol) {
        o();
        if (this.p < 0) {
            AbstractC6789rA1.d("Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (ol != null) {
            C6940rz c6940rz = this.h;
            synchronized (c6940rz.a) {
                try {
                    ArrayList arrayList = new ArrayList(c6940rz.d);
                    arrayList.add(ol);
                    c6940rz.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c6940rz.b.get(ol);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c6940rz.c);
                        hashSet.add(ol);
                        c6940rz.c = Collections.unmodifiableSet(hashSet);
                    }
                    c6940rz.b.put(ol, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            YN1.f(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new HandlerC4308iF(this, this.q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (ol != null && j() && this.h.b(ol) == 1) {
            ol.c(this.o);
        }
        C6039nF c6039nF = (C6039nF) this.d.a;
        if (c6039nF.k != -9223372036854775807L) {
            c6039nF.n.remove(this);
            Handler handler = c6039nF.t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.LL
    public final boolean f(String str) {
        o();
        byte[] bArr = this.u;
        YN1.h(bArr);
        return this.b.y(str, bArr);
    }

    @Override // defpackage.LL
    public final InterfaceC5836mB g() {
        o();
        return this.s;
    }

    @Override // defpackage.LL
    public final int getState() {
        o();
        return this.o;
    }

    public final void h(C6799rE c6799rE) {
        Set set;
        C6940rz c6940rz = this.h;
        synchronized (c6940rz.a) {
            set = c6940rz.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OL) it.next()).a();
        }
    }

    public final void i(boolean z) {
        long jMin;
        String str;
        Set set;
        boolean z2 = true;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        int i = AbstractC0277Dh1.a;
        if (this.v == null) {
            n(1, bArr, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.n(this.u, this.v);
            } catch (Exception | NoSuchMethodError e) {
                k(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (AbstractC1063Nk.d.equals(this.l)) {
            o();
            byte[] bArr2 = this.u;
            Pair pair = null;
            Map mapB = bArr2 == null ? null : this.b.b(bArr2);
            if (mapB != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapB.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str2 = (String) mapB.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            AbstractC6789rA1.c("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            n(2, bArr, z);
            return;
        }
        if (jMin <= 0) {
            k(2, new C7457ug0());
            return;
        }
        this.o = 4;
        C6940rz c6940rz = this.h;
        synchronized (c6940rz.a) {
            set = c6940rz.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OL) it.next()).b();
        }
    }

    public final boolean j() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            KL r0 = new KL
            int r1 = defpackage.AbstractC0277Dh1.a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = defpackage.TL.a(r7)
            if (r2 == 0) goto L14
            int r6 = defpackage.TL.b(r7)
            goto L5f
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r1 = defpackage.UL.a(r7)
            if (r1 == 0) goto L22
        L20:
            r6 = r4
            goto L5f
        L22:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r2 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L57
            boolean r1 = defpackage.AbstractC3498e02.c(r7)
            if (r1 == 0) goto L2f
            goto L57
        L2f:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L36
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5f
        L36:
            boolean r1 = r7 instanceof defpackage.C1443Sg1
            if (r1 == 0) goto L3d
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5f
        L3d:
            boolean r1 = r7 instanceof defpackage.C5657lF
            if (r1 == 0) goto L44
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5f
        L44:
            boolean r1 = r7 instanceof defpackage.C7457ug0
            if (r1 == 0) goto L4b
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5f
        L4b:
            if (r6 != r3) goto L4e
            goto L20
        L4e:
            r1 = 2
            if (r6 != r1) goto L54
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5f
        L54:
            r1 = 3
            if (r6 != r1) goto L59
        L57:
            r6 = r2
            goto L5f
        L59:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L5f:
            r0.<init>(r6, r7)
            r5.t = r0
            java.lang.String r6 = "DRM session error"
            defpackage.AbstractC6789rA1.e(r6, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L8f
            rz r6 = r5.h
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.Set r6 = r6.c     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r6 = r6.iterator()
        L79:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r6.next()
            OL r0 = (defpackage.OL) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L79
        L8c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r6
        L8f:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto Lab
            boolean r6 = defpackage.AbstractC3498e02.d(r7)
            if (r6 != 0) goto La3
            boolean r6 = defpackage.AbstractC3498e02.c(r7)
            if (r6 == 0) goto La0
            goto La3
        La0:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La3:
            int r6 = r5.o
            r7 = 4
            if (r6 == r7) goto Laa
            r5.o = r3
        Laa:
            return
        Lab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5466kF.k(int, java.lang.Throwable):void");
    }

    public final void l(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || AbstractC3498e02.c(th)) {
            this.c.x(this);
        } else {
            k(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r4 = this;
            boolean r0 = r4.j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            HQ r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.m()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            HQ r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            NB0 r3 = r4.j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.w(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            HQ r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            mB r0 = r0.l(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            rz r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            OL r3 = (defpackage.OL) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = defpackage.AbstractC3498e02.c(r0)
            if (r2 == 0) goto L59
            Mo1 r0 = r4.c
            r0.x(r4)
            goto L62
        L59:
            r4.k(r1, r0)
            goto L62
        L5d:
            Mo1 r0 = r4.c
            r0.x(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5466kF.m():boolean");
    }

    public final void n(int i, byte[] bArr, boolean z) {
        try {
            EQ eqS = this.b.s(bArr, this.a, i, this.g);
            this.w = eqS;
            HandlerC4308iF handlerC4308iF = this.r;
            int i2 = AbstractC0277Dh1.a;
            eqS.getClass();
            handlerC4308iF.getClass();
            handlerC4308iF.obtainMessage(2, new C5275jF(C4020gk0.b.getAndIncrement(), z, SystemClock.elapsedRealtime(), eqS)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC6789rA1.i("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
