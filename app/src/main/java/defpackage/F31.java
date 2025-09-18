package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class F31 {
    public static final boolean a;
    public static final D8 b;
    public static final D8 c;
    public static final D8 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (!z) {
            b = null;
            c = null;
            d = null;
        } else {
            new C3354dF(Date.class);
            new C3354dF(Timestamp.class);
            b = B31.c;
            c = B31.d;
            d = D31.c;
        }
    }
}
