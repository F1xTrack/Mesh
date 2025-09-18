package p000;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.util.LinkedHashMap;

/* renamed from: XM */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1470XM implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13677a;

    /* renamed from: b */
    public final /* synthetic */ Activity f13678b;

    /* renamed from: c */
    public final /* synthetic */ String f13679c;

    public /* synthetic */ RunnableC1470XM(Activity activity, int i, String str) {
        this.f13677a = i;
        this.f13678b = activity;
        this.f13679c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C8485Wn1 c8537Xn1;
        boolean zM9264b = true;
        String str = this.f13679c;
        Activity activity = this.f13678b;
        switch (this.f13677a) {
            case 0:
                O90.m5968f(str, "$style");
                LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
                Window window = activity.getWindow();
                O90.m5967e(window, "getWindow(...)");
                C8771ao1 c8771ao1M9263a = AbstractC1533YM.m9263a(window);
                if (str.equals("light-content")) {
                    zM9264b = false;
                } else if (!str.equals("dark-content")) {
                    zM9264b = AbstractC1533YM.m9264b(activity);
                }
                c8771ao1M9263a.f16606a.mo8863g(zM9264b);
                break;
            case 1:
                O90.m5968f(str, "$style");
                LinkedHashMap linkedHashMap2 = AbstractC1533YM.f14265a;
                Window window2 = activity.getWindow();
                O90.m5967e(window2, "getWindow(...)");
                C8771ao1 c8771ao1M9263a2 = AbstractC1533YM.m9263a(window2);
                if (str.equals("light-content")) {
                    zM9264b = false;
                } else if (!str.equals("dark-content")) {
                    zM9264b = AbstractC1533YM.m9264b(activity);
                }
                c8771ao1M9263a2.f16606a.mo9116f(zM9264b);
                break;
            case 2:
                View decorView = activity.getWindow().getDecorView();
                O90.m5967e(decorView, "getDecorView(...)");
                Window window3 = activity.getWindow();
                C10641pN0 c10641pN0 = new C10641pN0(decorView);
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    C8641Zn1 c8641Zn1 = new C8641Zn1(window3.getInsetsController(), c10641pN0);
                    c8641Zn1.f15132d = window3;
                    c8537Xn1 = c8641Zn1;
                } else {
                    c8537Xn1 = i >= 26 ? new C8537Xn1(window3, c10641pN0) : new C8485Wn1(window3, c10641pN0);
                }
                c8537Xn1.mo8863g(str.equals("dark"));
                break;
            default:
                StatusBarModule.setStyle$lambda$2(activity, str);
                break;
        }
    }
}
