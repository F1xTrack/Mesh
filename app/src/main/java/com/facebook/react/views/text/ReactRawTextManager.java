package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import p000.C10127lM0;
import p000.C9105dN0;
import p000.InterfaceC9101dL0;
import p000.S91;

@InterfaceC9101dL0(name = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactRawTextManager extends ViewManager<View, C10127lM0> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C10127lM0> getShadowNodeClass() {
        return C10127lM0.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10127lM0 createShadowNodeInstance() {
        C10127lM0 c10127lM0 = new C10127lM0();
        c10127lM0.f37026y = null;
        return c10127lM0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9105dN0 createViewInstance(S91 s91) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
