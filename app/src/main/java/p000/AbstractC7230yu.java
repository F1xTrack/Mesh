package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yu */
/* loaded from: classes2.dex */
public abstract class AbstractC7230yu {
    /* renamed from: a */
    public static final void m26270a(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
    }

    /* renamed from: b */
    public static C10685pj0 m26271b(C10685pj0 c10685pj0) {
        c10685pj0.m23854r();
        c10685pj0.f40353c = true;
        return c10685pj0.f40352b > 0 ? c10685pj0 : C10685pj0.f40350d;
    }

    /* renamed from: c */
    public static C10685pj0 m26272c() {
        return new C10685pj0(10);
    }

    /* renamed from: d */
    public static int m26273d(List list) {
        O90.m5968f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: e */
    public static List m26274e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        O90.m5967e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: f */
    public static List m26275f(Object... objArr) {
        O90.m5968f(objArr, "elements");
        return objArr.length > 0 ? AbstractC0576J8.m4176c(objArr) : C0779MN.f7117a;
    }

    /* renamed from: g */
    public static List m26276g(Object obj) {
        return obj != null ? m26274e(obj) : C0779MN.f7117a;
    }

    /* renamed from: h */
    public static ArrayList m26277h(Object... objArr) {
        O90.m5968f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6407m8(objArr, true));
    }

    /* renamed from: i */
    public static final List m26278i(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m26274e(list.get(0)) : C0779MN.f7117a;
    }

    /* renamed from: j */
    public static void m26279j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
