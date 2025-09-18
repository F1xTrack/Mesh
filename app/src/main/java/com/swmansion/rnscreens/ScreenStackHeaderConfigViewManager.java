package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.C10169lh0;
import p000.C10915rW0;
import p000.C11043sW0;
import p000.C11171tW0;
import p000.C11427vW0;
import p000.C6340l4;
import p000.G41;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9607hI0;
import p000.InterfaceC9871jM0;
import p000.NM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010#J!\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0015H\u0017¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b=\u0010;J\u001f\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010>\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0017¢\u0006\u0004\bB\u0010@J\u001f\u0010D\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010C\u001a\u00020+H\u0017¢\u0006\u0004\bD\u0010@J!\u0010F\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bF\u0010;J\u001f\u0010H\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010G\u001a\u00020+H\u0017¢\u0006\u0004\bH\u0010@J\u001f\u0010J\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010I\u001a\u00020+H\u0017¢\u0006\u0004\bJ\u0010@J\u001f\u0010L\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010K\u001a\u00020+H\u0017¢\u0006\u0004\bL\u0010@J!\u0010N\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bN\u00102J\u001d\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f\u0018\u00010OH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020RH\u0014¢\u0006\u0004\bS\u0010TJ#\u0010V\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bV\u00102J#\u0010W\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bW\u00102J!\u0010X\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\bX\u0010&J!\u0010Y\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bY\u0010@J!\u0010Z\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bZ\u0010@J#\u0010[\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u00102J!\u0010\\\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\\\u0010&J#\u0010]\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u00102J#\u0010^\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b^\u0010;J!\u0010_\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\b_\u0010@J#\u0010`\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b`\u0010;J!\u0010a\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\ba\u0010@J#\u0010b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bb\u00102J#\u0010c\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bc\u00102J\u0017\u0010e\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010fR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006k"}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LrW0;", "LhI0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LrW0;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Llh0;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Llh0;", "parent", "Landroid/view/View;", "child", "", "index", "LTf1;", "addView", "(LrW0;Landroid/view/View;I)V", "view", "LNM0;", "props", "LG41;", "stateWrapper", "", "updateState", "(LrW0;LNM0;LG41;)Ljava/lang/Object;", "onDropViewInstance", "(LrW0;)V", "removeAllViews", "removeViewAt", "(LrW0;I)V", "getChildCount", "(LrW0;)I", "getChildAt", "(LrW0;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "title", "setTitle", "(LrW0;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(LrW0;Ljava/lang/Integer;)V", "backgroundColor", "setBackgroundColor", "hideShadow", "setHideShadow", "(LrW0;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "setDirection", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "LEk1;", "getDelegate", "()LEk1;", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "LEk1;", "Companion", "tW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<C10915rW0> implements InterfaceC9607hI0 {
    public static final C11171tW0 Companion = new C11171tW0();
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 12);

    private final void logNotAvailable(String propName) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC10889rJ0.m24257d("topAttached", AbstractC10889rJ0.m24256c("registrationName", "onAttached"), "topDetached", AbstractC10889rJ0.m24256c("registrationName", "onDetached"));
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
        return new C11043sW0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10915rW0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new C10915rW0(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C10915rW0 parent) {
        O90.m5968f(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.m24396c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C10915rW0 view) {
        O90.m5968f(view, "view");
        view.f41709q = true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void removeAllViews(C10915rW0 parent) {
        O90.m5968f(parent, "parent");
        parent.f41695c.clear();
        parent.m24395b();
    }

    @Override // p000.InterfaceC9607hI0
    public void setBackButtonDisplayMode(C10915rW0 view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(C10915rW0 config, boolean backButtonInCustomView) {
        O90.m5968f(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // p000.InterfaceC9607hI0
    public void setBackTitle(C10915rW0 view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // p000.InterfaceC9607hI0
    public void setBackTitleFontFamily(C10915rW0 view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // p000.InterfaceC9607hI0
    public void setBackTitleFontSize(C10915rW0 view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // p000.InterfaceC9607hI0
    public void setBackTitleVisible(C10915rW0 view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "backgroundColor")
    public void setBackgroundColor(C10915rW0 config, Integer backgroundColor) {
        O90.m5968f(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // p000.InterfaceC9607hI0
    public void setBlurEffect(C10915rW0 view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(C10915rW0 config, Integer color) {
        O90.m5968f(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    public void setDirection(C10915rW0 config, String direction) {
        O90.m5968f(config, "config");
        config.setDirection(direction);
    }

    @Override // p000.InterfaceC9607hI0
    public void setDisableBackButtonMenu(C10915rW0 view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "hidden")
    public void setHidden(C10915rW0 config, boolean hidden) {
        O90.m5968f(config, "config");
        config.setHidden(hidden);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "hideBackButton")
    public void setHideBackButton(C10915rW0 config, boolean hideBackButton) {
        O90.m5968f(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "hideShadow")
    public void setHideShadow(C10915rW0 config, boolean hideShadow) {
        O90.m5968f(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitle(C10915rW0 view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleBackgroundColor(C10915rW0 view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleColor(C10915rW0 view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleFontFamily(C10915rW0 view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleFontSize(C10915rW0 view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleFontWeight(C10915rW0 view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // p000.InterfaceC9607hI0
    public void setLargeTitleHideShadow(C10915rW0 view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "title")
    public void setTitle(C10915rW0 config, String title) {
        O90.m5968f(config, "config");
        config.setTitle(title);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "titleColor")
    public void setTitleColor(C10915rW0 config, Integer titleColor) {
        O90.m5968f(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "titleFontFamily")
    public void setTitleFontFamily(C10915rW0 config, String titleFontFamily) {
        O90.m5968f(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "titleFontSize")
    public void setTitleFontSize(C10915rW0 config, int titleFontSize) {
        O90.m5968f(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "titleFontWeight")
    public void setTitleFontWeight(C10915rW0 config, String titleFontWeight) {
        O90.m5968f(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "topInsetEnabled")
    public void setTopInsetEnabled(C10915rW0 config, boolean topInsetEnabled) {
        O90.m5968f(config, "config");
        config.setTopInsetEnabled(topInsetEnabled);
    }

    @Override // p000.InterfaceC9607hI0
    @InterfaceC9871jM0(name = "translucent")
    public void setTranslucent(C10915rW0 config, boolean translucent) {
        O90.m5968f(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C10915rW0 view, NM0 props, G41 stateWrapper) {
        O90.m5968f(view, "view");
        return super.updateState((ScreenStackHeaderConfigViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C10915rW0 parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        if (child instanceof C11427vW0) {
            parent.f41695c.add(index, (C11427vW0) child);
            parent.m24395b();
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C10915rW0 parent, int index) {
        O90.m5968f(parent, "parent");
        Object obj = parent.f41695c.get(index);
        O90.m5967e(obj, "get(...)");
        return (C11427vW0) obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C10915rW0 parent) {
        O90.m5968f(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C10915rW0 parent, int index) {
        O90.m5968f(parent, "parent");
        parent.f41695c.remove(index);
        parent.m24395b();
    }
}
