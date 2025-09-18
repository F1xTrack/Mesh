package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: tj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7276tj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7276tj1(long j, long j2) {
        super(1);
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.f(writableMap, "$this$dispatch");
        writableMap.putDouble("currentTime", this.e / 1000.0d);
        writableMap.putDouble("seekTime", this.f / 1000.0d);
        return C1518Tf1.a;
    }
}
