package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3176w8 extends SQLiteOpenHelper implements Closeable {
    private final String a;
    private final Im b;
    protected final E8 c;

    public C3176w8(Context context, String str, E8 e8) {
        this(context, str, e8, AbstractC3265zm.a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.a(th, "", new Object[0]);
            this.b.b("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            ((Nh) Oh.a()).reportError("db_read_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.a(th, "", new Object[0]);
            this.b.b("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            ((Nh) Oh.a()).reportError("db_write_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.c.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c.a(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.c.b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c.b(sQLiteDatabase, i, i2);
    }

    public C3176w8(Context context, String str, E8 e8, Im im) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, O8.a);
        this.c = e8;
        this.a = str;
        this.b = im;
    }
}
