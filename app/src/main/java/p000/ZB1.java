package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ZB1 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (O12.m5941b(getKey(), entry.getKey()) && O12.m5941b(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC1374Vq.m8589h(String.valueOf(getKey()), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(getValue()));
    }
}
