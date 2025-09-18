package defpackage;

/* renamed from: na */
/* loaded from: classes.dex */
public final class C6102na {
    public static final C6102na d = new C5911ma().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public C6102na(C5911ma c5911ma) {
        this.a = c5911ma.a;
        this.b = c5911ma.b;
        this.c = c5911ma.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6102na.class != obj.getClass()) {
            return false;
        }
        C6102na c6102na = (C6102na) obj;
        return this.a == c6102na.a && this.b == c6102na.b && this.c == c6102na.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
