package p000;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;

/* renamed from: kG */
/* loaded from: classes.dex */
public final class C6289kG {

    /* renamed from: a */
    public final C7063wF f36397a;

    /* renamed from: d */
    public InterfaceC1397WC f36400d;

    /* renamed from: f */
    public C7408Bv0 f36402f;

    /* renamed from: g */
    public C8450Vw0 f36403g;

    /* renamed from: h */
    public InterfaceC1154SL f36404h;

    /* renamed from: i */
    public C3979eG f36405i;

    /* renamed from: b */
    public final HashMap f36398b = new HashMap();

    /* renamed from: c */
    public final HashMap f36399c = new HashMap();

    /* renamed from: e */
    public boolean f36401e = true;

    public C6289kG(C7063wF c7063wF, C7408Bv0 c7408Bv0) {
        this.f36397a = c7063wF;
        this.f36402f = c7408Bv0;
    }

    /* renamed from: a */
    public final InterfaceC7552Ep0 m22182a(int i) {
        InterfaceC10736q61 interfaceC10736q61;
        InterfaceC10736q61 c6226jG;
        HashMap map = this.f36399c;
        InterfaceC7552Ep0 interfaceC7552Ep0 = (InterfaceC7552Ep0) map.get(Integer.valueOf(i));
        if (interfaceC7552Ep0 != null) {
            return interfaceC7552Ep0;
        }
        HashMap map2 = this.f36398b;
        InterfaceC10736q61 interfaceC10736q612 = (InterfaceC10736q61) map2.get(Integer.valueOf(i));
        if (interfaceC10736q612 == null) {
            final InterfaceC1397WC interfaceC1397WC = this.f36400d;
            interfaceC1397WC.getClass();
            if (i == 0) {
                final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC7552Ep0.class);
                final int i2 = 0;
                interfaceC10736q61 = new InterfaceC10736q61() { // from class: iG
                    @Override // p000.InterfaceC10736q61
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return C6415mG.m22709g((Class) clsAsSubclass, interfaceC1397WC);
                            case 1:
                                return C6415mG.m22709g((Class) clsAsSubclass, interfaceC1397WC);
                            case 2:
                                return C6415mG.m22709g((Class) clsAsSubclass, interfaceC1397WC);
                            default:
                                return new C10879rE0(interfaceC1397WC, ((C6289kG) clsAsSubclass).f36397a);
                        }
                    }
                };
            } else if (i == 1) {
                final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC7552Ep0.class);
                final int i3 = 1;
                interfaceC10736q61 = new InterfaceC10736q61() { // from class: iG
                    @Override // p000.InterfaceC10736q61
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return C6415mG.m22709g((Class) clsAsSubclass2, interfaceC1397WC);
                            case 1:
                                return C6415mG.m22709g((Class) clsAsSubclass2, interfaceC1397WC);
                            case 2:
                                return C6415mG.m22709g((Class) clsAsSubclass2, interfaceC1397WC);
                            default:
                                return new C10879rE0(interfaceC1397WC, ((C6289kG) clsAsSubclass2).f36397a);
                        }
                    }
                };
            } else if (i != 2) {
                if (i == 3) {
                    c6226jG = new C6226jG(0, RtspMediaSource$Factory.class.asSubclass(InterfaceC7552Ep0.class));
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unrecognized contentType: "));
                    }
                    final int i4 = 3;
                    c6226jG = new InterfaceC10736q61() { // from class: iG
                        @Override // p000.InterfaceC10736q61
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return C6415mG.m22709g((Class) this, interfaceC1397WC);
                                case 1:
                                    return C6415mG.m22709g((Class) this, interfaceC1397WC);
                                case 2:
                                    return C6415mG.m22709g((Class) this, interfaceC1397WC);
                                default:
                                    return new C10879rE0(interfaceC1397WC, ((C6289kG) this).f36397a);
                            }
                        }
                    };
                }
                interfaceC10736q612 = c6226jG;
                map2.put(Integer.valueOf(i), interfaceC10736q612);
            } else {
                final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC7552Ep0.class);
                final int i5 = 2;
                interfaceC10736q61 = new InterfaceC10736q61() { // from class: iG
                    @Override // p000.InterfaceC10736q61
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return C6415mG.m22709g((Class) clsAsSubclass3, interfaceC1397WC);
                            case 1:
                                return C6415mG.m22709g((Class) clsAsSubclass3, interfaceC1397WC);
                            case 2:
                                return C6415mG.m22709g((Class) clsAsSubclass3, interfaceC1397WC);
                            default:
                                return new C10879rE0(interfaceC1397WC, ((C6289kG) clsAsSubclass3).f36397a);
                        }
                    }
                };
            }
            interfaceC10736q612 = interfaceC10736q61;
            map2.put(Integer.valueOf(i), interfaceC10736q612);
        }
        InterfaceC7552Ep0 interfaceC7552Ep02 = (InterfaceC7552Ep0) interfaceC10736q612.get();
        C8450Vw0 c8450Vw0 = this.f36403g;
        if (c8450Vw0 != null) {
            interfaceC7552Ep02.mo2426a(c8450Vw0);
        }
        InterfaceC1154SL interfaceC1154SL = this.f36404h;
        if (interfaceC1154SL != null) {
            interfaceC7552Ep02.mo2430e(interfaceC1154SL);
        }
        C3979eG c3979eG = this.f36405i;
        if (c3979eG != null) {
            interfaceC7552Ep02.mo2431f(c3979eG);
        }
        interfaceC7552Ep02.mo2427b(this.f36402f);
        interfaceC7552Ep02.mo2428c(this.f36401e);
        map.put(Integer.valueOf(i), interfaceC7552Ep02);
        return interfaceC7552Ep02;
    }
}
