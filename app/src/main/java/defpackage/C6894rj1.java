package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: rj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6894rj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6894rj1(boolean z, boolean z2) {
        super(1);
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.f(writableMap, "$this$dispatch");
        writableMap.putBoolean("isPlaying", this.e);
        writableMap.putBoolean("isSeeking", this.f);
        return C1518Tf1.a;
    }
}
