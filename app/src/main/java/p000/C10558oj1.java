package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: oj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10558oj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ long f39204e;

    /* renamed from: f */
    public final /* synthetic */ long f39205f;

    /* renamed from: g */
    public final /* synthetic */ long f39206g;

    /* renamed from: h */
    public final /* synthetic */ double f39207h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10558oj1(long j, long j2, long j3, double d) {
        super(1);
        this.f39204e = j;
        this.f39205f = j2;
        this.f39206g = j3;
        this.f39207h = d;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.m5968f(writableMap, "$this$dispatch");
        writableMap.putDouble("currentTime", this.f39204e / 1000.0d);
        writableMap.putDouble("playableDuration", this.f39205f / 1000.0d);
        writableMap.putDouble("seekableDuration", this.f39206g / 1000.0d);
        writableMap.putDouble("currentPlaybackTime", this.f39207h);
        return C8313Tf1.f11463a;
    }
}
