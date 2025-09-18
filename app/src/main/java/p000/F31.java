package p000;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class F31 {

    /* renamed from: a */
    public static final boolean f3046a;

    /* renamed from: b */
    public static final C0198D8 f3047b;

    /* renamed from: c */
    public static final C0198D8 f3048c;

    /* renamed from: d */
    public static final C0198D8 f3049d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f3046a = z;
        if (!z) {
            f3047b = null;
            f3048c = null;
            f3049d = null;
        } else {
            new C3916dF(Date.class);
            new C3916dF(Timestamp.class);
            f3047b = B31.f530c;
            f3048c = B31.f531d;
            f3049d = D31.f1811c;
        }
    }
}
