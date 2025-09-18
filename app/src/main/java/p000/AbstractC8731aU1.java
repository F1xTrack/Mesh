package p000;

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
public abstract class AbstractC8731aU1 {
    /* renamed from: a */
    public static final void m9752a(ArrayList arrayList, InterfaceC6497nZ interfaceC6497nZ) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC6497nZ.invoke(it.next());
            it.remove();
        }
    }

    /* renamed from: b */
    public static final Point m9753b(Context context) {
        O90.m5968f(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            O90.m5967e(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Rect bounds = currentWindowMetrics.getBounds();
            O90.m5967e(bounds, "getBounds(...)");
            point.x = bounds.width();
            point.y = bounds.height();
        } else {
            Object systemService = context.getSystemService("window");
            O90.m5966d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            O90.m5967e(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    /* renamed from: c */
    public static final boolean m9754c(Context context) {
        O90.m5968f(context, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Object systemService = context.getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }
}
