package p000;

import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class HJ0 {

    /* renamed from: c */
    public static final HashMap f4227c;

    /* renamed from: a */
    public int f4228a = -1;

    /* renamed from: b */
    public final ReactRootView f4229b;

    static {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k(23, "select");
        c0926OiM24254a.m6125k(66, "select");
        c0926OiM24254a.m6125k(62, "select");
        c0926OiM24254a.m6125k(85, "playPause");
        c0926OiM24254a.m6125k(89, "rewind");
        c0926OiM24254a.m6125k(90, "fastForward");
        c0926OiM24254a.m6125k(86, "stop");
        c0926OiM24254a.m6125k(87, "next");
        c0926OiM24254a.m6125k(88, "previous");
        c0926OiM24254a.m6125k(19, "up");
        c0926OiM24254a.m6125k(22, "right");
        c0926OiM24254a.m6125k(20, "down");
        c0926OiM24254a.m6125k(21, "left");
        c0926OiM24254a.m6125k(165, "info");
        c0926OiM24254a.m6125k(82, "menu");
        f4227c = c0926OiM24254a.m6122h();
    }

    public HJ0(ReactRootView reactRootView) {
        this.f4229b = reactRootView;
    }

    /* renamed from: a */
    public final void m3344a(int i, int i2, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f4229b.m10916l("onHWKeyEvent", writableNativeMap);
    }
}
