package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Objects;
import ru.mes.dnevnik.R;

/* renamed from: cL0 */
/* loaded from: classes.dex */
public final class C2497cL0 extends ViewGroup implements LifecycleEventListener {
    public Dialog a;
    public boolean b;
    public DialogInterface.OnShowListener c;
    public InterfaceC2116aL0 d;
    public boolean e;
    public String f;
    public boolean g;
    public ZK0 h;
    public boolean i;

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.h);
        if (this.e) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((S91) context).a.getCurrentActivity();
    }

    public final void a() {
        Context baseContext;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.a;
        if (dialog != null) {
            if (dialog.isShowing()) {
                Context context = dialog.getContext();
                while (!Activity.class.isInstance(context)) {
                    if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                        context = null;
                        break;
                    }
                    context = baseContext;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    dialog.dismiss();
                }
            }
            this.a = null;
            this.i = true;
            ViewParent parent = this.h.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        O90.f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.h.addView(view, i);
    }

    public final void b() {
        Window window;
        UiThreadUtil.assertOnUiThread();
        if (!this.i) {
            c();
            return;
        }
        a();
        this.i = false;
        String str = this.f;
        int i = O90.a(str, "fade") ? R.style.Theme_FullScreenDialogAnimatedFade : O90.a(str, "slide") ? R.style.Theme_FullScreenDialogAnimatedSlide : R.style.Theme_FullScreenDialog;
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i);
        this.a = dialog;
        Window window2 = dialog.getWindow();
        Objects.requireNonNull(window2);
        window2.setFlags(8, 8);
        dialog.setContentView(getContentView());
        c();
        dialog.setOnShowListener(this.c);
        dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC2307bL0(this));
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
        if (this.g && (window = dialog.getWindow()) != null) {
            window.addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        Activity currentActivity2 = getCurrentActivity();
        if (currentActivity2 != null) {
            Dialog dialog2 = this.a;
            if (dialog2 == null) {
                throw new IllegalStateException("dialog must exist when we call updateProperties");
            }
            Window window4 = dialog2.getWindow();
            if (window4 == null) {
                throw new IllegalStateException("dialog must have window when we call updateProperties");
            }
            if (Build.VERSION.SDK_INT > 30) {
                WindowInsetsController insetsController = currentActivity2.getWindow().getInsetsController();
                if (insetsController == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int systemBarsAppearance = insetsController.getSystemBarsAppearance() & 8;
                WindowInsetsController insetsController2 = window4.getInsetsController();
                if (insetsController2 != null) {
                    insetsController2.setSystemBarsAppearance(systemBarsAppearance, 8);
                }
            } else {
                Window window5 = currentActivity2.getWindow();
                if (window5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                View decorView = window5.getDecorView();
                O90.e(decorView, "getDecorView(...)");
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility());
            }
        }
        Window window6 = dialog.getWindow();
        if (window6 != null) {
            window6.clearFlags(8);
        }
    }

    public final void c() {
        Dialog dialog = this.a;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Activity currentActivity = getCurrentActivity();
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        if (currentActivity == null || currentActivity.isFinishing() || !window.isActive()) {
            return;
        }
        Window window2 = currentActivity.getWindow();
        if (window2 != null) {
            if ((window2.getAttributes().flags & 1024) != 0) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
        }
        if (this.b) {
            window.clearFlags(2);
        } else {
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        O90.f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        O90.f(viewStructure, "structure");
        this.h.dispatchProvideStructure(viewStructure);
    }

    public final String getAnimationType() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.h.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.h.getChildCount();
    }

    public final Dialog getDialog() {
        return this.a;
    }

    public final InterfaceC7405uP getEventDispatcher() {
        return this.h.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.g;
    }

    public final InterfaceC2116aL0 getOnRequestCloseListener() {
        return this.d;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.c;
    }

    public final G41 getStateWrapper() {
        return this.h.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.e;
    }

    public final boolean getTransparent() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((S91) context).removeLifecycleEventListener(this);
        a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.h.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        ZK0 zk0 = this.h;
        zk0.removeView(zk0.getChildAt(i));
    }

    public final void setAnimationType(String str) {
        this.f = str;
        this.i = true;
    }

    public final void setEventDispatcher(InterfaceC7405uP interfaceC7405uP) {
        this.h.setEventDispatcher$ReactAndroid_release(interfaceC7405uP);
    }

    public final void setHardwareAccelerated(boolean z) {
        this.g = z;
        this.i = true;
    }

    public final void setOnRequestCloseListener(InterfaceC2116aL0 interfaceC2116aL0) {
        this.d = interfaceC2116aL0;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.c = onShowListener;
    }

    public final void setStateWrapper(G41 g41) {
        this.h.setStateWrapper$ReactAndroid_release(g41);
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.e = z;
        this.i = true;
    }

    public final void setTransparent(boolean z) {
        this.b = z;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
