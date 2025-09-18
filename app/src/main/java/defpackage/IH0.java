package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes2.dex */
public final class IH0 extends JH0 {
    public final /* synthetic */ int a;

    public /* synthetic */ IH0(int i) {
        this.a = i;
    }

    @Override // defpackage.JH0
    public void a(R00 r00, ReadableMap readableMap) {
        boolean z;
        switch (this.a) {
            case 0:
                C4359iW c4359iW = (C4359iW) r00;
                O90.f(readableMap, "config");
                super.a(c4359iW, readableMap);
                if (readableMap.hasKey("numberOfPointers")) {
                    c4359iW.M = readableMap.getInt("numberOfPointers");
                }
                if (readableMap.hasKey(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                    c4359iW.N = readableMap.getInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
                    break;
                }
                break;
            case 1:
            case 3:
            case 6:
            case 7:
            default:
                super.a(r00, readableMap);
                break;
            case 2:
                C8423zl0 c8423zl0 = (C8423zl0) r00;
                O90.f(readableMap, "config");
                super.a(c8423zl0, readableMap);
                if (readableMap.hasKey("minDurationMs")) {
                    c8423zl0.M = readableMap.getInt("minDurationMs");
                }
                if (readableMap.hasKey("maxDist")) {
                    float fB = AbstractC7586vL1.b((float) readableMap.getDouble("maxDist"));
                    c8423zl0.O = fB * fB;
                }
                if (readableMap.hasKey("numberOfPointers")) {
                    c8423zl0.P = readableMap.getInt("numberOfPointers");
                    break;
                }
                break;
            case 4:
                C8070xu0 c8070xu0 = (C8070xu0) r00;
                O90.f(readableMap, "config");
                super.a(c8070xu0, readableMap);
                if (readableMap.hasKey("shouldActivateOnStart")) {
                    c8070xu0.M = readableMap.getBoolean("shouldActivateOnStart");
                }
                if (readableMap.hasKey("disallowInterruption")) {
                    c8070xu0.N = readableMap.getBoolean("disallowInterruption");
                    break;
                }
                break;
            case 5:
                C2083aA0 c2083aA0 = (C2083aA0) r00;
                O90.f(readableMap, "config");
                super.a(c2083aA0, readableMap);
                boolean z2 = true;
                if (readableMap.hasKey("activeOffsetXStart")) {
                    c2083aA0.Q = AbstractC7586vL1.b((float) readableMap.getDouble("activeOffsetXStart"));
                    z = true;
                } else {
                    z = false;
                }
                if (readableMap.hasKey("activeOffsetXEnd")) {
                    c2083aA0.R = AbstractC7586vL1.b((float) readableMap.getDouble("activeOffsetXEnd"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetXStart")) {
                    c2083aA0.S = AbstractC7586vL1.b((float) readableMap.getDouble("failOffsetXStart"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetXEnd")) {
                    c2083aA0.T = AbstractC7586vL1.b((float) readableMap.getDouble("failOffsetXEnd"));
                    z = true;
                }
                if (readableMap.hasKey("activeOffsetYStart")) {
                    c2083aA0.U = AbstractC7586vL1.b((float) readableMap.getDouble("activeOffsetYStart"));
                    z = true;
                }
                if (readableMap.hasKey("activeOffsetYEnd")) {
                    c2083aA0.V = AbstractC7586vL1.b((float) readableMap.getDouble("activeOffsetYEnd"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetYStart")) {
                    c2083aA0.W = AbstractC7586vL1.b((float) readableMap.getDouble("failOffsetYStart"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetYEnd")) {
                    c2083aA0.X = AbstractC7586vL1.b((float) readableMap.getDouble("failOffsetYEnd"));
                    z = true;
                }
                if (readableMap.hasKey("minVelocity")) {
                    float fB2 = AbstractC7586vL1.b((float) readableMap.getDouble("minVelocity"));
                    c2083aA0.a0 = fB2 * fB2;
                    z = true;
                }
                if (readableMap.hasKey("minVelocityX")) {
                    c2083aA0.Y = AbstractC7586vL1.b((float) readableMap.getDouble("minVelocityX"));
                    z = true;
                }
                if (readableMap.hasKey("minVelocityY")) {
                    c2083aA0.Z = AbstractC7586vL1.b((float) readableMap.getDouble("minVelocityY"));
                } else {
                    z2 = z;
                }
                if (readableMap.hasKey("minDist")) {
                    float fB3 = AbstractC7586vL1.b((float) readableMap.getDouble("minDist"));
                    c2083aA0.P = fB3 * fB3;
                } else if (z2) {
                    c2083aA0.P = Float.POSITIVE_INFINITY;
                }
                if (readableMap.hasKey("minPointers")) {
                    c2083aA0.b0 = readableMap.getInt("minPointers");
                }
                if (readableMap.hasKey("maxPointers")) {
                    c2083aA0.c0 = readableMap.getInt("maxPointers");
                }
                if (readableMap.hasKey("avgTouches")) {
                    c2083aA0.k0 = readableMap.getBoolean("avgTouches");
                }
                if (readableMap.hasKey("activateAfterLongPress")) {
                    c2083aA0.l0 = readableMap.getInt("activateAfterLongPress");
                    break;
                }
                break;
            case 8:
                C8307z81 c8307z81 = (C8307z81) r00;
                O90.f(readableMap, "config");
                super.a(c8307z81, readableMap);
                if (readableMap.hasKey("numberOfTaps")) {
                    c8307z81.R = readableMap.getInt("numberOfTaps");
                }
                if (readableMap.hasKey("maxDurationMs")) {
                    c8307z81.P = readableMap.getInt("maxDurationMs");
                }
                if (readableMap.hasKey("maxDelayMs")) {
                    c8307z81.Q = readableMap.getInt("maxDelayMs");
                }
                if (readableMap.hasKey("maxDeltaX")) {
                    c8307z81.M = AbstractC7586vL1.b((float) readableMap.getDouble("maxDeltaX"));
                }
                if (readableMap.hasKey("maxDeltaY")) {
                    c8307z81.N = AbstractC7586vL1.b((float) readableMap.getDouble("maxDeltaY"));
                }
                if (readableMap.hasKey("maxDist")) {
                    float fB4 = AbstractC7586vL1.b((float) readableMap.getDouble("maxDist"));
                    c8307z81.O = fB4 * fB4;
                }
                if (readableMap.hasKey("minPointers")) {
                    c8307z81.S = readableMap.getInt("minPointers");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.JH0
    public final R00 b(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return new C4359iW();
            case 1:
                N30 n30 = new N30();
                n30.N = new DE(17, n30);
                n30.O = new H51();
                return n30;
            case 2:
                O90.c(reactApplicationContext);
                return new C8423zl0(reactApplicationContext);
            case 3:
                return new C1382Rm0();
            case 4:
                C8070xu0 c8070xu0 = new C8070xu0();
                c8070xu0.O = C8070xu0.P;
                c8070xu0.y = true;
                return c8070xu0;
            case 5:
                return new C2083aA0(reactApplicationContext);
            case 6:
                return new C3915gB0();
            case 7:
                return new BT0();
            default:
                return new C8307z81();
        }
    }

    @Override // defpackage.JH0
    public final S00 c(R00 r00) {
        switch (this.a) {
            case 0:
                C4359iW c4359iW = (C4359iW) r00;
                O90.f(c4359iW, "handler");
                return new C5326jW(c4359iW);
            case 1:
                N30 n30 = (N30) r00;
                O90.f(n30, "handler");
                return new O30(n30);
            case 2:
                C8423zl0 c8423zl0 = (C8423zl0) r00;
                O90.f(c8423zl0, "handler");
                return new C0054Al0(c8423zl0);
            case 3:
                C1382Rm0 c1382Rm0 = (C1382Rm0) r00;
                O90.f(c1382Rm0, "handler");
                return new C1460Sm0(c1382Rm0);
            case 4:
                C8070xu0 c8070xu0 = (C8070xu0) r00;
                O90.f(c8070xu0, "handler");
                return new C5590ku0(c8070xu0);
            case 5:
                C2083aA0 c2083aA0 = (C2083aA0) r00;
                O90.f(c2083aA0, "handler");
                return new C2274bA0(c2083aA0);
            case 6:
                C3915gB0 c3915gB0 = (C3915gB0) r00;
                O90.f(c3915gB0, "handler");
                return new C4106hB0(c3915gB0);
            case 7:
                BT0 bt0 = (BT0) r00;
                O90.f(bt0, "handler");
                return new C4106hB0(bt0);
            default:
                C8307z81 c8307z81 = (C8307z81) r00;
                O90.f(c8307z81, "handler");
                return new C5326jW(c8307z81);
        }
    }

    @Override // defpackage.JH0
    public final String d() {
        switch (this.a) {
            case 0:
                return "FlingGestureHandler";
            case 1:
                return "HoverGestureHandler";
            case 2:
                return "LongPressGestureHandler";
            case 3:
                return "ManualGestureHandler";
            case 4:
                return "NativeViewGestureHandler";
            case 5:
                return "PanGestureHandler";
            case 6:
                return "PinchGestureHandler";
            case 7:
                return "RotationGestureHandler";
            default:
                return "TapGestureHandler";
        }
    }

    @Override // defpackage.JH0
    public final Class e() {
        switch (this.a) {
            case 0:
                return C4359iW.class;
            case 1:
                return N30.class;
            case 2:
                return C8423zl0.class;
            case 3:
                return C1382Rm0.class;
            case 4:
                return C8070xu0.class;
            case 5:
                return C2083aA0.class;
            case 6:
                return C3915gB0.class;
            case 7:
                return BT0.class;
            default:
                return C8307z81.class;
        }
    }
}
