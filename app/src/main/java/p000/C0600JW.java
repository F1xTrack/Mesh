package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: JW */
/* loaded from: classes2.dex */
public final class C0600JW extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f5563a;

    /* renamed from: b */
    public final Object f5564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0600JW(Object obj, int i, int i2, int i3) {
        super(i, i2);
        this.f5563a = i3;
        this.f5564b = obj;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        switch (this.f5563a) {
        }
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        switch (this.f5563a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                C0663KW c0663kw = (C0663KW) this.f5564b;
                writableMapCreateMap.putInt("target", c0663kw.f6140g);
                writableMapCreateMap.putInt("parentScrollViewTarget", c0663kw.f6141h);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("x", c0663kw.f6134a);
                writableMapCreateMap2.putDouble("y", c0663kw.f6135b);
                writableMapCreateMap2.putDouble(Snapshot.WIDTH, c0663kw.f6136c);
                writableMapCreateMap2.putDouble(Snapshot.HEIGHT, c0663kw.f6137d);
                writableMapCreateMap2.putDouble("absoluteX", c0663kw.f6138e);
                writableMapCreateMap2.putDouble("absoluteY", c0663kw.f6139f);
                writableMapCreateMap.putMap("layout", writableMapCreateMap2);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                C0914OW c0914ow = (C0914OW) this.f5564b;
                writableMapCreateMap3.putInt("target", c0914ow.f8466a);
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                WritableMap writableMapCreateMap5 = Arguments.createMap();
                writableMapCreateMap5.putDouble("x", c0914ow.f8467b);
                writableMapCreateMap5.putDouble("y", c0914ow.f8468c);
                writableMapCreateMap5.putInt("position", c0914ow.f8471f);
                writableMapCreateMap4.putMap("start", writableMapCreateMap5);
                WritableMap writableMapCreateMap6 = Arguments.createMap();
                writableMapCreateMap6.putDouble("x", c0914ow.f8469d);
                writableMapCreateMap6.putDouble("y", c0914ow.f8470e);
                writableMapCreateMap6.putInt("position", c0914ow.f8472g);
                writableMapCreateMap4.putMap("end", writableMapCreateMap6);
                writableMapCreateMap3.putMap("selection", writableMapCreateMap4);
                return writableMapCreateMap3;
            default:
                WritableMap writableMapCreateMap7 = Arguments.createMap();
                writableMapCreateMap7.putString("error", ((Throwable) this.f5564b).getMessage());
                return writableMapCreateMap7;
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f5563a) {
            case 0:
                return "topFocusedInputLayoutChanged";
            case 1:
                return "topFocusedInputSelectionChanged";
            default:
                return "topAnimationFailure";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0600JW(Throwable th, int i, int i2) {
        super(i, i2);
        this.f5563a = 2;
        O90.m5968f(th, "error");
        this.f5564b = th;
    }
}
