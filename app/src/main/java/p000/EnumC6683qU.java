package p000;

import java.util.HashMap;

/* renamed from: qU */
/* loaded from: classes.dex */
public enum EnumC6683qU {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAP("wrap"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(LocalNotification.Importance.NONE);


    /* renamed from: b */
    public static final HashMap f40891b = new HashMap();

    /* renamed from: a */
    public final String f40893a;

    static {
        for (EnumC6683qU enumC6683qU : values()) {
            f40891b.put(enumC6683qU.f40893a, enumC6683qU);
        }
    }

    EnumC6683qU(String str) {
        this.f40893a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f40893a;
    }
}
