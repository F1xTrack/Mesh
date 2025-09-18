package p000;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class O30 extends S00 {

    /* renamed from: e */
    public final float f8195e;

    /* renamed from: f */
    public final float f8196f;

    /* renamed from: g */
    public final float f8197g;

    /* renamed from: h */
    public final float f8198h;

    /* renamed from: i */
    public final H51 f8199i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O30(N30 n30) {
        super(n30);
        O90.m5968f(n30, "handler");
        this.f8195e = n30.f9919t;
        this.f8196f = n30.f9920u;
        this.f8197g = n30.m6865o();
        this.f8198h = n30.m6866p();
        this.f8199i = n30.f7481O;
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        super.mo315a(writableMap);
        writableMap.putDouble("x", AbstractC11406vL1.m25402a(this.f8195e));
        writableMap.putDouble("y", AbstractC11406vL1.m25402a(this.f8196f));
        writableMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(this.f8197g));
        writableMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(this.f8198h));
        H51 h51 = this.f8199i;
        if (h51.f4055e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", h51.m3265a());
    }
}
