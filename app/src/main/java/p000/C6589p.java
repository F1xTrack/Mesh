package p000;

/* renamed from: p */
/* loaded from: classes.dex */
public final class C6589p {

    /* renamed from: a */
    public final /* synthetic */ int f39423a;

    /* renamed from: b */
    public String f39424b;

    /* renamed from: c */
    public int f39425c;

    /* renamed from: d */
    public int f39426d;

    public /* synthetic */ C6589p(int i) {
        this.f39423a = i;
    }

    /* renamed from: a */
    public boolean m23584a() {
        String str = this.f39424b;
        return str.length() > 0 && this.f39426d < str.length() - 1;
    }

    /* renamed from: b */
    public boolean m23585b() {
        char cCharAt;
        int i = this.f39425c;
        int i2 = i + 1;
        int i3 = this.f39426d;
        if (i3 != i2) {
            return false;
        }
        String str = this.f39424b;
        return AbstractC10471o22.m23321a(str.charAt(i)) && (cCharAt = str.charAt(i3)) >= '0' && cCharAt <= '9';
    }

    /* renamed from: c */
    public boolean m23586c() {
        int i = this.f39425c;
        int i2 = i + 1;
        int i3 = this.f39426d;
        if (i3 != i2) {
            return false;
        }
        String str = this.f39424b;
        char cCharAt = str.charAt(i);
        return (AbstractC10471o22.m23321a(cCharAt) || (cCharAt >= '0' && cCharAt <= '9')) && AbstractC10471o22.m23321a(str.charAt(i3));
    }

    /* renamed from: d */
    public boolean m23587d() {
        String str = this.f39424b;
        int i = this.f39425c;
        int i2 = this.f39426d;
        if (AbstractC10471o22.m23322b(i, i2, 2, 3, str) || AbstractC10471o22.m23322b(i, i2, 5, 8, str)) {
            return true;
        }
        return (i2 - i) + 1 == 4 && str.charAt(i) == 'r' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'o' && str.charAt(i + 3) == 't';
    }

    /* renamed from: e */
    public C6589p m23588e() throws C7594Fk0 {
        if (!m23584a()) {
            throw new C7594Fk0();
        }
        int i = this.f39426d;
        int i2 = this.f39425c;
        String str = this.f39424b;
        if (i >= i2) {
            if (str.charAt(i + 1) != '-') {
                throw new C7594Fk0();
            }
            if (this.f39426d + 2 == str.length()) {
                throw new C7594Fk0();
            }
            this.f39425c = this.f39426d + 2;
        }
        this.f39426d = this.f39425c;
        while (this.f39426d < str.length() && str.charAt(this.f39426d) != '-') {
            this.f39426d++;
        }
        int i3 = this.f39426d;
        int i4 = this.f39425c;
        if (i3 <= i4) {
            throw new C7594Fk0();
        }
        int i5 = i3 - 1;
        this.f39426d = i5;
        C6589p c6589p = new C6589p(2);
        c6589p.f39424b = str;
        c6589p.f39425c = i4;
        c6589p.f39426d = i5;
        return c6589p;
    }

    public String toString() {
        switch (this.f39423a) {
            case 2:
                return this.f39424b.subSequence(this.f39425c, this.f39426d + 1).toString();
            default:
                return super.toString();
        }
    }

    public C6589p(int i, int i2, String str) {
        this.f39423a = 0;
        this.f39425c = i;
        this.f39426d = i2;
        this.f39424b = str;
    }

    public C6589p(String str, int i, int i2, int i3, long j) {
        this.f39423a = 1;
        this.f39424b = str;
        this.f39426d = i;
        this.f39425c = i2;
    }
}
