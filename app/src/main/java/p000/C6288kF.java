package p000;

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
public final class C6288kF implements InterfaceC0715LL {

    /* renamed from: a */
    public final List f36370a;

    /* renamed from: b */
    public final InterfaceC0468HQ f36371b;

    /* renamed from: c */
    public final C7967Mo1 f36372c;

    /* renamed from: d */
    public final QQ0 f36373d;

    /* renamed from: e */
    public final boolean f36374e;

    /* renamed from: f */
    public final boolean f36375f;

    /* renamed from: g */
    public final HashMap f36376g;

    /* renamed from: h */
    public final C6794rz f36377h;

    /* renamed from: i */
    public final C3979eG f36378i;

    /* renamed from: j */
    public final NB0 f36379j;

    /* renamed from: k */
    public final C8539Xo1 f36380k;

    /* renamed from: l */
    public final UUID f36381l;

    /* renamed from: m */
    public final Looper f36382m;

    /* renamed from: n */
    public final HandlerC0319F3 f36383n;

    /* renamed from: o */
    public int f36384o;

    /* renamed from: p */
    public int f36385p;

    /* renamed from: q */
    public HandlerThread f36386q;

    /* renamed from: r */
    public HandlerC4230iF f36387r;

    /* renamed from: s */
    public InterfaceC6410mB f36388s;

    /* renamed from: t */
    public C0652KL f36389t;

    /* renamed from: u */
    public byte[] f36390u;

    /* renamed from: v */
    public byte[] f36391v;

    /* renamed from: w */
    public C0279EQ f36392w;

    /* renamed from: x */
    public C0405GQ f36393x;

    public C6288kF(UUID uuid, InterfaceC0468HQ interfaceC0468HQ, C7967Mo1 c7967Mo1, QQ0 qq0, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C8539Xo1 c8539Xo1, Looper looper, C3979eG c3979eG, NB0 nb0) {
        this.f36381l = uuid;
        this.f36372c = c7967Mo1;
        this.f36373d = qq0;
        this.f36371b = interfaceC0468HQ;
        this.f36374e = z;
        this.f36375f = z2;
        if (bArr != null) {
            this.f36391v = bArr;
            this.f36370a = null;
        } else {
            list.getClass();
            this.f36370a = Collections.unmodifiableList(list);
        }
        this.f36376g = map;
        this.f36380k = c8539Xo1;
        this.f36377h = new C6794rz();
        this.f36378i = c3979eG;
        this.f36379j = nb0;
        this.f36384o = 2;
        this.f36382m = looper;
        this.f36383n = new HandlerC0319F3(this, looper, 2);
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: a */
    public final UUID mo4948a() {
        m22181o();
        return this.f36381l;
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: b */
    public final boolean mo4949b() {
        m22181o();
        return this.f36374e;
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: c */
    public final C0652KL mo4950c() {
        m22181o();
        if (this.f36384o == 1) {
            return this.f36389t;
        }
        return null;
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: d */
    public final void mo4951d(C0903OL c0903ol) {
        m22181o();
        int i = this.f36385p;
        if (i <= 0) {
            AbstractC10872rA1.m24171d("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f36385p = i2;
        if (i2 == 0) {
            this.f36384o = 0;
            HandlerC0319F3 handlerC0319F3 = this.f36383n;
            int i3 = AbstractC7485Dh1.f2166a;
            handlerC0319F3.removeCallbacksAndMessages(null);
            HandlerC4230iF handlerC4230iF = this.f36387r;
            synchronized (handlerC4230iF) {
                handlerC4230iF.removeCallbacksAndMessages(null);
                handlerC4230iF.f28977a = true;
            }
            this.f36387r = null;
            this.f36386q.quit();
            this.f36386q = null;
            this.f36388s = null;
            this.f36389t = null;
            this.f36392w = null;
            this.f36393x = null;
            byte[] bArr = this.f36390u;
            if (bArr != null) {
                this.f36371b.mo3417o(bArr);
                this.f36390u = null;
            }
        }
        if (c0903ol != null) {
            this.f36377h.m24565d(c0903ol);
            if (this.f36377h.m24564b(c0903ol) == 0) {
                c0903ol.m6019e();
            }
        }
        QQ0 qq0 = this.f36373d;
        int i4 = this.f36385p;
        C6477nF c6477nF = (C6477nF) qq0.f9619a;
        if (i4 == 1 && c6477nF.f38206o > 0 && c6477nF.f38202k != -9223372036854775807L) {
            c6477nF.f38205n.add(this);
            Handler handler = c6477nF.f38211t;
            handler.getClass();
            handler.postAtTime(new RunnableC0204DE(2, this), this, SystemClock.uptimeMillis() + c6477nF.f38202k);
        } else if (i4 == 0) {
            c6477nF.f38203l.remove(this);
            if (c6477nF.f38208q == this) {
                c6477nF.f38208q = null;
            }
            if (c6477nF.f38209r == this) {
                c6477nF.f38209r = null;
            }
            C7967Mo1 c7967Mo1 = c6477nF.f38199h;
            HashSet hashSet = (HashSet) c7967Mo1.f7362a;
            hashSet.remove(this);
            if (((C6288kF) c7967Mo1.f7363b) == this) {
                c7967Mo1.f7363b = null;
                if (!hashSet.isEmpty()) {
                    C6288kF c6288kF = (C6288kF) hashSet.iterator().next();
                    c7967Mo1.f7363b = c6288kF;
                    C0405GQ c0405gqMo3412h = c6288kF.f36371b.mo3412h();
                    c6288kF.f36393x = c0405gqMo3412h;
                    HandlerC4230iF handlerC4230iF2 = c6288kF.f36387r;
                    int i5 = AbstractC7485Dh1.f2166a;
                    c0405gqMo3412h.getClass();
                    handlerC4230iF2.getClass();
                    handlerC4230iF2.obtainMessage(1, new C6225jF(C9535gk0.f27975b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c0405gqMo3412h)).sendToTarget();
                }
            }
            if (c6477nF.f38202k != -9223372036854775807L) {
                Handler handler2 = c6477nF.f38211t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c6477nF.f38205n.remove(this);
            }
        }
        c6477nF.m23109k();
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: e */
    public final void mo4952e(C0903OL c0903ol) {
        m22181o();
        if (this.f36385p < 0) {
            AbstractC10872rA1.m24171d("Session reference count less than zero: " + this.f36385p);
            this.f36385p = 0;
        }
        if (c0903ol != null) {
            C6794rz c6794rz = this.f36377h;
            synchronized (c6794rz.f42179a) {
                try {
                    ArrayList arrayList = new ArrayList(c6794rz.f42182d);
                    arrayList.add(c0903ol);
                    c6794rz.f42182d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c6794rz.f42180b.get(c0903ol);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c6794rz.f42181c);
                        hashSet.add(c0903ol);
                        c6794rz.f42181c = Collections.unmodifiableSet(hashSet);
                    }
                    c6794rz.f42180b.put(c0903ol, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.f36385p + 1;
        this.f36385p = i;
        if (i == 1) {
            YN1.m9281f(this.f36384o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f36386q = handlerThread;
            handlerThread.start();
            this.f36387r = new HandlerC4230iF(this, this.f36386q.getLooper());
            if (m22179m()) {
                m22175i(true);
            }
        } else if (c0903ol != null && m22176j() && this.f36377h.m24564b(c0903ol) == 1) {
            c0903ol.m6017c(this.f36384o);
        }
        C6477nF c6477nF = (C6477nF) this.f36373d.f9619a;
        if (c6477nF.f38202k != -9223372036854775807L) {
            c6477nF.f38205n.remove(this);
            Handler handler = c6477nF.f38211t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: f */
    public final boolean mo4953f(String str) {
        m22181o();
        byte[] bArr = this.f36390u;
        YN1.m9283h(bArr);
        return this.f36371b.mo3423y(str, bArr);
    }

    @Override // p000.InterfaceC0715LL
    /* renamed from: g */
    public final InterfaceC6410mB mo4954g() {
        m22181o();
        return this.f36388s;
    }

    @Override // p000.InterfaceC0715LL
    public final int getState() {
        m22181o();
        return this.f36384o;
    }

    /* renamed from: h */
    public final void m22174h(C6730rE c6730rE) {
        Set set;
        C6794rz c6794rz = this.f36377h;
        synchronized (c6794rz.f42179a) {
            set = c6794rz.f42181c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0903OL) it.next()).m6015a();
        }
    }

    /* renamed from: i */
    public final void m22175i(boolean z) {
        long jMin;
        String str;
        Set set;
        boolean z2 = true;
        if (this.f36375f) {
            return;
        }
        byte[] bArr = this.f36390u;
        int i = AbstractC7485Dh1.f2166a;
        if (this.f36391v == null) {
            m22180n(1, bArr, z);
            return;
        }
        if (this.f36384o != 4) {
            try {
                this.f36371b.mo3416n(this.f36390u, this.f36391v);
            } catch (Exception | NoSuchMethodError e) {
                m22177k(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (AbstractC0865Nk.f7980d.equals(this.f36381l)) {
            m22181o();
            byte[] bArr2 = this.f36390u;
            Pair pair = null;
            Map mapMo3411b = bArr2 == null ? null : this.f36371b.mo3411b(bArr2);
            if (mapMo3411b != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapMo3411b.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str2 = (String) mapMo3411b.get("PlaybackDurationRemaining");
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
            AbstractC10872rA1.m24170c("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m22180n(2, bArr, z);
            return;
        }
        if (jMin <= 0) {
            m22177k(2, new C11319ug0());
            return;
        }
        this.f36384o = 4;
        C6794rz c6794rz = this.f36377h;
        synchronized (c6794rz.f42179a) {
            set = c6794rz.f42181c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0903OL) it.next()).m6016b();
        }
    }

    /* renamed from: j */
    public final boolean m22176j() {
        int i = this.f36384o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0020  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22177k(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            KL r0 = new KL
            int r1 = p000.AbstractC7485Dh1.f2166a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = p000.AbstractC1217TL.m7685a(r7)
            if (r2 == 0) goto L14
            int r6 = p000.AbstractC1217TL.m7686b(r7)
            goto L5f
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r1 = p000.AbstractC1280UL.m7986a(r7)
            if (r1 == 0) goto L22
        L20:
            r6 = r4
            goto L5f
        L22:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r2 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L57
            boolean r1 = p000.AbstractC9185e02.m17814c(r7)
            if (r1 == 0) goto L2f
            goto L57
        L2f:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L36
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5f
        L36:
            boolean r1 = r7 instanceof p000.C8263Sg1
            if (r1 == 0) goto L3d
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5f
        L3d:
            boolean r1 = r7 instanceof p000.C6351lF
            if (r1 == 0) goto L44
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5f
        L44:
            boolean r1 = r7 instanceof p000.C11319ug0
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
            r5.f36389t = r0
            java.lang.String r6 = "DRM session error"
            p000.AbstractC10872rA1.m24172e(r6, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L8f
            rz r6 = r5.f36377h
            java.lang.Object r0 = r6.f42179a
            monitor-enter(r0)
            java.util.Set r6 = r6.f42181c     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r6 = r6.iterator()
        L79:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r6.next()
            OL r0 = (p000.C0903OL) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.m6018d(r1)
            goto L79
        L8c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r6
        L8f:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto Lab
            boolean r6 = p000.AbstractC9185e02.m17815d(r7)
            if (r6 != 0) goto La3
            boolean r6 = p000.AbstractC9185e02.m17814c(r7)
            if (r6 == 0) goto La0
            goto La3
        La0:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La3:
            int r6 = r5.f36384o
            r7 = 4
            if (r6 == r7) goto Laa
            r5.f36384o = r3
        Laa:
            return
        Lab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6288kF.m22177k(int, java.lang.Throwable):void");
    }

    /* renamed from: l */
    public final void m22178l(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || AbstractC9185e02.m17814c(th)) {
            this.f36372c.m5455x(this);
        } else {
            m22177k(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0059  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22179m() {
        /*
            r4 = this;
            boolean r0 = r4.m22176j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            HQ r0 = r4.f36371b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.mo3415m()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f36390u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            HQ r2 = r4.f36371b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            NB0 r3 = r4.f36379j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.mo3422w(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            HQ r0 = r4.f36371b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f36390u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            mB r0 = r0.mo3414l(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f36388s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f36384o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            rz r2 = r4.f36377h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f42179a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f42181c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            OL r3 = (p000.C0903OL) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.m6017c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f36390u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
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
            boolean r2 = p000.AbstractC9185e02.m17814c(r0)
            if (r2 == 0) goto L59
            Mo1 r0 = r4.f36372c
            r0.m5455x(r4)
            goto L62
        L59:
            r4.m22177k(r1, r0)
            goto L62
        L5d:
            Mo1 r0 = r4.f36372c
            r0.m5455x(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6288kF.m22179m():boolean");
    }

    /* renamed from: n */
    public final void m22180n(int i, byte[] bArr, boolean z) {
        try {
            C0279EQ c0279eqMo3420s = this.f36371b.mo3420s(bArr, this.f36370a, i, this.f36376g);
            this.f36392w = c0279eqMo3420s;
            HandlerC4230iF handlerC4230iF = this.f36387r;
            int i2 = AbstractC7485Dh1.f2166a;
            c0279eqMo3420s.getClass();
            handlerC4230iF.getClass();
            handlerC4230iF.obtainMessage(2, new C6225jF(C9535gk0.f27975b.getAndIncrement(), z, SystemClock.elapsedRealtime(), c0279eqMo3420s)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m22178l(e, true);
        }
    }

    /* renamed from: o */
    public final void m22181o() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f36382m;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC10872rA1.m24176i("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
