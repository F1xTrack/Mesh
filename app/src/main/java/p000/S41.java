package p000;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes.dex */
public final class S41 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f10576a;

    /* renamed from: b */
    public final /* synthetic */ boolean f10577b;

    /* renamed from: c */
    public final /* synthetic */ int f10578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S41(Activity activity, boolean z, int i, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f10576a = activity;
        this.f10577b = z;
        this.f10578c = i;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        Activity activity = this.f10576a;
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        boolean z = this.f10577b;
        int i = this.f10578c;
        if (!z) {
            window.setStatusBarColor(i);
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i));
        valueAnimatorOfObject.addUpdateListener(new C0772MG(5, activity));
        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        valueAnimatorOfObject.start();
    }
}
