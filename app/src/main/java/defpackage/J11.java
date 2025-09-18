package defpackage;

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
public final class J11 implements InterfaceC6839rR0, InterfaceC3505e21 {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public int A;
    public final F41 a;
    public final Object b;
    public final FR0 c;
    public final InterfaceC8173yR0 d;
    public final Context e;
    public final C7903x10 f;
    public final Object g;
    public final Class h;
    public final AbstractC0116Bg i;
    public final int j;
    public final int k;
    public final EnumC7561vD0 l;
    public final A81 m;
    public final List n;
    public final C7304tt o;
    public final Executor p;
    public JO q;
    public C5772lr0 r;
    public volatile EO s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public int w;
    public int x;
    public boolean y;
    public final RuntimeException z;

    public J11(Context context, C7903x10 c7903x10, Object obj, Object obj2, Class cls, AbstractC0116Bg abstractC0116Bg, int i, int i2, EnumC7561vD0 enumC7561vD0, A81 a81, FR0 fr0, List list, InterfaceC8173yR0 interfaceC8173yR0, EO eo, Executor executor) {
        C7304tt c7304tt = C0708Iv0.a;
        if (B) {
            String.valueOf(hashCode());
        }
        this.a = new F41();
        this.b = obj;
        this.e = context;
        this.f = c7903x10;
        this.g = obj2;
        this.h = cls;
        this.i = abstractC0116Bg;
        this.j = i;
        this.k = i2;
        this.l = enumC7561vD0;
        this.m = a81;
        this.c = fr0;
        this.n = list;
        this.d = interfaceC8173yR0;
        this.s = eo;
        this.o = c7304tt;
        this.p = executor;
        this.A = 1;
        if (this.z == null && ((Map) c7903x10.h.b).containsKey(AbstractC7140t10.class)) {
            this.z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 4;
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean b(InterfaceC6839rR0 interfaceC6839rR0) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0116Bg abstractC0116Bg;
        EnumC7561vD0 enumC7561vD0;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0116Bg abstractC0116Bg2;
        EnumC7561vD0 enumC7561vD02;
        int size2;
        if (!(interfaceC6839rR0 instanceof J11)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                abstractC0116Bg = this.i;
                enumC7561vD0 = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        J11 j11 = (J11) interfaceC6839rR0;
        synchronized (j11.b) {
            try {
                i3 = j11.j;
                i4 = j11.k;
                obj2 = j11.g;
                cls2 = j11.h;
                abstractC0116Bg2 = j11.i;
                enumC7561vD02 = j11.l;
                List list2 = j11.n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC0121Bh1.a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && abstractC0116Bg.equals(abstractC0116Bg2) && enumC7561vD0 == enumC7561vD02 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (this.y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.m.a(this);
        C5772lr0 c5772lr0 = this.r;
        if (c5772lr0 != null) {
            synchronized (((EO) c5772lr0.d)) {
                ((HO) c5772lr0.b).j((J11) c5772lr0.c);
            }
            this.r = null;
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                if (this.A == 6) {
                    return;
                }
                c();
                JO jo = this.q;
                if (jo != null) {
                    this.q = null;
                } else {
                    jo = null;
                }
                InterfaceC8173yR0 interfaceC8173yR0 = this.d;
                if (interfaceC8173yR0 == null || interfaceC8173yR0.f(this)) {
                    this.m.i(e());
                }
                this.A = 6;
                if (jo != null) {
                    this.s.getClass();
                    EO.f(jo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.v == null) {
            AbstractC0116Bg abstractC0116Bg = this.i;
            Drawable fallbackDrawable = abstractC0116Bg.getFallbackDrawable();
            this.v = fallbackDrawable;
            if (fallbackDrawable == null && abstractC0116Bg.getFallbackId() > 0) {
                this.v = g(abstractC0116Bg.getFallbackId());
            }
        }
        return this.v;
    }

    public final Drawable e() {
        if (this.u == null) {
            AbstractC0116Bg abstractC0116Bg = this.i;
            Drawable placeholderDrawable = abstractC0116Bg.getPlaceholderDrawable();
            this.u = placeholderDrawable;
            if (placeholderDrawable == null && abstractC0116Bg.getPlaceholderId() > 0) {
                this.u = g(abstractC0116Bg.getPlaceholderId());
            }
        }
        return this.u;
    }

    public final boolean f() {
        InterfaceC8173yR0 interfaceC8173yR0 = this.d;
        return interfaceC8173yR0 == null || !interfaceC8173yR0.e().a();
    }

    public final Drawable g(int i) {
        AbstractC0116Bg abstractC0116Bg = this.i;
        Resources.Theme theme = abstractC0116Bg.getTheme() != null ? abstractC0116Bg.getTheme() : this.e.getTheme();
        C7903x10 c7903x10 = this.f;
        return C6698qh1.b(c7903x10, c7903x10, i, theme);
    }

    public final void h(C8283z10 c8283z10, int i) {
        boolean zOnLoadFailed;
        this.a.a();
        synchronized (this.b) {
            try {
                c8283z10.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Objects.toString(this.g);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C8283z10.a(c8283z10, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.r = null;
                this.A = 5;
                InterfaceC8173yR0 interfaceC8173yR0 = this.d;
                if (interfaceC8173yR0 != null) {
                    interfaceC8173yR0.c(this);
                }
                boolean z = true;
                this.y = true;
                try {
                    List list = this.n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= ((FR0) it.next()).onLoadFailed(c8283z10, this.g, this.m, f());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    FR0 fr0 = this.c;
                    if (fr0 == null || !fr0.onLoadFailed(c8283z10, this.g, this.m, f())) {
                        z = false;
                    }
                    if (!(zOnLoadFailed | z)) {
                        o();
                    }
                    this.y = false;
                } finally {
                    this.y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 6;
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            int i = this.A;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void j() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = AbstractC6136nl0.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (AbstractC0121Bh1.j(this.j, this.k)) {
                        this.w = this.j;
                        this.x = this.k;
                    }
                    h(new C8283z10("Received null model"), d() == null ? 5 : 3);
                    return;
                }
                int i2 = this.A;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    l(this.q, XC.e, false);
                    return;
                }
                List<FR0> list = this.n;
                if (list != null) {
                    for (FR0 fr0 : list) {
                    }
                }
                this.A = 3;
                if (AbstractC0121Bh1.j(this.j, this.k)) {
                    n(this.j, this.k);
                } else {
                    this.m.b(this);
                }
                int i3 = this.A;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC8173yR0 interfaceC8173yR0 = this.d;
                    if (interfaceC8173yR0 == null || interfaceC8173yR0.g(this)) {
                        this.m.g(e());
                    }
                }
                if (B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 4;
        }
        return z;
    }

    public final void l(JO jo, XC xc, boolean z) {
        this.a.a();
        JO jo2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.r = null;
                    if (jo == null) {
                        h(new C8283z10("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = jo.c.get();
                    try {
                        if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                            InterfaceC8173yR0 interfaceC8173yR0 = this.d;
                            if (interfaceC8173yR0 == null || interfaceC8173yR0.h(this)) {
                                m(jo, obj, xc);
                                return;
                            }
                            this.q = null;
                            this.A = 4;
                            this.s.getClass();
                            EO.f(jo);
                            return;
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(jo);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        h(new C8283z10(sb.toString()), 5);
                        this.s.getClass();
                        EO.f(jo);
                    } catch (Throwable th) {
                        jo2 = jo;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (jo2 != null) {
                this.s.getClass();
                EO.f(jo2);
            }
            throw th3;
        }
    }

    public final void m(JO jo, Object obj, XC xc) {
        boolean zOnResourceReady;
        boolean zF = f();
        this.A = 4;
        this.q = jo;
        if (this.f.i <= 3) {
            Objects.toString(xc);
            Objects.toString(this.g);
            int i = AbstractC6136nl0.a;
            SystemClock.elapsedRealtimeNanos();
        }
        InterfaceC8173yR0 interfaceC8173yR0 = this.d;
        if (interfaceC8173yR0 != null) {
            interfaceC8173yR0.d(this);
        }
        boolean z = true;
        this.y = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    zOnResourceReady |= ((FR0) it.next()).onResourceReady(obj, this.g, this.m, xc, zF);
                }
            } else {
                zOnResourceReady = false;
            }
            FR0 fr0 = this.c;
            if (fr0 == null || !fr0.onResourceReady(obj, this.g, this.m, xc, zF)) {
                z = false;
            }
            if (!(z | zOnResourceReady)) {
                this.o.getClass();
                this.m.e(obj);
            }
            this.y = false;
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    public final void n(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.a.a();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = B;
                    if (z) {
                        int i3 = AbstractC6136nl0.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.A == 3) {
                        this.A = 2;
                        float sizeMultiplier = this.i.getSizeMultiplier();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * sizeMultiplier);
                        }
                        this.w = iRound;
                        this.x = i2 == Integer.MIN_VALUE ? i2 : Math.round(sizeMultiplier * i2);
                        if (z) {
                            int i4 = AbstractC6136nl0.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        obj = obj2;
                        try {
                            this.r = this.s.a(this.f, this.g, this.i.getSignature(), this.w, this.x, this.i.getResourceClass(), this.h, this.l, this.i.getDiskCacheStrategy(), this.i.getTransformations(), this.i.isTransformationRequired(), this.i.isScaleOnlyOrNoTransform(), this.i.getOptions(), this.i.isMemoryCacheable(), this.i.getUseUnlimitedSourceGeneratorsPool(), this.i.getUseAnimationPool(), this.i.getOnlyRetrieveFromCache(), this, this.p);
                            if (this.A != 2) {
                                this.r = null;
                            }
                            if (z) {
                                int i5 = AbstractC6136nl0.a;
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

    public final void o() {
        InterfaceC8173yR0 interfaceC8173yR0 = this.d;
        if (interfaceC8173yR0 == null || interfaceC8173yR0.g(this)) {
            Drawable drawableD = this.g == null ? d() : null;
            if (drawableD == null) {
                if (this.t == null) {
                    AbstractC0116Bg abstractC0116Bg = this.i;
                    Drawable errorPlaceholder = abstractC0116Bg.getErrorPlaceholder();
                    this.t = errorPlaceholder;
                    if (errorPlaceholder == null && abstractC0116Bg.getErrorId() > 0) {
                        this.t = g(abstractC0116Bg.getErrorId());
                    }
                }
                drawableD = this.t;
            }
            if (drawableD == null) {
                drawableD = e();
            }
            this.m.f(drawableD);
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void pause() {
        synchronized (this.b) {
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
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
