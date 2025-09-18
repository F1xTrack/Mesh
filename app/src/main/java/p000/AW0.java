package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class AW0 extends AbstractC6550oP {

    /* renamed from: a */
    public final float f221a;

    /* renamed from: b */
    public final boolean f222b;

    /* renamed from: c */
    public final boolean f223c;

    /* renamed from: d */
    public final short f224d;

    public AW0(int i, int i2, float f, boolean z, boolean z2, short s) {
        super(i, i2);
        this.f221a = f;
        this.f222b = z;
        this.f223c = z2;
        this.f224d = s;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return this.f224d;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.f221a);
        writableMapCreateMap.putInt("closing", this.f222b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f223c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topTransitionProgress";
    }
}
