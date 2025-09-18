package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;

/* loaded from: classes2.dex */
public final class DW0 extends GuardedRunnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW0(Activity activity, Integer num, boolean z, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.a = activity;
        this.b = num;
        this.c = z;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        Window window = this.a.getWindow();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.b);
        valueAnimatorOfObject.addUpdateListener(new CW0(window, 0));
        if (this.c) {
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        } else {
            valueAnimatorOfObject.setDuration(0L).setStartDelay(300L);
        }
        valueAnimatorOfObject.start();
    }
}
