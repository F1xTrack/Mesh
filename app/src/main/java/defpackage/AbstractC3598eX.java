package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eX */
/* loaded from: classes.dex */
public abstract class AbstractC3598eX {
    public static final K9 a = new K9(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final L01 d;

    static {
        AR0 ar0 = new AR0();
        ar0.a = "fonts-androidx";
        ar0.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), ar0);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new L01();
    }

    public static C3408dX a(String str, Context context, C2342bX c2342bX, int i) {
        K9 k9 = a;
        Typeface typeface = (Typeface) k9.e(str);
        if (typeface != null) {
            return new C3408dX(typeface);
        }
        try {
            C5520kX c5520kXA = AbstractC1110Nz1.a(context, c2342bX);
            int i2 = 1;
            C5711lX[] c5711lXArr = c5520kXA.b;
            int i3 = c5520kXA.a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else if (c5711lXArr != null && c5711lXArr.length != 0) {
                int length = c5711lXArr.length;
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c5711lXArr[i4].e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
            }
            if (i2 != 0) {
                return new C3408dX(i2);
            }
            Typeface typefaceC = AbstractC0814Ke1.a.c(context, c5711lXArr, i);
            if (typefaceC == null) {
                return new C3408dX(-3);
            }
            k9.f(str, typefaceC);
            return new C3408dX(typefaceC);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3408dX(-1);
        }
    }
}
