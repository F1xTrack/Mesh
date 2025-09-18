package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.appmetrica.analytics.impl.C5094ea;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.BH0;
import p000.C6340l4;
import p000.DH0;
import p000.EH0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0002?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, m22267d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LDH0;", "LBH0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LDH0;", "view", "", "useDrawableOnForeground", "LTf1;", "setForeground", "(LDH0;Z)V", "", "backgroundColor", "setBackgroundColor", "(LDH0;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", Snapshot.BORDER_RADIUS, "setBorderRadius", "(LDH0;F)V", Snapshot.BORDER_TOP_LEFT_RADIUS, "setBorderTopLeftRadius", Snapshot.BORDER_TOP_RIGHT_RADIUS, "setBorderTopRightRadius", Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "setBorderBottomLeftRadius", Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(LDH0;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(LDH0;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(LDH0;)V", "LEk1;", "getDelegate", "()LEk1;", "mDelegate", "LEk1;", "Companion", "EH0", "react-native-gesture-handler_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<DH0> implements BH0 {
    public static final EH0 Companion = new EH0();
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 5);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate, reason: from getter */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
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
    public DH0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        DH0 dh0 = new DH0(context);
        dh0.f1955l = "solid";
        dh0.f1956m = true;
        dh0.f1959p = -1L;
        dh0.f1960q = -1;
        dh0.setOnClickListener(DH0.f1943w);
        dh0.setClickable(true);
        dh0.setFocusable(true);
        dh0.f1958o = true;
        dh0.setClipChildren(false);
        return dh0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(DH0 view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((RNGestureHandlerButtonViewManager) view);
        view.m1619l();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "backgroundColor")
    public void setBackgroundColor(DH0 view, int backgroundColor) {
        O90.m5968f(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = Snapshot.BORDER_BOTTOM_LEFT_RADIUS)
    public void setBorderBottomLeftRadius(DH0 view, float borderBottomLeftRadius) {
        O90.m5968f(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)
    public void setBorderBottomRightRadius(DH0 view, float borderBottomRightRadius) {
        O90.m5968f(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "borderColor")
    public void setBorderColor(DH0 view, Integer borderColor) {
        O90.m5968f(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = Snapshot.BORDER_RADIUS)
    public void setBorderRadius(DH0 view, float borderRadius) {
        O90.m5968f(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(DH0 view, String borderStyle) {
        O90.m5968f(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = Snapshot.BORDER_TOP_LEFT_RADIUS)
    public void setBorderTopLeftRadius(DH0 view, float borderTopLeftRadius) {
        O90.m5968f(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = Snapshot.BORDER_TOP_RIGHT_RADIUS)
    public void setBorderTopRightRadius(DH0 view, float borderTopRightRadius) {
        O90.m5968f(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "borderWidth")
    public void setBorderWidth(DH0 view, float borderWidth) {
        O90.m5968f(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "borderless")
    public void setBorderless(DH0 view, boolean useBorderlessDrawable) {
        O90.m5968f(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "enabled")
    public void setEnabled(DH0 view, boolean enabled) {
        O90.m5968f(view, "view");
        view.setEnabled(enabled);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "exclusive")
    public void setExclusive(DH0 view, boolean exclusive) {
        O90.m5968f(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = C5094ea.f31575g)
    @TargetApi(23)
    public void setForeground(DH0 view, boolean useDrawableOnForeground) {
        O90.m5968f(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "rippleColor")
    public void setRippleColor(DH0 view, Integer rippleColor) {
        O90.m5968f(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "rippleRadius")
    public void setRippleRadius(DH0 view, int rippleRadius) {
        O90.m5968f(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // p000.BH0
    @InterfaceC9871jM0(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(DH0 view, boolean touchSoundDisabled) {
        O90.m5968f(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
