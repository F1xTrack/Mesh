package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: jW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5326jW extends S00 {
    public final /* synthetic */ int e = 0;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5326jW(C4359iW c4359iW) {
        super(c4359iW);
        O90.f(c4359iW, "handler");
        this.f = c4359iW.t;
        this.g = c4359iW.u;
        this.h = c4359iW.o();
        this.i = c4359iW.p();
    }

    @Override // defpackage.S00
    public final void a(WritableMap writableMap) {
        switch (this.e) {
            case 0:
                super.a(writableMap);
                writableMap.putDouble("x", AbstractC7586vL1.a(this.f));
                writableMap.putDouble("y", AbstractC7586vL1.a(this.g));
                writableMap.putDouble("absoluteX", AbstractC7586vL1.a(this.h));
                writableMap.putDouble("absoluteY", AbstractC7586vL1.a(this.i));
                break;
            default:
                super.a(writableMap);
                writableMap.putDouble("x", AbstractC7586vL1.a(this.f));
                writableMap.putDouble("y", AbstractC7586vL1.a(this.g));
                writableMap.putDouble("absoluteX", AbstractC7586vL1.a(this.h));
                writableMap.putDouble("absoluteY", AbstractC7586vL1.a(this.i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5326jW(C8307z81 c8307z81) {
        super(c8307z81);
        O90.f(c8307z81, "handler");
        this.f = c8307z81.t;
        this.g = c8307z81.u;
        this.h = c8307z81.o();
        this.i = c8307z81.p();
    }
}
