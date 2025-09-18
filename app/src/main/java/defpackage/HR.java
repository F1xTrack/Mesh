package defpackage;

/* loaded from: classes.dex */
public abstract class HR {
    public static final FR a = new FR();
    public static final FR b;

    static {
        FR fr = null;
        try {
            fr = (FR) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = fr;
    }
}
