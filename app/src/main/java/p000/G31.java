package p000;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public abstract class G31 {

    /* renamed from: a */
    public static final boolean f3555a;

    /* renamed from: b */
    public static final C0261E8 f3556b;

    /* renamed from: c */
    public static final C0261E8 f3557c;

    /* renamed from: d */
    public static final C0261E8 f3558d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f3555a = z;
        if (!z) {
            f3556b = null;
            f3557c = null;
            f3558d = null;
        } else {
            new C3978eF(Date.class);
            new C3978eF(Timestamp.class);
            f3556b = C31.f1161c;
            f3557c = C31.f1162d;
            f3558d = E31.f2443c;
        }
    }
}
