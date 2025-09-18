package defpackage;

import java.util.HashMap;

/* renamed from: rU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6847rU {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL("normal"),
    MULTIPLY("multiply"),
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN("screen"),
    /* JADX INFO: Fake field, exist only in values array */
    DARKEN("darken"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTEN("lighten");

    public static final HashMap c = new HashMap();
    public final String a;

    static {
        for (EnumC6847rU enumC6847rU : values()) {
            c.put(enumC6847rU.a, enumC6847rU);
        }
    }

    EnumC6847rU(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
