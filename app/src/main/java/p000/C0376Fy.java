package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: Fy */
/* loaded from: classes.dex */
public final class C0376Fy extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f3495a = 1;

    /* renamed from: b */
    public int f3496b;

    /* renamed from: c */
    public int f3497c;

    public /* synthetic */ C0376Fy(int i, int i2) {
        super(i, i2);
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        switch (this.f3495a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble(Snapshot.WIDTH, AbstractC11406vL1.m25402a(this.f3496b));
                writableMapCreateMap.putDouble(Snapshot.HEIGHT, AbstractC11406vL1.m25402a(this.f3497c));
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putInt("end", this.f3497c);
                writableMapCreateMap3.putInt("start", this.f3496b);
                writableMapCreateMap2.putMap("selection", writableMapCreateMap3);
                return writableMapCreateMap2;
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f3495a) {
            case 0:
                return "topContentSizeChange";
            default:
                return "topSelectionChange";
        }
    }

    public C0376Fy(int i, int i2, int i3) {
        super(-1, i);
        this.f3496b = i2;
        this.f3497c = i3;
    }
}
