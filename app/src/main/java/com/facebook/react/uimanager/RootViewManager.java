package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C11421vT0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m22267d2 = {"Lcom/facebook/react/uimanager/RootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)Landroid/view/ViewGroup;", "Companion", "vT0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final C11421vT0 Companion = new C11421vT0();
    public static final String REACT_CLASS = "RootView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new FrameLayout(reactContext);
    }
}
