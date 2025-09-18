package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;

/* loaded from: classes.dex */
public final class YR0 extends AbstractC8388Ur0 {

    /* renamed from: c */
    public final /* synthetic */ int f14299c = 1;

    /* renamed from: d */
    public final Context f14300d;

    public YR0(Context context, int i, int i2) {
        super(i, i2);
        this.f14300d = context;
    }

    @Override // p000.AbstractC8388Ur0
    /* renamed from: a */
    public final void mo8194a(C1482XY c1482xy) throws SQLException {
        Context context = this.f14300d;
        switch (this.f14299c) {
            case 0:
                if (this.f12175b >= 10) {
                    c1482xy.m9082x(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c1482xy.m9081w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c1482xy.m9077m();
                    try {
                        c1482xy.m9082x(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        c1482xy.m9082x(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        c1482xy.m9076U();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c1482xy.m9077m();
                    try {
                        c1482xy.m9082x(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        c1482xy.m9082x(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        c1482xy.m9076U();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public YR0(Context context) {
        super(9, 10);
        this.f14300d = context;
    }
}
