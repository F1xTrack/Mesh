package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000.AbstractC0881O;
import p000.AbstractC4061fZ;
import p000.C4124gZ;
import p000.InterfaceC9101dL0;
import p000.S91;

@InterfaceC9101dL0(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, C4124gZ> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractC0881O mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(S91 s91) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C4124gZ> getShadowNodeClass() {
        return C4124gZ.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractC0881O abstractC0881O, Object obj) {
        this.mDraweeControllerBuilder = abstractC0881O;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C4124gZ createShadowNodeInstance() {
        AbstractC0881O abstractC0881O = this.mDraweeControllerBuilder;
        if (abstractC0881O == null) {
            abstractC0881O = AbstractC4061fZ.f27229a.get();
        }
        return new C4124gZ(abstractC0881O, this.mCallerContext);
    }
}
