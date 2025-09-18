package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC9188e12;
import p000.AbstractC9536gk1;
import p000.C1843cN;
import p000.C8433Vn1;
import p000.O61;
import p000.RunnableC7273za;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i2 = 0;
        }
        layoutParams.setMargins(0, i, 0, i2);
        return layoutParams;
    }

    public /* synthetic */ void lambda$updateInsets$1(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i, i2);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.getWindow().getDecorView().findViewById(R.id.action_bar_root).setLayoutParams(layoutParams);
    }

    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        AbstractC9188e12.m17819c(currentActivity.getWindow(), z);
    }

    public C8433Vn1 onApplyWindowInsetsListener(View view, C8433Vn1 c8433Vn1) {
        C8433Vn1 c8433Vn1M24477i = AbstractC10944rk1.m24477i(view, c8433Vn1);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(c8433Vn1, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(c8433Vn1M24477i);
        return c8433Vn1M24477i;
    }

    private void setWindowInsets(C8433Vn1 c8433Vn1) {
        updateInsets(c8433Vn1.f12756a.mo5837f(7).f5353b, c8433Vn1.f12756a.mo5837f(7).f5355d);
    }

    private void updateInsets(int i, int i2) {
        new Handler(Looper.getMainLooper()).post(new O61(this, i, i2, 1));
    }

    private void updateWindowDecor(boolean z) {
        new Handler(Looper.getMainLooper()).post(new RunnableC7273za(this, z, 10));
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z, boolean z2) {
        this.mIsStatusBarTranslucent = z;
        this.mIsNavigationBarTranslucent = z2;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        C1843cN c1843cN = new C1843cN(1, this);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18626u(decorView, c1843cN);
        AbstractC10944rk1.m24484p(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC10944rk1.m24484p(decorView, null);
        AbstractC9536gk1.m18626u(decorView, null);
    }
}
