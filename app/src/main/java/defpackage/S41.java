package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes.dex */
public final class S41 extends GuardedRunnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S41(Activity activity, boolean z, int i, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.a = activity;
        this.b = z;
        this.c = i;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        Activity activity = this.a;
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        boolean z = this.b;
        int i = this.c;
        if (!z) {
            window.setStatusBarColor(i);
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i));
        valueAnimatorOfObject.addUpdateListener(new MG(5, activity));
        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        valueAnimatorOfObject.start();
    }
}
