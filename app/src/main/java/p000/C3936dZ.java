package p000;

import android.database.sqlite.SQLiteStatement;

/* renamed from: dZ */
/* loaded from: classes.dex */
public final class C3936dZ extends C1855cZ implements E61 {

    /* renamed from: b */
    public final SQLiteStatement f26138b;

    public C3936dZ(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f26138b = sQLiteStatement;
    }

    /* renamed from: m */
    public final int m17710m() {
        return this.f26138b.executeUpdateDelete();
    }
}
