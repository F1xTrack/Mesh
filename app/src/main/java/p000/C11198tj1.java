package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: tj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11198tj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ long f43230e;

    /* renamed from: f */
    public final /* synthetic */ long f43231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11198tj1(long j, long j2) {
        super(1);
        this.f43230e = j;
        this.f43231f = j2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.m5968f(writableMap, "$this$dispatch");
        writableMap.putDouble("currentTime", this.f43230e / 1000.0d);
        writableMap.putDouble("seekTime", this.f43231f / 1000.0d);
        return C8313Tf1.f11463a;
    }
}
