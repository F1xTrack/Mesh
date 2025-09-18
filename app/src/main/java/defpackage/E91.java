package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public enum E91 {
    None(LocalNotification.Importance.NONE),
    /* JADX INFO: Fake field, exist only in values array */
    Underline("underline"),
    /* JADX INFO: Fake field, exist only in values array */
    Overline("overline"),
    /* JADX INFO: Fake field, exist only in values array */
    LineThrough("line-through"),
    /* JADX INFO: Fake field, exist only in values array */
    Blink("blink");

    public static final HashMap c = new HashMap();
    public final String a;

    static {
        for (E91 e91 : values()) {
            c.put(e91.a, e91);
        }
    }

    E91(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
