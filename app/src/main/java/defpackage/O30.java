package defpackage;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class O30 extends S00 {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final H51 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O30(N30 n30) {
        super(n30);
        O90.f(n30, "handler");
        this.e = n30.t;
        this.f = n30.u;
        this.g = n30.o();
        this.h = n30.p();
        this.i = n30.O;
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", AbstractC7586vL1.a(this.e));
        writableMap.putDouble("y", AbstractC7586vL1.a(this.f));
        writableMap.putDouble("absoluteX", AbstractC7586vL1.a(this.g));
        writableMap.putDouble("absoluteY", AbstractC7586vL1.a(this.h));
        H51 h51 = this.i;
        if (h51.e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", h51.a());
    }
}
