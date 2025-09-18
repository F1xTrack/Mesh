package p000;

/* renamed from: Jw */
/* loaded from: classes2.dex */
public final class C0626Jw {

    /* renamed from: a */
    public final /* synthetic */ int f5802a = 1;

    /* renamed from: b */
    public String f5803b;

    /* renamed from: c */
    public String f5804c;

    public /* synthetic */ C0626Jw() {
    }

    public boolean equals(Object obj) {
        switch (this.f5802a) {
            case 1:
                if (!(obj instanceof C8664Zz0)) {
                    return false;
                }
                C8664Zz0 c8664Zz0 = (C8664Zz0) obj;
                Object obj2 = c8664Zz0.f15267a;
                String str = this.f5803b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                String str2 = this.f5804c;
                Object obj3 = c8664Zz0.f15268b;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f5802a) {
            case 1:
                String str = this.f5803b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f5804c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f5802a) {
            case 1:
                return "Pair{" + ((Object) this.f5803b) + " " + ((Object) this.f5804c) + "}";
            default:
                return super.toString();
        }
    }

    public C0626Jw(String str, String str2) {
        this.f5803b = str;
        this.f5804c = str2;
    }
}
