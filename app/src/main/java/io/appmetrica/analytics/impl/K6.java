package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class K6 extends InterruptionSafeThread {
    public final C4567g5 a;
    public final /* synthetic */ L6 b;

    public K6(L6 l6, C4567g5 c4567g5) {
        this.b = l6;
        this.a = c4567g5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.b.j.iterator();
            while (it2.hasNext()) {
                ((O8) it2.next()).a(arrayList2);
            }
            this.a.q.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (L6.a(this.b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.b.e) {
                arrayList = new ArrayList(this.b.f);
                this.b.f.clear();
            }
            L6 l6 = this.b;
            l6.getClass();
            if (!arrayList.isEmpty()) {
                l6.b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = l6.c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                l6.i.incrementAndGet();
                                l6.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            l6.i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            l6.b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                l6.b.unlock();
            }
            a(arrayList);
        }
    }
}
