package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: rj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10942rj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ boolean f41835e;

    /* renamed from: f */
    public final /* synthetic */ boolean f41836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10942rj1(boolean z, boolean z2) {
        super(1);
        this.f41835e = z;
        this.f41836f = z2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.m5968f(writableMap, "$this$dispatch");
        writableMap.putBoolean("isPlaying", this.f41835e);
        writableMap.putBoolean("isSeeking", this.f41836f);
        return C8313Tf1.f11463a;
    }
}
