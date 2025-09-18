package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class J11 implements InterfaceC10905rR0, InterfaceC9190e21 {

    /* renamed from: B */
    public static final boolean f5259B = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f5260A;

    /* renamed from: a */
    public final F41 f5261a;

    /* renamed from: b */
    public final Object f5262b;

    /* renamed from: c */
    public final FR0 f5263c;

    /* renamed from: d */
    public final InterfaceC11798yR0 f5264d;

    /* renamed from: e */
    public final Context f5265e;

    /* renamed from: f */
    public final C11617x10 f5266f;

    /* renamed from: g */
    public final Object f5267g;

    /* renamed from: h */
    public final Class f5268h;

    /* renamed from: i */
    public final AbstractC0106Bg f5269i;

    /* renamed from: j */
    public final int f5270j;

    /* renamed from: k */
    public final int f5271k;

    /* renamed from: l */
    public final EnumC11389vD0 f5272l;

    /* renamed from: m */
    public final A81 f5273m;

    /* renamed from: n */
    public final List f5274n;

    /* renamed from: o */
    public final C6914tt f5275o;

    /* renamed from: p */
    public final Executor f5276p;

    /* renamed from: q */
    public C0592JO f5277q;

    /* renamed from: r */
    public C10189lr0 f5278r;

    /* renamed from: s */
    public volatile C0277EO f5279s;

    /* renamed from: t */
    public Drawable f5280t;

    /* renamed from: u */
    public Drawable f5281u;

    /* renamed from: v */
    public Drawable f5282v;

    /* renamed from: w */
    public int f5283w;

    /* renamed from: x */
    public int f5284x;

    /* renamed from: y */
    public boolean f5285y;

    /* renamed from: z */
    public final RuntimeException f5286z;

    public J11(Context context, C11617x10 c11617x10, Object obj, Object obj2, Class cls, AbstractC0106Bg abstractC0106Bg, int i, int i2, EnumC11389vD0 enumC11389vD0, A81 a81, FR0 fr0, List list, InterfaceC11798yR0 interfaceC11798yR0, C0277EO c0277eo, Executor executor) {
        C6914tt c6914tt = C7772Iv0.f5200a;
        if (f5259B) {
            String.valueOf(hashCode());
        }
        this.f5261a = new F41();
        this.f5262b = obj;
        this.f5265e = context;
        this.f5266f = c11617x10;
        this.f5267g = obj2;
        this.f5268h = cls;
        this.f5269i = abstractC0106Bg;
        this.f5270j = i;
        this.f5271k = i2;
        this.f5272l = enumC11389vD0;
        this.f5273m = a81;
        this.f5263c = fr0;
        this.f5274n = list;
        this.f5264d = interfaceC11798yR0;
        this.f5279s = c0277eo;
        this.f5275o = c6914tt;
        this.f5276p = executor;
        this.f5260A = 1;
        if (this.f5286z == null && ((Map) c11617x10.f45268h.f7393b).containsKey(AbstractC11106t10.class)) {
            this.f5286z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: a */
    public final boolean mo4116a() {
        boolean z;
        synchronized (this.f5262b) {
            z = this.f5260A == 4;
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: b */
    public final boolean mo4117b(InterfaceC10905rR0 interfaceC10905rR0) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0106Bg abstractC0106Bg;
        EnumC11389vD0 enumC11389vD0;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0106Bg abstractC0106Bg2;
        EnumC11389vD0 enumC11389vD02;
        int size2;
        if (!(interfaceC10905rR0 instanceof J11)) {
            return false;
        }
        synchronized (this.f5262b) {
            try {
                i = this.f5270j;
                i2 = this.f5271k;
                obj = this.f5267g;
                cls = this.f5268h;
                abstractC0106Bg = this.f5269i;
                enumC11389vD0 = this.f5272l;
                List list = this.f5274n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        J11 j11 = (J11) interfaceC10905rR0;
        synchronized (j11.f5262b) {
            try {
                i3 = j11.f5270j;
                i4 = j11.f5271k;
                obj2 = j11.f5267g;
                cls2 = j11.f5268h;
                abstractC0106Bg2 = j11.f5269i;
                enumC11389vD02 = j11.f5272l;
                List list2 = j11.f5274n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC7381Bh1.f976a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && abstractC0106Bg.equals(abstractC0106Bg2) && enumC11389vD0 == enumC11389vD02 && size == size2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m4118c() {
        if (this.f5285y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f5261a.m2490a();
        this.f5273m.mo77a(this);
        C10189lr0 c10189lr0 = this.f5278r;
        if (c10189lr0 != null) {
            synchronized (((C0277EO) c10189lr0.f37325d)) {
                ((C0466HO) c10189lr0.f37323b).m3397j((J11) c10189lr0.f37324c);
            }
            this.f5278r = null;
        }
    }

    @Override // p000.InterfaceC10905rR0
    public final void clear() {
        synchronized (this.f5262b) {
            try {
                if (this.f5285y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f5261a.m2490a();
                if (this.f5260A == 6) {
                    return;
                }
                m4118c();
                C0592JO c0592jo = this.f5277q;
                if (c0592jo != null) {
                    this.f5277q = null;
                } else {
                    c0592jo = null;
                }
                InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
                if (interfaceC11798yR0 == null || interfaceC11798yR0.mo17585f(this)) {
                    this.f5273m.mo84i(m4120e());
                }
                this.f5260A = 6;
                if (c0592jo != null) {
                    this.f5279s.getClass();
                    C0277EO.m2201f(c0592jo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final Drawable m4119d() {
        if (this.f5282v == null) {
            AbstractC0106Bg abstractC0106Bg = this.f5269i;
            Drawable fallbackDrawable = abstractC0106Bg.getFallbackDrawable();
            this.f5282v = fallbackDrawable;
            if (fallbackDrawable == null && abstractC0106Bg.getFallbackId() > 0) {
                this.f5282v = m4122g(abstractC0106Bg.getFallbackId());
            }
        }
        return this.f5282v;
    }

    /* renamed from: e */
    public final Drawable m4120e() {
        if (this.f5281u == null) {
            AbstractC0106Bg abstractC0106Bg = this.f5269i;
            Drawable placeholderDrawable = abstractC0106Bg.getPlaceholderDrawable();
            this.f5281u = placeholderDrawable;
            if (placeholderDrawable == null && abstractC0106Bg.getPlaceholderId() > 0) {
                this.f5281u = m4122g(abstractC0106Bg.getPlaceholderId());
            }
        }
        return this.f5281u;
    }

    /* renamed from: f */
    public final boolean m4121f() {
        InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
        return interfaceC11798yR0 == null || !interfaceC11798yR0.mo17584e().mo4116a();
    }

    /* renamed from: g */
    public final Drawable m4122g(int i) {
        AbstractC0106Bg abstractC0106Bg = this.f5269i;
        Resources.Theme theme = abstractC0106Bg.getTheme() != null ? abstractC0106Bg.getTheme() : this.f5265e.getTheme();
        C11617x10 c11617x10 = this.f5266f;
        return C10810qh1.m24044b(c11617x10, c11617x10, i, theme);
    }

    /* renamed from: h */
    public final void m4123h(C11871z10 c11871z10, int i) {
        boolean zOnLoadFailed;
        this.f5261a.m2490a();
        synchronized (this.f5262b) {
            try {
                c11871z10.getClass();
                int i2 = this.f5266f.f45269i;
                if (i2 <= i) {
                    Objects.toString(this.f5267g);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C11871z10.m26300a(c11871z10, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.f5278r = null;
                this.f5260A = 5;
                InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
                if (interfaceC11798yR0 != null) {
                    interfaceC11798yR0.mo17582c(this);
                }
                boolean z = true;
                this.f5285y = true;
                try {
                    List list = this.f5274n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= ((FR0) it.next()).onLoadFailed(c11871z10, this.f5267g, this.f5273m, m4121f());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    FR0 fr0 = this.f5263c;
                    if (fr0 == null || !fr0.onLoadFailed(c11871z10, this.f5267g, this.f5273m, m4121f())) {
                        z = false;
                    }
                    if (!(zOnLoadFailed | z)) {
                        m4130o();
                    }
                    this.f5285y = false;
                } finally {
                    this.f5285y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: i */
    public final boolean mo4124i() {
        boolean z;
        synchronized (this.f5262b) {
            z = this.f5260A == 6;
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f5262b) {
            int i = this.f5260A;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: j */
    public final void mo4125j() {
        synchronized (this.f5262b) {
            try {
                if (this.f5285y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f5261a.m2490a();
                int i = AbstractC10433nl0.f38500a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f5267g == null) {
                    if (AbstractC7381Bh1.m811j(this.f5270j, this.f5271k)) {
                        this.f5283w = this.f5270j;
                        this.f5284x = this.f5271k;
                    }
                    m4123h(new C11871z10("Received null model"), m4119d() == null ? 5 : 3);
                    return;
                }
                int i2 = this.f5260A;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m4127l(this.f5277q, EnumC1460XC.f13618e, false);
                    return;
                }
                List<FR0> list = this.f5274n;
                if (list != null) {
                    for (FR0 fr0 : list) {
                    }
                }
                this.f5260A = 3;
                if (AbstractC7381Bh1.m811j(this.f5270j, this.f5271k)) {
                    m4129n(this.f5270j, this.f5271k);
                } else {
                    this.f5273m.mo78b(this);
                }
                int i3 = this.f5260A;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
                    if (interfaceC11798yR0 == null || interfaceC11798yR0.mo17586g(this)) {
                        this.f5273m.mo82g(m4120e());
                    }
                }
                if (f5259B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: k */
    public final boolean mo4126k() {
        boolean z;
        synchronized (this.f5262b) {
            z = this.f5260A == 4;
        }
        return z;
    }

    /* renamed from: l */
    public final void m4127l(C0592JO c0592jo, EnumC1460XC enumC1460XC, boolean z) {
        this.f5261a.m2490a();
        C0592JO c0592jo2 = null;
        try {
            synchronized (this.f5262b) {
                try {
                    this.f5278r = null;
                    if (c0592jo == null) {
                        m4123h(new C11871z10("Expected to receive a Resource<R> with an object of " + this.f5268h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = c0592jo.f5504c.get();
                    try {
                        if (obj != null && this.f5268h.isAssignableFrom(obj.getClass())) {
                            InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
                            if (interfaceC11798yR0 == null || interfaceC11798yR0.mo17587h(this)) {
                                m4128m(c0592jo, obj, enumC1460XC);
                                return;
                            }
                            this.f5277q = null;
                            this.f5260A = 4;
                            this.f5279s.getClass();
                            C0277EO.m2201f(c0592jo);
                            return;
                        }
                        this.f5277q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f5268h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(c0592jo);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        m4123h(new C11871z10(sb.toString()), 5);
                        this.f5279s.getClass();
                        C0277EO.m2201f(c0592jo);
                    } catch (Throwable th) {
                        c0592jo2 = c0592jo;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (c0592jo2 != null) {
                this.f5279s.getClass();
                C0277EO.m2201f(c0592jo2);
            }
            throw th3;
        }
    }

    /* renamed from: m */
    public final void m4128m(C0592JO c0592jo, Object obj, EnumC1460XC enumC1460XC) {
        boolean zOnResourceReady;
        boolean zM4121f = m4121f();
        this.f5260A = 4;
        this.f5277q = c0592jo;
        if (this.f5266f.f45269i <= 3) {
            Objects.toString(enumC1460XC);
            Objects.toString(this.f5267g);
            int i = AbstractC10433nl0.f38500a;
            SystemClock.elapsedRealtimeNanos();
        }
        InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
        if (interfaceC11798yR0 != null) {
            interfaceC11798yR0.mo17583d(this);
        }
        boolean z = true;
        this.f5285y = true;
        try {
            List list = this.f5274n;
            if (list != null) {
                Iterator it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    zOnResourceReady |= ((FR0) it.next()).onResourceReady(obj, this.f5267g, this.f5273m, enumC1460XC, zM4121f);
                }
            } else {
                zOnResourceReady = false;
            }
            FR0 fr0 = this.f5263c;
            if (fr0 == null || !fr0.onResourceReady(obj, this.f5267g, this.f5273m, enumC1460XC, zM4121f)) {
                z = false;
            }
            if (!(z | zOnResourceReady)) {
                this.f5275o.getClass();
                this.f5273m.mo80e(obj);
            }
            this.f5285y = false;
        } catch (Throwable th) {
            this.f5285y = false;
            throw th;
        }
    }

    /* renamed from: n */
    public final void m4129n(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f5261a.m2490a();
        Object obj2 = this.f5262b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f5259B;
                    if (z) {
                        int i3 = AbstractC10433nl0.f38500a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.f5260A == 3) {
                        this.f5260A = 2;
                        float sizeMultiplier = this.f5269i.getSizeMultiplier();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * sizeMultiplier);
                        }
                        this.f5283w = iRound;
                        this.f5284x = i2 == Integer.MIN_VALUE ? i2 : Math.round(sizeMultiplier * i2);
                        if (z) {
                            int i4 = AbstractC10433nl0.f38500a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        obj = obj2;
                        try {
                            this.f5278r = this.f5279s.m2202a(this.f5266f, this.f5267g, this.f5269i.getSignature(), this.f5283w, this.f5284x, this.f5269i.getResourceClass(), this.f5268h, this.f5272l, this.f5269i.getDiskCacheStrategy(), this.f5269i.getTransformations(), this.f5269i.isTransformationRequired(), this.f5269i.isScaleOnlyOrNoTransform(), this.f5269i.getOptions(), this.f5269i.isMemoryCacheable(), this.f5269i.getUseUnlimitedSourceGeneratorsPool(), this.f5269i.getUseAnimationPool(), this.f5269i.getOnlyRetrieveFromCache(), this, this.f5276p);
                            if (this.f5260A != 2) {
                                this.f5278r = null;
                            }
                            if (z) {
                                int i5 = AbstractC10433nl0.f38500a;
                                SystemClock.elapsedRealtimeNanos();
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: o */
    public final void m4130o() {
        InterfaceC11798yR0 interfaceC11798yR0 = this.f5264d;
        if (interfaceC11798yR0 == null || interfaceC11798yR0.mo17586g(this)) {
            Drawable drawableM4119d = this.f5267g == null ? m4119d() : null;
            if (drawableM4119d == null) {
                if (this.f5280t == null) {
                    AbstractC0106Bg abstractC0106Bg = this.f5269i;
                    Drawable errorPlaceholder = abstractC0106Bg.getErrorPlaceholder();
                    this.f5280t = errorPlaceholder;
                    if (errorPlaceholder == null && abstractC0106Bg.getErrorId() > 0) {
                        this.f5280t = m4122g(abstractC0106Bg.getErrorId());
                    }
                }
                drawableM4119d = this.f5280t;
            }
            if (drawableM4119d == null) {
                drawableM4119d = m4120e();
            }
            this.f5273m.mo81f(drawableM4119d);
        }
    }

    @Override // p000.InterfaceC10905rR0
    public final void pause() {
        synchronized (this.f5262b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f5262b) {
            obj = this.f5267g;
            cls = this.f5268h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
