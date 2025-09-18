package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: dZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3414dZ extends C2538cZ implements E61 {
    public final SQLiteStatement b;

    public C3414dZ(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final int m() {
        return this.b.executeUpdateDelete();
    }
}
