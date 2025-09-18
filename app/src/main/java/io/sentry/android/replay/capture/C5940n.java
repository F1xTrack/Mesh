package io.sentry.android.replay.capture;

import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.n */
/* loaded from: classes2.dex */
public final class C5940n extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f33958e;

    /* renamed from: f */
    public final /* synthetic */ C5941o f33959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5940n(C5941o c5941o, int i) {
        super(1);
        this.f33958e = i;
        this.f33959f = c5941o;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f33958e) {
            case 0:
                AbstractC5937k abstractC5937k = (AbstractC5937k) obj;
                O90.m5968f(abstractC5937k, "segment");
                if (abstractC5937k instanceof C5935i) {
                    C5935i c5935i = (C5935i) abstractC5937k;
                    C5941o c5941o = this.f33959f;
                    C5935i.m21666a(c5935i, c5941o.f33961t);
                    c5941o.m21657l(c5941o.m21655j() + 1);
                    c5941o.m21659n(c5935i.f33950a.f33277u);
                }
                break;
            default:
                AbstractC5937k abstractC5937k2 = (AbstractC5937k) obj;
                O90.m5968f(abstractC5937k2, "segment");
                if (abstractC5937k2 instanceof C5935i) {
                    C5941o c5941o2 = this.f33959f;
                    C5935i.m21666a((C5935i) abstractC5937k2, c5941o2.f33961t);
                    c5941o2.m21657l(c5941o2.m21655j() + 1);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
