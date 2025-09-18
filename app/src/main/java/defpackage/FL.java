package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class FL extends AbstractC6260oP {
    public final float a;

    public FL(int i, float f, int i2) {
        super(i, i2);
        this.a = f;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("offset", this.a);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topDrawerSlide";
    }
}
