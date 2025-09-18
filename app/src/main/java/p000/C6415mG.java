package p000;

import java.util.Iterator;

/* renamed from: mG */
/* loaded from: classes.dex */
public final class C6415mG implements InterfaceC7552Ep0 {

    /* renamed from: a */
    public final C6289kG f37600a;

    /* renamed from: b */
    public InterfaceC1397WC f37601b;

    /* renamed from: c */
    public C7408Bv0 f37602c;

    /* renamed from: d */
    public C3979eG f37603d;

    /* renamed from: e */
    public final long f37604e;

    /* renamed from: f */
    public final long f37605f;

    /* renamed from: g */
    public final long f37606g;

    /* renamed from: h */
    public final float f37607h;

    /* renamed from: i */
    public final float f37608i;

    /* renamed from: j */
    public boolean f37609j;

    public C6415mG(InterfaceC1397WC interfaceC1397WC) {
        this(interfaceC1397WC, new C7063wF());
    }

    /* renamed from: g */
    public static InterfaceC7552Ep0 m22709g(Class cls, InterfaceC1397WC interfaceC1397WC) {
        try {
            return (InterfaceC7552Ep0) cls.getConstructor(InterfaceC1397WC.class).newInstance(interfaceC1397WC);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: a */
    public final InterfaceC7552Ep0 mo2426a(C8450Vw0 c8450Vw0) {
        c8450Vw0.getClass();
        C6289kG c6289kG = this.f37600a;
        c6289kG.f36403g = c8450Vw0;
        Iterator it = c6289kG.f36399c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7552Ep0) it.next()).mo2426a(c8450Vw0);
        }
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: b */
    public final InterfaceC7552Ep0 mo2427b(C7408Bv0 c7408Bv0) {
        this.f37602c = c7408Bv0;
        C6289kG c6289kG = this.f37600a;
        c6289kG.f36402f = c7408Bv0;
        C7063wF c7063wF = c6289kG.f36397a;
        synchronized (c7063wF) {
            c7063wF.f44730c = c7408Bv0;
        }
        Iterator it = c6289kG.f36399c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7552Ep0) it.next()).mo2427b(c7408Bv0);
        }
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: c */
    public final InterfaceC7552Ep0 mo2428c(boolean z) {
        this.f37609j = z;
        C6289kG c6289kG = this.f37600a;
        c6289kG.f36401e = z;
        C7063wF c7063wF = c6289kG.f36397a;
        synchronized (c7063wF) {
            c7063wF.f44729b = z;
        }
        Iterator it = c6289kG.f36399c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7552Ep0) it.next()).mo2428c(z);
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004a  */
    @Override // p000.InterfaceC7552Ep0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC6758rg mo2429d(p000.C10825qp0 r31) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6415mG.mo2429d(qp0):rg");
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: e */
    public final InterfaceC7552Ep0 mo2430e(InterfaceC1154SL interfaceC1154SL) {
        YN1.m9280e(interfaceC1154SL, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        C6289kG c6289kG = this.f37600a;
        c6289kG.f36404h = interfaceC1154SL;
        Iterator it = c6289kG.f36399c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7552Ep0) it.next()).mo2430e(interfaceC1154SL);
        }
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: f */
    public final InterfaceC7552Ep0 mo2431f(C3979eG c3979eG) {
        YN1.m9280e(c3979eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f37603d = c3979eG;
        C6289kG c6289kG = this.f37600a;
        c6289kG.f36405i = c3979eG;
        Iterator it = c6289kG.f36399c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7552Ep0) it.next()).mo2431f(c3979eG);
        }
        return this;
    }

    public C6415mG(InterfaceC1397WC interfaceC1397WC, C7063wF c7063wF) {
        this.f37601b = interfaceC1397WC;
        C7408Bv0 c7408Bv0 = new C7408Bv0(12);
        this.f37602c = c7408Bv0;
        C6289kG c6289kG = new C6289kG(c7063wF, c7408Bv0);
        this.f37600a = c6289kG;
        if (interfaceC1397WC != c6289kG.f36400d) {
            c6289kG.f36400d = interfaceC1397WC;
            c6289kG.f36398b.clear();
            c6289kG.f36399c.clear();
        }
        this.f37604e = -9223372036854775807L;
        this.f37605f = -9223372036854775807L;
        this.f37606g = -9223372036854775807L;
        this.f37607h = -3.4028235E38f;
        this.f37608i = -3.4028235E38f;
        this.f37609j = true;
    }
}
