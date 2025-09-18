package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class O60 extends AbstractC6550oP {

    /* renamed from: a */
    public final int f8231a;

    /* renamed from: b */
    public final String f8232b;

    /* renamed from: c */
    public final String f8233c;

    /* renamed from: d */
    public final int f8234d;

    /* renamed from: e */
    public final int f8235e;

    /* renamed from: f */
    public final int f8236f;

    /* renamed from: g */
    public final int f8237g;

    public /* synthetic */ O60(int i, int i2, int i3) {
        this(null, null, i, i2, i3, 0, 0, 0, 0);
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return (short) this.f8231a;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.f8231a;
        if (i == 1) {
            writableMapCreateMap.putString("error", this.f8232b);
        } else if (i == 2) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("uri", this.f8233c);
            writableMapCreateMap2.putDouble(Snapshot.WIDTH, this.f8234d);
            writableMapCreateMap2.putDouble(Snapshot.HEIGHT, this.f8235e);
            writableMapCreateMap.putMap("source", writableMapCreateMap2);
        } else if (i == 5) {
            int i2 = this.f8236f;
            writableMapCreateMap.putInt("loaded", i2);
            int i3 = this.f8237g;
            writableMapCreateMap.putInt("total", i3);
            writableMapCreateMap.putDouble("progress", i2 / i3);
        }
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return AbstractC9191e22.m17826a(this.f8231a);
    }

    public O60(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2);
        this.f8231a = i3;
        this.f8232b = str;
        this.f8233c = str2;
        this.f8234d = i4;
        this.f8235e = i5;
        this.f8236f = i6;
        this.f8237g = i7;
    }
}
