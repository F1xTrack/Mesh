package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.util.ArrayList;

/* renamed from: cn1 */
/* loaded from: classes.dex */
public final class C9025cn1 {

    /* renamed from: q */
    public static final C11864yy0 f17748q = C11864yy0.m26288a(C8535Xm1.f13968c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");

    /* renamed from: a */
    public final C8379Um1 f17749a;

    /* renamed from: b */
    public final Handler f17750b;

    /* renamed from: c */
    public final ArrayList f17751c;

    /* renamed from: d */
    public final JR0 f17752d;

    /* renamed from: e */
    public final InterfaceC6443mi f17753e;

    /* renamed from: f */
    public boolean f17754f;

    /* renamed from: g */
    public boolean f17755g;

    /* renamed from: h */
    public final C11671xR0 f17756h;

    /* renamed from: i */
    public C8639Zm1 f17757i;

    /* renamed from: j */
    public boolean f17758j;

    /* renamed from: k */
    public C8639Zm1 f17759k;

    /* renamed from: l */
    public Bitmap f17760l;

    /* renamed from: m */
    public C8639Zm1 f17761m;

    /* renamed from: n */
    public final int f17762n;

    /* renamed from: o */
    public final int f17763o;

    /* renamed from: p */
    public final int f17764p;

    public C9025cn1(ComponentCallbacks2C1874a componentCallbacks2C1874a, C8379Um1 c8379Um1, int i, int i2, Bitmap bitmap) {
        C8469Wf1 c8469Wf1 = C8469Wf1.f13315b;
        InterfaceC6443mi interfaceC6443mi = componentCallbacks2C1874a.f17774b;
        C11617x10 c11617x10 = componentCallbacks2C1874a.f17776d;
        JR0 jr0M10888h = ComponentCallbacks2C1874a.m10888h(c11617x10.getBaseContext());
        C11671xR0 c11671xR0Apply = ComponentCallbacks2C1874a.m10888h(c11617x10.getBaseContext()).asBitmap().apply(((PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC4046fK.f27136a).useAnimationPool(true)).skipMemoryCache(true)).override(i, i2));
        this.f17751c = new ArrayList();
        this.f17754f = false;
        this.f17755g = false;
        this.f17752d = jr0M10888h;
        Handler handler = new Handler(Looper.getMainLooper(), new C9954k10(2, this));
        this.f17753e = interfaceC6443mi;
        this.f17750b = handler;
        this.f17756h = c11671xR0Apply;
        this.f17749a = c8379Um1;
        this.f17760l = bitmap;
        this.f17756h = c11671xR0Apply.apply(new PR0().transform((InterfaceC11312uc1) c8469Wf1, true));
        this.f17762n = AbstractC7381Bh1.m804c(bitmap);
        this.f17763o = bitmap.getWidth();
        this.f17764p = bitmap.getHeight();
    }

    /* renamed from: a */
    public final void m10869a() {
        int i;
        if (!this.f17754f || this.f17755g) {
            return;
        }
        C8639Zm1 c8639Zm1 = this.f17761m;
        if (c8639Zm1 != null) {
            this.f17761m = null;
            m10870b(c8639Zm1);
            return;
        }
        this.f17755g = true;
        C8379Um1 c8379Um1 = this.f17749a;
        int[] iArr = c8379Um1.f12034e;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((iArr.length == 0 || (i = c8379Um1.f12033d) < 0) ? 0 : (i < 0 || i >= iArr.length) ? -1 : iArr[i]);
        c8379Um1.m8140b();
        this.f17759k = new C8639Zm1(this.f17750b, c8379Um1.f12033d, jUptimeMillis);
        this.f17756h.apply(PR0.signatureOf(new C8897bn1(new C8606Yw0(c8379Um1), r2)).skipMemoryCache(c8379Um1.f12040k.f13969a == 1)).m26632load(c8379Um1).into((C11671xR0) this.f17759k);
    }

    /* renamed from: b */
    public final void m10870b(C8639Zm1 c8639Zm1) {
        this.f17755g = false;
        boolean z = this.f17758j;
        Handler handler = this.f17750b;
        if (z) {
            handler.obtainMessage(2, c8639Zm1).sendToTarget();
            return;
        }
        if (!this.f17754f) {
            this.f17761m = c8639Zm1;
            return;
        }
        if (c8639Zm1.f15126g != null) {
            Bitmap bitmap = this.f17760l;
            if (bitmap != null) {
                this.f17753e.mo319i(bitmap);
                this.f17760l = null;
            }
            C8639Zm1 c8639Zm12 = this.f17757i;
            this.f17757i = c8639Zm1;
            ArrayList arrayList = this.f17751c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                try {
                    InterfaceC8769an1 interfaceC8769an1 = (InterfaceC8769an1) arrayList.get(size);
                    if (interfaceC8769an1 != null) {
                        ((C8483Wm1) interfaceC8769an1).m8857a();
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
            if (c8639Zm12 != null) {
                handler.obtainMessage(2, c8639Zm12).sendToTarget();
            }
        }
        m10869a();
    }
}
