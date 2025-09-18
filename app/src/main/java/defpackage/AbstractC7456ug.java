package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7456ug implements InterfaceC6604qC0 {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    @Override // defpackage.InterfaceC6604qC0
    public AbstractC8446zt a(Bitmap bitmap, N8 n8) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        AbstractC8446zt abstractC8446ztG = n8.g(width, height, config);
        try {
            d((Bitmap) abstractC8446ztG.w(), bitmap);
            return abstractC8446ztG.clone();
        } finally {
            AbstractC8446zt.p(abstractC8446ztG);
        }
    }

    @Override // defpackage.InterfaceC6604qC0
    public InterfaceC4213hl b() {
        return null;
    }

    public final void d(Bitmap bitmap, Bitmap bitmap2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                b.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        c(bitmap);
    }

    @Override // defpackage.InterfaceC6604qC0
    public final String getName() {
        return "Unknown postprocessor";
    }

    public void c(Bitmap bitmap) {
    }
}
