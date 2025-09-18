package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class XM implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;

    public /* synthetic */ XM(Activity activity, int i, String str) {
        this.a = i;
        this.b = activity;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C1776Wn1 c1854Xn1;
        boolean zB = true;
        String str = this.c;
        Activity activity = this.b;
        switch (this.a) {
            case 0:
                O90.f(str, "$style");
                LinkedHashMap linkedHashMap = YM.a;
                Window window = activity.getWindow();
                O90.e(window, "getWindow(...)");
                C2204ao1 c2204ao1A = YM.a(window);
                if (str.equals("light-content")) {
                    zB = false;
                } else if (!str.equals("dark-content")) {
                    zB = YM.b(activity);
                }
                c2204ao1A.a.g(zB);
                break;
            case 1:
                O90.f(str, "$style");
                LinkedHashMap linkedHashMap2 = YM.a;
                Window window2 = activity.getWindow();
                O90.e(window2, "getWindow(...)");
                C2204ao1 c2204ao1A2 = YM.a(window2);
                if (str.equals("light-content")) {
                    zB = false;
                } else if (!str.equals("dark-content")) {
                    zB = YM.b(activity);
                }
                c2204ao1A2.a.f(zB);
                break;
            case 2:
                View decorView = activity.getWindow().getDecorView();
                O90.e(decorView, "getDecorView(...)");
                Window window3 = activity.getWindow();
                C6446pN0 c6446pN0 = new C6446pN0(decorView);
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    C2010Zn1 c2010Zn1 = new C2010Zn1(window3.getInsetsController(), c6446pN0);
                    c2010Zn1.d = window3;
                    c1854Xn1 = c2010Zn1;
                } else {
                    c1854Xn1 = i >= 26 ? new C1854Xn1(window3, c6446pN0) : new C1776Wn1(window3, c6446pN0);
                }
                c1854Xn1.g(str.equals("dark"));
                break;
            default:
                StatusBarModule.setStyle$lambda$2(activity, str);
                break;
        }
    }
}
