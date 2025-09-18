package com.th3rdwave.safeareacontext;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0852NX;
import p000.AbstractC11077sn0;
import p000.BU0;
import p000.C8960cH0;
import p000.CU0;
import p000.DU0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = SafeAreaProviderManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m22267d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LBU0;", "", "<init>", "()V", "LcH0;", "kotlin.jvm.PlatformType", "getDelegate", "()LcH0;", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LBU0;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "view", "LTf1;", "addEventEmitters", "(LS91;LBU0;)V", "mDelegate", "LcH0;", "Companion", "CU0", "react-native-safe-area-context_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SafeAreaProviderManager extends ViewGroupManager<BU0> {
    public static final CU0 Companion = new CU0();
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final C8960cH0 mDelegate = new C8960cH0(5, this);

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return AbstractC11077sn0.m24781i(new Pair("topInsetsChange", AbstractC11077sn0.m24781i(new Pair("registrationName", "onInsetsChange"))));
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
    public void addEventEmitters(S91 reactContext, BU0 view) {
        O90.m5968f(reactContext, "reactContext");
        O90.m5968f(view, "view");
        super.addEventEmitters(reactContext, (S91) view);
        view.setOnInsetsChangeHandler(DU0.f2020a);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public BU0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new BU0(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate, reason: from getter */
    public C8960cH0 getMDelegate() {
        return this.mDelegate;
    }
}
