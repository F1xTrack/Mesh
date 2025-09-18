package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: fZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3795fZ {
    public static C5455kB0 a = null;
    public static volatile boolean b = false;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final boolean a(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!O90.a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final String b(Object[] objArr, int i, int i2, O0 o0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == o0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static void c(Context context, C2265b70 c2265b70) {
        int i = 21;
        AbstractC4368iZ.b();
        if (b) {
            AbstractC3393dS.n(AbstractC3795fZ.class);
        } else {
            b = true;
        }
        if (!C3354dF.b()) {
            AbstractC4368iZ.b();
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (IllegalAccessException unused) {
                        C3354dF.a(new NV1(i));
                    } catch (NoSuchMethodException unused2) {
                        C3354dF.a(new NV1(i));
                    }
                } catch (ClassNotFoundException unused3) {
                    C3354dF.a(new NV1(i));
                } catch (InvocationTargetException unused4) {
                    C3354dF.a(new NV1(i));
                }
                AbstractC4368iZ.b();
            } finally {
                AbstractC4368iZ.b();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c2265b70 == null) {
            synchronized (C2455c70.class) {
                AbstractC4368iZ.b();
                O90.f(applicationContext, "context");
                C2455c70.j(new C2265b70(new C2074a70(applicationContext)));
            }
        } else {
            C2455c70.j(c2265b70);
        }
        AbstractC4368iZ.b();
        a = new C5455kB0(applicationContext);
        int i2 = T01.h;
        AbstractC4368iZ.b();
    }

    public static int d(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return AbstractC0937Lu.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float e(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void f(Object[] objArr, int i, int i2) {
        O90.f(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static float g() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
