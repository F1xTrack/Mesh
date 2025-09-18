package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.w8 */
/* loaded from: classes2.dex */
public class C3696w8 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    private final String f25165a;

    /* renamed from: b */
    private final C2689Im f25166b;

    /* renamed from: c */
    protected final C2575E8 f25167c;

    public C3696w8(Context context, String str, C2575E8 c2575e8) {
        this(context, str, c2575e8, AbstractC3788zm.m17344a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f25166b.m17365a(th, "", new Object[0]);
            this.f25166b.m17367b("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f25165a);
            ((C2809Nh) C2834Oh.m14711a()).reportError("db_read_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f25166b.m17365a(th, "", new Object[0]);
            this.f25166b.m17367b("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f25165a);
            ((C2809Nh) C2834Oh.m14711a()).reportError("db_write_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f25167c.m14032a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f25167c.m14033a(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f25167c.m14034b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f25167c.m14035b(sQLiteDatabase, i, i2);
    }

    public C3696w8(Context context, String str, C2575E8 c2575e8, C2689Im c2689Im) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C2825O8.f21845a);
        this.f25167c = c2575e8;
        this.f25165a = str;
        this.f25166b = c2689Im;
    }
}
