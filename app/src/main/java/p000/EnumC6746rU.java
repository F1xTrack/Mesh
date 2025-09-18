package p000;

import java.util.HashMap;

/* renamed from: rU */
/* loaded from: classes.dex */
public enum EnumC6746rU {
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


    /* renamed from: c */
    public static final HashMap f41682c = new HashMap();

    /* renamed from: a */
    public final String f41684a;

    static {
        for (EnumC6746rU enumC6746rU : values()) {
            f41682c.put(enumC6746rU.f41684a, enumC6746rU);
        }
    }

    EnumC6746rU(String str) {
        this.f41684a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41684a;
    }
}
