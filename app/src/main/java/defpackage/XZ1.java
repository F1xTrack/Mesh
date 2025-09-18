package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class XZ1 {
    public static DisplayMetrics a;
    public static DisplayMetrics b;

    public static final WritableNativeMap a(double d) {
        if (a == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        if (b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetrics displayMetrics = a;
        O90.d(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", b(displayMetrics, d));
        DisplayMetrics displayMetrics2 = b;
        O90.d(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", b(displayMetrics2, d));
        return writableNativeMap;
    }

    public static WritableNativeMap b(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(Snapshot.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = b;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final DisplayMetrics d() {
        DisplayMetrics displayMetrics = a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final void e(Context context) {
        O90.f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        a = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        O90.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        b = displayMetrics2;
    }

    public static final void f(Context context) {
        O90.f(context, "context");
        if (b != null) {
            return;
        }
        e(context);
    }

    public static final Object g(JV0 jv0, JV0 jv02, Function2 function2) throws Throwable {
        Object c6165nv;
        Object objH;
        try {
            AbstractC5543ke1.d(2, function2);
            c6165nv = function2.invoke(jv02, jv0);
        } catch (Throwable th) {
            c6165nv = new C6165nv(th, false);
        }
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        if (c6165nv == enumC1030Mz || (objH = jv0.H(c6165nv)) == AbstractC4295iA1.b) {
            return enumC1030Mz;
        }
        if (objH instanceof C6165nv) {
            throw ((C6165nv) objH).a;
        }
        return AbstractC4295iA1.a(objH);
    }
}
