package p000;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: cg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9010cg0 {

    /* renamed from: a */
    public final ReactApplicationContext f17682a;

    /* renamed from: b */
    public final int f17683b;

    public C9010cg0(ReactApplicationContext reactApplicationContext) {
        Window window;
        WindowManager.LayoutParams attributes;
        O90.m5968f(reactApplicationContext, "mReactContext");
        this.f17682a = reactApplicationContext;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        this.f17683b = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.softInputMode;
    }
}
