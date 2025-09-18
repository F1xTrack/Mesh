package defpackage;

import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class HJ0 {
    public static final HashMap c;
    public int a = -1;
    public final ReactRootView b;

    static {
        C1135Oi c1135OiA = AbstractC6815rJ0.a();
        c1135OiA.k(23, "select");
        c1135OiA.k(66, "select");
        c1135OiA.k(62, "select");
        c1135OiA.k(85, "playPause");
        c1135OiA.k(89, "rewind");
        c1135OiA.k(90, "fastForward");
        c1135OiA.k(86, "stop");
        c1135OiA.k(87, "next");
        c1135OiA.k(88, "previous");
        c1135OiA.k(19, "up");
        c1135OiA.k(22, "right");
        c1135OiA.k(20, "down");
        c1135OiA.k(21, "left");
        c1135OiA.k(165, "info");
        c1135OiA.k(82, "menu");
        c = c1135OiA.h();
    }

    public HJ0(ReactRootView reactRootView) {
        this.b = reactRootView;
    }

    public final void a(int i, int i2, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.b.l("onHWKeyEvent", writableNativeMap);
    }
}
