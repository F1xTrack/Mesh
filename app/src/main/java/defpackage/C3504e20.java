package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: e20 */
/* loaded from: classes.dex */
public final class C3504e20 {
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ES1 c;
    public final C7879wu d;
    public final List e;
    public final boolean f;
    public final List g;
    public final List h;
    public final List i;

    public C3504e20(C3387dQ c3387dQ, Map map, List list, List list2, List list3, List list4) {
        ES1 es1 = new ES1(map, list4, false, 7);
        this.c = es1;
        this.f = true;
        this.g = list;
        this.h = list2;
        this.i = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0265Dd1.z);
        arrayList.add(C2230ax0.b);
        arrayList.add(c3387dQ);
        arrayList.addAll(list3);
        arrayList.add(AbstractC0265Dd1.p);
        arrayList.add(AbstractC0265Dd1.g);
        arrayList.add(AbstractC0265Dd1.d);
        arrayList.add(AbstractC0265Dd1.e);
        arrayList.add(AbstractC0265Dd1.f);
        C0711Iw0 c0711Iw0 = AbstractC0265Dd1.k;
        arrayList.add(new C2322bQ0(Long.TYPE, Long.class, c0711Iw0));
        arrayList.add(new C2322bQ0(Double.TYPE, Double.class, new C0711Iw0(1)));
        arrayList.add(new C2322bQ0(Float.TYPE, Float.class, new C0711Iw0(2)));
        arrayList.add(C0711Iw0.b);
        arrayList.add(AbstractC0265Dd1.h);
        arrayList.add(AbstractC0265Dd1.i);
        arrayList.add(new C8210yd1(AtomicLong.class, new E31(new E31(c0711Iw0, 1), 3), 0));
        arrayList.add(new C8210yd1(AtomicLongArray.class, new E31(new E31(c0711Iw0, 2), 3), 0));
        arrayList.add(AbstractC0265Dd1.j);
        arrayList.add(AbstractC0265Dd1.l);
        arrayList.add(AbstractC0265Dd1.q);
        arrayList.add(AbstractC0265Dd1.r);
        arrayList.add(new C8210yd1(BigDecimal.class, AbstractC0265Dd1.m, 0));
        arrayList.add(new C8210yd1(BigInteger.class, AbstractC0265Dd1.n, 0));
        arrayList.add(new C8210yd1(AbstractC6506ph0.class, AbstractC0265Dd1.o, 0));
        arrayList.add(AbstractC0265Dd1.s);
        arrayList.add(AbstractC0265Dd1.t);
        arrayList.add(AbstractC0265Dd1.v);
        arrayList.add(AbstractC0265Dd1.w);
        arrayList.add(AbstractC0265Dd1.y);
        arrayList.add(AbstractC0265Dd1.u);
        arrayList.add(AbstractC0265Dd1.b);
        arrayList.add(C6224oD.c);
        arrayList.add(AbstractC0265Dd1.x);
        if (G31.a) {
            arrayList.add(G31.c);
            arrayList.add(G31.b);
            arrayList.add(G31.d);
        }
        arrayList.add(G8.c);
        arrayList.add(AbstractC0265Dd1.a);
        arrayList.add(new C7879wu(es1, 0));
        arrayList.add(new C7879wu(es1, 2));
        C7879wu c7879wu = new C7879wu(es1, 1);
        this.d = c7879wu;
        arrayList.add(c7879wu);
        arrayList.add(AbstractC0265Dd1.A);
        arrayList.add(new C2322bQ0(es1, c3387dQ, c7879wu, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final AbstractC7067sd1 b(C8213ye1 c8213ye1) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        AbstractC7067sd1 abstractC7067sd1 = (AbstractC7067sd1) concurrentHashMap.get(c8213ye1);
        if (abstractC7067sd1 != null) {
            return abstractC7067sd1;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC7067sd1 abstractC7067sd12 = (AbstractC7067sd1) map.get(c8213ye1);
            if (abstractC7067sd12 != null) {
                return abstractC7067sd12;
            }
            z = false;
        }
        try {
            C3314d20 c3314d20 = new C3314d20();
            AbstractC7067sd1 abstractC7067sd1A = null;
            c3314d20.a = null;
            map.put(c8213ye1, c3314d20);
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC7067sd1A = ((InterfaceC7449ud1) it.next()).a(this, c8213ye1);
                if (abstractC7067sd1A != null) {
                    if (c3314d20.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c3314d20.a = abstractC7067sd1A;
                    map.put(c8213ye1, abstractC7067sd1A);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC7067sd1A != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC7067sd1A;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c8213ye1);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final C0885Lc0 c(Writer writer) {
        C0885Lc0 c0885Lc0 = new C0885Lc0(writer);
        c0885Lc0.f = this.f;
        c0885Lc0.e = false;
        c0885Lc0.h = false;
        return c0885Lc0;
    }

    public final String d(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                e(c(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C7074sg((Throwable) e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(obj, cls, c(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C7074sg((Throwable) e2);
        }
    }

    public final void e(C0885Lc0 c0885Lc0) {
        C7063sc0 c7063sc0 = C7063sc0.a;
        boolean z = c0885Lc0.e;
        c0885Lc0.e = true;
        boolean z2 = c0885Lc0.f;
        c0885Lc0.f = this.f;
        boolean z3 = c0885Lc0.h;
        c0885Lc0.h = false;
        try {
            try {
                C8210yd1 c8210yd1 = AbstractC0265Dd1.a;
                C0711Iw0.b(c0885Lc0, c7063sc0);
                c0885Lc0.e = z;
                c0885Lc0.f = z2;
                c0885Lc0.h = z3;
            } catch (IOException e) {
                throw new C7074sg((Throwable) e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c0885Lc0.e = z;
            c0885Lc0.f = z2;
            c0885Lc0.h = z3;
            throw th;
        }
    }

    public final void f(Object obj, Class cls, C0885Lc0 c0885Lc0) {
        AbstractC7067sd1 abstractC7067sd1B = b(new C8213ye1(cls));
        boolean z = c0885Lc0.e;
        c0885Lc0.e = true;
        boolean z2 = c0885Lc0.f;
        c0885Lc0.f = this.f;
        boolean z3 = c0885Lc0.h;
        c0885Lc0.h = false;
        try {
            try {
                try {
                    abstractC7067sd1B.a(c0885Lc0, obj);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new C7074sg((Throwable) e2);
            }
        } finally {
            c0885Lc0.e = z;
            c0885Lc0.f = z2;
            c0885Lc0.h = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
