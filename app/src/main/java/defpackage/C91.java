package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public enum C91 {
    baseline("baseline"),
    /* JADX INFO: Fake field, exist only in values array */
    textBottom("text-bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    alphabetic("alphabetic"),
    /* JADX INFO: Fake field, exist only in values array */
    ideographic("ideographic"),
    /* JADX INFO: Fake field, exist only in values array */
    middle("middle"),
    /* JADX INFO: Fake field, exist only in values array */
    central("central"),
    /* JADX INFO: Fake field, exist only in values array */
    mathematical("mathematical"),
    /* JADX INFO: Fake field, exist only in values array */
    textTop("text-top"),
    /* JADX INFO: Fake field, exist only in values array */
    bottom("bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    center("center"),
    /* JADX INFO: Fake field, exist only in values array */
    top("top"),
    /* JADX INFO: Fake field, exist only in values array */
    textBeforeEdge("text-before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    textAfterEdge("text-after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    beforeEdge("before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    afterEdge("after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    hanging("hanging");

    public static final HashMap c = new HashMap();
    public final String a;

    static {
        for (C91 c91 : values()) {
            c.put(c91.a, c91);
        }
    }

    C91(String str) {
        this.a = str;
    }

    public static C91 a(String str) {
        HashMap map = c;
        if (map.containsKey(str)) {
            return (C91) map.get(str);
        }
        throw new IllegalArgumentException(AbstractC8235ym.v("Unknown String Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
