package defpackage;

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
public final class C7992xU0 implements PP, A71, InterfaceC2217at {
    public static final C7973xO f = new C7973xO("proto");
    public final GV0 a;
    public final InterfaceC6541pt b;
    public final InterfaceC6541pt c;
    public final C0263Dd d;
    public final Provider e;

    public C7992xU0(InterfaceC6541pt interfaceC6541pt, InterfaceC6541pt interfaceC6541pt2, C0263Dd c0263Dd, GV0 gv0, Provider provider) {
        this.a = gv0;
        this.b = interfaceC6541pt;
        this.c = interfaceC6541pt2;
        this.d = c0263Dd;
        this.e = provider;
    }

    public static String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C4383ie) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object D(Cursor cursor, InterfaceC7612vU0 interfaceC7612vU0) {
        try {
            return interfaceC7612vU0.mo3apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, C1513Te c1513Te) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1513Te.a, String.valueOf(AbstractC8131yD0.a(c1513Te.c))));
        byte[] bArr = c1513Te.b;
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
        this.a.close();
    }

    public final SQLiteDatabase m() {
        GV0 gv0 = this.a;
        Objects.requireNonNull(gv0);
        InterfaceC6541pt interfaceC6541pt = this.c;
        long jD = interfaceC6541pt.d();
        while (true) {
            try {
                return gv0.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6541pt.d() >= this.d.c + jD) {
                    throw new C8114y71("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object o(InterfaceC7612vU0 interfaceC7612vU0) {
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            Object objMo3apply = interfaceC7612vU0.mo3apply(sQLiteDatabaseM);
            sQLiteDatabaseM.setTransactionSuccessful();
            return objMo3apply;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    public final ArrayList p(SQLiteDatabase sQLiteDatabase, C1513Te c1513Te, int i) {
        ArrayList arrayList = new ArrayList();
        Long lN = n(sQLiteDatabase, c1513Te);
        if (lN == null) {
            return arrayList;
        }
        D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lN.toString()}, null, null, null, String.valueOf(i)), new C4290i9(this, arrayList, c1513Te, 18));
        return arrayList;
    }

    public final void w(long j, EnumC5372jl0 enumC5372jl0, String str) {
        o(new C0086Aw(str, enumC5372jl0, j, 4));
    }

    public final Object x(InterfaceC8304z71 interfaceC8304z71) {
        SQLiteDatabase sQLiteDatabaseM = m();
        InterfaceC6541pt interfaceC6541pt = this.c;
        long jD = interfaceC6541pt.d();
        while (true) {
            try {
                sQLiteDatabaseM.beginTransaction();
                try {
                    Object objExecute = interfaceC8304z71.execute();
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseM.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6541pt.d() >= this.d.c + jD) {
                    throw new C8114y71("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
