package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public abstract class G31 {
    public static final boolean a;
    public static final E8 b;
    public static final E8 c;
    public static final E8 d;

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
            new C3544eF(Date.class);
            new C3544eF(Timestamp.class);
            b = C31.c;
            c = C31.d;
            d = E31.c;
        }
    }
}
