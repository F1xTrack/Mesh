package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.K6 */
/* loaded from: classes2.dex */
public final class C4607K6 extends InterruptionSafeThread {

    /* renamed from: a */
    public final C5139g5 f30386a;

    /* renamed from: b */
    public final /* synthetic */ C4631L6 f30387b;

    public C4607K6(C4631L6 c4631l6, C5139g5 c5139g5) {
        this.f30387b = c4631l6;
        this.f30386a = c5139g5;
    }

    /* renamed from: a */
    public final synchronized void m19546a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f30387b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f30387b.f30440j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC4705O8) it2.next()).mo19308a(arrayList2);
            }
            this.f30386a.f31738q.m20860b();
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
                        if (C4631L6.m19580a(this.f30387b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f30387b.f30435e) {
                arrayList = new ArrayList(this.f30387b.f30436f);
                this.f30387b.f30436f.clear();
            }
            C4631L6 c4631l6 = this.f30387b;
            c4631l6.getClass();
            if (!arrayList.isEmpty()) {
                c4631l6.f30432b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c4631l6.f30433c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c4631l6.f30439i.incrementAndGet();
                                c4631l6.m19589a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c4631l6.f30439i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            c4631l6.f30432b.unlock();
                            m19546a(arrayList);
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
                c4631l6.f30432b.unlock();
            }
            m19546a(arrayList);
        }
    }
}
