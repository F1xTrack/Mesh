package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ki0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5554ki0 {
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ C5554ki0(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public static void a(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Method method2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!e) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                method2 = c;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (method2 != null && d != null) {
                method2.setAccessible(true);
                d.setAccessible(true);
                e = true;
            }
        }
        if (z) {
            try {
                Method method3 = c;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public final int b() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.b.m;
        }
    }

    public final int d(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() + this.b.o;
            default:
                return view.getLeft() - this.b.o;
        }
    }
}
