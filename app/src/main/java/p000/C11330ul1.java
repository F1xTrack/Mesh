package p000;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: ul1 */
/* loaded from: classes.dex */
public final class C11330ul1 {

    /* renamed from: d */
    public static Integer f43844d;

    /* renamed from: a */
    public final ImageView f43845a;

    /* renamed from: b */
    public final ArrayList f43846b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC1770bC f43847c;

    public C11330ul1(ImageView imageView) {
        this.f43845a = imageView;
    }

    /* renamed from: a */
    public final int m25231a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.f43845a;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = imageView.getContext();
        if (f43844d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            IL1.m3830d(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f43844d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f43844d.intValue();
    }
}
