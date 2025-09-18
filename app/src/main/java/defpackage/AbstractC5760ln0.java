package defpackage;

/* renamed from: ln0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5760ln0 {
    public static final C5378jn0 a;
    public static final C5378jn0 b;

    static {
        C5378jn0 c5378jn0 = null;
        try {
            c5378jn0 = (C5378jn0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c5378jn0;
        b = new C5378jn0();
    }
}
