package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: u01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11232u01 extends AbstractC6550oP {

    /* renamed from: a */
    public final int f43443a;

    /* renamed from: b */
    public final boolean f43444b;

    public C11232u01(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.f43443a = i3;
        this.f43444b = z;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.f43443a);
        writableMapCreateMap.putBoolean("isStable", this.f43444b);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topSheetDetentChanged";
    }
}
