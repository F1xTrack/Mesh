package defpackage;

import com.huawei.hms.rn.push.constants.LocalNotification;
import java.util.HashMap;

/* renamed from: qU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6657qU {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAP("wrap"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(LocalNotification.Importance.NONE);

    public static final HashMap b = new HashMap();
    public final String a;

    static {
        for (EnumC6657qU enumC6657qU : values()) {
            b.put(enumC6657qU.a, enumC6657qU);
        }
    }

    EnumC6657qU(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
