package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class ZB extends Toolbar {
    public final C6854rW0 U;
    public boolean V;
    public final ChoreographerFrameCallbackC1636Ut W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZB(S91 s91, C6854rW0 c6854rW0) {
        super(s91, null);
        O90.f(s91, "context");
        O90.f(c6854rW0, "config");
        this.U = c6854rW0;
        this.W = new ChoreographerFrameCallbackC1636Ut(1, this);
    }

    public final C6854rW0 getConfig() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int contentInsetStartWithNavigation = getNavigationIcon() != null ? getContentInsetStartWithNavigation() : getContentInsetStart();
            int contentInsetEnd = getContentInsetEnd();
            C6854rW0 c6854rW0 = this.U;
            if (Math.abs(c6854rW0.a - contentInsetStartWithNavigation) >= 0.9d || Math.abs(c6854rW0.b - contentInsetEnd) >= 0.9d) {
                c6854rW0.a = contentInsetStartWithNavigation;
                c6854rW0.b = contentInsetEnd;
                Context context = c6854rW0.getContext();
                ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
                UIManagerModule uIManagerModule = reactContext != null ? (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class) : null;
                if (uIManagerModule != null) {
                    uIManagerModule.setViewLocalData(c6854rW0.getId(), new C0953Lz0(contentInsetStartWithNavigation, contentInsetEnd));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC1636Ut choreographerFrameCallbackC1636Ut;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((S91) context).a.getCurrentActivity();
        Integer numValueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.V || (choreographerFrameCallbackC1636Ut = this.W) == null) {
            return;
        }
        this.V = true;
        MJ0.a().c(3, choreographerFrameCallbackC1636Ut);
    }
}
