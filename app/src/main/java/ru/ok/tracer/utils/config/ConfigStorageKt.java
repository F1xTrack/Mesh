package ru.ok.tracer.utils.config;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "", "key", "", "isShutdown", "(Lru/ok/tracer/utils/SimpleFileKeyValueStorage;Ljava/lang/String;)Z", "", "", "", "shutdownMs", "LTf1;", "putShutdownMs", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)V", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfigStorageKt {
    public static final boolean isShutdown(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        Long l = simpleFileKeyValueStorage.getLong(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final void putShutdownMs(Map<String, Object> map, String str, Long l) {
        Long lValueOf = null;
        if (l != null && l.longValue() > 0) {
            lValueOf = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        map.put(str, lValueOf);
    }
}
