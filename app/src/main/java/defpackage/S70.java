package defpackage;


/* loaded from: classes.dex */
public final class S70 {
    public final Object a;
    public final Object b;
    public final Object c;

    public S70(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.a;
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.b);
        sb.append(" and ");
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.c);
        return new IllegalArgumentException(sb.toString());
    }
}
