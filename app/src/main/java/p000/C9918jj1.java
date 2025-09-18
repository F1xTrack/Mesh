package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: jj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9918jj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f35350e;

    /* renamed from: f */
    public final /* synthetic */ float f35351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9918jj1(float f, int i) {
        super(1);
        this.f35350e = i;
        this.f35351f = f;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f35350e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.m5968f(writableMap, "$this$dispatch");
                writableMap.putDouble("playbackRate", this.f35351f);
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.m5968f(writableMap2, "$this$dispatch");
                writableMap2.putDouble("volume", this.f35351f);
                break;
            case 2:
                C10891rK0 c10891rK0 = (C10891rK0) obj;
                if (c10891rK0 != null) {
                    long jM18304b = AbstractC9426ft1.m18304b(this.f35351f * 1000.0f);
                    C1474XQ c1474xq = c10891rK0.f41573j;
                    if (c1474xq != null) {
                        c1474xq.mo7846o1(c1474xq.m9007D1(), jM18304b, false);
                    }
                }
                break;
            default:
                C10891rK0 c10891rK02 = (C10891rK0) obj;
                if (c10891rK02 != null) {
                    c10891rK02.setVolumeModifier(this.f35351f);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
