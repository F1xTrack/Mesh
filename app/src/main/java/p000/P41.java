package p000;

import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class P41 {

    /* renamed from: a */
    public final ReactApplicationContext f8843a;

    /* renamed from: b */
    public final U41 f8844b;

    /* renamed from: c */
    public C8771ao1 f8845c;

    /* renamed from: d */
    public WeakReference f8846d;

    public P41(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "mReactContext");
        this.f8843a = reactApplicationContext;
        U41 u41 = new U41();
        try {
            u41.f11644a = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactApplicationContext);
            Class cls = Boolean.TYPE;
            u41.f11645b = StatusBarModule.class.getMethod("setHidden", cls);
            u41.f11646c = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            u41.f11647d = StatusBarModule.class.getMethod("setTranslucent", cls);
            u41.f11648e = StatusBarModule.class.getMethod("setStyle", String.class);
            u41.f11649f = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception unused) {
            int i = V41.f12346a;
        }
        this.f8844b = u41;
        this.f8846d = new WeakReference(null);
    }

    /* renamed from: a */
    public final C8771ao1 m6225a() {
        Activity currentActivity = this.f8843a.getCurrentActivity();
        if (this.f8845c == null || !O90.m5963a(currentActivity, this.f8846d.get())) {
            if (currentActivity == null) {
                int i = Q41.f9469a;
                return this.f8845c;
            }
            Window window = currentActivity.getWindow();
            this.f8846d = new WeakReference(currentActivity);
            this.f8845c = new C8771ao1(window, window.getDecorView());
        }
        return this.f8845c;
    }
}
