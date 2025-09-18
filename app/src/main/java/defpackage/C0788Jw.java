package defpackage;

/* renamed from: Jw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0788Jw {
    public final /* synthetic */ int a = 1;
    public String b;
    public String c;

    public /* synthetic */ C0788Jw() {
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (!(obj instanceof C2045Zz0)) {
                    return false;
                }
                C2045Zz0 c2045Zz0 = (C2045Zz0) obj;
                Object obj2 = c2045Zz0.a;
                String str = this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                String str2 = this.c;
                Object obj3 = c2045Zz0.b;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public C0788Jw(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
