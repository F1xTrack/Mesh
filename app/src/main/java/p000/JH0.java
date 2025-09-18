package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
public abstract class JH0 {
    /* renamed from: a */
    public void mo3801a(R00 r00, ReadableMap readableMap) {
        O90.m5968f(readableMap, "config");
        r00.mo6872z();
        if (readableMap.hasKey("shouldCancelWhenOutside")) {
            r00.f9924y = readableMap.getBoolean("shouldCancelWhenOutside");
        }
        if (readableMap.hasKey("enabled")) {
            boolean z = readableMap.getBoolean("enabled");
            if (r00.f9904e != null && r00.f9909j != z) {
                UiThreadUtil.runOnUiThread(new O00(0, r00));
            }
            r00.f9909j = z;
        }
        if (readableMap.hasKey("hitSlop")) {
            RNGestureHandlerModule.Companion.getClass();
            if (readableMap.getType("hitSlop") == ReadableType.Number) {
                float fM25403b = AbstractC11406vL1.m25403b((float) readableMap.getDouble("hitSlop"));
                r00.m6850B(fM25403b, fM25403b, fM25403b, fM25403b, Float.NaN, Float.NaN);
            } else {
                ReadableMap map = readableMap.getMap("hitSlop");
                O90.m5965c(map);
                float fM25403b2 = map.hasKey("horizontal") ? AbstractC11406vL1.m25403b((float) map.getDouble("horizontal")) : Float.NaN;
                float fM25403b3 = fM25403b2;
                float fM25403b4 = map.hasKey("vertical") ? AbstractC11406vL1.m25403b((float) map.getDouble("vertical")) : Float.NaN;
                float fM25403b5 = fM25403b4;
                if (map.hasKey("left")) {
                    fM25403b2 = AbstractC11406vL1.m25403b((float) map.getDouble("left"));
                }
                float f = fM25403b2;
                if (map.hasKey("top")) {
                    fM25403b4 = AbstractC11406vL1.m25403b((float) map.getDouble("top"));
                }
                float f2 = fM25403b4;
                if (map.hasKey("right")) {
                    fM25403b3 = AbstractC11406vL1.m25403b((float) map.getDouble("right"));
                }
                float f3 = fM25403b3;
                if (map.hasKey("bottom")) {
                    fM25403b5 = AbstractC11406vL1.m25403b((float) map.getDouble("bottom"));
                }
                r00.m6850B(f, f2, f3, fM25403b5, map.hasKey(Snapshot.WIDTH) ? AbstractC11406vL1.m25403b((float) map.getDouble(Snapshot.WIDTH)) : Float.NaN, map.hasKey(Snapshot.HEIGHT) ? AbstractC11406vL1.m25403b((float) map.getDouble(Snapshot.HEIGHT)) : Float.NaN);
            }
        }
        if (readableMap.hasKey("needsPointerData")) {
            r00.f9916q = readableMap.getBoolean("needsPointerData");
        }
        if (readableMap.hasKey("manualActivation")) {
            r00.f9921v = readableMap.getBoolean("manualActivation");
        }
        if (readableMap.hasKey("mouseButton")) {
            r00.f9895E = readableMap.getInt("mouseButton");
        }
    }

    /* renamed from: b */
    public abstract R00 mo3802b(ReactApplicationContext reactApplicationContext);

    /* renamed from: c */
    public abstract S00 mo3803c(R00 r00);

    /* renamed from: d */
    public abstract String mo3804d();

    /* renamed from: e */
    public abstract Class mo3805e();
}
