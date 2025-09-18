package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* loaded from: classes.dex */
public final class JK {
    public static final Size e = new Size(1920, 1080);
    public static final Size f = new Size(320, 240);
    public static final Size g = new Size(640, 480);
    public static final Object h = new Object();
    public static volatile JK i;
    public final DisplayManager a;
    public volatile Size b = null;
    public final C0481Fx1 c = new C0481Fx1(25);
    public final C3513e41 d = new C3513e41(13);

    public JK(Context context) {
        this.a = (DisplayManager) context.getSystemService("display");
    }

    public static JK b(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new JK(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i3 = point.x * point.y;
                if (i3 > i2) {
                    display = display2;
                    i2 = i3;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeD;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = AbstractC3696f21.a;
        if (size.getHeight() * size.getWidth() < AbstractC3696f21.a(f)) {
            size = ((SmallDisplaySizeQuirk) this.d.b) != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        return (((ExtraCroppingQuirk) this.c.a) == null || (sizeD = ExtraCroppingQuirk.d(1)) == null) ? size : sizeD.getHeight() * sizeD.getWidth() > size.getHeight() * size.getWidth() ? sizeD : size;
    }

    public final Display c(boolean z) {
        Display[] displays = this.a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z);
        if (displayD == null && z) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }
}
