package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class O60 extends AbstractC6260oP {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public /* synthetic */ O60(int i, int i2, int i3) {
        this(null, null, i, i2, i3, 0, 0, 0, 0);
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return (short) this.a;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.a;
        if (i == 1) {
            writableMapCreateMap.putString("error", this.b);
        } else if (i == 2) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("uri", this.c);
            writableMapCreateMap2.putDouble(Snapshot.WIDTH, this.d);
            writableMapCreateMap2.putDouble(Snapshot.HEIGHT, this.e);
            writableMapCreateMap.putMap("source", writableMapCreateMap2);
        } else if (i == 5) {
            int i2 = this.f;
            writableMapCreateMap.putInt("loaded", i2);
            int i3 = this.g;
            writableMapCreateMap.putInt("total", i3);
            writableMapCreateMap.putDouble("progress", i2 / i3);
        }
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return AbstractC3506e22.a(this.a);
    }

    public O60(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2);
        this.a = i3;
        this.b = str;
        this.c = str2;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }
}
