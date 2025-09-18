package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2144aU1 {
    public static final void a(ArrayList arrayList, InterfaceC6099nZ interfaceC6099nZ) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC6099nZ.invoke(it.next());
            it.remove();
        }
    }

    public static final Point b(Context context) {
        O90.f(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            O90.e(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Rect bounds = currentWindowMetrics.getBounds();
            O90.e(bounds, "getBounds(...)");
            point.x = bounds.width();
            point.y = bounds.height();
        } else {
            Object systemService = context.getSystemService("window");
            O90.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            O90.e(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    public static final boolean c(Context context) {
        O90.f(context, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Object systemService = context.getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }
}
