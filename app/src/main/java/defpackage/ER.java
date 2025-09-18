package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class ER {
    public static volatile ER a;
    public static final ER b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        ER er = new ER();
        Collections.emptyMap();
        b = er;
    }

    public static ER a() {
        ER er = a;
        if (er == null) {
            synchronized (ER.class) {
                try {
                    er = a;
                    if (er == null) {
                        Class cls = AR.a;
                        if (cls != null) {
                            try {
                                er = (ER) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                            a = er;
                        } else {
                            er = b;
                            a = er;
                        }
                    }
                } finally {
                }
            }
        }
        return er;
    }
}
