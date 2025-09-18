package p000;

import com.huawei.hms.framework.common.ContainerUtils;

/* renamed from: zy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11992zy1 {

    /* renamed from: a */
    public final Object f47117a;

    /* renamed from: b */
    public final Object f47118b;

    /* renamed from: c */
    public final Object f47119c;

    public C11992zy1(Object obj, Object obj2, Object obj3) {
        this.f47117a = obj;
        this.f47118b = obj2;
        this.f47119c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m26595a() {
        Object obj = this.f47117a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f47118b);
        return new IllegalArgumentException(AbstractC11153tN0.m24914z(F91.m2541x("Multiple entries with same key: ", strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2, " and "), String.valueOf(obj), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f47119c)));
    }
}
