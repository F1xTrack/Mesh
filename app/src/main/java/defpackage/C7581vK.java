package defpackage;

/* renamed from: vK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7581vK {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public C7581vK(C7581vK c7581vK) {
        this.a = 3;
        this.b = c7581vK.b;
        this.c = c7581vK.c;
    }

    public void a(long j) {
        if (j >= 0) {
            this.c = j;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public C7581vK(long j, long j2) {
        this.a = 4;
        this.b = j;
        this.c = j2;
    }

    public C7581vK(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = 60L;
                this.c = C0320Dw.j;
                break;
            case 5:
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                break;
        }
    }

    public C7581vK(long j, long j2, long j3) {
        this.a = 0;
        this.b = j2;
        this.c = j3;
    }
}
