package p000;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: fZ */
/* loaded from: classes.dex */
public abstract class AbstractC4061fZ {

    /* renamed from: a */
    public static C9977kB0 f27229a = null;

    /* renamed from: b */
    public static volatile boolean f27230b = false;

    /* renamed from: c */
    public static final float[][] f27231c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: d */
    public static final float[][] f27232d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: e */
    public static final float[] f27233e = {95.047f, 100.0f, 108.883f};

    /* renamed from: f */
    public static final float[][] f27234f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static final boolean m18251a(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!O90.m5963a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final String m18252b(Object[] objArr, int i, int i2, AbstractC0882O0 abstractC0882O0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0882O0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: c */
    public static void m18253c(Context context, C8812b70 c8812b70) {
        int i = 21;
        AbstractC4250iZ.m19063b();
        if (f27230b) {
            AbstractC3929dS.m17681n(AbstractC4061fZ.class);
        } else {
            f27230b = true;
        }
        if (!C3916dF.m17512b()) {
            AbstractC4250iZ.m19063b();
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (IllegalAccessException unused) {
                        C3916dF.m17511a(new NV1(i));
                    } catch (NoSuchMethodException unused2) {
                        C3916dF.m17511a(new NV1(i));
                    }
                } catch (ClassNotFoundException unused3) {
                    C3916dF.m17511a(new NV1(i));
                } catch (InvocationTargetException unused4) {
                    C3916dF.m17511a(new NV1(i));
                }
                AbstractC4250iZ.m19063b();
            } finally {
                AbstractC4250iZ.m19063b();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c8812b70 == null) {
            synchronized (C8940c70.class) {
                AbstractC4250iZ.m19063b();
                O90.m5968f(applicationContext, "context");
                C8940c70.m10587j(new C8812b70(new C8684a70(applicationContext)));
            }
        } else {
            C8940c70.m10587j(c8812b70);
        }
        AbstractC4250iZ.m19063b();
        f27229a = new C9977kB0(applicationContext);
        int i2 = T01.f11103h;
        AbstractC4250iZ.m19063b();
    }

    /* renamed from: d */
    public static int m18254d(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f27233e;
        return AbstractC0749Lu.m5128a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* renamed from: e */
    public static float m18255e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: f */
    public static final void m18256f(Object[] objArr, int i, int i2) {
        O90.m5968f(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* renamed from: g */
    public static float m18257g() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
