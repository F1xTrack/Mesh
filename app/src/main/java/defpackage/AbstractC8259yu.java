package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8259yu {
    public static final void a(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
    }

    public static C6512pj0 b(C6512pj0 c6512pj0) {
        c6512pj0.r();
        c6512pj0.c = true;
        return c6512pj0.b > 0 ? c6512pj0 : C6512pj0.d;
    }

    public static C6512pj0 c() {
        return new C6512pj0(10);
    }

    public static int d(List list) {
        O90.f(list, "<this>");
        return list.size() - 1;
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        O90.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List f(Object... objArr) {
        O90.f(objArr, "elements");
        return objArr.length > 0 ? J8.c(objArr) : MN.a;
    }

    public static List g(Object obj) {
        return obj != null ? e(obj) : MN.a;
    }

    public static ArrayList h(Object... objArr) {
        O90.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5827m8(objArr, true));
    }

    public static final List i(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : e(list.get(0)) : MN.a;
    }

    public static void j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
