package defpackage;

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

/* renamed from: mX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5902mX implements Runnable {
    public static final long e;
    public final Context a;
    public final C0844Ko1 b;
    public final C0481Fx1 c;
    public int d = 0;

    static {
        TE.M("ForceStopRunnable");
        e = TimeUnit.DAYS.toMillis(3650L);
    }

    public RunnableC5902mX(Context context, C0844Ko1 c0844Ko1) {
        this.a = context.getApplicationContext();
        this.b = c0844Ko1;
        this.c = c0844Ko1.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC5902mX.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        C0844Ko1 c0844Ko1 = this.b;
        try {
            C6928rv c6928rv = c0844Ko1.b;
            c6928rv.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (zIsEmpty) {
                TE.G().getClass();
                zA = true;
            } else {
                zA = ID0.a(context, c6928rv);
                TE.G().getClass();
            }
            if (!zA) {
                return;
            }
            while (true) {
                try {
                    AbstractC5233j12.b(context);
                    TE.G().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            TE.G().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            c0844Ko1.b.getClass();
                            throw illegalStateException;
                        }
                        TE.G().getClass();
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    TE.G().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    c0844Ko1.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            c0844Ko1.e();
        }
    }
}
