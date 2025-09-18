package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class XZ1 {

    /* renamed from: a */
    public static DisplayMetrics f13853a;

    /* renamed from: b */
    public static DisplayMetrics f13854b;

    /* renamed from: a */
    public static final WritableNativeMap m9085a(double d) {
        if (f13853a == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        if (f13854b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetrics displayMetrics = f13853a;
        O90.m5966d(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", m9086b(displayMetrics, d));
        DisplayMetrics displayMetrics2 = f13854b;
        O90.m5966d(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", m9086b(displayMetrics2, d));
        return writableNativeMap;
    }

    /* renamed from: b */
    public static WritableNativeMap m9086b(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(Snapshot.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    /* renamed from: c */
    public static final DisplayMetrics m9087c() {
        DisplayMetrics displayMetrics = f13854b;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    /* renamed from: d */
    public static final DisplayMetrics m9088d() {
        DisplayMetrics displayMetrics = f13853a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    /* renamed from: e */
    public static final void m9089e(Context context) {
        O90.m5968f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f13853a = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        f13854b = displayMetrics2;
    }

    /* renamed from: f */
    public static final void m9090f(Context context) {
        O90.m5968f(context, "context");
        if (f13854b != null) {
            return;
        }
        m9089e(context);
    }

    /* renamed from: g */
    public static final Object m9091g(JV0 jv0, JV0 jv02, Function2 function2) throws Throwable {
        Object c6519nv;
        Object objM10801H;
        try {
            AbstractC10036ke1.m22229d(2, function2);
            c6519nv = function2.invoke(jv02, jv0);
        } catch (Throwable th) {
            c6519nv = new C6519nv(th, false);
        }
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        if (c6519nv == enumC0817Mz || (objM10801H = jv0.m10801H(c6519nv)) == AbstractC9720iA1.f28866b) {
            return enumC0817Mz;
        }
        if (objM10801H instanceof C6519nv) {
            throw ((C6519nv) objM10801H).f38606a;
        }
        return AbstractC9720iA1.m18978a(objM10801H);
    }
}
