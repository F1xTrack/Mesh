package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: mX */
/* loaded from: classes.dex */
public final class RunnableC6432mX implements Runnable {

    /* renamed from: e */
    public static final long f37754e;

    /* renamed from: a */
    public final Context f37755a;

    /* renamed from: b */
    public final C7863Ko1 f37756b;

    /* renamed from: c */
    public final C7621Fx1 f37757c;

    /* renamed from: d */
    public int f37758d = 0;

    static {
        C1210TE.m7637M("ForceStopRunnable");
        f37754e = TimeUnit.DAYS.toMillis(3650L);
    }

    public RunnableC6432mX(Context context, C7863Ko1 c7863Ko1) {
        this.f37755a = context.getApplicationContext();
        this.f37756b = c7863Ko1;
        this.f37757c = c7863Ko1.f6320g;
    }

    /* renamed from: b */
    public static void m22834b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f37754e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22835a() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC6432mX.m22835a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM3787a;
        C7863Ko1 c7863Ko1 = this.f37756b;
        try {
            C6790rv c6790rv = c7863Ko1.f6315b;
            c6790rv.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f37755a;
            if (zIsEmpty) {
                C1210TE.m7634G().getClass();
                zM3787a = true;
            } else {
                zM3787a = ID0.m3787a(context, c6790rv);
                C1210TE.m7634G().getClass();
            }
            if (!zM3787a) {
                return;
            }
            while (true) {
                try {
                    AbstractC9828j12.m21958b(context);
                    C1210TE.m7634G().getClass();
                    try {
                        m22835a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.f37758d + 1;
                        this.f37758d = i;
                        if (i >= 3) {
                            C1210TE.m7634G().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            c7863Ko1.f6315b.getClass();
                            throw illegalStateException;
                        }
                        C1210TE.m7634G().getClass();
                        try {
                            Thread.sleep(this.f37758d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    C1210TE.m7634G().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c7863Ko1.f6315b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            c7863Ko1.m4737e();
        }
    }
}
