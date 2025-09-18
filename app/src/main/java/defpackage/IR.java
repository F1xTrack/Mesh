package defpackage;

/* loaded from: classes.dex */
public abstract class IR {
    public static final GR a = new GR();
    public static final GR b;

    static {
        GR gr = null;
        try {
            gr = (GR) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gr;
    }
}
