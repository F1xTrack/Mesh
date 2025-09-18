package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes2.dex */
public final class IH0 extends JH0 {

    /* renamed from: a */
    public final /* synthetic */ int f4876a;

    public /* synthetic */ IH0(int i) {
        this.f4876a = i;
    }

    @Override // p000.JH0
    /* renamed from: a */
    public void mo3801a(R00 r00, ReadableMap readableMap) {
        boolean z;
        switch (this.f4876a) {
            case 0:
                C4247iW c4247iW = (C4247iW) r00;
                O90.m5968f(readableMap, "config");
                super.mo3801a(c4247iW, readableMap);
                if (readableMap.hasKey("numberOfPointers")) {
                    c4247iW.f29282M = readableMap.getInt("numberOfPointers");
                }
                if (readableMap.hasKey(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                    c4247iW.f29283N = readableMap.getInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
                    break;
                }
                break;
            case 1:
            case 3:
            case 6:
            case 7:
            default:
                super.mo3801a(r00, readableMap);
                break;
            case 2:
                C11965zl0 c11965zl0 = (C11965zl0) r00;
                O90.m5968f(readableMap, "config");
                super.mo3801a(c11965zl0, readableMap);
                if (readableMap.hasKey("minDurationMs")) {
                    c11965zl0.f46973M = readableMap.getInt("minDurationMs");
                }
                if (readableMap.hasKey("maxDist")) {
                    float fM25403b = AbstractC11406vL1.m25403b((float) readableMap.getDouble("maxDist"));
                    c11965zl0.f46975O = fM25403b * fM25403b;
                }
                if (readableMap.hasKey("numberOfPointers")) {
                    c11965zl0.f46976P = readableMap.getInt("numberOfPointers");
                    break;
                }
                break;
            case 4:
                C11729xu0 c11729xu0 = (C11729xu0) r00;
                O90.m5968f(readableMap, "config");
                super.mo3801a(c11729xu0, readableMap);
                if (readableMap.hasKey("shouldActivateOnStart")) {
                    c11729xu0.f45880M = readableMap.getBoolean("shouldActivateOnStart");
                }
                if (readableMap.hasKey("disallowInterruption")) {
                    c11729xu0.f45881N = readableMap.getBoolean("disallowInterruption");
                    break;
                }
                break;
            case 5:
                C8690aA0 c8690aA0 = (C8690aA0) r00;
                O90.m5968f(readableMap, "config");
                super.mo3801a(c8690aA0, readableMap);
                boolean z2 = true;
                if (readableMap.hasKey("activeOffsetXStart")) {
                    c8690aA0.f15346Q = AbstractC11406vL1.m25403b((float) readableMap.getDouble("activeOffsetXStart"));
                    z = true;
                } else {
                    z = false;
                }
                if (readableMap.hasKey("activeOffsetXEnd")) {
                    c8690aA0.f15347R = AbstractC11406vL1.m25403b((float) readableMap.getDouble("activeOffsetXEnd"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetXStart")) {
                    c8690aA0.f15348S = AbstractC11406vL1.m25403b((float) readableMap.getDouble("failOffsetXStart"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetXEnd")) {
                    c8690aA0.f15349T = AbstractC11406vL1.m25403b((float) readableMap.getDouble("failOffsetXEnd"));
                    z = true;
                }
                if (readableMap.hasKey("activeOffsetYStart")) {
                    c8690aA0.f15350U = AbstractC11406vL1.m25403b((float) readableMap.getDouble("activeOffsetYStart"));
                    z = true;
                }
                if (readableMap.hasKey("activeOffsetYEnd")) {
                    c8690aA0.f15351V = AbstractC11406vL1.m25403b((float) readableMap.getDouble("activeOffsetYEnd"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetYStart")) {
                    c8690aA0.f15352W = AbstractC11406vL1.m25403b((float) readableMap.getDouble("failOffsetYStart"));
                    z = true;
                }
                if (readableMap.hasKey("failOffsetYEnd")) {
                    c8690aA0.f15353X = AbstractC11406vL1.m25403b((float) readableMap.getDouble("failOffsetYEnd"));
                    z = true;
                }
                if (readableMap.hasKey("minVelocity")) {
                    float fM25403b2 = AbstractC11406vL1.m25403b((float) readableMap.getDouble("minVelocity"));
                    c8690aA0.f15356a0 = fM25403b2 * fM25403b2;
                    z = true;
                }
                if (readableMap.hasKey("minVelocityX")) {
                    c8690aA0.f15354Y = AbstractC11406vL1.m25403b((float) readableMap.getDouble("minVelocityX"));
                    z = true;
                }
                if (readableMap.hasKey("minVelocityY")) {
                    c8690aA0.f15355Z = AbstractC11406vL1.m25403b((float) readableMap.getDouble("minVelocityY"));
                } else {
                    z2 = z;
                }
                if (readableMap.hasKey("minDist")) {
                    float fM25403b3 = AbstractC11406vL1.m25403b((float) readableMap.getDouble("minDist"));
                    c8690aA0.f15345P = fM25403b3 * fM25403b3;
                } else if (z2) {
                    c8690aA0.f15345P = Float.POSITIVE_INFINITY;
                }
                if (readableMap.hasKey("minPointers")) {
                    c8690aA0.f15357b0 = readableMap.getInt("minPointers");
                }
                if (readableMap.hasKey("maxPointers")) {
                    c8690aA0.f15358c0 = readableMap.getInt("maxPointers");
                }
                if (readableMap.hasKey("avgTouches")) {
                    c8690aA0.f15366k0 = readableMap.getBoolean("avgTouches");
                }
                if (readableMap.hasKey("activateAfterLongPress")) {
                    c8690aA0.f15367l0 = readableMap.getInt("activateAfterLongPress");
                    break;
                }
                break;
            case 8:
                C11888z81 c11888z81 = (C11888z81) r00;
                O90.m5968f(readableMap, "config");
                super.mo3801a(c11888z81, readableMap);
                if (readableMap.hasKey("numberOfTaps")) {
                    c11888z81.f46649R = readableMap.getInt("numberOfTaps");
                }
                if (readableMap.hasKey("maxDurationMs")) {
                    c11888z81.f46647P = readableMap.getInt("maxDurationMs");
                }
                if (readableMap.hasKey("maxDelayMs")) {
                    c11888z81.f46648Q = readableMap.getInt("maxDelayMs");
                }
                if (readableMap.hasKey("maxDeltaX")) {
                    c11888z81.f46644M = AbstractC11406vL1.m25403b((float) readableMap.getDouble("maxDeltaX"));
                }
                if (readableMap.hasKey("maxDeltaY")) {
                    c11888z81.f46645N = AbstractC11406vL1.m25403b((float) readableMap.getDouble("maxDeltaY"));
                }
                if (readableMap.hasKey("maxDist")) {
                    float fM25403b4 = AbstractC11406vL1.m25403b((float) readableMap.getDouble("maxDist"));
                    c11888z81.f46646O = fM25403b4 * fM25403b4;
                }
                if (readableMap.hasKey("minPointers")) {
                    c11888z81.f46650S = readableMap.getInt("minPointers");
                    break;
                }
                break;
        }
    }

    @Override // p000.JH0
    /* renamed from: b */
    public final R00 mo3802b(ReactApplicationContext reactApplicationContext) {
        switch (this.f4876a) {
            case 0:
                return new C4247iW();
            case 1:
                N30 n30 = new N30();
                n30.f7480N = new RunnableC0204DE(17, n30);
                n30.f7481O = new H51();
                return n30;
            case 2:
                O90.m5965c(reactApplicationContext);
                return new C11965zl0(reactApplicationContext);
            case 3:
                return new C8222Rm0();
            case 4:
                C11729xu0 c11729xu0 = new C11729xu0();
                c11729xu0.f45882O = C11729xu0.f45879P;
                c11729xu0.f9924y = true;
                return c11729xu0;
            case 5:
                return new C8690aA0(reactApplicationContext);
            case 6:
                return new C9465gB0();
            case 7:
                return new BT0();
            default:
                return new C11888z81();
        }
    }

    @Override // p000.JH0
    /* renamed from: c */
    public final S00 mo3803c(R00 r00) {
        switch (this.f4876a) {
            case 0:
                C4247iW c4247iW = (C4247iW) r00;
                O90.m5968f(c4247iW, "handler");
                return new C6242jW(c4247iW);
            case 1:
                N30 n30 = (N30) r00;
                O90.m5968f(n30, "handler");
                return new O30(n30);
            case 2:
                C11965zl0 c11965zl0 = (C11965zl0) r00;
                O90.m5968f(c11965zl0, "handler");
                return new C7336Al0(c11965zl0);
            case 3:
                C8222Rm0 c8222Rm0 = (C8222Rm0) r00;
                O90.m5968f(c8222Rm0, "handler");
                return new C8274Sm0(c8222Rm0);
            case 4:
                C11729xu0 c11729xu0 = (C11729xu0) r00;
                O90.m5968f(c11729xu0, "handler");
                return new C10067ku0(c11729xu0);
            case 5:
                C8690aA0 c8690aA0 = (C8690aA0) r00;
                O90.m5968f(c8690aA0, "handler");
                return new C8818bA0(c8690aA0);
            case 6:
                C9465gB0 c9465gB0 = (C9465gB0) r00;
                O90.m5968f(c9465gB0, "handler");
                return new C9593hB0(c9465gB0);
            case 7:
                BT0 bt0 = (BT0) r00;
                O90.m5968f(bt0, "handler");
                return new C9593hB0(bt0);
            default:
                C11888z81 c11888z81 = (C11888z81) r00;
                O90.m5968f(c11888z81, "handler");
                return new C6242jW(c11888z81);
        }
    }

    @Override // p000.JH0
    /* renamed from: d */
    public final String mo3804d() {
        switch (this.f4876a) {
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

    @Override // p000.JH0
    /* renamed from: e */
    public final Class mo3805e() {
        switch (this.f4876a) {
            case 0:
                return C4247iW.class;
            case 1:
                return N30.class;
            case 2:
                return C11965zl0.class;
            case 3:
                return C8222Rm0.class;
            case 4:
                return C11729xu0.class;
            case 5:
                return C8690aA0.class;
            case 6:
                return C9465gB0.class;
            case 7:
                return BT0.class;
            default:
                return C11888z81.class;
        }
    }
}
