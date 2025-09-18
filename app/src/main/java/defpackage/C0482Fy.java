package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: Fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482Fy extends AbstractC6260oP {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;

    public /* synthetic */ C0482Fy(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble(Snapshot.WIDTH, AbstractC7586vL1.a(this.b));
                writableMapCreateMap.putDouble(Snapshot.HEIGHT, AbstractC7586vL1.a(this.c));
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putInt("end", this.c);
                writableMapCreateMap3.putInt("start", this.b);
                writableMapCreateMap2.putMap("selection", writableMapCreateMap3);
                return writableMapCreateMap2;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topContentSizeChange";
            default:
                return "topSelectionChange";
        }
    }

    public C0482Fy(int i, int i2, int i3) {
        super(-1, i);
        this.b = i2;
        this.c = i3;
    }
}
