package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* renamed from: H0 */
/* loaded from: classes.dex */
public abstract class AbstractC0442H0 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC9984kE1.m22173a(getKey(), entry.getKey()) && AbstractC9984kE1.m22173a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}
