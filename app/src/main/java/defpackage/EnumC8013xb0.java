package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* renamed from: xb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8013xb0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0440Fk.class, C0440Fk.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    EnumC8013xb0(Class cls, Serializable serializable) {
    }
}
