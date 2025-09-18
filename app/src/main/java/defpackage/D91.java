package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public enum D91 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    /* JADX INFO: Fake field, exist only in values array */
    w400("400"),
    w500("500"),
    w600("600"),
    /* JADX INFO: Fake field, exist only in values array */
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");

    public static final HashMap m = new HashMap();
    public final String a;

    static {
        for (D91 d91 : values()) {
            m.put(d91.a, d91);
        }
    }

    D91(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
