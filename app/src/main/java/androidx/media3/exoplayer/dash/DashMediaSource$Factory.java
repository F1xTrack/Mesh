package androidx.media3.exoplayer.dash;

import java.util.List;
import p000.AbstractC6758rg;
import p000.C0142CF;
import p000.C10313mp0;
import p000.C10825qp0;
import p000.C1356VY;
import p000.C3979eG;
import p000.C6540oF;
import p000.C6728rC;
import p000.C6914tt;
import p000.C7123xC;
import p000.C7408Bv0;
import p000.C8450Vw0;
import p000.C9108dO1;
import p000.InterfaceC0560It;
import p000.InterfaceC10231mA0;
import p000.InterfaceC1154SL;
import p000.InterfaceC1397WC;
import p000.InterfaceC7552Ep0;
import p000.YN1;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC7552Ep0 {

    /* renamed from: a */
    public final C1356VY f16334a;

    /* renamed from: b */
    public final InterfaceC1397WC f16335b;

    /* renamed from: c */
    public C8450Vw0 f16336c;

    /* renamed from: d */
    public InterfaceC1154SL f16337d;

    /* renamed from: e */
    public final C6914tt f16338e;

    /* renamed from: f */
    public C3979eG f16339f;

    /* renamed from: g */
    public final long f16340g;

    /* renamed from: h */
    public final long f16341h;

    public DashMediaSource$Factory(InterfaceC1397WC interfaceC1397WC) {
        this(new C1356VY(interfaceC1397WC), interfaceC1397WC);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: a */
    public final InterfaceC7552Ep0 mo2426a(C8450Vw0 c8450Vw0) {
        c8450Vw0.getClass();
        this.f16336c = c8450Vw0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: b */
    public final InterfaceC7552Ep0 mo2427b(C7408Bv0 c7408Bv0) {
        C0142CF c0142cf = (C0142CF) this.f16334a.f12613d;
        c0142cf.getClass();
        c0142cf.f1266b = c7408Bv0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: c */
    public final InterfaceC7552Ep0 mo2428c(boolean z) {
        ((C0142CF) this.f16334a.f12613d).f1267c = z;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: d */
    public final AbstractC6758rg mo2429d(C10825qp0 c10825qp0) {
        C10313mp0 c10313mp0 = c10825qp0.f41186b;
        c10313mp0.getClass();
        C6728rC c6728rC = new C6728rC();
        List list = c10313mp0.f37953c;
        InterfaceC10231mA0 c9108dO1 = !list.isEmpty() ? new C9108dO1(c6728rC, list, false, 12) : c6728rC;
        C8450Vw0 c8450Vw0 = this.f16336c;
        return new C7123xC(c10825qp0, this.f16335b, c9108dO1, this.f16334a, this.f16338e, c8450Vw0 == null ? null : ((InterfaceC0560It) c8450Vw0.f12875b).mo503j(c10825qp0), this.f16337d.mo7363d(c10825qp0), this.f16339f, this.f16340g, this.f16341h);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: e */
    public final InterfaceC7552Ep0 mo2430e(InterfaceC1154SL interfaceC1154SL) {
        YN1.m9280e(interfaceC1154SL, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16337d = interfaceC1154SL;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: f */
    public final InterfaceC7552Ep0 mo2431f(C3979eG c3979eG) {
        YN1.m9280e(c3979eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16339f = c3979eG;
        return this;
    }

    public DashMediaSource$Factory(C1356VY c1356vy, InterfaceC1397WC interfaceC1397WC) {
        this.f16334a = c1356vy;
        this.f16335b = interfaceC1397WC;
        this.f16337d = new C6540oF(0);
        this.f16339f = new C3979eG(-1, 0);
        this.f16340g = 30000L;
        this.f16341h = 5000000L;
        this.f16338e = new C6914tt(12);
        ((C0142CF) c1356vy.f12613d).f1267c = true;
    }
}
