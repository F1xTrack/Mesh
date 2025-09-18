package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;

/* renamed from: ij1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9790ij1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ long f29424e;

    /* renamed from: f */
    public final /* synthetic */ long f29425f;

    /* renamed from: g */
    public final /* synthetic */ C11326uj1 f29426g;

    /* renamed from: h */
    public final /* synthetic */ int f29427h;

    /* renamed from: i */
    public final /* synthetic */ int f29428i;

    /* renamed from: j */
    public final /* synthetic */ String f29429j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f29430k;

    /* renamed from: l */
    public final /* synthetic */ ArrayList f29431l;

    /* renamed from: m */
    public final /* synthetic */ ArrayList f29432m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9790ij1(long j, long j2, C11326uj1 c11326uj1, int i, int i2, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(1);
        this.f29424e = j;
        this.f29425f = j2;
        this.f29426g = c11326uj1;
        this.f29427h = i;
        this.f29428i = i2;
        this.f29429j = str;
        this.f29430k = arrayList;
        this.f29431l = arrayList2;
        this.f29432m = arrayList3;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        WritableMap writableMap = (WritableMap) obj;
        O90.m5968f(writableMap, "$this$dispatch");
        writableMap.putDouble("duration", this.f29424e / 1000.0d);
        writableMap.putDouble("currentTime", this.f29425f / 1000.0d);
        C11326uj1 c11326uj1 = this.f29426g;
        c11326uj1.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.f29427h;
        if (i > 0) {
            writableMapCreateMap.putInt(Snapshot.WIDTH, i);
        }
        int i2 = this.f29428i;
        if (i2 > 0) {
            writableMapCreateMap.putInt(Snapshot.HEIGHT, i2);
        }
        writableMapCreateMap.putString("orientation", i > i2 ? "landscape" : i < i2 ? "portrait" : "square");
        writableMap.putMap("naturalSize", writableMapCreateMap);
        String str = this.f29429j;
        if (str != null) {
            writableMap.putString("trackId", str);
        }
        writableMap.putArray("videoTracks", C11326uj1.m25228c(c11326uj1, this.f29430k));
        writableMap.putArray("audioTracks", C11326uj1.m25226a(c11326uj1, this.f29431l));
        writableMap.putArray("textTracks", C11326uj1.m25227b(c11326uj1, this.f29432m));
        writableMap.putBoolean("canPlayFastForward", true);
        writableMap.putBoolean("canPlaySlowForward", true);
        writableMap.putBoolean("canPlaySlowReverse", true);
        writableMap.putBoolean("canPlayReverse", true);
        writableMap.putBoolean("canPlayFastForward", true);
        writableMap.putBoolean("canStepBackward", true);
        writableMap.putBoolean("canStepForward", true);
        return C8313Tf1.f11463a;
    }
}
