package defpackage;

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

/* renamed from: Aw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0086Aw implements InterfaceC1651Uy, InterfaceC5281jH, InterfaceC0443Fl, InterfaceC7612vU0, InterfaceC8304z71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0086Aw(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public Object mo3apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC5372jl0) this.d).a;
        String string = Integer.toString(i);
        String str = (String) this.c;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.b;
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

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        C1911Yg1 c1911Yg1 = (C1911Yg1) this.c;
        long jD = c1911Yg1.g.d() + this.b;
        C7992xU0 c7992xU0 = (C7992xU0) c1911Yg1.c;
        C1513Te c1513Te = (C1513Te) this.d;
        c7992xU0.getClass();
        c7992xU0.o(new C4406im(jD, c1513Te));
        return null;
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
        ((InterfaceC6787rA) interfaceC3739fG0.get()).d((String) this.c, this.b, (C0110Be) this.d);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(final C0365El c0365El) {
        switch (this.a) {
            case 2:
                C0599Hl c0599Hl = (C0599Hl) this.c;
                AbstractC1500Sz1.m(c0599Hl, c0365El);
                C0521Gl c0521Gl = c0599Hl.b;
                if (!c0521Gl.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule = ((C20) this.d).schedule(new RQ(c0365El, 5, c0599Hl), this.b, TimeUnit.MILLISECONDS);
                    final int i = 0;
                    c0521Gl.d(new Runnable() { // from class: TZ
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
                    }, QR1.a());
                }
                return "TimeoutFuture[" + c0599Hl + "]";
            default:
                final InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) this.c;
                AbstractC1500Sz1.m(interfaceFutureC0750Jj0, c0365El);
                if (!interfaceFutureC0750Jj0.isDone()) {
                    final long j = this.b;
                    final ScheduledFuture scheduledFutureSchedule2 = ((C20) this.d).schedule(new Callable() { // from class: UZ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(c0365El.d(new TimeoutException("Future[" + interfaceFutureC0750Jj0 + "] is not done within " + j + " ms.")));
                        }
                    }, j, TimeUnit.MILLISECONDS);
                    final int i2 = 1;
                    interfaceFutureC0750Jj0.d(new Runnable() { // from class: TZ
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
                    }, QR1.a());
                }
                return "TimeoutFuture[" + interfaceFutureC0750Jj0 + "]";
        }
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        return ((C0320Dw) this.c).c(task, this.b, (HashMap) this.d);
    }

    public /* synthetic */ C0086Aw(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
