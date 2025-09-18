package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.C10169lh0;
import p000.C6340l4;
import p000.HW0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9891jW0;
import p000.O90;
import p000.RV0;
import p000.S91;
import p000.SV0;
import p000.TV0;

@InterfaceC9101dL0(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LSV0;", "", "<init>", "()V", "LEk1;", "getDelegate", "()LEk1;", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LSV0;", "parent", "Landroid/view/View;", "child", "", "index", "LTf1;", "addView", "(LSV0;Landroid/view/View;I)V", "removeViewAt", "(LSV0;I)V", "removeAllViews", "(LSV0;)V", "getChildCount", "(LSV0;)I", "getChildAt", "(LSV0;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Llh0;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Llh0;", "", "needsCustomLayoutForChildren", "()Z", "delegate", "LEk1;", "Companion", "TV0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenContainerViewManager extends ViewGroupManager<SV0> {
    public static final TV0 Companion = new TV0();
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 8);

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance(ReactApplicationContext context) {
        O90.m5968f(context, "context");
        return new HW0(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SV0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new SV0(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void removeAllViews(SV0 parent) {
        O90.m5968f(parent, "parent");
        parent.mo7382h();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(SV0 parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        if (child instanceof RV0) {
            RV0 rv0 = (RV0) child;
            InterfaceC9891jW0 interfaceC9891jW0Mo7375a = parent.mo7375a(rv0);
            rv0.setFragmentWrapper(interfaceC9891jW0Mo7375a);
            parent.f10815a.add(index, interfaceC9891jW0Mo7375a);
            rv0.setContainer(parent);
            parent.m7379e();
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(SV0 parent, int index) {
        O90.m5968f(parent, "parent");
        return ((InterfaceC9891jW0) parent.f10815a.get(index)).mo13727h();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(SV0 parent) {
        O90.m5968f(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(SV0 parent, int index) {
        O90.m5968f(parent, "parent");
        parent.mo7383i(index);
    }
}
