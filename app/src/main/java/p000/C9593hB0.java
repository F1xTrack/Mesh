package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: hB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9593hB0 extends S00 {

    /* renamed from: e */
    public final /* synthetic */ int f28298e = 1;

    /* renamed from: f */
    public final double f28299f;

    /* renamed from: g */
    public final float f28300g;

    /* renamed from: h */
    public final float f28301h;

    /* renamed from: i */
    public final double f28302i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9593hB0(C9465gB0 c9465gB0) {
        super(c9465gB0);
        O90.m5968f(c9465gB0, "handler");
        this.f28299f = c9465gB0.f27600M;
        this.f28300g = c9465gB0.f27602O;
        this.f28301h = c9465gB0.f27603P;
        this.f28302i = c9465gB0.f27601N;
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        switch (this.f28298e) {
            case 0:
                super.mo315a(writableMap);
                writableMap.putDouble("scale", this.f28299f);
                writableMap.putDouble("focalX", AbstractC11406vL1.m25402a(this.f28300g));
                writableMap.putDouble("focalY", AbstractC11406vL1.m25402a(this.f28301h));
                writableMap.putDouble("velocity", this.f28302i);
                break;
            default:
                super.mo315a(writableMap);
                writableMap.putDouble("rotation", this.f28299f);
                writableMap.putDouble("anchorX", AbstractC11406vL1.m25402a(this.f28300g));
                writableMap.putDouble("anchorY", AbstractC11406vL1.m25402a(this.f28301h));
                writableMap.putDouble("velocity", this.f28302i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9593hB0(BT0 bt0) {
        super(bt0);
        O90.m5968f(bt0, "handler");
        this.f28299f = bt0.f831N;
        this.f28300g = bt0.f833P;
        this.f28301h = bt0.f834Q;
        this.f28302i = bt0.f832O;
    }
}
