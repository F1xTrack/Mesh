package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0852NX;
import p000.AbstractC11077sn0;
import p000.C6340l4;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.OH0;
import p000.PH0;
import p000.QH0;
import p000.S91;

@InterfaceC9101dL0(name = RNGestureHandlerRootViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00140\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m22267d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LPH0;", "", "<init>", "()V", "LEk1;", "getDelegate", "()LEk1;", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LPH0;", "view", "LTf1;", "onDropViewInstance", "(LPH0;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "LEk1;", "Companion", "QH0", "react-native-gesture-handler_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<PH0> {
    public static final QH0 Companion = new QH0();
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 6);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate, reason: from getter */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return AbstractC11077sn0.m24781i(new Pair("onGestureHandlerEvent", AbstractC11077sn0.m24781i(new Pair("registrationName", "onGestureHandlerEvent"))), new Pair("onGestureHandlerStateChange", AbstractC11077sn0.m24781i(new Pair("registrationName", "onGestureHandlerStateChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PH0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new PH0(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(PH0 view) {
        O90.m5968f(view, "view");
        OH0 oh0 = view.f8981b;
        if (oh0 != null) {
            oh0.m6006b();
        }
    }
}
