package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: qj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6704qj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6704qj1(long j, String str, int i, int i2) {
        super(1);
        this.e = j;
        this.f = i;
        this.g = i2;
        this.h = str;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.f(writableMap, "$this$dispatch");
        writableMap.putDouble("bitrate", this.e);
        int i = this.f;
        if (i > 0) {
            writableMap.putInt(Snapshot.WIDTH, i);
        }
        int i2 = this.g;
        if (i2 > 0) {
            writableMap.putInt(Snapshot.HEIGHT, i2);
        }
        String str = this.h;
        if (str != null) {
            writableMap.putString("trackId", str);
        }
        return C1518Tf1.a;
    }
}
