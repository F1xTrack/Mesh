package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: y12 */
/* loaded from: classes.dex */
public abstract class AbstractC11746y12 {
    /* renamed from: a */
    public static C1482XY m26032a(C8170Qm0 c8170Qm0, SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(c8170Qm0, "refHolder");
        O90.m5968f(sQLiteDatabase, "sqLiteDatabase");
        C1482XY c1482xy = (C1482XY) c8170Qm0.f9780b;
        if (c1482xy != null && O90.m5963a((SQLiteDatabase) c1482xy.f13844b, sQLiteDatabase)) {
            return c1482xy;
        }
        C1482XY c1482xy2 = new C1482XY(sQLiteDatabase);
        c8170Qm0.f9780b = c1482xy2;
        return c1482xy2;
    }

    /* renamed from: b */
    public static long m26033b(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }
}
