package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Bh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7381Bh1 {

    /* renamed from: a */
    public static final char[] f976a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f977b = new char[64];

    /* renamed from: c */
    public static volatile Handler f978c;

    /* renamed from: a */
    public static void m802a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m803b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static int m804c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: d */
    public static int m805d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC11831yh1.f46420a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: e */
    public static ArrayList m806e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Handler m807f() {
        if (f978c == null) {
            synchronized (AbstractC7381Bh1.class) {
                try {
                    if (f978c == null) {
                        f978c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f978c;
    }

    /* renamed from: g */
    public static int m808g(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: h */
    public static int m809h(int i, Object obj) {
        return m808g(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: i */
    public static boolean m810i() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }

    /* renamed from: j */
    public static boolean m811j(int i, int i2) {
        return (i > 0 || i == Integer.MIN_VALUE) && (i2 > 0 || i2 == Integer.MIN_VALUE);
    }
}
