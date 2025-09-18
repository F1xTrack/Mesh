package defpackage;

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
public abstract class AbstractC7287tn0 {
    public static boolean a;
    public static final C5484kL b = new C5484kL(8);

    public static C6126ni a(InterfaceC5935mi interfaceC5935mi, Drawable drawable, int i, int i2) {
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
                    Lock lock = AbstractC7827wc1.d;
                    lock.lock();
                    Bitmap bitmapO = interfaceC5935mi.o(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapO);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapO;
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
            interfaceC5935mi = b;
        }
        return C6126ni.b(interfaceC5935mi, bitmap);
    }

    public static int b(int i) {
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

    public static Map c(Pair pair) {
        O90.f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.a, pair.b);
        O90.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map d(Map map) {
        O90.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        O90.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static synchronized void e() {
        if (a) {
            return;
        }
        a = true;
    }
}
