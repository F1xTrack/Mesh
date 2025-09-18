package p000;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: qj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10814qj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ long f41117e;

    /* renamed from: f */
    public final /* synthetic */ int f41118f;

    /* renamed from: g */
    public final /* synthetic */ int f41119g;

    /* renamed from: h */
    public final /* synthetic */ String f41120h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10814qj1(long j, String str, int i, int i2) {
        super(1);
        this.f41117e = j;
        this.f41118f = i;
        this.f41119g = i2;
        this.f41120h = str;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.m5968f(writableMap, "$this$dispatch");
        writableMap.putDouble("bitrate", this.f41117e);
        int i = this.f41118f;
        if (i > 0) {
            writableMap.putInt(Snapshot.WIDTH, i);
        }
        int i2 = this.f41119g;
        if (i2 > 0) {
            writableMap.putInt(Snapshot.HEIGHT, i2);
        }
        String str = this.f41120h;
        if (str != null) {
            writableMap.putString("trackId", str);
        }
        return C8313Tf1.f11463a;
    }
}
