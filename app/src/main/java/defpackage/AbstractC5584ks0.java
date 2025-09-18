package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* renamed from: ks0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5584ks0 {
    public static final Point a = new Point();
    public static final Point b = new Point();
    public static final Point c = new Point();

    public static final Point a(Context context) {
        O90.f(context, "context");
        Object systemService = context.getSystemService("window");
        O90.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = a;
        Point point2 = b;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = c;
        defaultDisplay.getSize(point3);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen});
        O90.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimension = 0;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (z && identifier > 0) {
            dimension = (int) resources.getDimension(identifier);
        }
        return point3.x < point3.y ? new Point(point.x, point2.y + dimension) : new Point(point2.x, point.y + dimension);
    }
}
