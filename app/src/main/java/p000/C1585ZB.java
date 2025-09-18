package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: ZB */
/* loaded from: classes2.dex */
public final class C1585ZB extends Toolbar {

    /* renamed from: U */
    public final C10915rW0 f14769U;

    /* renamed from: V */
    public boolean f14770V;

    /* renamed from: W */
    public final ChoreographerFrameCallbackC1314Ut f14771W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585ZB(S91 s91, C10915rW0 c10915rW0) {
        super(s91, null);
        O90.m5968f(s91, "context");
        O90.m5968f(c10915rW0, "config");
        this.f14769U = c10915rW0;
        this.f14771W = new ChoreographerFrameCallbackC1314Ut(1, this);
    }

    public final C10915rW0 getConfig() {
        return this.f14769U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int contentInsetStartWithNavigation = getNavigationIcon() != null ? getContentInsetStartWithNavigation() : getContentInsetStart();
            int contentInsetEnd = getContentInsetEnd();
            C10915rW0 c10915rW0 = this.f14769U;
            if (Math.abs(c10915rW0.f26720a - contentInsetStartWithNavigation) >= 0.9d || Math.abs(c10915rW0.f26721b - contentInsetEnd) >= 0.9d) {
                c10915rW0.f26720a = contentInsetStartWithNavigation;
                c10915rW0.f26721b = contentInsetEnd;
                Context context = c10915rW0.getContext();
                ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
                UIManagerModule uIManagerModule = reactContext != null ? (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class) : null;
                if (uIManagerModule != null) {
                    uIManagerModule.setViewLocalData(c10915rW0.getId(), new C7936Lz0(contentInsetStartWithNavigation, contentInsetEnd));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC1314Ut choreographerFrameCallbackC1314Ut;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((S91) context).f10602a.getCurrentActivity();
        Integer numValueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.f14770V || (choreographerFrameCallbackC1314Ut = this.f14771W) == null) {
            return;
        }
        this.f14770V = true;
        MJ0.m5303a().m5305c(3, choreographerFrameCallbackC1314Ut);
    }
}
