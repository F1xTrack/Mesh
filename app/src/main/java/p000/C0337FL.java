package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: FL */
/* loaded from: classes.dex */
public final class C0337FL extends AbstractC6550oP {

    /* renamed from: a */
    public final float f3158a;

    public C0337FL(int i, float f, int i2) {
        super(i, i2);
        this.f3158a = f;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.m5967e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("offset", this.f3158a);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topDrawerSlide";
    }
}
