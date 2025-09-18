package p000;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* renamed from: cC */
/* loaded from: classes.dex */
public final class C1832cC {

    /* renamed from: d */
    public static Integer f17363d;

    /* renamed from: a */
    public final View f17364a;

    /* renamed from: b */
    public final ArrayList f17365b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC1770bC f17366c;

    public C1832cC(View view) {
        this.f17364a = view;
    }

    /* renamed from: a */
    public final int m10623a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.f17364a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (f17363d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            IL1.m3830d(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f17363d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f17363d.intValue();
    }
}
