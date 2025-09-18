package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: oj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6322oj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6322oj1(long j, long j2, long j3, double d) {
        super(1);
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = d;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.f(writableMap, "$this$dispatch");
        writableMap.putDouble("currentTime", this.e / 1000.0d);
        writableMap.putDouble("playableDuration", this.f / 1000.0d);
        writableMap.putDouble("seekableDuration", this.g / 1000.0d);
        writableMap.putDouble("currentPlaybackTime", this.h);
        return C1518Tf1.a;
    }
}
