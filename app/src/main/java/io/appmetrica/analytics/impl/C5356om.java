package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.impl.om */
/* loaded from: classes2.dex */
public final class C5356om implements TempCacheStorage {

    /* renamed from: a */
    public final InterfaceC5590y6 f32364a;

    /* renamed from: b */
    public final String f32365b;

    /* renamed from: c */
    public final SystemTimeProvider f32366c = new SystemTimeProvider();

    public C5356om(InterfaceC5590y6 interfaceC5590y6, String str) {
        this.f32364a = interfaceC5590y6;
        this.f32365b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseMo19759a;
        SQLiteDatabase sQLiteDatabase;
        C5406qm c5406qm;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabaseMo19759a = this.f32364a.mo19759a();
            sQLiteDatabase = sQLiteDatabaseMo19759a;
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (sQLiteDatabaseMo19759a != 0) {
            try {
                cursorQuery = sQLiteDatabaseMo19759a.query(false, this.f32365b, null, "scope=?", new String[]{str}, null, null, NotificationConstants.f19487ID, String.valueOf(i));
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                c5406qm = new C5406qm(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(NotificationConstants.f19487ID)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("scope")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c5406qm = null;
                            }
                            if (c5406qm != null) {
                                arrayList.add(c5406qm);
                            }
                        } catch (Throwable unused3) {
                            cursor = sQLiteDatabaseMo19759a;
                            sQLiteDatabaseMo19759a = cursor;
                            cursor = cursorQuery;
                            sQLiteDatabase = sQLiteDatabaseMo19759a;
                            AbstractC5182hn.m20509a(cursor);
                            this.f32364a.mo19760a(sQLiteDatabase);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursorQuery = null;
            }
            cursor = cursorQuery;
            sQLiteDatabase = sQLiteDatabaseMo19759a;
        }
        AbstractC5182hn.m20509a(cursor);
        this.f32364a.mo19760a(sQLiteDatabase);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseMo19759a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo19759a = this.f32364a.mo19759a();
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j));
                    contentValues.put("data", bArr);
                    long jInsertOrThrow = sQLiteDatabaseMo19759a.insertOrThrow(this.f32365b, null, contentValues);
                    this.f32364a.mo19760a(sQLiteDatabaseMo19759a);
                    return jInsertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo19759a;
                    sQLiteDatabaseMo19759a = sQLiteDatabase;
                    this.f32364a.mo19760a(sQLiteDatabaseMo19759a);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f32364a.mo19760a(sQLiteDatabaseMo19759a);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        m20889a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j) {
        m20889a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f32366c.currentTimeMillis() - j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) AbstractC7167xu.m25957C(get(str, 1));
    }

    /* renamed from: a */
    public final void m20889a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseMo19759a;
        try {
            sQLiteDatabaseMo19759a = this.f32364a.mo19759a();
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    sQLiteDatabaseMo19759a.delete(this.f32365b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo19759a = null;
        }
        this.f32364a.mo19760a(sQLiteDatabaseMo19759a);
    }
}
