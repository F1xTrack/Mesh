package p000;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class EW0 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f2731a = 0;

    /* renamed from: b */
    public final /* synthetic */ Activity f2732b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EW0(Activity activity, boolean z, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f2732b = activity;
        this.f2733c = z;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        boolean z = this.f2733c;
        Activity activity = this.f2732b;
        switch (this.f2731a) {
            case 0:
                View decorView = activity.getWindow().getDecorView();
                O90.m5967e(decorView, "getDecorView(...)");
                FW0 fw0 = QB1.f9530e;
                if (z) {
                    M80.f7000a.m5275a(decorView);
                    M80.f7001b.add(fw0);
                } else {
                    M80 m80 = M80.f7000a;
                    M80.f7001b.remove(fw0);
                }
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9280ek1.m18029c(decorView);
                break;
            default:
                Window window = activity.getWindow();
                if (window != null) {
                    View decorView2 = window.getDecorView();
                    O90.m5967e(decorView2, "getDecorView(...)");
                    if (z) {
                        decorView2.setOnApplyWindowInsetsListener(new T41());
                    } else {
                        decorView2.setOnApplyWindowInsetsListener(null);
                    }
                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                    AbstractC9280ek1.m18029c(decorView2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EW0(Activity activity, boolean z, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.f2732b = activity;
        this.f2733c = z;
    }
}
