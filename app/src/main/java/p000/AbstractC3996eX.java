package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eX */
/* loaded from: classes.dex */
public abstract class AbstractC3996eX {

    /* renamed from: a */
    public static final C0640K9 f26739a = new C0640K9(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f26740b;

    /* renamed from: c */
    public static final Object f26741c;

    /* renamed from: d */
    public static final L01 f26742d;

    static {
        AR0 ar0 = new AR0();
        ar0.f192a = "fonts-androidx";
        ar0.f193b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), ar0);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f26740b = threadPoolExecutor;
        f26741c = new Object();
        f26742d = new L01();
    }

    /* renamed from: a */
    public static C3934dX m18006a(String str, Context context, C1791bX c1791bX, int i) {
        C0640K9 c0640k9 = f26739a;
        Typeface typeface = (Typeface) c0640k9.m4572e(str);
        if (typeface != null) {
            return new C3934dX(typeface);
        }
        try {
            C6306kX c6306kXM5916a = AbstractC8041Nz1.m5916a(context, c1791bX);
            int i2 = 1;
            C6369lX[] c6369lXArr = c6306kXM5916a.f36524b;
            int i3 = c6306kXM5916a.f36523a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else if (c6369lXArr != null && c6369lXArr.length != 0) {
                int length = c6369lXArr.length;
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c6369lXArr[i4].f37097e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
            }
            if (i2 != 0) {
                return new C3934dX(i2);
            }
            Typeface typefaceMo3090c = AbstractC7843Ke1.f6246a.mo3090c(context, c6369lXArr, i);
            if (typefaceMo3090c == null) {
                return new C3934dX(-3);
            }
            c0640k9.m4573f(str, typefaceMo3090c);
            return new C3934dX(typefaceMo3090c);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3934dX(-1);
        }
    }
}
