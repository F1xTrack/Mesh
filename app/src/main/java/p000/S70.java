package p000;

import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes.dex */
public final class S70 {

    /* renamed from: a */
    public final Object f10585a;

    /* renamed from: b */
    public final Object f10586b;

    /* renamed from: c */
    public final Object f10587c;

    public S70(Object obj, Object obj2, Object obj3) {
        this.f10585a = obj;
        this.f10586b = obj2;
        this.f10587c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m7180a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f10585a;
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.f10586b);
        sb.append(" and ");
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.f10587c);
        return new IllegalArgumentException(sb.toString());
    }
}
