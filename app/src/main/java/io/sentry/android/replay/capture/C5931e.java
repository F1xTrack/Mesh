package io.sentry.android.replay.capture;

import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.e */
/* loaded from: classes2.dex */
public final class C5931e extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f33943e;

    /* renamed from: f */
    public final /* synthetic */ C5932f f33944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5931e(C5932f c5932f, int i) {
        super(1);
        this.f33943e = i;
        this.f33944f = c5932f;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f33943e) {
            case 0:
                AbstractC5937k abstractC5937k = (AbstractC5937k) obj;
                O90.m5968f(abstractC5937k, "segment");
                if (abstractC5937k instanceof C5935i) {
                    C5932f c5932f = this.f33944f;
                    c5932f.f33949w.add(abstractC5937k);
                    c5932f.m21657l(c5932f.m21655j() + 1);
                }
                break;
            default:
                AbstractC5937k abstractC5937k2 = (AbstractC5937k) obj;
                O90.m5968f(abstractC5937k2, "segment");
                if (abstractC5937k2 instanceof C5935i) {
                    C5932f c5932f2 = this.f33944f;
                    c5932f2.f33949w.add(abstractC5937k2);
                    c5932f2.m21657l(c5932f2.m21655j() + 1);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
