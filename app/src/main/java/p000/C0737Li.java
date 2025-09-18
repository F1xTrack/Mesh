package p000;

/* renamed from: Li */
/* loaded from: classes.dex */
public final class C0737Li {

    /* renamed from: a */
    public C11323ui0 f6805a;

    /* renamed from: b */
    public C11323ui0 f6806b;

    /* renamed from: c */
    public C11323ui0 f6807c;

    /* renamed from: d */
    public C11323ui0 f6808d;

    /* renamed from: e */
    public C11323ui0 f6809e;

    /* renamed from: f */
    public C11323ui0 f6810f;

    /* renamed from: g */
    public C11323ui0 f6811g;

    /* renamed from: h */
    public C11323ui0 f6812h;

    /* renamed from: i */
    public C11323ui0 f6813i;

    /* renamed from: j */
    public C11323ui0 f6814j;

    /* renamed from: k */
    public C11323ui0 f6815k;

    /* renamed from: l */
    public C11323ui0 f6816l;

    /* renamed from: m */
    public C11323ui0 f6817m;

    /* renamed from: a */
    public final void m5066a(EnumC0675Ki enumC0675Ki, C11323ui0 c11323ui0) {
        O90.m5968f(enumC0675Ki, "property");
        switch (enumC0675Ki.ordinal()) {
            case 0:
                this.f6805a = c11323ui0;
                break;
            case 1:
                this.f6806b = c11323ui0;
                break;
            case 2:
                this.f6807c = c11323ui0;
                break;
            case 3:
                this.f6809e = c11323ui0;
                break;
            case 4:
                this.f6808d = c11323ui0;
                break;
            case 5:
                this.f6810f = c11323ui0;
                break;
            case 6:
                this.f6811g = c11323ui0;
                break;
            case 7:
                this.f6812h = c11323ui0;
                break;
            case 8:
                this.f6813i = c11323ui0;
                break;
            case 9:
                this.f6817m = c11323ui0;
                break;
            case 10:
                this.f6816l = c11323ui0;
                break;
            case 11:
                this.f6815k = c11323ui0;
                break;
            case 12:
                this.f6814j = c11323ui0;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0737Li)) {
            return false;
        }
        C0737Li c0737Li = (C0737Li) obj;
        return O90.m5963a(this.f6805a, c0737Li.f6805a) && O90.m5963a(this.f6806b, c0737Li.f6806b) && O90.m5963a(this.f6807c, c0737Li.f6807c) && O90.m5963a(this.f6808d, c0737Li.f6808d) && O90.m5963a(this.f6809e, c0737Li.f6809e) && O90.m5963a(this.f6810f, c0737Li.f6810f) && O90.m5963a(this.f6811g, c0737Li.f6811g) && O90.m5963a(this.f6812h, c0737Li.f6812h) && O90.m5963a(this.f6813i, c0737Li.f6813i) && O90.m5963a(this.f6814j, c0737Li.f6814j) && O90.m5963a(this.f6815k, c0737Li.f6815k) && O90.m5963a(this.f6816l, c0737Li.f6816l) && O90.m5963a(this.f6817m, c0737Li.f6817m);
    }

    public final int hashCode() {
        C11323ui0 c11323ui0 = this.f6805a;
        int iHashCode = (c11323ui0 == null ? 0 : c11323ui0.hashCode()) * 31;
        C11323ui0 c11323ui02 = this.f6806b;
        int iHashCode2 = (iHashCode + (c11323ui02 == null ? 0 : c11323ui02.hashCode())) * 31;
        C11323ui0 c11323ui03 = this.f6807c;
        int iHashCode3 = (iHashCode2 + (c11323ui03 == null ? 0 : c11323ui03.hashCode())) * 31;
        C11323ui0 c11323ui04 = this.f6808d;
        int iHashCode4 = (iHashCode3 + (c11323ui04 == null ? 0 : c11323ui04.hashCode())) * 31;
        C11323ui0 c11323ui05 = this.f6809e;
        int iHashCode5 = (iHashCode4 + (c11323ui05 == null ? 0 : c11323ui05.hashCode())) * 31;
        C11323ui0 c11323ui06 = this.f6810f;
        int iHashCode6 = (iHashCode5 + (c11323ui06 == null ? 0 : c11323ui06.hashCode())) * 31;
        C11323ui0 c11323ui07 = this.f6811g;
        int iHashCode7 = (iHashCode6 + (c11323ui07 == null ? 0 : c11323ui07.hashCode())) * 31;
        C11323ui0 c11323ui08 = this.f6812h;
        int iHashCode8 = (iHashCode7 + (c11323ui08 == null ? 0 : c11323ui08.hashCode())) * 31;
        C11323ui0 c11323ui09 = this.f6813i;
        int iHashCode9 = (iHashCode8 + (c11323ui09 == null ? 0 : c11323ui09.hashCode())) * 31;
        C11323ui0 c11323ui010 = this.f6814j;
        int iHashCode10 = (iHashCode9 + (c11323ui010 == null ? 0 : c11323ui010.hashCode())) * 31;
        C11323ui0 c11323ui011 = this.f6815k;
        int iHashCode11 = (iHashCode10 + (c11323ui011 == null ? 0 : c11323ui011.hashCode())) * 31;
        C11323ui0 c11323ui012 = this.f6816l;
        int iHashCode12 = (iHashCode11 + (c11323ui012 == null ? 0 : c11323ui012.hashCode())) * 31;
        C11323ui0 c11323ui013 = this.f6817m;
        return iHashCode12 + (c11323ui013 != null ? c11323ui013.hashCode() : 0);
    }

    public final String toString() {
        return "BorderRadiusStyle(uniform=" + this.f6805a + ", topLeft=" + this.f6806b + ", topRight=" + this.f6807c + ", bottomLeft=" + this.f6808d + ", bottomRight=" + this.f6809e + ", topStart=" + this.f6810f + ", topEnd=" + this.f6811g + ", bottomStart=" + this.f6812h + ", bottomEnd=" + this.f6813i + ", startStart=" + this.f6814j + ", startEnd=" + this.f6815k + ", endStart=" + this.f6816l + ", endEnd=" + this.f6817m + ")";
    }
}
