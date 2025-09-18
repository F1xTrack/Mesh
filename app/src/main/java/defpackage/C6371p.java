package defpackage;

/* renamed from: p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6371p {
    public final /* synthetic */ int a;
    public String b;
    public int c;
    public int d;

    public /* synthetic */ C6371p(int i) {
        this.a = i;
    }

    public boolean a() {
        String str = this.b;
        return str.length() > 0 && this.d < str.length() - 1;
    }

    public boolean b() {
        char cCharAt;
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if (i3 != i2) {
            return false;
        }
        String str = this.b;
        return AbstractC6192o22.a(str.charAt(i)) && (cCharAt = str.charAt(i3)) >= '0' && cCharAt <= '9';
    }

    public boolean c() {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if (i3 != i2) {
            return false;
        }
        String str = this.b;
        char cCharAt = str.charAt(i);
        return (AbstractC6192o22.a(cCharAt) || (cCharAt >= '0' && cCharAt <= '9')) && AbstractC6192o22.a(str.charAt(i3));
    }

    public boolean d() {
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        if (AbstractC6192o22.b(i, i2, 2, 3, str) || AbstractC6192o22.b(i, i2, 5, 8, str)) {
            return true;
        }
        return (i2 - i) + 1 == 4 && str.charAt(i) == 'r' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'o' && str.charAt(i + 3) == 't';
    }

    public C6371p e() throws C0441Fk0 {
        if (!a()) {
            throw new C0441Fk0();
        }
        int i = this.d;
        int i2 = this.c;
        String str = this.b;
        if (i >= i2) {
            if (str.charAt(i + 1) != '-') {
                throw new C0441Fk0();
            }
            if (this.d + 2 == str.length()) {
                throw new C0441Fk0();
            }
            this.c = this.d + 2;
        }
        this.d = this.c;
        while (this.d < str.length() && str.charAt(this.d) != '-') {
            this.d++;
        }
        int i3 = this.d;
        int i4 = this.c;
        if (i3 <= i4) {
            throw new C0441Fk0();
        }
        int i5 = i3 - 1;
        this.d = i5;
        C6371p c6371p = new C6371p(2);
        c6371p.b = str;
        c6371p.c = i4;
        c6371p.d = i5;
        return c6371p;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b.subSequence(this.c, this.d + 1).toString();
            default:
                return super.toString();
        }
    }

    public C6371p(int i, int i2, String str) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = str;
    }

    public C6371p(String str, int i, int i2, int i3, long j) {
        this.a = 1;
        this.b = str;
        this.d = i;
        this.c = i2;
    }
}
