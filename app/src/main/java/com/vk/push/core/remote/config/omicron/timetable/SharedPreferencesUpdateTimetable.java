package com.vk.push.core.remote.config.omicron.timetable;

import android.content.SharedPreferences;
import android.util.Base64;
import com.vk.push.core.remote.config.omicron.DataId;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SharedPreferencesUpdateTimetable implements UpdateTimetable {
    public final SharedPreferences a;
    public final TimeProvider b;

    public SharedPreferencesUpdateTimetable(SharedPreferences sharedPreferences, TimeProvider timeProvider) {
        this.a = sharedPreferences;
        this.b = timeProvider;
    }

    public static String a(DataId dataId) {
        return Base64.encodeToString((dataId.getAppId() + dataId.getUrl()).getBytes(StandardCharsets.UTF_8), 3);
    }

    @Override // com.vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public void setNeedUpdate(DataId dataId) {
        this.a.edit().remove(a(dataId)).apply();
    }

    @Override // com.vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public void setUpdateDate(DataId dataId, Date date) {
        this.a.edit().putLong(a(dataId), date.getTime()).apply();
    }

    @Override // com.vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public boolean shouldUpdate(DataId dataId, long j, TimeUnit timeUnit) {
        return new Date(timeUnit.toMillis(j) + this.a.getLong(a(dataId), 0L)).before(this.b.getCurrentDate());
    }
}
