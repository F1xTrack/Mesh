package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Zk */
/* loaded from: classes2.dex */
abstract class AbstractC3111Zk<T> {

    /* renamed from: a */
    private List<Object> f23003a;

    /* renamed from: b */
    private final C3036Wk f23004b;

    public AbstractC3111Zk(T t, C3036Wk c3036Wk) {
        this.f23003a = m15558c(t);
        this.f23004b = c3036Wk;
    }

    /* renamed from: c */
    private List<Object> m15558c(T t) {
        InterfaceC3320hm c2986Uk;
        Pattern patternCompile;
        Pattern patternCompile2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int iMo14550b = mo14550b(t);
        List<C3242em> listMo14549a = mo14549a(t);
        arrayList.add(new C2538Cl(iMo14550b));
        for (C3242em c3242em : listMo14549a) {
            int iOrdinal = c3242em.f23374a.ordinal();
            if (iOrdinal == 0) {
                c2986Uk = new C2986Uk(c3242em.f23375b);
            } else if (iOrdinal != 1) {
                c2986Uk = null;
                if (iOrdinal == 2) {
                    try {
                        patternCompile = Pattern.compile(c3242em.f23375b);
                    } catch (Throwable unused) {
                        patternCompile = null;
                    }
                    if (patternCompile != null) {
                        c2986Uk = new C3527pl(patternCompile);
                    }
                } else if (iOrdinal == 3) {
                    try {
                        patternCompile2 = Pattern.compile(c3242em.f23375b);
                    } catch (Throwable unused2) {
                        patternCompile2 = null;
                    }
                    if (patternCompile2 != null) {
                        c2986Uk = new C2862Pk(patternCompile2);
                    }
                }
            } else {
                c2986Uk = new C2737Kk(c3242em.f23375b);
            }
            if (c2986Uk != null) {
                arrayList.add(c2986Uk);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public C3036Wk m15559a() {
        return this.f23004b;
    }

    /* renamed from: a */
    public abstract List<C3242em> mo14549a(T t);

    /* renamed from: b */
    public abstract int mo14550b(T t);

    /* renamed from: b */
    public List<Object> m15560b() {
        return this.f23003a;
    }

    /* renamed from: d */
    public void m15561d(T t) {
        this.f23004b.m15397a();
        this.f23003a = m15558c(t);
    }
}
