package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: Al0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7336Al0 extends S00 {

    /* renamed from: e */
    public final float f349e;

    /* renamed from: f */
    public final float f350f;

    /* renamed from: g */
    public final float f351g;

    /* renamed from: h */
    public final float f352h;

    /* renamed from: i */
    public final int f353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7336Al0(C11965zl0 c11965zl0) {
        super(c11965zl0);
        O90.m5968f(c11965zl0, "handler");
        this.f349e = c11965zl0.f9919t;
        this.f350f = c11965zl0.f9920u;
        this.f351g = c11965zl0.m6865o();
        this.f352h = c11965zl0.m6866p();
        this.f353i = (int) (c11965zl0.f46980T - c11965zl0.f46979S);
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        super.mo315a(writableMap);
        writableMap.putDouble("x", AbstractC11406vL1.m25402a(this.f349e));
        writableMap.putDouble("y", AbstractC11406vL1.m25402a(this.f350f));
        writableMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(this.f351g));
        writableMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(this.f352h));
        writableMap.putInt("duration", this.f353i);
    }
}
