package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class UM0 extends AbstractC6260oP {
    public String a;
    public int b;

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.a);
        writableMapCreateMap.putInt("eventCount", this.b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topChange";
    }
}
