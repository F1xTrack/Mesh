package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;

/* renamed from: ij1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4399ij1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ C7467uj1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4399ij1(long j, long j2, C7467uj1 c7467uj1, int i, int i2, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(1);
        this.e = j;
        this.f = j2;
        this.g = c7467uj1;
        this.h = i;
        this.i = i2;
        this.j = str;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = arrayList3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.f(writableMap, "$this$dispatch");
        writableMap.putDouble("duration", this.e / 1000.0d);
        writableMap.putDouble("currentTime", this.f / 1000.0d);
        C7467uj1 c7467uj1 = this.g;
        c7467uj1.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.h;
        if (i > 0) {
            writableMapCreateMap.putInt(Snapshot.WIDTH, i);
        }
        int i2 = this.i;
        if (i2 > 0) {
            writableMapCreateMap.putInt(Snapshot.HEIGHT, i2);
        }
        writableMapCreateMap.putString("orientation", i > i2 ? "landscape" : i < i2 ? "portrait" : "square");
        writableMap.putMap("naturalSize", writableMapCreateMap);
        String str = this.j;
        if (str != null) {
            writableMap.putString("trackId", str);
        }
        writableMap.putArray("videoTracks", C7467uj1.c(c7467uj1, this.k));
        writableMap.putArray("audioTracks", C7467uj1.a(c7467uj1, this.l));
        writableMap.putArray("textTracks", C7467uj1.b(c7467uj1, this.m));
        writableMap.putBoolean("canPlayFastForward", true);
        writableMap.putBoolean("canPlaySlowForward", true);
        writableMap.putBoolean("canPlaySlowReverse", true);
        writableMap.putBoolean("canPlayReverse", true);
        writableMap.putBoolean("canPlayFastForward", true);
        writableMap.putBoolean("canStepBackward", true);
        writableMap.putBoolean("canStepForward", true);
        return C1518Tf1.a;
    }
}
