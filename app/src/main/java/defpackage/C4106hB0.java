package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: hB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4106hB0 extends S00 {
    public final /* synthetic */ int e = 1;
    public final double f;
    public final float g;
    public final float h;
    public final double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4106hB0(C3915gB0 c3915gB0) {
        super(c3915gB0);
        O90.f(c3915gB0, "handler");
        this.f = c3915gB0.M;
        this.g = c3915gB0.O;
        this.h = c3915gB0.P;
        this.i = c3915gB0.N;
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        switch (this.e) {
            case 0:
                super.a(writableMap);
                writableMap.putDouble("scale", this.f);
                writableMap.putDouble("focalX", AbstractC7586vL1.a(this.g));
                writableMap.putDouble("focalY", AbstractC7586vL1.a(this.h));
                writableMap.putDouble("velocity", this.i);
                break;
            default:
                super.a(writableMap);
                writableMap.putDouble("rotation", this.f);
                writableMap.putDouble("anchorX", AbstractC7586vL1.a(this.g));
                writableMap.putDouble("anchorY", AbstractC7586vL1.a(this.h));
                writableMap.putDouble("velocity", this.i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4106hB0(BT0 bt0) {
        super(bt0);
        O90.f(bt0, "handler");
        this.f = bt0.N;
        this.g = bt0.P;
        this.h = bt0.Q;
        this.i = bt0.O;
    }
}
