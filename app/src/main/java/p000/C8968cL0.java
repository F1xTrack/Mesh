package p000;

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
public final class C8968cL0 extends ViewGroup implements LifecycleEventListener {

    /* renamed from: a */
    public Dialog f17439a;

    /* renamed from: b */
    public boolean f17440b;

    /* renamed from: c */
    public DialogInterface.OnShowListener f17441c;

    /* renamed from: d */
    public InterfaceC8712aL0 f17442d;

    /* renamed from: e */
    public boolean f17443e;

    /* renamed from: f */
    public String f17444f;

    /* renamed from: g */
    public boolean f17445g;

    /* renamed from: h */
    public ZK0 f17446h;

    /* renamed from: i */
    public boolean f17447i;

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f17446h);
        if (this.f17443e) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((S91) context).f10602a.getCurrentActivity();
    }

    /* renamed from: a */
    public final void m10668a() {
        Context baseContext;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f17439a;
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
            this.f17439a = null;
            this.f17447i = true;
            ViewParent parent = this.f17446h.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        O90.m5968f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.f17446h.addView(view, i);
    }

    /* renamed from: b */
    public final void m10669b() {
        Window window;
        UiThreadUtil.assertOnUiThread();
        if (!this.f17447i) {
            m10670c();
            return;
        }
        m10668a();
        this.f17447i = false;
        String str = this.f17444f;
        int i = O90.m5963a(str, "fade") ? R.style.Theme_FullScreenDialogAnimatedFade : O90.m5963a(str, "slide") ? R.style.Theme_FullScreenDialogAnimatedSlide : R.style.Theme_FullScreenDialog;
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i);
        this.f17439a = dialog;
        Window window2 = dialog.getWindow();
        Objects.requireNonNull(window2);
        window2.setFlags(8, 8);
        dialog.setContentView(getContentView());
        m10670c();
        dialog.setOnShowListener(this.f17441c);
        dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC8840bL0(this));
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
        if (this.f17445g && (window = dialog.getWindow()) != null) {
            window.addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        Activity currentActivity2 = getCurrentActivity();
        if (currentActivity2 != null) {
            Dialog dialog2 = this.f17439a;
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
                O90.m5967e(decorView, "getDecorView(...)");
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility());
            }
        }
        Window window6 = dialog.getWindow();
        if (window6 != null) {
            window6.clearFlags(8);
        }
    }

    /* renamed from: c */
    public final void m10670c() {
        Dialog dialog = this.f17439a;
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
        if (this.f17440b) {
            window.clearFlags(2);
        } else {
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        O90.m5968f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        O90.m5968f(viewStructure, "structure");
        this.f17446h.dispatchProvideStructure(viewStructure);
    }

    public final String getAnimationType() {
        return this.f17444f;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.f17446h.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f17446h.getChildCount();
    }

    public final Dialog getDialog() {
        return this.f17439a;
    }

    public final InterfaceC6947uP getEventDispatcher() {
        return this.f17446h.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.f17445g;
    }

    public final InterfaceC8712aL0 getOnRequestCloseListener() {
        return this.f17442d;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.f17441c;
    }

    public final G41 getStateWrapper() {
        return this.f17446h.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.f17443e;
    }

    public final boolean getTransparent() {
        return this.f17440b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10668a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((S91) context).removeLifecycleEventListener(this);
        m10668a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        m10669b();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f17446h.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        ZK0 zk0 = this.f17446h;
        zk0.removeView(zk0.getChildAt(i));
    }

    public final void setAnimationType(String str) {
        this.f17444f = str;
        this.f17447i = true;
    }

    public final void setEventDispatcher(InterfaceC6947uP interfaceC6947uP) {
        this.f17446h.setEventDispatcher$ReactAndroid_release(interfaceC6947uP);
    }

    public final void setHardwareAccelerated(boolean z) {
        this.f17445g = z;
        this.f17447i = true;
    }

    public final void setOnRequestCloseListener(InterfaceC8712aL0 interfaceC8712aL0) {
        this.f17442d = interfaceC8712aL0;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f17441c = onShowListener;
    }

    public final void setStateWrapper(G41 g41) {
        this.f17446h.setStateWrapper$ReactAndroid_release(g41);
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.f17443e = z;
        this.f17447i = true;
    }

    public final void setTransparent(boolean z) {
        this.f17440b = z;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
