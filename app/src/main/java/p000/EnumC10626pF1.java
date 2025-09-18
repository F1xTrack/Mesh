package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* renamed from: pF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10626pF1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C11769yC1.class, C11769yC1.f46138c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    EnumC10626pF1(Class cls, Serializable serializable) {
    }
}
