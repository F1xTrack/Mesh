package com.reactnativekeyboardcontroller;

import android.view.View;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C10169lh0;
import p000.C10205lz0;
import p000.C10333mz0;
import p000.C10461nz0;
import p000.C10717pz0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/OverKeyboardViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lmz0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)Lmz0;", "Llh0;", "createShadowNodeInstance", "()Llh0;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "", "value", "LTf1;", "setVisible", "(Lmz0;Z)V", "Lpz0;", "manager", "Lpz0;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class OverKeyboardViewManager extends ViewGroupManager<C10333mz0> {
    private final C10717pz0 manager = new C10717pz0();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OverKeyboardView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C10169lh0> getShadowNodeClass() {
        return C10205lz0.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "visible")
    public final void setVisible(C10333mz0 view, boolean value) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        if (value) {
            view.f38022a.addView(view.f38023b, new WindowManager.LayoutParams(-1, -1, 1000, 520, -3));
        } else {
            C10461nz0 c10461nz0 = view.f38023b;
            if (c10461nz0.f38660f) {
                view.f38022a.removeView(c10461nz0);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        return new C10205lz0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10333mz0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        this.manager.getClass();
        return new C10333mz0(reactContext);
    }
}
