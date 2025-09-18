package p000;

/* renamed from: vK */
/* loaded from: classes.dex */
public final class C7005vK {

    /* renamed from: a */
    public final /* synthetic */ int f44328a;

    /* renamed from: b */
    public long f44329b;

    /* renamed from: c */
    public long f44330c;

    public C7005vK(C7005vK c7005vK) {
        this.f44328a = 3;
        this.f44329b = c7005vK.f44329b;
        this.f44330c = c7005vK.f44330c;
    }

    /* renamed from: a */
    public void m25399a(long j) {
        if (j >= 0) {
            this.f44330c = j;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
    }

    public String toString() {
        switch (this.f44328a) {
            case 4:
                return this.f44329b + "/" + this.f44330c;
            default:
                return super.toString();
        }
    }

    public C7005vK(long j, long j2) {
        this.f44328a = 4;
        this.f44329b = j;
        this.f44330c = j2;
    }

    public C7005vK(int i) {
        this.f44328a = i;
        switch (i) {
            case 2:
                this.f44329b = 60L;
                this.f44330c = C0248Dw.f2311j;
                break;
            case 5:
                this.f44329b = -9223372036854775807L;
                this.f44330c = -9223372036854775807L;
                break;
        }
    }

    public C7005vK(long j, long j2, long j3) {
        this.f44328a = 0;
        this.f44329b = j2;
        this.f44330c = j3;
    }
}
