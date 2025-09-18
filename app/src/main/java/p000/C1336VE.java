package p000;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: VE */
/* loaded from: classes.dex */
public final class C1336VE implements InterfaceC0056At, InterfaceC7103wt {

    /* renamed from: h */
    public static final HashSet f12441h = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "modified_url", "image_color_space"));

    /* renamed from: i */
    public static final /* synthetic */ int f12442i = 0;

    /* renamed from: a */
    public final HashMap f12443a;

    /* renamed from: b */
    public L60 f12444b;

    /* renamed from: c */
    public AbstractC7292zt f12445c;

    /* renamed from: d */
    public volatile Bitmap f12446d;

    /* renamed from: e */
    public final InterfaceC11267uG0 f12447e;

    /* renamed from: f */
    public final int f12448f;

    /* renamed from: g */
    public final int f12449g;

    public C1336VE() {
        this.f12443a = new HashMap();
    }

    /* renamed from: a */
    public final void m8336a(Map map) {
        if (map == null) {
            return;
        }
        Iterator it = f12441h.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = ((HashMap) map).get(str);
            if (obj != null) {
                this.f12443a.put(str, obj);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC7292zt abstractC7292zt;
        synchronized (this) {
            abstractC7292zt = this.f12445c;
            this.f12445c = null;
            this.f12446d = null;
        }
        if (abstractC7292zt != null) {
            abstractC7292zt.close();
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        synchronized (this) {
            z = this.f12445c == null;
        }
        if (z) {
            return;
        }
        AbstractC3929dS.m17684q("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", C1336VE.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p000.J60
    public final Map getExtras() {
        return this.f12443a;
    }

    @Override // p000.J60
    public final int getHeight() {
        int i;
        if (this.f12448f % 180 != 0 || (i = this.f12449g) == 5 || i == 7) {
            Bitmap bitmap = this.f12446d;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f12446d;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // p000.J60
    public final int getWidth() {
        int i;
        if (this.f12448f % 180 != 0 || (i = this.f12449g) == 5 || i == 7) {
            Bitmap bitmap = this.f12446d;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f12446d;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    public C1336VE(Bitmap bitmap, C10689pl0 c10689pl0, T70 t70) {
        this();
        this.f12446d = bitmap;
        Bitmap bitmap2 = this.f12446d;
        c10689pl0.getClass();
        this.f12445c = AbstractC7292zt.m26567S(bitmap2, c10689pl0, AbstractC7292zt.f47072f);
        this.f12447e = t70;
        this.f12448f = 0;
        this.f12449g = 0;
    }

    public C1336VE(AbstractC7292zt abstractC7292zt, InterfaceC11267uG0 interfaceC11267uG0, int i, int i2) {
        this();
        AbstractC7292zt abstractC7292ztM26571n = abstractC7292zt.m26571n();
        abstractC7292ztM26571n.getClass();
        this.f12445c = abstractC7292ztM26571n;
        this.f12446d = (Bitmap) abstractC7292ztM26571n.m26572w();
        this.f12447e = interfaceC11267uG0;
        this.f12448f = i;
        this.f12449g = i2;
    }
}
