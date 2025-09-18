package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ug */
/* loaded from: classes.dex */
public abstract class AbstractC6964ug implements InterfaceC10747qC0 {

    /* renamed from: a */
    public static final Bitmap.Config f43789a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    public static Method f43790b;

    @Override // p000.InterfaceC10747qC0
    /* renamed from: a */
    public AbstractC7292zt mo3818a(Bitmap bitmap, C0827N8 c0827n8) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f43789a;
        }
        AbstractC7292zt abstractC7292ztM5558g = c0827n8.m5558g(width, height, config);
        try {
            m25218d((Bitmap) abstractC7292ztM5558g.m26572w(), bitmap);
            return abstractC7292ztM5558g.clone();
        } finally {
            AbstractC7292zt.m26569p(abstractC7292ztM5558g);
        }
    }

    @Override // p000.InterfaceC10747qC0
    /* renamed from: b */
    public InterfaceC4199hl mo22219b() {
        return null;
    }

    /* renamed from: d */
    public final void m25218d(Bitmap bitmap, Bitmap bitmap2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (f43790b == null) {
                    int i = Bitmaps.f17850a;
                    f43790b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                f43790b.invoke(null, bitmap, bitmap2);
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
        mo22220c(bitmap);
    }

    @Override // p000.InterfaceC10747qC0
    public final String getName() {
        return "Unknown postprocessor";
    }

    /* renamed from: c */
    public void mo22220c(Bitmap bitmap) {
    }
}
