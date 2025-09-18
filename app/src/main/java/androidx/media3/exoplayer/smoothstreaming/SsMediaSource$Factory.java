package androidx.media3.exoplayer.smoothstreaming;

import java.util.List;
import p000.AbstractC6758rg;
import p000.C10313mp0;
import p000.C10825qp0;
import p000.C11287uQ0;
import p000.C3979eG;
import p000.C6540oF;
import p000.C6914tt;
import p000.C7408Bv0;
import p000.C8450Vw0;
import p000.C9108dO1;
import p000.InterfaceC0560It;
import p000.InterfaceC10231mA0;
import p000.InterfaceC1154SL;
import p000.InterfaceC1397WC;
import p000.InterfaceC7552Ep0;
import p000.R31;
import p000.X11;
import p000.YN1;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC7552Ep0 {

    /* renamed from: a */
    public final X11 f16354a;

    /* renamed from: b */
    public final InterfaceC1397WC f16355b;

    /* renamed from: c */
    public final C6914tt f16356c;

    /* renamed from: d */
    public C8450Vw0 f16357d;

    /* renamed from: e */
    public InterfaceC1154SL f16358e;

    /* renamed from: f */
    public C3979eG f16359f;

    /* renamed from: g */
    public final long f16360g;

    public SsMediaSource$Factory(InterfaceC1397WC interfaceC1397WC) {
        this(new X11(interfaceC1397WC), interfaceC1397WC);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: a */
    public final InterfaceC7552Ep0 mo2426a(C8450Vw0 c8450Vw0) {
        c8450Vw0.getClass();
        this.f16357d = c8450Vw0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: b */
    public final InterfaceC7552Ep0 mo2427b(C7408Bv0 c7408Bv0) {
        this.f16354a.f13489d = c7408Bv0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: c */
    public final InterfaceC7552Ep0 mo2428c(boolean z) {
        this.f16354a.f13487b = z;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: d */
    public final AbstractC6758rg mo2429d(C10825qp0 c10825qp0) {
        C10313mp0 c10313mp0 = c10825qp0.f41186b;
        c10313mp0.getClass();
        C11287uQ0 c11287uQ0 = new C11287uQ0(4);
        List list = c10313mp0.f37953c;
        InterfaceC10231mA0 c9108dO1 = !list.isEmpty() ? new C9108dO1(c11287uQ0, list, false, 12) : c11287uQ0;
        C8450Vw0 c8450Vw0 = this.f16357d;
        return new R31(c10825qp0, this.f16355b, c9108dO1, this.f16354a, this.f16356c, c8450Vw0 == null ? null : ((InterfaceC0560It) c8450Vw0.f12875b).mo503j(c10825qp0), this.f16358e.mo7363d(c10825qp0), this.f16359f, this.f16360g);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: e */
    public final InterfaceC7552Ep0 mo2430e(InterfaceC1154SL interfaceC1154SL) {
        YN1.m9280e(interfaceC1154SL, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16358e = interfaceC1154SL;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: f */
    public final InterfaceC7552Ep0 mo2431f(C3979eG c3979eG) {
        YN1.m9280e(c3979eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16359f = c3979eG;
        return this;
    }

    public SsMediaSource$Factory(X11 x11, InterfaceC1397WC interfaceC1397WC) {
        this.f16354a = x11;
        this.f16355b = interfaceC1397WC;
        this.f16358e = new C6540oF(0);
        this.f16359f = new C3979eG(-1, 0);
        this.f16360g = 30000L;
        this.f16356c = new C6914tt(12);
        x11.f13487b = true;
    }
}
