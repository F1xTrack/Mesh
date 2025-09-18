package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: al */
/* loaded from: classes2.dex */
public final class C1684al {

    /* renamed from: n */
    public static final /* synthetic */ int f15668n = 0;

    /* renamed from: a */
    public final boolean f15669a;

    /* renamed from: b */
    public final boolean f15670b;

    /* renamed from: c */
    public final int f15671c;

    /* renamed from: d */
    public final int f15672d;

    /* renamed from: e */
    public final boolean f15673e;

    /* renamed from: f */
    public final boolean f15674f;

    /* renamed from: g */
    public final boolean f15675g;

    /* renamed from: h */
    public final int f15676h;

    /* renamed from: i */
    public final int f15677i;

    /* renamed from: j */
    public final boolean f15678j;

    /* renamed from: k */
    public final boolean f15679k;

    /* renamed from: l */
    public final boolean f15680l;

    /* renamed from: m */
    public String f15681m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        O90.m5968f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C1684al(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f15669a = z;
        this.f15670b = z2;
        this.f15671c = i;
        this.f15672d = i2;
        this.f15673e = z3;
        this.f15674f = z4;
        this.f15675g = z5;
        this.f15676h = i3;
        this.f15677i = i4;
        this.f15678j = z6;
        this.f15679k = z7;
        this.f15680l = z8;
        this.f15681m = str;
    }

    public final String toString() {
        String str = this.f15681m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f15669a) {
            sb.append("no-cache, ");
        }
        if (this.f15670b) {
            sb.append("no-store, ");
        }
        int i = this.f15671c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f15672d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f15673e) {
            sb.append("private, ");
        }
        if (this.f15674f) {
            sb.append("public, ");
        }
        if (this.f15675g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f15676h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f15677i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f15678j) {
            sb.append("only-if-cached, ");
        }
        if (this.f15679k) {
            sb.append("no-transform, ");
        }
        if (this.f15680l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        this.f15681m = string;
        return string;
    }
}
