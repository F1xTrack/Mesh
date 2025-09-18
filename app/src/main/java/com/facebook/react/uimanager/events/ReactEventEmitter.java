package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p000.AbstractC1374Vq;
import p000.R02;
import p000.UN1;

/* loaded from: classes.dex */
public class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private final ReactApplicationContext mReactContext;
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mDefaultEventEmitter = null;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        UN1.m7997a(writableArray.size() > 0);
        if (R02.m6874b(writableArray.getMap(0).getInt("target")) != 1 || getDefaultEventEmitter() == null) {
            return;
        }
        this.mDefaultEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i) {
        if (i == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        receiveEvent(i, i2, str, false, 0, writableMap, 2);
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, boolean z, int i3, WritableMap writableMap, int i4) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int iM6875c = R02.m6875c(i2, i);
        if (iM6875c == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i, i2, str, z, i3, writableMap, i4);
            return;
        }
        if (iM6875c == 1) {
            RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
            if (defaultEventEmitter != null) {
                defaultEventEmitter.receiveEvent(i2, str, writableMap);
                return;
            }
            return;
        }
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Cannot find EventEmitter for receiveEvent: SurfaceId[", "] ReactTag[", i, i2, "] UIManagerType[");
        sbM8594m.append(iM6875c);
        sbM8594m.append("] EventName[");
        sbM8594m.append(str);
        sbM8594m.append("]");
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(sbM8594m.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x008c A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:52:0x0033, B:71:0x008c, B:73:0x008f, B:60:0x0052, B:63:0x005a, B:64:0x005e, B:66:0x0061, B:68:0x006d, B:69:0x007a), top: B:84:0x0033 }] */
    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveTouches(p000.C11438vb1 r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.ReactEventEmitter.receiveTouches(vb1):void");
    }
}
