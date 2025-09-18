package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class EW0 extends GuardedRunnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EW0(Activity activity, boolean z, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.b = activity;
        this.c = z;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        boolean z = this.c;
        Activity activity = this.b;
        switch (this.a) {
            case 0:
                View decorView = activity.getWindow().getDecorView();
                O90.e(decorView, "getDecorView(...)");
                FW0 fw0 = QB1.e;
                if (z) {
                    M80.a.a(decorView);
                    M80.b.add(fw0);
                } else {
                    M80 m80 = M80.a;
                    M80.b.remove(fw0);
                }
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC3639ek1.c(decorView);
                break;
            default:
                Window window = activity.getWindow();
                if (window != null) {
                    View decorView2 = window.getDecorView();
                    O90.e(decorView2, "getDecorView(...)");
                    if (z) {
                        decorView2.setOnApplyWindowInsetsListener(new T41());
                    } else {
                        decorView2.setOnApplyWindowInsetsListener(null);
                    }
                    WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                    AbstractC3639ek1.c(decorView2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EW0(Activity activity, boolean z, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.b = activity;
        this.c = z;
    }
}
