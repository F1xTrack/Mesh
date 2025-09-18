package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class UM0 extends AbstractC6550oP {

    /* renamed from: a */
    public String f11739a;

    /* renamed from: b */
    public int f11740b;

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f11739a);
        writableMapCreateMap.putInt("eventCount", this.f11740b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topChange";
    }
}
