package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.p018my.tracker.obfuscated.C2320h;
import com.p018my.tracker.obfuscated.C2358q1;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: BH */
/* loaded from: classes.dex */
public final /* synthetic */ class C0081BH implements InterfaceC0396GH, InterfaceC11886z71, InterfaceC9307ey0 {

    /* renamed from: a */
    public final /* synthetic */ int f698a;

    /* renamed from: b */
    public final /* synthetic */ Object f699b;

    /* renamed from: c */
    public final /* synthetic */ long f700c;

    /* renamed from: d */
    public final /* synthetic */ Object f701d;

    /* renamed from: e */
    public final /* synthetic */ Object f702e;

    public /* synthetic */ C0081BH(ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f698a = i;
        this.f699b = scheduledExecutorServiceC0333FH;
        this.f702e = obj;
        this.f700c = j;
        this.f701d = timeUnit;
    }

    @Override // p000.InterfaceC0396GH
    /* renamed from: a */
    public ScheduledFuture mo576a(C9432fw1 c9432fw1) {
        switch (this.f698a) {
            case 0:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH = (ScheduledExecutorServiceC0333FH) this.f699b;
                scheduledExecutorServiceC0333FH.getClass();
                return scheduledExecutorServiceC0333FH.f3140b.schedule(new RunnableC0270EH(scheduledExecutorServiceC0333FH, (Runnable) this.f702e, c9432fw1, 1), this.f700c, (TimeUnit) this.f701d);
            default:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH2 = (ScheduledExecutorServiceC0333FH) this.f699b;
                scheduledExecutorServiceC0333FH2.getClass();
                return scheduledExecutorServiceC0333FH2.f3140b.schedule(new CallableC0298Ej(scheduledExecutorServiceC0333FH2, (Callable) this.f702e, c9432fw1, 1), this.f700c, (TimeUnit) this.f701d);
        }
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        C8575Yg1 c8575Yg1 = (C8575Yg1) this.f699b;
        C11677xU0 c11677xU0 = (C11677xU0) c8575Yg1.f14445c;
        c11677xU0.getClass();
        Iterable iterable = (Iterable) this.f702e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C11677xU0.m25898A(iterable);
            SQLiteDatabase sQLiteDatabaseM25901m = c11677xU0.m25901m();
            sQLiteDatabaseM25901m.beginTransaction();
            try {
                sQLiteDatabaseM25901m.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM25901m.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c11677xU0.m25904w(cursorRawQuery.getInt(0), EnumC9921jl0.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM25901m.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM25901m.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM25901m.endTransaction();
            }
        }
        c11677xU0.m25902o(new C4263im(c8575Yg1.f14449g.mo2451d() + this.f700c, (C1236Te) this.f701d));
        return null;
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        C2358q1 c2358q1 = (C2358q1) this.f702e;
        ((C2320h) this.f699b).m13137a(this.f700c, c2358q1, (String) this.f701d, (C0952P7) obj);
    }

    public /* synthetic */ C0081BH(C8575Yg1 c8575Yg1, Iterable iterable, C1236Te c1236Te, long j) {
        this.f698a = 2;
        this.f699b = c8575Yg1;
        this.f702e = iterable;
        this.f701d = c1236Te;
        this.f700c = j;
    }

    public /* synthetic */ C0081BH(C2320h c2320h, long j, C2358q1 c2358q1, String str) {
        this.f698a = 3;
        this.f699b = c2320h;
        this.f700c = j;
        this.f702e = c2358q1;
        this.f701d = str;
    }
}
