package ru.ok.tracer.session;

import defpackage.AbstractC7096sn0;
import defpackage.MN;
import defpackage.O90;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.SystemStateSerializer;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "", "key", "Lru/ok/tracer/SystemState;", "getSystemState", "(Lru/ok/tracer/utils/SimpleFileKeyValueStorage;Ljava/lang/String;)Lru/ok/tracer/SystemState;", "value", "LTf1;", "putSystemState", "(Lru/ok/tracer/utils/SimpleFileKeyValueStorage;Ljava/lang/String;Lru/ok/tracer/SystemState;)V", "", "Lru/ok/tracer/session/SessionState;", "getSessionStates", "(Lru/ok/tracer/utils/SimpleFileKeyValueStorage;Ljava/lang/String;)Ljava/util/List;", "putSessionStates", "(Lru/ok/tracer/utils/SimpleFileKeyValueStorage;Ljava/lang/String;Ljava/util/List;)V", "K", "", "V", "", "", "update", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "prevProperties", "withPrevProperties", "(Lru/ok/tracer/SystemState;Ljava/util/Map;)Lru/ok/tracer/SystemState;", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionStateStorageKt {
    public static final List<SessionState> getSessionStates(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        String string = simpleFileKeyValueStorage.getString(str);
        MN mn = MN.a;
        if (string == null) {
            return mn;
        }
        try {
            return SessionStatesSerializer.INSTANCE.fromJson(string);
        } catch (Exception unused) {
            return mn;
        }
    }

    public static final SystemState getSystemState(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        String string = simpleFileKeyValueStorage.getString(str);
        if (string == null) {
            return null;
        }
        try {
            return SystemStateSerializer.INSTANCE.fromJson(string);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void putSessionStates(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str, List<SessionState> list) {
        simpleFileKeyValueStorage.putString(str, SessionStatesSerializer.INSTANCE.toJson(list));
    }

    public static final void putSystemState(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str, SystemState systemState) {
        simpleFileKeyValueStorage.putString(str, SystemStateSerializer.INSTANCE.toJson(systemState));
    }

    public static final <K, V> boolean update(Map<K, V> map, K k, V v) {
        if (O90.a(map.get(k), v)) {
            return false;
        }
        if (v != null) {
            map.put(k, v);
            return true;
        }
        map.remove(k);
        return true;
    }

    public static final SystemState withPrevProperties(SystemState systemState, Map<String, String> map) {
        return map != null ? SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, false, false, AbstractC7096sn0.j(map, systemState.getProperties()), null, 6143, null) : systemState;
    }
}
