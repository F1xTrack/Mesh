package io.sentry.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import java.util.Map;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.InterfaceC9871jM0;
import p000.S91;

/* loaded from: classes2.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<C6122f> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    private final ReactApplicationContext mCallerContext;

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("onDrawNextFrameView", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onDrawNextFrame")));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(C6122f c6122f, boolean z) {
        c6122f.setFullDisplay(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(C6122f c6122f, boolean z) {
        c6122f.setInitialDisplay(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6122f createViewInstance(S91 s91) {
        return new C6122f(this.mCallerContext, new C5832D(new C5847T()));
    }
}
