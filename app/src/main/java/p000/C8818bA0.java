package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: bA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8818bA0 extends S00 {

    /* renamed from: e */
    public final float f16845e;

    /* renamed from: f */
    public final float f16846f;

    /* renamed from: g */
    public final float f16847g;

    /* renamed from: h */
    public final float f16848h;

    /* renamed from: i */
    public final float f16849i;

    /* renamed from: j */
    public final float f16850j;

    /* renamed from: k */
    public final float f16851k;

    /* renamed from: l */
    public final float f16852l;

    /* renamed from: m */
    public final H51 f16853m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8818bA0(C8690aA0 c8690aA0) {
        super(c8690aA0);
        O90.m5968f(c8690aA0, "handler");
        this.f16845e = c8690aA0.f9919t;
        this.f16846f = c8690aA0.f9920u;
        this.f16847g = c8690aA0.m6865o();
        this.f16848h = c8690aA0.m6866p();
        this.f16849i = (c8690aA0.f15363h0 - c8690aA0.f15359d0) + c8690aA0.f15361f0;
        this.f16850j = (c8690aA0.f15364i0 - c8690aA0.f15360e0) + c8690aA0.f15362g0;
        this.f16851k = c8690aA0.f15342M;
        this.f16852l = c8690aA0.f15343N;
        this.f16853m = c8690aA0.f15370o0;
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        super.mo315a(writableMap);
        writableMap.putDouble("x", AbstractC11406vL1.m25402a(this.f16845e));
        writableMap.putDouble("y", AbstractC11406vL1.m25402a(this.f16846f));
        writableMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(this.f16847g));
        writableMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(this.f16848h));
        writableMap.putDouble("translationX", AbstractC11406vL1.m25402a(this.f16849i));
        writableMap.putDouble("translationY", AbstractC11406vL1.m25402a(this.f16850j));
        writableMap.putDouble("velocityX", AbstractC11406vL1.m25402a(this.f16851k));
        writableMap.putDouble("velocityY", AbstractC11406vL1.m25402a(this.f16852l));
        H51 h51 = this.f16853m;
        if (h51.f4055e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", h51.m3265a());
    }
}
