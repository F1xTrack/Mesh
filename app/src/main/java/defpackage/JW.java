package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
public final class JW extends AbstractC6260oP {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JW(Object obj, int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
        this.b = obj;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        switch (this.a) {
        }
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                KW kw = (KW) this.b;
                writableMapCreateMap.putInt("target", kw.g);
                writableMapCreateMap.putInt("parentScrollViewTarget", kw.h);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("x", kw.a);
                writableMapCreateMap2.putDouble("y", kw.b);
                writableMapCreateMap2.putDouble(Snapshot.WIDTH, kw.c);
                writableMapCreateMap2.putDouble(Snapshot.HEIGHT, kw.d);
                writableMapCreateMap2.putDouble("absoluteX", kw.e);
                writableMapCreateMap2.putDouble("absoluteY", kw.f);
                writableMapCreateMap.putMap("layout", writableMapCreateMap2);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                OW ow = (OW) this.b;
                writableMapCreateMap3.putInt("target", ow.a);
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                WritableMap writableMapCreateMap5 = Arguments.createMap();
                writableMapCreateMap5.putDouble("x", ow.b);
                writableMapCreateMap5.putDouble("y", ow.c);
                writableMapCreateMap5.putInt("position", ow.f);
                writableMapCreateMap4.putMap("start", writableMapCreateMap5);
                WritableMap writableMapCreateMap6 = Arguments.createMap();
                writableMapCreateMap6.putDouble("x", ow.d);
                writableMapCreateMap6.putDouble("y", ow.e);
                writableMapCreateMap6.putInt("position", ow.g);
                writableMapCreateMap4.putMap("end", writableMapCreateMap6);
                writableMapCreateMap3.putMap("selection", writableMapCreateMap4);
                return writableMapCreateMap3;
            default:
                WritableMap writableMapCreateMap7 = Arguments.createMap();
                writableMapCreateMap7.putString("error", ((Throwable) this.b).getMessage());
                return writableMapCreateMap7;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topFocusedInputLayoutChanged";
            case 1:
                return "topFocusedInputSelectionChanged";
            default:
                return "topAnimationFailure";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JW(Throwable th, int i, int i2) {
        super(i, i2);
        this.a = 2;
        O90.f(th, "error");
        this.b = th;
    }
}
