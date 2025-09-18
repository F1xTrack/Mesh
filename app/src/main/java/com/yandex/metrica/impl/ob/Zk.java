package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class Zk<T> {
    private List<Object> a;
    private final Wk b;

    public Zk(T t, Wk wk) {
        this.a = c(t);
        this.b = wk;
    }

    private List<Object> c(T t) {
        InterfaceC2812hm uk;
        Pattern patternCompile;
        Pattern patternCompile2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int iB = b(t);
        List<C2737em> listA = a(t);
        arrayList.add(new Cl(iB));
        for (C2737em c2737em : listA) {
            int iOrdinal = c2737em.a.ordinal();
            if (iOrdinal == 0) {
                uk = new Uk(c2737em.b);
            } else if (iOrdinal != 1) {
                uk = null;
                if (iOrdinal == 2) {
                    try {
                        patternCompile = Pattern.compile(c2737em.b);
                    } catch (Throwable unused) {
                        patternCompile = null;
                    }
                    if (patternCompile != null) {
                        uk = new C3010pl(patternCompile);
                    }
                } else if (iOrdinal == 3) {
                    try {
                        patternCompile2 = Pattern.compile(c2737em.b);
                    } catch (Throwable unused2) {
                        patternCompile2 = null;
                    }
                    if (patternCompile2 != null) {
                        uk = new Pk(patternCompile2);
                    }
                }
            } else {
                uk = new Kk(c2737em.b);
            }
            if (uk != null) {
                arrayList.add(uk);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Wk a() {
        return this.b;
    }

    public abstract List<C2737em> a(T t);

    public abstract int b(T t);

    public List<Object> b() {
        return this.a;
    }

    public void d(T t) {
        this.b.a();
        this.a = c(t);
    }
}
