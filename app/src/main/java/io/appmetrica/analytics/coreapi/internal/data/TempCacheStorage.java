package io.appmetrica.analytics.coreapi.internal.data;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0018J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "", "", "scope", "", "timestamp", "", "data", "put", "(Ljava/lang/String;J[B)J", "Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "get", "(Ljava/lang/String;)Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", "limit", "", "(Ljava/lang/String;I)Ljava/util/Collection;", NotificationConstants.f19487ID, "LTf1;", "remove", "(J)V", "interval", "removeOlderThan", "(Ljava/lang/String;J)V", "Entry", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface TempCacheStorage {

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", "data", "", "getData", "()[B", NotificationConstants.f19487ID, "", "getId", "()J", "scope", "", "getScope", "()Ljava/lang/String;", "timestamp", "getTimestamp", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String scope);

    Collection<Entry> get(String scope, int limit);

    long put(String scope, long timestamp, byte[] data);

    void remove(long id);

    void removeOlderThan(String scope, long interval);
}
