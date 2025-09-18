package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: y12 */
/* loaded from: classes.dex */
public abstract class AbstractC8095y12 {
    public static XY a(C1304Qm0 c1304Qm0, SQLiteDatabase sQLiteDatabase) {
        O90.f(c1304Qm0, "refHolder");
        O90.f(sQLiteDatabase, "sqLiteDatabase");
        XY xy = (XY) c1304Qm0.b;
        if (xy != null && O90.a((SQLiteDatabase) xy.b, sQLiteDatabase)) {
            return xy;
        }
        XY xy2 = new XY(sQLiteDatabase);
        c1304Qm0.b = xy2;
        return xy2;
    }

    public static long b(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }
}
