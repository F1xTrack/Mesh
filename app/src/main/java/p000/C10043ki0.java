package p000;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ki0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10043ki0 {

    /* renamed from: c */
    public static Method f36615c = null;

    /* renamed from: d */
    public static Method f36616d = null;

    /* renamed from: e */
    public static boolean f36617e = false;

    /* renamed from: a */
    public final /* synthetic */ int f36618a;

    /* renamed from: b */
    public final SideSheetBehavior f36619b;

    public /* synthetic */ C10043ki0(SideSheetBehavior sideSheetBehavior, int i) {
        this.f36618a = i;
        this.f36619b = sideSheetBehavior;
    }

    /* renamed from: a */
    public static void m22242a(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
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
        if (!f36617e) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    f36615c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f36616d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f36615c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f36616d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                method2 = f36615c;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (method2 != null && f36616d != null) {
                method2.setAccessible(true);
                f36616d.setAccessible(true);
                f36617e = true;
            }
        }
        if (z) {
            try {
                Method method3 = f36615c;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f36616d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* renamed from: b */
    public final int m22243b() {
        switch (this.f36618a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f36619b;
                return Math.max(0, sideSheetBehavior.f18246n + sideSheetBehavior.f18247o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f36619b;
                return Math.max(0, (sideSheetBehavior2.f18245m - sideSheetBehavior2.f18244l) - sideSheetBehavior2.f18247o);
        }
    }

    /* renamed from: c */
    public final int m22244c() {
        switch (this.f36618a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f36619b;
                return (-sideSheetBehavior.f18244l) - sideSheetBehavior.f18247o;
            default:
                return this.f36619b.f18245m;
        }
    }

    /* renamed from: d */
    public final int m22245d(View view) {
        switch (this.f36618a) {
            case 0:
                return view.getRight() + this.f36619b.f18247o;
            default:
                return view.getLeft() - this.f36619b.f18247o;
        }
    }
}
