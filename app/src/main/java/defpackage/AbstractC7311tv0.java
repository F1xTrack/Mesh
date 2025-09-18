package defpackage;

/* renamed from: tv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7311tv0 {
    public static final C6929rv0 a;
    public static final C6929rv0 b;

    static {
        C6929rv0 c6929rv0 = null;
        try {
            c6929rv0 = (C6929rv0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c6929rv0;
        b = new C6929rv0();
    }
}
