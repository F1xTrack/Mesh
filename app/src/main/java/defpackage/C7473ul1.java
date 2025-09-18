package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: ul1 */
/* loaded from: classes.dex */
public final class C7473ul1 {
    public static Integer d;
    public final ImageView a;
    public final ArrayList b = new ArrayList();
    public ViewTreeObserverOnPreDrawListenerC2279bC c;

    public C7473ul1(ImageView imageView) {
        this.a = imageView;
    }

    public final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.a;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = imageView.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            IL1.d(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }
}
