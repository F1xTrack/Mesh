package com.facebook.react.views.scroll;

import android.text.TextUtils;
import com.facebook.react.views.view.ReactClippingViewManager;
import java.util.Locale;
import kotlin.Metadata;
import p000.C11784yK0;
import p000.C11911zK0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m22267d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "LyK0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LyK0;", "Companion", "zK0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<C11784yK0> {
    public static final C11911zK0 Companion = new C11911zK0();
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11784yK0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C11784yK0 c11784yK0 = new C11784yK0(context);
        int i = 0;
        if ((context.getApplicationInfo().flags & 4194304) != 0 && (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1))) {
            i = 1;
        }
        c11784yK0.f46190a = i;
        return c11784yK0;
    }
}
