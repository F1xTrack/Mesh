package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.LifecycleEventListener;
import com.microsoft.codepush.react.CodePushNativeModule;
import java.util.Date;

/* renamed from: Zt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2026Zt implements LifecycleEventListener {
    public Date a = null;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final GR0 c = new GR0(8, this);
    public final /* synthetic */ AsyncTaskC2220au d;

    public C2026Zt(AsyncTaskC2220au asyncTaskC2220au) {
        this.d = asyncTaskC2220au;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.a = new Date();
        AsyncTaskC2220au asyncTaskC2220au = this.d;
        if (asyncTaskC2220au.b == 3 && asyncTaskC2220au.e.mSettingsManager.c(null)) {
            this.b.postDelayed(this.c, asyncTaskC2220au.c * 1000);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.b.removeCallbacks(this.c);
        if (this.a != null) {
            long time = (new Date().getTime() - this.a.getTime()) / 1000;
            AsyncTaskC2220au asyncTaskC2220au = this.d;
            int i = asyncTaskC2220au.b;
            CodePushNativeModule codePushNativeModule = asyncTaskC2220au.e;
            if (i == 0 || time >= codePushNativeModule.mMinimumBackgroundDuration) {
                codePushNativeModule.restartAppInternal(false);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }
}
