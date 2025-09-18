package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.my.tracker.obfuscated.h;
import com.my.tracker.obfuscated.q1;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class BH implements GH, InterfaceC8304z71, InterfaceC3680ey0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ BH(FH fh, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = fh;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.GH
    public ScheduledFuture a(C3866fw1 c3866fw1) {
        switch (this.a) {
            case 0:
                FH fh = (FH) this.b;
                fh.getClass();
                return fh.b.schedule(new EH(fh, (Runnable) this.e, c3866fw1, 1), this.c, (TimeUnit) this.d);
            default:
                FH fh2 = (FH) this.b;
                fh2.getClass();
                return fh2.b.schedule(new CallableC0359Ej(fh2, (Callable) this.e, c3866fw1, 1), this.c, (TimeUnit) this.d);
        }
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        C1911Yg1 c1911Yg1 = (C1911Yg1) this.b;
        C7992xU0 c7992xU0 = (C7992xU0) c1911Yg1.c;
        c7992xU0.getClass();
        Iterable iterable = (Iterable) this.e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C7992xU0.A(iterable);
            SQLiteDatabase sQLiteDatabaseM = c7992xU0.m();
            sQLiteDatabaseM.beginTransaction();
            try {
                sQLiteDatabaseM.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c7992xU0.w(cursorRawQuery.getInt(0), EnumC5372jl0.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM.endTransaction();
            }
        }
        c7992xU0.o(new C4406im(c1911Yg1.g.d() + this.c, (C1513Te) this.d));
        return null;
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        q1 q1Var = (q1) this.e;
        ((h) this.b).a(this.c, q1Var, (String) this.d, (P7) obj);
    }

    public /* synthetic */ BH(C1911Yg1 c1911Yg1, Iterable iterable, C1513Te c1513Te, long j) {
        this.a = 2;
        this.b = c1911Yg1;
        this.e = iterable;
        this.d = c1513Te;
        this.c = j;
    }

    public /* synthetic */ BH(h hVar, long j, q1 q1Var, String str) {
        this.a = 3;
        this.b = hVar;
        this.c = j;
        this.e = q1Var;
        this.d = str;
    }
}
