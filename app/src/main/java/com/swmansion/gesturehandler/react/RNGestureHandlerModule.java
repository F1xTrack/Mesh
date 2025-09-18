package com.swmansion.gesturehandler.react;

import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC10900rO1;
import p000.AbstractC11077sn0;
import p000.AbstractC6550oP;
import p000.AbstractC7222ym;
import p000.C10107lC0;
import p000.FH0;
import p000.GH0;
import p000.HH0;
import p000.HN1;
import p000.IH0;
import p000.InterfaceC9101dL0;
import p000.JH0;
import p000.KH0;
import p000.MH0;
import p000.MN1;
import p000.NN0;
import p000.O90;
import p000.OH0;
import p000.PN1;
import p000.R00;
import p000.RH0;
import p000.RunnableC8352Tz0;
import p000.S00;
import p000.SH0;
import p000.U00;

@InterfaceC9101dL0(name = "RNGestureHandlerModule")
@Metadata(m22266d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001V\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u000bkl@llllllllB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001aH\u0017¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010\u001fJ\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00100J7\u00104\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00105J/\u00106\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0082 ¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u0004\u0018\u00010-2\u0006\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010>J5\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010@\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010C\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010?\u001a\u00028\u0000H\u0002¢\u0006\u0004\bC\u0010DJ7\u0010F\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010?\u001a\u00028\u00002\u0006\u0010#\u001a\u00020!2\u0006\u0010E\u001a\u00020!H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010?\u001a\u00028\u0000H\u0002¢\u0006\u0004\bH\u0010DJ'\u0010K\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010J\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u00020\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010J\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010LJ\u001f\u0010T\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0017\u0010]\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020-0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006m"}, m22267d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "LU00;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "handlerName", "", "handlerTagDouble", "Lcom/facebook/react/bridge/ReadableMap;", "config", "LTf1;", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "", "handlerTag", "newState", "setGestureHandlerState", "(II)V", "install", "()Z", "", "", "getConstants", "()Ljava/util/Map;", "invalidate", "LOH0;", "root", "registerRootHelper", "(LOH0;)V", "unregisterRootHelper", "LR00;", "T", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "findRootHelperForViewAncestor", "(I)LOH0;", "handler", "LJH0;", "findFactoryForHandler", "(LR00;)LJH0;", "onHandlerUpdate", "(LR00;)V", "oldState", "onStateChange", "(LR00;II)V", "onTouchEvent", "LoP;", "event", "sendEventForReanimated", "(LoP;)V", "LFH0;", "sendEventForNativeAnimatedEvent", "(LFH0;)V", "sendEventForDirectEvent", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "sendEventForDeviceEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "KH0", "eventListener", "LKH0;", "", "handlerFactories", "[LJH0;", "LMH0;", "registry", "LMH0;", "getRegistry", "()LMH0;", "LGH0;", "interactionManager", "LGH0;", "", "roots", "Ljava/util/List;", "LNN0;", "reanimatedEventDispatcher", "LNN0;", "Companion", "HH0", "IH0", "react-native-gesture-handler_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements U00 {
    public static final HH0 Companion = new HH0();
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String NAME = "RNGestureHandlerModule";
    private final KH0 eventListener;
    private final JH0[] handlerFactories;
    private final GH0 interactionManager;
    private final NN0 reanimatedEventDispatcher;
    private final MH0 registry;
    private final List<OH0> roots;

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new KH0(this);
        this.handlerFactories = new JH0[]{new IH0(4), new IH0(8), new IH0(2), new IH0(5), new IH0(6), new IH0(7), new IH0(0), new IH0(3), new IH0(1)};
        this.registry = new MH0();
        this.interactionManager = new GH0();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new NN0();
    }

    private final <T extends R00> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        if (this.registry.m5292e(handlerTag) != null) {
            throw new IllegalStateException(AbstractC7222ym.m26230g(handlerTag, "Handler with tag ", " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors."));
        }
        for (JH0 jh0 : this.handlerFactories) {
            if (jh0.mo3804d().equals(handlerName)) {
                R00 r00Mo3802b = jh0.mo3802b(getReactApplicationContext());
                r00Mo3802b.f9903d = handlerTag;
                r00Mo3802b.f9892B = this.eventListener;
                this.registry.m5295h(r00Mo3802b);
                this.interactionManager.m3022a(r00Mo3802b, config);
                jh0.mo3801a(r00Mo3802b, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Invalid handler name ", handlerName));
    }

    private final native void decorateRuntime(long jsiPtr);

    private final <T extends R00> JH0 findFactoryForHandler(R00 handler) {
        for (JH0 jh0 : this.handlerFactories) {
            if (jh0.mo3805e().equals(handler.getClass())) {
                return jh0;
            }
        }
        return null;
    }

    private final OH0 findRootHelperForViewAncestor(int viewTag) {
        OH0 oh0;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        NativeModule nativeModule = reactApplicationContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        O90.m5965c(nativeModule);
        int iResolveRootTagFromReactTag = ((UIManagerModule) nativeModule).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                Iterator<T> it = this.roots.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ViewGroup viewGroup = ((OH0) next).f8340d;
                    if ((viewGroup instanceof ReactRootView) && ((ReactRootView) viewGroup).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = next;
                        break;
                    }
                }
                oh0 = (OH0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oh0;
    }

    public static final void install$lambda$2(RNGestureHandlerModule rNGestureHandlerModule) {
        O90.m5968f(rNGestureHandlerModule, "this$0");
        try {
            SoLoader.m11076j("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            O90.m5965c(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
        }
    }

    public final <T extends R00> void onHandlerUpdate(T handler) {
        JH0 jh0FindFactoryForHandler;
        if (handler.f9903d >= 0 && handler.f9905f == 4 && (jh0FindFactoryForHandler = findFactoryForHandler(handler)) != null) {
            int i = handler.f9910k;
            if (i == 1) {
                C10107lC0 c10107lC0 = FH0.f3141d;
                sendEventForReanimated(HN1.m3387b(handler, jh0FindFactoryForHandler.mo3803c(handler), false));
                return;
            }
            if (i == 2) {
                C10107lC0 c10107lC02 = FH0.f3141d;
                sendEventForNativeAnimatedEvent(HN1.m3387b(handler, jh0FindFactoryForHandler.mo3803c(handler), true));
                return;
            }
            if (i == 3) {
                C10107lC0 c10107lC03 = FH0.f3141d;
                sendEventForDirectEvent(HN1.m3387b(handler, jh0FindFactoryForHandler.mo3803c(handler), false));
            } else if (i == 4) {
                C10107lC0 c10107lC04 = FH0.f3141d;
                S00 s00Mo3803c = jh0FindFactoryForHandler.mo3803c(handler);
                WritableMap writableMapCreateMap = Arguments.createMap();
                O90.m5965c(writableMapCreateMap);
                s00Mo3803c.mo315a(writableMapCreateMap);
                sendEventForDeviceEvent("onGestureHandlerEvent", writableMapCreateMap);
            }
        }
    }

    public final <T extends R00> void onStateChange(T handler, int newState, int oldState) {
        JH0 jh0FindFactoryForHandler;
        if (handler.f9903d >= 0 && (jh0FindFactoryForHandler = findFactoryForHandler(handler)) != null) {
            int i = handler.f9910k;
            if (i == 1) {
                C10107lC0 c10107lC0 = RH0.f10107d;
                sendEventForReanimated(MN1.m5360b(handler, newState, oldState, jh0FindFactoryForHandler.mo3803c(handler)));
                return;
            }
            if (i == 2 || i == 3) {
                C10107lC0 c10107lC02 = RH0.f10107d;
                sendEventForDirectEvent(MN1.m5360b(handler, newState, oldState, jh0FindFactoryForHandler.mo3803c(handler)));
            } else if (i == 4) {
                C10107lC0 c10107lC03 = RH0.f10107d;
                S00 s00Mo3803c = jh0FindFactoryForHandler.mo3803c(handler);
                WritableMap writableMapCreateMap = Arguments.createMap();
                O90.m5965c(writableMapCreateMap);
                s00Mo3803c.mo315a(writableMapCreateMap);
                writableMapCreateMap.putInt("state", newState);
                writableMapCreateMap.putInt("oldState", oldState);
                sendEventForDeviceEvent("onGestureHandlerStateChange", writableMapCreateMap);
            }
        }
    }

    public final <T extends R00> void onTouchEvent(T handler) {
        if (handler.f9903d < 0) {
            return;
        }
        int i = handler.f9905f;
        if (i == 2 || i == 4 || i == 0 || handler.f9904e != null) {
            int i2 = handler.f9910k;
            if (i2 != 1) {
                if (i2 == 4) {
                    C10107lC0 c10107lC0 = SH0.f10671c;
                    sendEventForDeviceEvent("onGestureHandlerEvent", PN1.m6355a(handler));
                    return;
                }
                return;
            }
            SH0 sh0 = (SH0) SH0.f10671c.mo4581i();
            if (sh0 == null) {
                sh0 = new SH0();
            }
            SH0.m7209a(sh0, handler);
            sendEventForReanimated(sh0);
        }
    }

    private final void sendEventForDeviceEvent(String eventName, WritableMap data) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        JavaScriptModule jSModule = reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        O90.m5967e(jSModule, "getJSModule(...)");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule).emit(eventName, data);
    }

    private final <T extends AbstractC6550oP> void sendEventForDirectEvent(T event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        AbstractC10900rO1.m24325a(reactApplicationContext, event);
    }

    private final void sendEventForNativeAnimatedEvent(FH0 event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        AbstractC10900rO1.m24325a(reactApplicationContext, event);
    }

    private final <T extends AbstractC6550oP> void sendEventForReanimated(T event) {
        sendEventForDirectEvent(event);
    }

    private final <T extends R00> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        JH0 jh0FindFactoryForHandler;
        R00 r00M5292e = this.registry.m5292e(handlerTag);
        if (r00M5292e == null || (jh0FindFactoryForHandler = findFactoryForHandler(r00M5292e)) == null) {
            return;
        }
        GH0 gh0 = this.interactionManager;
        gh0.f3662a.remove(handlerTag);
        gh0.f3663b.remove(handlerTag);
        this.interactionManager.m3022a(r00M5292e, config);
        jh0FindFactoryForHandler.mo3801a(r00M5292e, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i = (int) handlerTagDouble;
        if (!this.registry.m5288a(i, (int) viewTagDouble, (int) actionTypeDouble)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "Handler with tag ", " does not exists"));
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String handlerName, double handlerTagDouble, ReadableMap config) {
        O90.m5968f(handlerName, "handlerName");
        O90.m5968f(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i = (int) handlerTagDouble;
        GH0 gh0 = this.interactionManager;
        gh0.f3662a.remove(i);
        gh0.f3663b.remove(i);
        this.registry.m5291d(i);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return AbstractC11077sn0.m24780h(new Pair("State", AbstractC11077sn0.m24780h(new Pair("UNDETERMINED", 0), new Pair("BEGAN", 2), new Pair("ACTIVE", 4), new Pair("CANCELLED", 3), new Pair("FAILED", 1), new Pair("END", 5))), new Pair("Direction", AbstractC11077sn0.m24780h(new Pair("RIGHT", 1), new Pair("LEFT", 2), new Pair("UP", 4), new Pair("DOWN", 8))));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final MH0 getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        OH0 oh0FindRootHelperForViewAncestor = findRootHelperForViewAncestor((int) viewTagDouble);
        if (oh0FindRootHelperForViewAncestor == null || !blockNativeResponder) {
            return;
        }
        UiThreadUtil.runOnUiThread(new RunnableC8352Tz0(6, oh0FindRootHelperForViewAncestor));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new RunnableC8352Tz0(5, this));
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.m5290c();
        GH0 gh0 = this.interactionManager;
        gh0.f3662a.clear();
        gh0.f3663b.clear();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                this.roots.get(0).m6006b();
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.invalidate();
    }

    public final void registerRootHelper(OH0 root) {
        O90.m5968f(root, "root");
        synchronized (this.roots) {
            if (this.roots.contains(root)) {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
            this.roots.add(root);
        }
    }

    @Override // p000.U00
    public void setGestureHandlerState(int handlerTag, int newState) {
        R00 r00M5292e = this.registry.m5292e(handlerTag);
        if (r00M5292e != null) {
            if (newState == 1) {
                r00M5292e.m6864m();
                return;
            }
            if (newState == 2) {
                r00M5292e.m6856d();
                return;
            }
            if (newState == 3) {
                r00M5292e.m6857e();
            } else if (newState == 4) {
                r00M5292e.mo721a(true);
            } else {
                if (newState != 5) {
                    return;
                }
                r00M5292e.m6862k();
            }
        }
    }

    public final void unregisterRootHelper(OH0 root) {
        O90.m5968f(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, ReadableMap config) {
        O90.m5968f(config, "config");
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }
}
