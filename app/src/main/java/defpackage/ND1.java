package defpackage;

/* loaded from: classes.dex */
public abstract class ND1 {
    public static final ID1 a = new ID1();
    public static final ID1 b;

    static {
        ID1 id1 = null;
        try {
            id1 = (ID1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = id1;
    }
}
