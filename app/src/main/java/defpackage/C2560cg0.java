package defpackage;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: cg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2560cg0 {
    public final ReactApplicationContext a;
    public final int b;

    public C2560cg0(ReactApplicationContext reactApplicationContext) {
        Window window;
        WindowManager.LayoutParams attributes;
        O90.f(reactApplicationContext, "mReactContext");
        this.a = reactApplicationContext;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        this.b = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.softInputMode;
    }
}
