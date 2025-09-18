package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* renamed from: cn1 */
/* loaded from: classes.dex */
public final class C2582cn1 {
    public static final C8272yy0 q = C8272yy0.a(C1851Xm1.c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");
    public final C1617Um1 a;
    public final Handler b;
    public final ArrayList c;
    public final JR0 d;
    public final InterfaceC5935mi e;
    public boolean f;
    public boolean g;
    public final C7983xR0 h;
    public C2007Zm1 i;
    public boolean j;
    public C2007Zm1 k;
    public Bitmap l;
    public C2007Zm1 m;
    public final int n;
    public final int o;
    public final int p;

    public C2582cn1(a aVar, C1617Um1 c1617Um1, int i, int i2, Bitmap bitmap) {
        C1752Wf1 c1752Wf1 = C1752Wf1.b;
        InterfaceC5935mi interfaceC5935mi = aVar.b;
        C7903x10 c7903x10 = aVar.d;
        JR0 jr0H = a.h(c7903x10.getBaseContext());
        C7983xR0 c7983xR0Apply = a.h(c7903x10.getBaseContext()).asBitmap().apply(((PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC3750fK.a).useAnimationPool(true)).skipMemoryCache(true)).override(i, i2));
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.d = jr0H;
        Handler handler = new Handler(Looper.getMainLooper(), new C5422k10(2, this));
        this.e = interfaceC5935mi;
        this.b = handler;
        this.h = c7983xR0Apply;
        this.a = c1617Um1;
        this.l = bitmap;
        this.h = c7983xR0Apply.apply(new PR0().transform((InterfaceC7446uc1) c1752Wf1, true));
        this.n = AbstractC0121Bh1.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        C2007Zm1 c2007Zm1 = this.m;
        if (c2007Zm1 != null) {
            this.m = null;
            b(c2007Zm1);
            return;
        }
        this.g = true;
        C1617Um1 c1617Um1 = this.a;
        int[] iArr = c1617Um1.e;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((iArr.length == 0 || (i = c1617Um1.d) < 0) ? 0 : (i < 0 || i >= iArr.length) ? -1 : iArr[i]);
        c1617Um1.b();
        this.k = new C2007Zm1(this.b, c1617Um1.d, jUptimeMillis);
        this.h.apply(PR0.signatureOf(new C2392bn1(new C1958Yw0(c1617Um1), r2)).skipMemoryCache(c1617Um1.k.a == 1)).m38load(c1617Um1).into((C7983xR0) this.k);
    }

    public final void b(C2007Zm1 c2007Zm1) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, c2007Zm1).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = c2007Zm1;
            return;
        }
        if (c2007Zm1.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.i(bitmap);
                this.l = null;
            }
            C2007Zm1 c2007Zm12 = this.i;
            this.i = c2007Zm1;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                try {
                    InterfaceC2201an1 interfaceC2201an1 = (InterfaceC2201an1) arrayList.get(size);
                    if (interfaceC2201an1 != null) {
                        ((C1773Wm1) interfaceC2201an1).a();
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
            if (c2007Zm12 != null) {
                handler.obtainMessage(2, c2007Zm12).sendToTarget();
            }
        }
        a();
    }
}
