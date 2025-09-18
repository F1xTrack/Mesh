package p000;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;

/* loaded from: classes2.dex */
public final class DW0 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f2028a;

    /* renamed from: b */
    public final /* synthetic */ Integer f2029b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW0(Activity activity, Integer num, boolean z, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.f2028a = activity;
        this.f2029b = num;
        this.f2030c = z;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        Window window = this.f2028a.getWindow();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f2029b);
        valueAnimatorOfObject.addUpdateListener(new CW0(window, 0));
        if (this.f2030c) {
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        } else {
            valueAnimatorOfObject.setDuration(0L).setStartDelay(300L);
        }
        valueAnimatorOfObject.start();
    }
}
