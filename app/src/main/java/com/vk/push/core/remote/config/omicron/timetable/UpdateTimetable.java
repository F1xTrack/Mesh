package com.vk.push.core.remote.config.omicron.timetable;

import com.vk.push.core.remote.config.omicron.DataId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface UpdateTimetable {
    void setNeedUpdate(DataId dataId);

    void setUpdateDate(DataId dataId, Date date);

    boolean shouldUpdate(DataId dataId, long j, TimeUnit timeUnit);
}
