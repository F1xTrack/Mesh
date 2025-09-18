package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "window", "", "limitPerWindow", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "storage", "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "", "key", "", "detect", "(Ljava/lang/String;)Z", "LTf1;", "updateParameters", "(JI)V", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a */
    private long f29753a;

    /* renamed from: b */
    private int f29754b;

    /* renamed from: c */
    private final EventFrequencyStorage f29755c;

    /* renamed from: d */
    private final SystemTimeProvider f29756d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j, int i, EventFrequencyStorage eventFrequencyStorage) {
        this.f29753a = j;
        this.f29754b = i;
        this.f29755c = eventFrequencyStorage;
    }

    public final boolean detect(String key) {
        long jLongValue;
        long jUptimeMillis = this.f29756d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f29755c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j = jUptimeMillis - jLongValue;
        if (j < 0 || j > this.f29753a) {
            this.f29755c.putWindowStart(key, jUptimeMillis);
            this.f29755c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f29755c.getWindowOccurrencesCount(key);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f29755c.putWindowOccurrencesCount(key, iIntValue);
        return iIntValue > this.f29754b;
    }

    public final synchronized void updateParameters(long window, int limitPerWindow) {
        this.f29753a = window;
        this.f29754b = limitPerWindow;
    }
}
