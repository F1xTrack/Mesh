package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: jj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5367jj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5367jj1(float f, int i) {
        super(1);
        this.e = i;
        this.f = f;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.f(writableMap, "$this$dispatch");
                writableMap.putDouble("playbackRate", this.f);
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.f(writableMap2, "$this$dispatch");
                writableMap2.putDouble("volume", this.f);
                break;
            case 2:
                C6818rK0 c6818rK0 = (C6818rK0) obj;
                if (c6818rK0 != null) {
                    long jB = AbstractC3857ft1.b(this.f * 1000.0f);
                    XQ xq = c6818rK0.j;
                    if (xq != null) {
                        xq.o1(xq.D1(), jB, false);
                    }
                }
                break;
            default:
                C6818rK0 c6818rK02 = (C6818rK0) obj;
                if (c6818rK02 != null) {
                    c6818rK02.setVolumeModifier(this.f);
                }
                break;
        }
        return C1518Tf1.a;
    }
}
