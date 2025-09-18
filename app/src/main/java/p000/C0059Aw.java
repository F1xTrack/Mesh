package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: Aw */
/* loaded from: classes.dex */
public final /* synthetic */ class C0059Aw implements InterfaceC1319Uy, InterfaceC6227jH, InterfaceC0363Fl, InterfaceC11423vU0, InterfaceC11886z71 {

    /* renamed from: a */
    public final /* synthetic */ int f471a;

    /* renamed from: b */
    public final /* synthetic */ long f472b;

    /* renamed from: c */
    public final /* synthetic */ Object f473c;

    /* renamed from: d */
    public final /* synthetic */ Object f474d;

    public /* synthetic */ C0059Aw(Object obj, long j, Object obj2, int i) {
        this.f471a = i;
        this.f473c = obj;
        this.f472b = j;
        this.f474d = obj2;
    }

    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public Object mo26597apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC9921jl0) this.f474d).f35367a;
        String string = Integer.toString(i);
        String str = (String) this.f473c;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f472b;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        C8575Yg1 c8575Yg1 = (C8575Yg1) this.f473c;
        long jMo2451d = c8575Yg1.f14449g.mo2451d() + this.f472b;
        C11677xU0 c11677xU0 = (C11677xU0) c8575Yg1.f14445c;
        C1236Te c1236Te = (C1236Te) this.f474d;
        c11677xU0.getClass();
        c11677xU0.m25902o(new C4263im(jMo2451d, c1236Te));
        return null;
    }

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
        ((InterfaceC6726rA) interfaceC9347fG0.get()).mo7025d((String) this.f473c, this.f472b, (C0104Be) this.f474d);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(final C0300El c0300El) {
        switch (this.f471a) {
            case 2:
                C0489Hl c0489Hl = (C0489Hl) this.f473c;
                AbstractC8301Sz1.m7490m(c0489Hl, c0300El);
                C0426Gl c0426Gl = c0489Hl.f4484b;
                if (!c0426Gl.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule = ((C20) this.f474d).schedule(new RunnableC1096RQ(c0300El, 5, c0489Hl), this.f472b, TimeUnit.MILLISECONDS);
                    final int i = 0;
                    c0426Gl.mo2494d(new Runnable() { // from class: TZ
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, QR1.m6703a());
                }
                return "TimeoutFuture[" + c0489Hl + "]";
            default:
                final InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) this.f473c;
                AbstractC8301Sz1.m7490m(interfaceFutureC7800Jj0, c0300El);
                if (!interfaceFutureC7800Jj0.isDone()) {
                    final long j = this.f472b;
                    final ScheduledFuture scheduledFutureSchedule2 = ((C20) this.f474d).schedule(new Callable() { // from class: UZ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(c0300El.m2377d(new TimeoutException("Future[" + interfaceFutureC7800Jj0 + "] is not done within " + j + " ms.")));
                        }
                    }, j, TimeUnit.MILLISECONDS);
                    final int i2 = 1;
                    interfaceFutureC7800Jj0.mo2494d(new Runnable() { // from class: TZ
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, QR1.m6703a());
                }
                return "TimeoutFuture[" + interfaceFutureC7800Jj0 + "]";
        }
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        return ((C0248Dw) this.f473c).m1949c(task, this.f472b, (HashMap) this.f474d);
    }

    public /* synthetic */ C0059Aw(Object obj, Object obj2, long j, int i) {
        this.f471a = i;
        this.f473c = obj;
        this.f474d = obj2;
        this.f472b = j;
    }
}
