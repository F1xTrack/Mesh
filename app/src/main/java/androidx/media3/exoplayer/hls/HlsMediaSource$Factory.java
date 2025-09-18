package androidx.media3.exoplayer.hls;

import java.util.List;
import p000.AbstractC6758rg;
import p000.C0142CF;
import p000.C0331FF;
import p000.C10313mp0;
import p000.C10689pl0;
import p000.C10825qp0;
import p000.C10856r30;
import p000.C1686an;
import p000.C22;
import p000.C3979eG;
import p000.C6540oF;
import p000.C6914tt;
import p000.C7391Bm1;
import p000.C7408Bv0;
import p000.C7967Mo1;
import p000.C8450Vw0;
import p000.InterfaceC0560It;
import p000.InterfaceC1091RL;
import p000.InterfaceC1154SL;
import p000.InterfaceC11750y30;
import p000.InterfaceC1397WC;
import p000.InterfaceC7552Ep0;
import p000.InterfaceC9704i30;
import p000.YN1;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC7552Ep0 {

    /* renamed from: a */
    public final C7391Bm1 f16342a;

    /* renamed from: b */
    public final C0142CF f16343b;

    /* renamed from: e */
    public final C6914tt f16346e;

    /* renamed from: f */
    public C8450Vw0 f16347f;

    /* renamed from: h */
    public C3979eG f16349h;

    /* renamed from: i */
    public boolean f16350i;

    /* renamed from: j */
    public final int f16351j;

    /* renamed from: k */
    public final long f16352k;

    /* renamed from: g */
    public InterfaceC1154SL f16348g = new C6540oF(0);

    /* renamed from: c */
    public final C10689pl0 f16344c = new C10689pl0(12);

    /* renamed from: d */
    public final C1686an f16345d = C0331FF.f3096o;

    public HlsMediaSource$Factory(InterfaceC1397WC interfaceC1397WC) {
        this.f16342a = new C7391Bm1(13, interfaceC1397WC);
        C0142CF c0142cf = InterfaceC9704i30.f28787a;
        this.f16343b = c0142cf;
        this.f16349h = new C3979eG(-1, 0);
        this.f16346e = new C6914tt(12);
        this.f16351j = 1;
        this.f16352k = -9223372036854775807L;
        this.f16350i = true;
        c0142cf.f1267c = true;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: a */
    public final InterfaceC7552Ep0 mo2426a(C8450Vw0 c8450Vw0) {
        c8450Vw0.getClass();
        this.f16347f = c8450Vw0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: b */
    public final InterfaceC7552Ep0 mo2427b(C7408Bv0 c7408Bv0) {
        this.f16343b.f1266b = c7408Bv0;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: c */
    public final InterfaceC7552Ep0 mo2428c(boolean z) {
        this.f16343b.f1267c = z;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: d */
    public final AbstractC6758rg mo2429d(C10825qp0 c10825qp0) {
        C10313mp0 c10313mp0 = c10825qp0.f41186b;
        c10313mp0.getClass();
        InterfaceC11750y30 c7967Mo1 = this.f16344c;
        List list = c10313mp0.f37953c;
        if (!list.isEmpty()) {
            c7967Mo1 = new C7967Mo1(c7967Mo1, list);
        }
        C8450Vw0 c8450Vw0 = this.f16347f;
        C22 c22Mo503j = c8450Vw0 == null ? null : ((InterfaceC0560It) c8450Vw0.f12875b).mo503j(c10825qp0);
        C0142CF c0142cf = this.f16343b;
        InterfaceC1091RL interfaceC1091RLMo7363d = this.f16348g.mo7363d(c10825qp0);
        C3979eG c3979eG = this.f16349h;
        getClass();
        C7391Bm1 c7391Bm1 = this.f16342a;
        return new C10856r30(c10825qp0, c7391Bm1, c0142cf, this.f16346e, c22Mo503j, interfaceC1091RLMo7363d, c3979eG, new C0331FF(c7391Bm1, c3979eG, c7967Mo1), this.f16352k, this.f16350i, this.f16351j);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: e */
    public final InterfaceC7552Ep0 mo2430e(InterfaceC1154SL interfaceC1154SL) {
        YN1.m9280e(interfaceC1154SL, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16348g = interfaceC1154SL;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: f */
    public final InterfaceC7552Ep0 mo2431f(C3979eG c3979eG) {
        YN1.m9280e(c3979eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16349h = c3979eG;
        return this;
    }
}
