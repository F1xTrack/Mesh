package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import defpackage.AbstractC8069xu;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4775om implements TempCacheStorage {
    public final InterfaceC4998y6 a;
    public final String b;
    public final SystemTimeProvider c = new SystemTimeProvider();

    public C4775om(InterfaceC4998y6 interfaceC4998y6, String str) {
        this.a = interfaceC4998y6;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase;
        C4823qm c4823qm;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = this.a.a();
            sQLiteDatabase = sQLiteDatabaseA;
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (sQLiteDatabaseA != 0) {
            try {
                cursorQuery = sQLiteDatabaseA.query(false, this.b, null, "scope=?", new String[]{str}, null, null, NotificationConstants.ID, String.valueOf(i));
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                c4823qm = new C4823qm(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(NotificationConstants.ID)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("scope")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c4823qm = null;
                            }
                            if (c4823qm != null) {
                                arrayList.add(c4823qm);
                            }
                        } catch (Throwable unused3) {
                            cursor = sQLiteDatabaseA;
                            sQLiteDatabaseA = cursor;
                            cursor = cursorQuery;
                            sQLiteDatabase = sQLiteDatabaseA;
                            hn.a(cursor);
                            this.a.a(sQLiteDatabase);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursorQuery = null;
            }
            cursor = cursorQuery;
            sQLiteDatabase = sQLiteDatabaseA;
        }
        hn.a(cursor);
        this.a.a(sQLiteDatabase);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j));
                    contentValues.put("data", bArr);
                    long jInsertOrThrow = sQLiteDatabaseA.insertOrThrow(this.b, null, contentValues);
                    this.a.a(sQLiteDatabaseA);
                    return jInsertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    this.a.a(sQLiteDatabaseA);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.a.a(sQLiteDatabaseA);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.c.currentTimeMillis() - j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) AbstractC8069xu.C(get(str, 1));
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.delete(this.b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.a.a(sQLiteDatabaseA);
    }
}
