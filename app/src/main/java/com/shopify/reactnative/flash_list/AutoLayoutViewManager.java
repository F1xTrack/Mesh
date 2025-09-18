package com.shopify.reactnative.flash_list;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0852NX;
import p000.AbstractC11077sn0;
import p000.AbstractC9426ft1;
import p000.C1045Qb;
import p000.C1107Rb;
import p000.C1170Sb;
import p000.InterfaceC1233Tb;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = AutoLayoutViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00160\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001aH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010#J\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0006H\u0017¢\u0006\u0004\b'\u0010#J\u001f\u0010)\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001aH\u0017¢\u0006\u0004\b)\u0010\u001eR \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m22267d2 = {"Lcom/shopify/reactnative/flash_list/AutoLayoutViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LQb;", "LTb;", "<init>", "()V", "", "dp", "density", "", "convertToPixelLayout", "(DD)I", "", "getName", "()Ljava/lang/String;", "LEk1;", "getDelegate", "()LEk1;", "LS91;", "context", "createViewInstance", "(LS91;)LQb;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "", "isHorizontal", "LTf1;", "setHorizontal", "(LQb;Z)V", "disableAutoLayout", "setDisableAutoLayout", "scrollOffset", "setScrollOffset", "(LQb;D)V", "windowSize", "setWindowSize", "renderOffset", "setRenderAheadOffset", "enableInstrumentation", "setEnableInstrumentation", "LSb;", "mDelegate", "LSb;", "Companion", "Rb", "shopify_flash-list_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class AutoLayoutViewManager extends ViewGroupManager<C1045Qb> implements InterfaceC1233Tb {
    public static final C1107Rb Companion = new C1107Rb();
    public static final String REACT_CLASS = "AutoLayoutView";
    private final C1170Sb mDelegate = new C1170Sb(5, this);

    private final int convertToPixelLayout(double dp, double density) {
        return AbstractC9426ft1.m18303a(dp * density);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return AbstractC11077sn0.m24781i(new Pair("onBlankAreaEvent", AbstractC11077sn0.m24781i(new Pair("registrationName", "onBlankAreaEvent"))));
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
    public C1045Qb createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C1045Qb c1045Qb = new C1045Qb(context);
        c1045Qb.setPixelDensity(context.getResources().getDisplayMetrics().density);
        return c1045Qb;
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "disableAutoLayout")
    public void setDisableAutoLayout(C1045Qb view, boolean disableAutoLayout) {
        O90.m5968f(view, "view");
        view.setDisableAutoLayout(disableAutoLayout);
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "enableInstrumentation")
    public void setEnableInstrumentation(C1045Qb view, boolean enableInstrumentation) {
        O90.m5968f(view, "view");
        view.setEnableInstrumentation(enableInstrumentation);
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "horizontal")
    public void setHorizontal(C1045Qb view, boolean isHorizontal) {
        O90.m5968f(view, "view");
        view.getAlShadow().f9151a = isHorizontal;
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "renderAheadOffset")
    public void setRenderAheadOffset(C1045Qb view, double renderOffset) {
        O90.m5968f(view, "view");
        view.getAlShadow().f9155e = convertToPixelLayout(renderOffset, view.getPixelDensity());
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "scrollOffset")
    public void setScrollOffset(C1045Qb view, double scrollOffset) {
        O90.m5968f(view, "view");
        view.getAlShadow().f9152b = convertToPixelLayout(scrollOffset, view.getPixelDensity());
    }

    @Override // p000.InterfaceC1233Tb
    @InterfaceC9871jM0(name = "windowSize")
    public void setWindowSize(C1045Qb view, double windowSize) {
        O90.m5968f(view, "view");
        view.getAlShadow().f9154d = convertToPixelLayout(windowSize, view.getPixelDensity());
    }
}
