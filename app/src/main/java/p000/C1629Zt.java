package p000;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.LifecycleEventListener;
import com.microsoft.codepush.react.CodePushNativeModule;
import java.util.Date;

/* renamed from: Zt */
/* loaded from: classes2.dex */
public final class C1629Zt implements LifecycleEventListener {

    /* renamed from: a */
    public Date f15193a = null;

    /* renamed from: b */
    public final Handler f15194b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final GR0 f15195c = new GR0(8, this);

    /* renamed from: d */
    public final /* synthetic */ AsyncTaskC1751au f15196d;

    public C1629Zt(AsyncTaskC1751au asyncTaskC1751au) {
        this.f15196d = asyncTaskC1751au;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.f15193a = new Date();
        AsyncTaskC1751au asyncTaskC1751au = this.f15196d;
        if (asyncTaskC1751au.f16649b == 3 && asyncTaskC1751au.f16652e.mSettingsManager.m3501c(null)) {
            this.f15194b.postDelayed(this.f15195c, asyncTaskC1751au.f16650c * 1000);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.f15194b.removeCallbacks(this.f15195c);
        if (this.f15193a != null) {
            long time = (new Date().getTime() - this.f15193a.getTime()) / 1000;
            AsyncTaskC1751au asyncTaskC1751au = this.f15196d;
            int i = asyncTaskC1751au.f16649b;
            CodePushNativeModule codePushNativeModule = asyncTaskC1751au.f16652e;
            if (i == 0 || time >= codePushNativeModule.mMinimumBackgroundDuration) {
                codePushNativeModule.restartAppInternal(false);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }
}
