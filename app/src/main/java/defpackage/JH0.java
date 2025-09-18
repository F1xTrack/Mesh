package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
public abstract class JH0 {
    public void a(R00 r00, ReadableMap readableMap) {
        O90.f(readableMap, "config");
        r00.z();
        if (readableMap.hasKey("shouldCancelWhenOutside")) {
            r00.y = readableMap.getBoolean("shouldCancelWhenOutside");
        }
        if (readableMap.hasKey("enabled")) {
            boolean z = readableMap.getBoolean("enabled");
            if (r00.e != null && r00.j != z) {
                UiThreadUtil.runOnUiThread(new O00(0, r00));
            }
            r00.j = z;
        }
        if (readableMap.hasKey("hitSlop")) {
            RNGestureHandlerModule.Companion.getClass();
            if (readableMap.getType("hitSlop") == ReadableType.Number) {
                float fB = AbstractC7586vL1.b((float) readableMap.getDouble("hitSlop"));
                r00.B(fB, fB, fB, fB, Float.NaN, Float.NaN);
            } else {
                ReadableMap map = readableMap.getMap("hitSlop");
                O90.c(map);
                float fB2 = map.hasKey("horizontal") ? AbstractC7586vL1.b((float) map.getDouble("horizontal")) : Float.NaN;
                float fB3 = fB2;
                float fB4 = map.hasKey("vertical") ? AbstractC7586vL1.b((float) map.getDouble("vertical")) : Float.NaN;
                float fB5 = fB4;
                if (map.hasKey("left")) {
                    fB2 = AbstractC7586vL1.b((float) map.getDouble("left"));
                }
                float f = fB2;
                if (map.hasKey("top")) {
                    fB4 = AbstractC7586vL1.b((float) map.getDouble("top"));
                }
                float f2 = fB4;
                if (map.hasKey("right")) {
                    fB3 = AbstractC7586vL1.b((float) map.getDouble("right"));
                }
                float f3 = fB3;
                if (map.hasKey("bottom")) {
                    fB5 = AbstractC7586vL1.b((float) map.getDouble("bottom"));
                }
                r00.B(f, f2, f3, fB5, map.hasKey(Snapshot.WIDTH) ? AbstractC7586vL1.b((float) map.getDouble(Snapshot.WIDTH)) : Float.NaN, map.hasKey(Snapshot.HEIGHT) ? AbstractC7586vL1.b((float) map.getDouble(Snapshot.HEIGHT)) : Float.NaN);
            }
        }
        if (readableMap.hasKey("needsPointerData")) {
            r00.q = readableMap.getBoolean("needsPointerData");
        }
        if (readableMap.hasKey("manualActivation")) {
            r00.v = readableMap.getBoolean("manualActivation");
        }
        if (readableMap.hasKey("mouseButton")) {
            r00.E = readableMap.getInt("mouseButton");
        }
    }

    public abstract R00 b(ReactApplicationContext reactApplicationContext);

    public abstract S00 c(R00 r00);

    public abstract String d();

    public abstract Class e();
}
