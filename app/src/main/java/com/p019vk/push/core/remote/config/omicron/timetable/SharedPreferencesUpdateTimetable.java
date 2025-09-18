package com.p019vk.push.core.remote.config.omicron.timetable;

import android.content.SharedPreferences;
import android.util.Base64;
import com.p019vk.push.core.remote.config.omicron.DataId;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SharedPreferencesUpdateTimetable implements UpdateTimetable {

    /* renamed from: a */
    public final SharedPreferences f20575a;

    /* renamed from: b */
    public final TimeProvider f20576b;

    public SharedPreferencesUpdateTimetable(SharedPreferences sharedPreferences, TimeProvider timeProvider) {
        this.f20575a = sharedPreferences;
        this.f20576b = timeProvider;
    }

    /* renamed from: a */
    public static String m13755a(DataId dataId) {
        return Base64.encodeToString((dataId.getAppId() + dataId.getUrl()).getBytes(StandardCharsets.UTF_8), 3);
    }

    @Override // com.p019vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public void setNeedUpdate(DataId dataId) {
        this.f20575a.edit().remove(m13755a(dataId)).apply();
    }

    @Override // com.p019vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public void setUpdateDate(DataId dataId, Date date) {
        this.f20575a.edit().putLong(m13755a(dataId), date.getTime()).apply();
    }

    @Override // com.p019vk.push.core.remote.config.omicron.timetable.UpdateTimetable
    public boolean shouldUpdate(DataId dataId, long j, TimeUnit timeUnit) {
        return new Date(timeUnit.toMillis(j) + this.f20575a.getLong(m13755a(dataId), 0L)).before(this.f20576b.getCurrentDate());
    }
}
