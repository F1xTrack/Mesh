package defpackage;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;

/* renamed from: kG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5469kG {
    public final C7756wF a;
    public WC d;
    public C0162Bv0 f;
    public C1724Vw0 g;
    public SL h;
    public C3547eG i;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;

    public C5469kG(C7756wF c7756wF, C0162Bv0 c0162Bv0) {
        this.a = c7756wF;
        this.f = c0162Bv0;
    }

    public final InterfaceC0378Ep0 a(int i) {
        InterfaceC6587q61 interfaceC6587q61;
        InterfaceC6587q61 c5278jG;
        HashMap map = this.c;
        InterfaceC0378Ep0 interfaceC0378Ep0 = (InterfaceC0378Ep0) map.get(Integer.valueOf(i));
        if (interfaceC0378Ep0 != null) {
            return interfaceC0378Ep0;
        }
        HashMap map2 = this.b;
        InterfaceC6587q61 interfaceC6587q612 = (InterfaceC6587q61) map2.get(Integer.valueOf(i));
        if (interfaceC6587q612 == null) {
            final WC wc = this.d;
            wc.getClass();
            if (i == 0) {
                final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC0378Ep0.class);
                final int i2 = 0;
                interfaceC6587q61 = new InterfaceC6587q61() { // from class: iG
                    @Override // defpackage.InterfaceC6587q61
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return C5851mG.g((Class) clsAsSubclass, wc);
                            case 1:
                                return C5851mG.g((Class) clsAsSubclass, wc);
                            case 2:
                                return C5851mG.g((Class) clsAsSubclass, wc);
                            default:
                                return new C6800rE0(wc, ((C5469kG) clsAsSubclass).a);
                        }
                    }
                };
            } else if (i == 1) {
                final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC0378Ep0.class);
                final int i3 = 1;
                interfaceC6587q61 = new InterfaceC6587q61() { // from class: iG
                    @Override // defpackage.InterfaceC6587q61
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return C5851mG.g((Class) clsAsSubclass2, wc);
                            case 1:
                                return C5851mG.g((Class) clsAsSubclass2, wc);
                            case 2:
                                return C5851mG.g((Class) clsAsSubclass2, wc);
                            default:
                                return new C6800rE0(wc, ((C5469kG) clsAsSubclass2).a);
                        }
                    }
                };
            } else if (i != 2) {
                if (i == 3) {
                    c5278jG = new C5278jG(0, RtspMediaSource$Factory.class.asSubclass(InterfaceC0378Ep0.class));
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unrecognized contentType: "));
                    }
                    final int i4 = 3;
                    c5278jG = new InterfaceC6587q61() { // from class: iG
                        @Override // defpackage.InterfaceC6587q61
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return C5851mG.g((Class) this, wc);
                                case 1:
                                    return C5851mG.g((Class) this, wc);
                                case 2:
                                    return C5851mG.g((Class) this, wc);
                                default:
                                    return new C6800rE0(wc, ((C5469kG) this).a);
                            }
                        }
                    };
                }
                interfaceC6587q612 = c5278jG;
                map2.put(Integer.valueOf(i), interfaceC6587q612);
            } else {
                final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC0378Ep0.class);
                final int i5 = 2;
                interfaceC6587q61 = new InterfaceC6587q61() { // from class: iG
                    @Override // defpackage.InterfaceC6587q61
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return C5851mG.g((Class) clsAsSubclass3, wc);
                            case 1:
                                return C5851mG.g((Class) clsAsSubclass3, wc);
                            case 2:
                                return C5851mG.g((Class) clsAsSubclass3, wc);
                            default:
                                return new C6800rE0(wc, ((C5469kG) clsAsSubclass3).a);
                        }
                    }
                };
            }
            interfaceC6587q612 = interfaceC6587q61;
            map2.put(Integer.valueOf(i), interfaceC6587q612);
        }
        InterfaceC0378Ep0 interfaceC0378Ep02 = (InterfaceC0378Ep0) interfaceC6587q612.get();
        C1724Vw0 c1724Vw0 = this.g;
        if (c1724Vw0 != null) {
            interfaceC0378Ep02.a(c1724Vw0);
        }
        SL sl = this.h;
        if (sl != null) {
            interfaceC0378Ep02.e(sl);
        }
        C3547eG c3547eG = this.i;
        if (c3547eG != null) {
            interfaceC0378Ep02.f(c3547eG);
        }
        interfaceC0378Ep02.b(this.f);
        interfaceC0378Ep02.c(this.e);
        map.put(Integer.valueOf(i), interfaceC0378Ep02);
        return interfaceC0378Ep02;
    }
}
