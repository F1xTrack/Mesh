package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000.C10001kN0;
import p000.InterfaceC9101dL0;
import p000.S91;

@InterfaceC9101dL0(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactVirtualTextViewManager extends BaseViewManager<View, C10001kN0> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(S91 s91) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C10001kN0> getShadowNodeClass() {
        return C10001kN0.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10001kN0 createShadowNodeInstance() {
        return new C10001kN0(null);
    }
}
