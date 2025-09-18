package defpackage;

import java.util.Iterator;

/* renamed from: mG */
/* loaded from: classes.dex */
public final class C5851mG implements InterfaceC0378Ep0 {
    public final C5469kG a;
    public WC b;
    public C0162Bv0 c;
    public C3547eG d;
    public final long e;
    public final long f;
    public final long g;
    public final float h;
    public final float i;
    public boolean j;

    public C5851mG(WC wc) {
        this(wc, new C7756wF());
    }

    public static InterfaceC0378Ep0 g(Class cls, WC wc) {
        try {
            return (InterfaceC0378Ep0) cls.getConstructor(WC.class).newInstance(wc);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 a(C1724Vw0 c1724Vw0) {
        c1724Vw0.getClass();
        C5469kG c5469kG = this.a;
        c5469kG.g = c1724Vw0;
        Iterator it = c5469kG.c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0378Ep0) it.next()).a(c1724Vw0);
        }
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 b(C0162Bv0 c0162Bv0) {
        this.c = c0162Bv0;
        C5469kG c5469kG = this.a;
        c5469kG.f = c0162Bv0;
        C7756wF c7756wF = c5469kG.a;
        synchronized (c7756wF) {
            c7756wF.c = c0162Bv0;
        }
        Iterator it = c5469kG.c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0378Ep0) it.next()).b(c0162Bv0);
        }
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 c(boolean z) {
        this.j = z;
        C5469kG c5469kG = this.a;
        c5469kG.e = z;
        C7756wF c7756wF = c5469kG.a;
        synchronized (c7756wF) {
            c7756wF.b = z;
        }
        Iterator it = c5469kG.c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0378Ep0) it.next()).c(z);
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004a  */
    @Override // defpackage.InterfaceC0378Ep0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6883rg d(defpackage.C6721qp0 r31) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5851mG.d(qp0):rg");
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 e(SL sl) {
        YN1.e(sl, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        C5469kG c5469kG = this.a;
        c5469kG.h = sl;
        Iterator it = c5469kG.c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0378Ep0) it.next()).e(sl);
        }
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 f(C3547eG c3547eG) {
        YN1.e(c3547eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = c3547eG;
        C5469kG c5469kG = this.a;
        c5469kG.i = c3547eG;
        Iterator it = c5469kG.c.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0378Ep0) it.next()).f(c3547eG);
        }
        return this;
    }

    public C5851mG(WC wc, C7756wF c7756wF) {
        this.b = wc;
        C0162Bv0 c0162Bv0 = new C0162Bv0(12);
        this.c = c0162Bv0;
        C5469kG c5469kG = new C5469kG(c7756wF, c0162Bv0);
        this.a = c5469kG;
        if (wc != c5469kG.d) {
            c5469kG.d = wc;
            c5469kG.b.clear();
            c5469kG.c.clear();
        }
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = true;
    }
}
