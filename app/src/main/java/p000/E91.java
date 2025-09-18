package p000;

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


    /* renamed from: c */
    public static final HashMap f2517c = new HashMap();

    /* renamed from: a */
    public final String f2519a;

    static {
        for (E91 e91 : values()) {
            f2517c.put(e91.f2519a, e91);
        }
    }

    E91(String str) {
        this.f2519a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2519a;
    }
}
