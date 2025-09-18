package p000;

/* renamed from: ra0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10923ra0 {

    /* renamed from: a */
    public static final Integer f41736a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f41736a = num;
    }
}
