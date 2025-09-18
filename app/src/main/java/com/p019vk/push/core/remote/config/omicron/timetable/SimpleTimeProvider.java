package com.p019vk.push.core.remote.config.omicron.timetable;

import java.util.Date;

/* loaded from: classes2.dex */
public class SimpleTimeProvider implements TimeProvider {
    @Override // com.p019vk.push.core.remote.config.omicron.timetable.TimeProvider
    public Date getCurrentDate() {
        return new Date();
    }
}
