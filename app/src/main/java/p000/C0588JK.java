package p000;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* renamed from: JK */
/* loaded from: classes.dex */
public final class C0588JK {

    /* renamed from: e */
    public static final Size f5448e = new Size(1920, 1080);

    /* renamed from: f */
    public static final Size f5449f = new Size(320, 240);

    /* renamed from: g */
    public static final Size f5450g = new Size(640, 480);

    /* renamed from: h */
    public static final Object f5451h = new Object();

    /* renamed from: i */
    public static volatile C0588JK f5452i;

    /* renamed from: a */
    public final DisplayManager f5453a;

    /* renamed from: b */
    public volatile Size f5454b = null;

    /* renamed from: c */
    public final C7621Fx1 f5455c = new C7621Fx1(25);

    /* renamed from: d */
    public final C9196e41 f5456d = new C9196e41(13);

    public C0588JK(Context context) {
        this.f5453a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: b */
    public static C0588JK m4281b(Context context) {
        if (f5452i == null) {
            synchronized (f5451h) {
                try {
                    if (f5452i == null) {
                        f5452i = new C0588JK(context);
                    }
                } finally {
                }
            }
        }
        return f5452i;
    }

    /* renamed from: d */
    public static Display m4282d(Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    display = display2;
                    i = i2;
                }
            }
        }
        return display;
    }

    /* renamed from: a */
    public final Size m4283a() {
        Size sizeM9877d;
        Point point = new Point();
        m4284c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = AbstractC9318f21.f27016a;
        if (size.getHeight() * size.getWidth() < AbstractC9318f21.m18157a(f5449f)) {
            size = ((SmallDisplaySizeQuirk) this.f5456d.f26532b) != null ? (Size) SmallDisplaySizeQuirk.f15949a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f5450g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f5448e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        return (((ExtraCroppingQuirk) this.f5455c.f3494a) == null || (sizeM9877d = ExtraCroppingQuirk.m9877d(1)) == null) ? size : sizeM9877d.getHeight() * sizeM9877d.getWidth() > size.getHeight() * size.getWidth() ? sizeM9877d : size;
    }

    /* renamed from: c */
    public final Display m4284c(boolean z) {
        Display[] displays = this.f5453a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM4282d = m4282d(displays, z);
        if (displayM4282d == null && z) {
            displayM4282d = m4282d(displays, false);
        }
        if (displayM4282d != null) {
            return displayM4282d;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* renamed from: e */
    public final Size m4285e() {
        if (this.f5454b != null) {
            return this.f5454b;
        }
        this.f5454b = m4283a();
        return this.f5454b;
    }
}
