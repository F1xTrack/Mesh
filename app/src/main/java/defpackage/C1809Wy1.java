package defpackage;


/* renamed from: Wy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1809Wy1 {
    public final Object a;
    public final Object b;
    public final Object c;

    public C1809Wy1(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(AbstractC7209tN0.z(F91.x("Multiple entries with same key: ", strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2, " and "), String.valueOf(obj), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.c)));
    }
}
