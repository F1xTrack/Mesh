package p000;

import com.huawei.hms.framework.common.ContainerUtils;

/* renamed from: Wy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8507Wy1 {

    /* renamed from: a */
    public final Object f13468a;

    /* renamed from: b */
    public final Object f13469b;

    /* renamed from: c */
    public final Object f13470c;

    public C8507Wy1(Object obj, Object obj2, Object obj3) {
        this.f13468a = obj;
        this.f13469b = obj2;
        this.f13470c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m8904a() {
        Object obj = this.f13468a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f13469b);
        return new IllegalArgumentException(AbstractC11153tN0.m24914z(F91.m2541x("Multiple entries with same key: ", strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2, " and "), String.valueOf(obj), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f13470c)));
    }
}
