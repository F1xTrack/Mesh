package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* renamed from: xU0 */
/* loaded from: classes.dex */
public final class C11677xU0 implements InterfaceC0970PP, A71, InterfaceC1750at {

    /* renamed from: f */
    public static final C7135xO f45654f = new C7135xO("proto");

    /* renamed from: a */
    public final GV0 f45655a;

    /* renamed from: b */
    public final InterfaceC6645pt f45656b;

    /* renamed from: c */
    public final InterfaceC6645pt f45657c;

    /* renamed from: d */
    public final C0229Dd f45658d;

    /* renamed from: e */
    public final Provider f45659e;

    public C11677xU0(InterfaceC6645pt interfaceC6645pt, InterfaceC6645pt interfaceC6645pt2, C0229Dd c0229Dd, GV0 gv0, Provider provider) {
        this.f45655a = gv0;
        this.f45656b = interfaceC6645pt;
        this.f45657c = interfaceC6645pt2;
        this.f45658d = c0229Dd;
        this.f45659e = provider;
    }

    /* renamed from: A */
    public static String m25898A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C4255ie) it.next()).f29397a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: D */
    public static Object m25899D(Cursor cursor, InterfaceC11423vU0 interfaceC11423vU0) {
        try {
            return interfaceC11423vU0.mo26597apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: n */
    public static Long m25900n(SQLiteDatabase sQLiteDatabase, C1236Te c1236Te) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1236Te.f11450a, String.valueOf(AbstractC11770yD0.m26100a(c1236Te.f11452c))));
        byte[] bArr = c1236Te.f11451b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45655a.close();
    }

    /* renamed from: m */
    public final SQLiteDatabase m25901m() {
        GV0 gv0 = this.f45655a;
        Objects.requireNonNull(gv0);
        InterfaceC6645pt interfaceC6645pt = this.f45657c;
        long jMo2451d = interfaceC6645pt.mo2451d();
        while (true) {
            try {
                return gv0.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6645pt.mo2451d() >= this.f45658d.f2086c + jMo2451d) {
                    throw new C11759y71("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: o */
    public final Object m25902o(InterfaceC11423vU0 interfaceC11423vU0) {
        SQLiteDatabase sQLiteDatabaseM25901m = m25901m();
        sQLiteDatabaseM25901m.beginTransaction();
        try {
            Object objMo26597apply = interfaceC11423vU0.mo26597apply(sQLiteDatabaseM25901m);
            sQLiteDatabaseM25901m.setTransactionSuccessful();
            return objMo26597apply;
        } finally {
            sQLiteDatabaseM25901m.endTransaction();
        }
    }

    /* renamed from: p */
    public final ArrayList m25903p(SQLiteDatabase sQLiteDatabase, C1236Te c1236Te, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM25900n = m25900n(sQLiteDatabase, c1236Te);
        if (lM25900n == null) {
            return arrayList;
        }
        m25899D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM25900n.toString()}, null, null, null, String.valueOf(i)), new C4224i9(this, arrayList, c1236Te, 18));
        return arrayList;
    }

    /* renamed from: w */
    public final void m25904w(long j, EnumC9921jl0 enumC9921jl0, String str) {
        m25902o(new C0059Aw(str, enumC9921jl0, j, 4));
    }

    /* renamed from: x */
    public final Object m25905x(InterfaceC11886z71 interfaceC11886z71) {
        SQLiteDatabase sQLiteDatabaseM25901m = m25901m();
        InterfaceC6645pt interfaceC6645pt = this.f45657c;
        long jMo2451d = interfaceC6645pt.mo2451d();
        while (true) {
            try {
                sQLiteDatabaseM25901m.beginTransaction();
                try {
                    Object objExecute = interfaceC11886z71.execute();
                    sQLiteDatabaseM25901m.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseM25901m.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6645pt.mo2451d() >= this.f45658d.f2086c + jMo2451d) {
                    throw new C11759y71("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
