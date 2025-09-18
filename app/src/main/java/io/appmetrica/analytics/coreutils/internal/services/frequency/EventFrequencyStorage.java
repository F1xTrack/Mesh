package io.appmetrica.analytics.coreutils.internal.services.frequency;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "", "", "key", "", "value", "LTf1;", "putWindowStart", "(Ljava/lang/String;J)V", "getWindowStart", "(Ljava/lang/String;)Ljava/lang/Long;", "", "putWindowOccurrencesCount", "(Ljava/lang/String;I)V", "getWindowOccurrencesCount", "(Ljava/lang/String;)Ljava/lang/Integer;", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface EventFrequencyStorage {
    Integer getWindowOccurrencesCount(String key);

    Long getWindowStart(String key);

    void putWindowOccurrencesCount(String key, int value);

    void putWindowStart(String key, long value);
}
