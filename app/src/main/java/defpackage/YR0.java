package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;

/* loaded from: classes.dex */
public final class YR0 extends AbstractC1631Ur0 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public YR0(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }

    @Override // defpackage.AbstractC1631Ur0
    public final void a(XY xy) throws SQLException {
        Context context = this.d;
        switch (this.c) {
            case 0:
                if (this.b >= 10) {
                    xy.x(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                xy.w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    xy.m();
                    try {
                        xy.x(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        xy.x(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        xy.U();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    xy.m();
                    try {
                        xy.x(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        xy.x(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        xy.U();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public YR0(Context context) {
        super(9, 10);
        this.d = context;
    }
}
