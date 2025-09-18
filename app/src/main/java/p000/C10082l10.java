package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.util.ArrayList;

/* renamed from: l10 */
/* loaded from: classes.dex */
public final class C10082l10 {

    /* renamed from: a */
    public final C10348n41 f36805a;

    /* renamed from: b */
    public final Handler f36806b;

    /* renamed from: c */
    public final ArrayList f36807c;

    /* renamed from: d */
    public final JR0 f36808d;

    /* renamed from: e */
    public final InterfaceC6443mi f36809e;

    /* renamed from: f */
    public boolean f36810f;

    /* renamed from: g */
    public boolean f36811g;

    /* renamed from: h */
    public C11671xR0 f36812h;

    /* renamed from: i */
    public C9698i10 f36813i;

    /* renamed from: j */
    public boolean f36814j;

    /* renamed from: k */
    public C9698i10 f36815k;

    /* renamed from: l */
    public Bitmap f36816l;

    /* renamed from: m */
    public C9698i10 f36817m;

    /* renamed from: n */
    public int f36818n;

    /* renamed from: o */
    public int f36819o;

    /* renamed from: p */
    public int f36820p;

    public C10082l10(ComponentCallbacks2C1874a componentCallbacks2C1874a, C10348n41 c10348n41, int i, int i2, Bitmap bitmap) {
        C8469Wf1 c8469Wf1 = C8469Wf1.f13315b;
        InterfaceC6443mi interfaceC6443mi = componentCallbacks2C1874a.f17774b;
        C11617x10 c11617x10 = componentCallbacks2C1874a.f17776d;
        JR0 jr0M10888h = ComponentCallbacks2C1874a.m10888h(c11617x10.getBaseContext());
        C11671xR0 c11671xR0Apply = ComponentCallbacks2C1874a.m10888h(c11617x10.getBaseContext()).asBitmap().apply(((PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC4046fK.f27136a).useAnimationPool(true)).skipMemoryCache(true)).override(i, i2));
        this.f36807c = new ArrayList();
        this.f36808d = jr0M10888h;
        Handler handler = new Handler(Looper.getMainLooper(), new C9954k10(0, this));
        this.f36809e = interfaceC6443mi;
        this.f36806b = handler;
        this.f36812h = c11671xR0Apply;
        this.f36805a = c10348n41;
        m22334c(c8469Wf1, bitmap);
    }

    /* renamed from: a */
    public final void m22332a() {
        int i;
        if (!this.f36810f || this.f36811g) {
            return;
        }
        C9698i10 c9698i10 = this.f36817m;
        if (c9698i10 != null) {
            this.f36817m = null;
            m22333b(c9698i10);
            return;
        }
        this.f36811g = true;
        C10348n41 c10348n41 = this.f36805a;
        int i2 = c10348n41.f38081l.f37398c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = c10348n41.f38080k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C9570h10) r1.f37400e.get(i)).f28162i);
        c10348n41.m23069b();
        this.f36815k = new C9698i10(this.f36806b, c10348n41.f38080k, jUptimeMillis);
        this.f36812h.apply((AbstractC0106Bg) PR0.signatureOf(new C8606Yw0(Double.valueOf(Math.random())))).m26632load(c10348n41).into((C11671xR0) this.f36815k);
    }

    /* renamed from: b */
    public final void m22333b(C9698i10 c9698i10) {
        this.f36811g = false;
        boolean z = this.f36814j;
        Handler handler = this.f36806b;
        if (z) {
            handler.obtainMessage(2, c9698i10).sendToTarget();
            return;
        }
        if (!this.f36810f) {
            this.f36817m = c9698i10;
            return;
        }
        if (c9698i10.f28758g != null) {
            Bitmap bitmap = this.f36816l;
            if (bitmap != null) {
                this.f36809e.mo319i(bitmap);
                this.f36816l = null;
            }
            C9698i10 c9698i102 = this.f36813i;
            this.f36813i = c9698i10;
            ArrayList arrayList = this.f36807c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C9186e10 c9186e10 = (C9186e10) ((InterfaceC9826j10) arrayList.get(size));
                Object callback = c9186e10.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c9186e10.stop();
                    c9186e10.invalidateSelf();
                } else {
                    c9186e10.invalidateSelf();
                    C9698i10 c9698i103 = ((C10082l10) c9186e10.f26481a.f17293b).f36813i;
                    if ((c9698i103 != null ? c9698i103.f28756e : -1) == r5.f36805a.f38081l.f37398c - 1) {
                        c9186e10.f26486f++;
                    }
                    int i = c9186e10.f26487g;
                    if (i != -1 && c9186e10.f26486f >= i) {
                        c9186e10.stop();
                    }
                }
            }
            if (c9698i102 != null) {
                handler.obtainMessage(2, c9698i102).sendToTarget();
            }
        }
        m22332a();
    }

    /* renamed from: c */
    public final void m22334c(InterfaceC11312uc1 interfaceC11312uc1, Bitmap bitmap) {
        IL1.m3830d(interfaceC11312uc1, "Argument must not be null");
        IL1.m3830d(bitmap, "Argument must not be null");
        this.f36816l = bitmap;
        this.f36812h = this.f36812h.apply(new PR0().transform(interfaceC11312uc1, true));
        this.f36818n = AbstractC7381Bh1.m804c(bitmap);
        this.f36819o = bitmap.getWidth();
        this.f36820p = bitmap.getHeight();
    }
}
