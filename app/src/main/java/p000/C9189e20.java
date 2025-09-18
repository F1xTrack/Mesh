package p000;

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
public final class C9189e20 {

    /* renamed from: a */
    public final ThreadLocal f26504a = new ThreadLocal();

    /* renamed from: b */
    public final ConcurrentHashMap f26505b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ES1 f26506c;

    /* renamed from: d */
    public final C7104wu f26507d;

    /* renamed from: e */
    public final List f26508e;

    /* renamed from: f */
    public final boolean f26509f;

    /* renamed from: g */
    public final List f26510g;

    /* renamed from: h */
    public final List f26511h;

    /* renamed from: i */
    public final List f26512i;

    public C9189e20(C3927dQ c3927dQ, Map map, List list, List list2, List list3, List list4) {
        ES1 es1 = new ES1(map, list4, false, 7);
        this.f26506c = es1;
        this.f26509f = true;
        this.f26510g = list;
        this.f26511h = list2;
        this.f26512i = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC7477Dd1.f2118z);
        arrayList.add(C8788ax0.f16691b);
        arrayList.add(c3927dQ);
        arrayList.addAll(list3);
        arrayList.add(AbstractC7477Dd1.f2108p);
        arrayList.add(AbstractC7477Dd1.f2099g);
        arrayList.add(AbstractC7477Dd1.f2096d);
        arrayList.add(AbstractC7477Dd1.f2097e);
        arrayList.add(AbstractC7477Dd1.f2098f);
        C7774Iw0 c7774Iw0 = AbstractC7477Dd1.f2103k;
        arrayList.add(new C8850bQ0(Long.TYPE, Long.class, c7774Iw0));
        arrayList.add(new C8850bQ0(Double.TYPE, Double.class, new C7774Iw0(1)));
        arrayList.add(new C8850bQ0(Float.TYPE, Float.class, new C7774Iw0(2)));
        arrayList.add(C7774Iw0.f5225b);
        arrayList.add(AbstractC7477Dd1.f2100h);
        arrayList.add(AbstractC7477Dd1.f2101i);
        arrayList.add(new C11823yd1(AtomicLong.class, new E31(new E31(c7774Iw0, 1), 3), 0));
        arrayList.add(new C11823yd1(AtomicLongArray.class, new E31(new E31(c7774Iw0, 2), 3), 0));
        arrayList.add(AbstractC7477Dd1.f2102j);
        arrayList.add(AbstractC7477Dd1.f2104l);
        arrayList.add(AbstractC7477Dd1.f2109q);
        arrayList.add(AbstractC7477Dd1.f2110r);
        arrayList.add(new C11823yd1(BigDecimal.class, AbstractC7477Dd1.f2105m, 0));
        arrayList.add(new C11823yd1(BigInteger.class, AbstractC7477Dd1.f2106n, 0));
        arrayList.add(new C11823yd1(AbstractC10681ph0.class, AbstractC7477Dd1.f2107o, 0));
        arrayList.add(AbstractC7477Dd1.f2111s);
        arrayList.add(AbstractC7477Dd1.f2112t);
        arrayList.add(AbstractC7477Dd1.f2114v);
        arrayList.add(AbstractC7477Dd1.f2115w);
        arrayList.add(AbstractC7477Dd1.f2117y);
        arrayList.add(AbstractC7477Dd1.f2113u);
        arrayList.add(AbstractC7477Dd1.f2094b);
        arrayList.add(C6538oD.f38886c);
        arrayList.add(AbstractC7477Dd1.f2116x);
        if (G31.f3555a) {
            arrayList.add(G31.f3557c);
            arrayList.add(G31.f3556b);
            arrayList.add(G31.f3558d);
        }
        arrayList.add(C0387G8.f3595c);
        arrayList.add(AbstractC7477Dd1.f2093a);
        arrayList.add(new C7104wu(es1, 0));
        arrayList.add(new C7104wu(es1, 2));
        C7104wu c7104wu = new C7104wu(es1, 1);
        this.f26507d = c7104wu;
        arrayList.add(c7104wu);
        arrayList.add(AbstractC7477Dd1.f2092A);
        arrayList.add(new C8850bQ0(es1, c3927dQ, c7104wu, list4));
        this.f26508e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m17820a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    public final AbstractC11058sd1 m17821b(C11825ye1 c11825ye1) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f26505b;
        AbstractC11058sd1 abstractC11058sd1 = (AbstractC11058sd1) concurrentHashMap.get(c11825ye1);
        if (abstractC11058sd1 != null) {
            return abstractC11058sd1;
        }
        ThreadLocal threadLocal = this.f26504a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC11058sd1 abstractC11058sd12 = (AbstractC11058sd1) map.get(c11825ye1);
            if (abstractC11058sd12 != null) {
                return abstractC11058sd12;
            }
            z = false;
        }
        try {
            C9061d20 c9061d20 = new C9061d20();
            AbstractC11058sd1 abstractC11058sd1Mo2052a = null;
            c9061d20.f25768a = null;
            map.put(c11825ye1, c9061d20);
            Iterator it = this.f26508e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC11058sd1Mo2052a = ((InterfaceC11314ud1) it.next()).mo2052a(this, c11825ye1);
                if (abstractC11058sd1Mo2052a != null) {
                    if (c9061d20.f25768a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c9061d20.f25768a = abstractC11058sd1Mo2052a;
                    map.put(c11825ye1, abstractC11058sd1Mo2052a);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC11058sd1Mo2052a != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC11058sd1Mo2052a;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c11825ye1);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final C7890Lc0 m17822c(Writer writer) {
        C7890Lc0 c7890Lc0 = new C7890Lc0(writer);
        c7890Lc0.f6767f = this.f26509f;
        c7890Lc0.f6766e = false;
        c7890Lc0.f6769h = false;
        return c7890Lc0;
    }

    /* renamed from: d */
    public final String m17823d(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m17824e(m17822c(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C6838sg((Throwable) e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m17825f(obj, cls, m17822c(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C6838sg((Throwable) e2);
        }
    }

    /* renamed from: e */
    public final void m17824e(C7890Lc0 c7890Lc0) {
        C11055sc0 c11055sc0 = C11055sc0.f42500a;
        boolean z = c7890Lc0.f6766e;
        c7890Lc0.f6766e = true;
        boolean z2 = c7890Lc0.f6767f;
        c7890Lc0.f6767f = this.f26509f;
        boolean z3 = c7890Lc0.f6769h;
        c7890Lc0.f6769h = false;
        try {
            try {
                C11823yd1 c11823yd1 = AbstractC7477Dd1.f2093a;
                C7774Iw0.m4086b(c7890Lc0, c11055sc0);
                c7890Lc0.f6766e = z;
                c7890Lc0.f6767f = z2;
                c7890Lc0.f6769h = z3;
            } catch (IOException e) {
                throw new C6838sg((Throwable) e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c7890Lc0.f6766e = z;
            c7890Lc0.f6767f = z2;
            c7890Lc0.f6769h = z3;
            throw th;
        }
    }

    /* renamed from: f */
    public final void m17825f(Object obj, Class cls, C7890Lc0 c7890Lc0) {
        AbstractC11058sd1 abstractC11058sd1M17821b = m17821b(new C11825ye1(cls));
        boolean z = c7890Lc0.f6766e;
        c7890Lc0.f6766e = true;
        boolean z2 = c7890Lc0.f6767f;
        c7890Lc0.f6767f = this.f26509f;
        boolean z3 = c7890Lc0.f6769h;
        c7890Lc0.f6769h = false;
        try {
            try {
                try {
                    abstractC11058sd1M17821b.mo246a(c7890Lc0, obj);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new C6838sg((Throwable) e2);
            }
        } finally {
            c7890Lc0.f6766e = z;
            c7890Lc0.f6767f = z2;
            c7890Lc0.f6769h = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f26508e + ",instanceCreators:" + this.f26506c + "}";
    }
}
