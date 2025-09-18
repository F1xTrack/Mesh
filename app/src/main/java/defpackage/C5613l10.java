package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* renamed from: l10 */
/* loaded from: classes.dex */
public final class C5613l10 {
    public final C6008n41 a;
    public final Handler b;
    public final ArrayList c;
    public final JR0 d;
    public final InterfaceC5935mi e;
    public boolean f;
    public boolean g;
    public C7983xR0 h;
    public C4264i10 i;
    public boolean j;
    public C4264i10 k;
    public Bitmap l;
    public C4264i10 m;
    public int n;
    public int o;
    public int p;

    public C5613l10(a aVar, C6008n41 c6008n41, int i, int i2, Bitmap bitmap) {
        C1752Wf1 c1752Wf1 = C1752Wf1.b;
        InterfaceC5935mi interfaceC5935mi = aVar.b;
        C7903x10 c7903x10 = aVar.d;
        JR0 jr0H = a.h(c7903x10.getBaseContext());
        C7983xR0 c7983xR0Apply = a.h(c7903x10.getBaseContext()).asBitmap().apply(((PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC3750fK.a).useAnimationPool(true)).skipMemoryCache(true)).override(i, i2));
        this.c = new ArrayList();
        this.d = jr0H;
        Handler handler = new Handler(Looper.getMainLooper(), new C5422k10(0, this));
        this.e = interfaceC5935mi;
        this.b = handler;
        this.h = c7983xR0Apply;
        this.a = c6008n41;
        c(c1752Wf1, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        C4264i10 c4264i10 = this.m;
        if (c4264i10 != null) {
            this.m = null;
            b(c4264i10);
            return;
        }
        this.g = true;
        C6008n41 c6008n41 = this.a;
        int i2 = c6008n41.l.c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = c6008n41.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C4073h10) r1.e.get(i)).i);
        c6008n41.b();
        this.k = new C4264i10(this.b, c6008n41.k, jUptimeMillis);
        this.h.apply((AbstractC0116Bg) PR0.signatureOf(new C1958Yw0(Double.valueOf(Math.random())))).m38load(c6008n41).into((C7983xR0) this.k);
    }

    public final void b(C4264i10 c4264i10) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, c4264i10).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = c4264i10;
            return;
        }
        if (c4264i10.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.i(bitmap);
                this.l = null;
            }
            C4264i10 c4264i102 = this.i;
            this.i = c4264i10;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C3500e10 c3500e10 = (C3500e10) ((InterfaceC5231j10) arrayList.get(size));
                Object callback = c3500e10.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c3500e10.stop();
                    c3500e10.invalidateSelf();
                } else {
                    c3500e10.invalidateSelf();
                    C4264i10 c4264i103 = ((C5613l10) c3500e10.a.b).i;
                    if ((c4264i103 != null ? c4264i103.e : -1) == r5.a.l.c - 1) {
                        c3500e10.f++;
                    }
                    int i = c3500e10.g;
                    if (i != -1 && c3500e10.f >= i) {
                        c3500e10.stop();
                    }
                }
            }
            if (c4264i102 != null) {
                handler.obtainMessage(2, c4264i102).sendToTarget();
            }
        }
        a();
    }

    public final void c(InterfaceC7446uc1 interfaceC7446uc1, Bitmap bitmap) {
        IL1.d(interfaceC7446uc1, "Argument must not be null");
        IL1.d(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.apply(new PR0().transform(interfaceC7446uc1, true));
        this.n = AbstractC0121Bh1.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
