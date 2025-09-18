package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;

/* renamed from: tn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11205tn0 {

    /* renamed from: a */
    public static boolean f43257a;

    /* renamed from: b */
    public static final C6294kL f43258b = new C6294kL(8);

    /* renamed from: a */
    public static C6506ni m24982a(InterfaceC6443mi interfaceC6443mi, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC11567wc1.f44998d;
                    lock.lock();
                    Bitmap bitmapMo320o = interfaceC6443mi.mo320o(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo320o);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo320o;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC6443mi = f43258b;
        }
        return C6506ni.m23171b(interfaceC6443mi, bitmap);
    }

    /* renamed from: b */
    public static int m24983b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static Map m24984c(Pair pair) {
        O90.m5968f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f36702a, pair.f36703b);
        O90.m5967e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: d */
    public static final Map m24985d(Map map) {
        O90.m5968f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        O90.m5967e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    /* renamed from: e */
    public static synchronized void m24986e() {
        if (f43257a) {
            return;
        }
        f43257a = true;
    }
}
