package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* renamed from: pF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6423pF1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C8129yC1.class, C8129yC1.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    EnumC6423pF1(Class cls, Serializable serializable) {
    }
}
