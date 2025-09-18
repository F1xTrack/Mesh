package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class SJ0 extends AbstractC6550oP {

    /* renamed from: a */
    public float f10683a;

    /* renamed from: b */
    public float f10684b;

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(Snapshot.WIDTH, this.f10683a);
        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, this.f10684b);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topContentSizeChange";
    }
}
