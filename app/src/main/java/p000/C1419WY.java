package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: WY */
/* loaded from: classes.dex */
public final /* synthetic */ class C1419WY implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ int f13250a;

    /* renamed from: b */
    public final /* synthetic */ Object f13251b;

    public /* synthetic */ C1419WY(int i, Object obj) {
        this.f13250a = i;
        this.f13251b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f13250a) {
            case 0:
                F61 f61 = (F61) this.f13251b;
                O90.m5965c(sQLiteQuery);
                f61.mo2493n(new C1855cZ(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((C10686pj1) this.f13251b).m23859a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
