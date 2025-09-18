package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0852NX;
import p000.AbstractC11077sn0;
import p000.C10169lh0;
import p000.C10275mW0;
import p000.C11681xW0;
import p000.C6340l4;
import p000.HW0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9891jW0;
import p000.O90;
import p000.RV0;
import p000.S91;

@InterfaceC9101dL0(name = ScreenStackViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LmW0;", "", "<init>", "()V", "LRV0;", "screen", "LTf1;", "prepareOutTransition", "(LRV0;)V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LmW0;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(LmW0;Landroid/view/View;I)V", "removeViewAt", "(LmW0;I)V", "invalidate", "getChildCount", "(LmW0;)I", "getChildAt", "(LmW0;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Llh0;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Llh0;", "", "needsCustomLayoutForChildren", "()Z", "LEk1;", "getDelegate", "()LEk1;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "delegate", "LEk1;", "Companion", "xW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStackViewManager extends ViewGroupManager<C10275mW0> {
    public static final C11681xW0 Companion = new C11681xW0();
    public static final String REACT_CLASS = "RNSScreenStack";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 14);

    private final void prepareOutTransition(RV0 screen) {
        if (screen == null || screen.f10230l) {
            return;
        }
        screen.f10230l = true;
        screen.m7029c(screen);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC11077sn0.m24781i(new Pair("topFinishTransitioning", AbstractC11077sn0.m24781i(new Pair("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance(ReactApplicationContext context) {
        O90.m5968f(context, "context");
        return new HW0(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10275mW0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new C10275mW0(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C10275mW0 parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        if (child instanceof RV0) {
            RV0 rv0 = (RV0) child;
            rv0.getId();
            InterfaceC9891jW0 interfaceC9891jW0Mo7375a = parent.mo7375a(rv0);
            rv0.setFragmentWrapper(interfaceC9891jW0Mo7375a);
            parent.f10815a.add(index, interfaceC9891jW0Mo7375a);
            rv0.setContainer(parent);
            parent.m7379e();
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C10275mW0 parent, int index) {
        O90.m5968f(parent, "parent");
        return ((InterfaceC9891jW0) parent.f10815a.get(index)).mo13727h();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C10275mW0 parent) {
        O90.m5968f(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C10275mW0 parent, int index) {
        O90.m5968f(parent, "parent");
        RV0 rv0Mo13727h = ((InterfaceC9891jW0) parent.f10815a.get(index)).mo13727h();
        prepareOutTransition(rv0Mo13727h);
        parent.mo7383i(index);
        rv0Mo13727h.getId();
    }
}
