package defpackage;

import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class P41 {
    public final ReactApplicationContext a;
    public final U41 b;
    public C2204ao1 c;
    public WeakReference d;

    public P41(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "mReactContext");
        this.a = reactApplicationContext;
        U41 u41 = new U41();
        try {
            u41.a = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactApplicationContext);
            Class cls = Boolean.TYPE;
            u41.b = StatusBarModule.class.getMethod("setHidden", cls);
            u41.c = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            u41.d = StatusBarModule.class.getMethod("setTranslucent", cls);
            u41.e = StatusBarModule.class.getMethod("setStyle", String.class);
            u41.f = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception unused) {
            int i = V41.a;
        }
        this.b = u41;
        this.d = new WeakReference(null);
    }

    public final C2204ao1 a() {
        Activity currentActivity = this.a.getCurrentActivity();
        if (this.c == null || !O90.a(currentActivity, this.d.get())) {
            if (currentActivity == null) {
                int i = Q41.a;
                return this.c;
            }
            Window window = currentActivity.getWindow();
            this.d = new WeakReference(currentActivity);
            this.c = new C2204ao1(window, window.getDecorView());
        }
        return this.c;
    }
}
