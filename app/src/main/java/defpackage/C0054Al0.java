package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: Al0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0054Al0 extends S00 {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054Al0(C8423zl0 c8423zl0) {
        super(c8423zl0);
        O90.f(c8423zl0, "handler");
        this.e = c8423zl0.t;
        this.f = c8423zl0.u;
        this.g = c8423zl0.o();
        this.h = c8423zl0.p();
        this.i = (int) (c8423zl0.T - c8423zl0.S);
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", AbstractC7586vL1.a(this.e));
        writableMap.putDouble("y", AbstractC7586vL1.a(this.f));
        writableMap.putDouble("absoluteX", AbstractC7586vL1.a(this.g));
        writableMap.putDouble("absoluteY", AbstractC7586vL1.a(this.h));
        writableMap.putInt("duration", this.i);
    }
}
