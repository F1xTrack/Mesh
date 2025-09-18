package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class VE implements InterfaceC0077At, InterfaceC7876wt {
    public static final HashSet h = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "modified_url", "image_color_space"));
    public static final /* synthetic */ int i = 0;
    public final HashMap a;
    public L60 b;
    public AbstractC8446zt c;
    public volatile Bitmap d;
    public final InterfaceC7379uG0 e;
    public final int f;
    public final int g;

    public VE() {
        this.a = new HashMap();
    }

    public final void a(Map map) {
        if (map == null) {
            return;
        }
        Iterator it = h.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = ((HashMap) map).get(str);
            if (obj != null) {
                this.a.put(str, obj);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC8446zt abstractC8446zt;
        synchronized (this) {
            abstractC8446zt = this.c;
            this.c = null;
            this.d = null;
        }
        if (abstractC8446zt != null) {
            abstractC8446zt.close();
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        synchronized (this) {
            z = this.c == null;
        }
        if (z) {
            return;
        }
        AbstractC3393dS.q("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", VE.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.J60
    public final Map getExtras() {
        return this.a;
    }

    @Override // defpackage.J60
    public final int getHeight() {
        int i2;
        if (this.f % 180 != 0 || (i2 = this.g) == 5 || i2 == 7) {
            Bitmap bitmap = this.d;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // defpackage.J60
    public final int getWidth() {
        int i2;
        if (this.f % 180 != 0 || (i2 = this.g) == 5 || i2 == 7) {
            Bitmap bitmap = this.d;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    public VE(Bitmap bitmap, C6518pl0 c6518pl0, T70 t70) {
        this();
        this.d = bitmap;
        Bitmap bitmap2 = this.d;
        c6518pl0.getClass();
        this.c = AbstractC8446zt.S(bitmap2, c6518pl0, AbstractC8446zt.f);
        this.e = t70;
        this.f = 0;
        this.g = 0;
    }

    public VE(AbstractC8446zt abstractC8446zt, InterfaceC7379uG0 interfaceC7379uG0, int i2, int i3) {
        this();
        AbstractC8446zt abstractC8446ztN = abstractC8446zt.n();
        abstractC8446ztN.getClass();
        this.c = abstractC8446ztN;
        this.d = (Bitmap) abstractC8446ztN.w();
        this.e = interfaceC7379uG0;
        this.f = i2;
        this.g = i3;
    }
}
