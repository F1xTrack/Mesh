package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: bA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2274bA0 extends S00 {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final H51 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274bA0(C2083aA0 c2083aA0) {
        super(c2083aA0);
        O90.f(c2083aA0, "handler");
        this.e = c2083aA0.t;
        this.f = c2083aA0.u;
        this.g = c2083aA0.o();
        this.h = c2083aA0.p();
        this.i = (c2083aA0.h0 - c2083aA0.d0) + c2083aA0.f0;
        this.j = (c2083aA0.i0 - c2083aA0.e0) + c2083aA0.g0;
        this.k = c2083aA0.M;
        this.l = c2083aA0.N;
        this.m = c2083aA0.o0;
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", AbstractC7586vL1.a(this.e));
        writableMap.putDouble("y", AbstractC7586vL1.a(this.f));
        writableMap.putDouble("absoluteX", AbstractC7586vL1.a(this.g));
        writableMap.putDouble("absoluteY", AbstractC7586vL1.a(this.h));
        writableMap.putDouble("translationX", AbstractC7586vL1.a(this.i));
        writableMap.putDouble("translationY", AbstractC7586vL1.a(this.j));
        writableMap.putDouble("velocityX", AbstractC7586vL1.a(this.k));
        writableMap.putDouble("velocityY", AbstractC7586vL1.a(this.l));
        H51 h51 = this.m;
        if (h51.e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", h51.a());
    }
}
