package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: ku0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5590ku0 extends S00 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5590ku0(C8070xu0 c8070xu0) {
        super(c8070xu0);
        O90.f(c8070xu0, "handler");
        this.e = c8070xu0.i;
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putBoolean("pointerInside", this.e);
    }
}
