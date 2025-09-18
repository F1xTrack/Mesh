package defpackage;

/* renamed from: rE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6800rE0 implements InterfaceC0378Ep0 {
    public final WC a;
    public final C1724Vw0 b;
    public SL c;
    public C3547eG d;
    public final int e;

    public C6800rE0(WC wc) {
        this(wc, new C7756wF());
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 a(C1724Vw0 c1724Vw0) {
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 b(C0162Bv0 c0162Bv0) {
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 c(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final AbstractC6883rg d(C6721qp0 c6721qp0) {
        c6721qp0.b.getClass();
        return new C6991sE0(c6721qp0, this.a, this.b, this.c.d(c6721qp0), this.d, this.e);
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 e(SL sl) {
        YN1.e(sl, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = sl;
        return this;
    }

    @Override // defpackage.InterfaceC0378Ep0
    public final InterfaceC0378Ep0 f(C3547eG c3547eG) {
        YN1.e(c3547eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = c3547eG;
        return this;
    }

    public C6800rE0(WC wc, C7756wF c7756wF) {
        C1724Vw0 c1724Vw0 = new C1724Vw0(4, c7756wF);
        C6230oF c6230oF = new C6230oF(0);
        C3547eG c3547eG = new C3547eG(-1, 0);
        this.a = wc;
        this.b = c1724Vw0;
        this.c = c6230oF;
        this.d = c3547eG;
        this.e = 1048576;
    }
}
