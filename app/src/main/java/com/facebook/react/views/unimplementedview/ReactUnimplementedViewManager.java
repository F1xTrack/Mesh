package com.facebook.react.views.unimplementedview;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C9489gN0;
import p000.C9617hN0;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = ReactUnimplementedViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m22267d2 = {"Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LgN0;", "<init>", "()V", "LS91;", "reactContext", "createViewInstance", "(LS91;)LgN0;", "", "getName", "()Ljava/lang/String;", "view", "name", "LTf1;", "setName", "(LgN0;Ljava/lang/String;)V", "Companion", "hN0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactUnimplementedViewManager extends ViewGroupManager<C9489gN0> {
    public static final C9617hN0 Companion = new C9617hN0();
    public static final String REACT_CLASS = "UnimplementedNativeView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "name")
    public final void setName(C9489gN0 view, String name) {
        O90.m5968f(view, "view");
        O90.m5968f(name, "name");
        view.setName(name);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9489gN0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new C9489gN0(reactContext);
    }
}
