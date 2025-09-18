package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: Hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617Hr implements InterfaceC8127yC, XR, YR, InterfaceC1571Tx0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public void A() {
        this.b = 0L;
        C0617Hr c0617Hr = (C0617Hr) this.c;
        if (c0617Hr != null) {
            c0617Hr.A();
        }
    }

    public void B(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            u();
            ((C0617Hr) this.c).B(i - 64);
        }
    }

    public void C(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
            this.b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.b) {
            Exception exc2 = (Exception) this.c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            throw exc3;
        }
    }

    @Override // defpackage.InterfaceC8127yC
    public long I(long j, long j2) {
        return AbstractC0277Dh1.f(((C1474Sr) this.c).e, j + this.b, true);
    }

    @Override // defpackage.InterfaceC8127yC
    public boolean P() {
        return true;
    }

    @Override // defpackage.InterfaceC8127yC
    public long R() {
        return 0L;
    }

    @Override // defpackage.InterfaceC8127yC
    public long W(long j) {
        return ((C1474Sr) this.c).a;
    }

    @Override // defpackage.InterfaceC8127yC
    public long X(long j, long j2) {
        return ((C1474Sr) this.c).a;
    }

    @Override // defpackage.InterfaceC8127yC
    public long a(long j) {
        return ((C1474Sr) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.XR
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        return ((C7566vF) this.c).b(bArr, 0, i2, z);
    }

    @Override // defpackage.InterfaceC8127yC
    public long e(long j, long j2) {
        return ((C1474Sr) this.c).d[(int) j];
    }

    @Override // defpackage.XR
    public boolean f(byte[] bArr, int i, int i2, boolean z) {
        return ((C7566vF) this.c).f(bArr, i, i2, z);
    }

    @Override // defpackage.InterfaceC8127yC
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.XR
    public long getLength() {
        return ((C7566vF) this.c).c - this.b;
    }

    @Override // defpackage.XR
    public long getPosition() {
        return ((C7566vF) this.c).d - this.b;
    }

    @Override // defpackage.InterfaceC8127yC
    public long h(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8127yC
    public C3939gJ0 i(long j) {
        return new C3939gJ0(((C1474Sr) this.c).c[(int) j], r0.b[r8], null);
    }

    @Override // defpackage.XR
    public long j() {
        return ((C7566vF) this.c).j() - this.b;
    }

    @Override // defpackage.XR
    public void k(int i) throws EOFException, InterruptedIOException {
        ((C7566vF) this.c).a(i, false);
    }

    @Override // defpackage.XR
    public void m() {
        ((C7566vF) this.c).f = 0;
    }

    @Override // defpackage.XR
    public void n(int i) throws EOFException, InterruptedIOException {
        ((C7566vF) this.c).n(i);
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 7:
                ((HL1) this.c).c.set(this.b);
                break;
            default:
                ((C6005n32) this.c).b.set(this.b);
                break;
        }
    }

    @Override // defpackage.YR
    public void p() {
        ((YR) this.c).p();
    }

    @Override // defpackage.XR
    public void q(byte[] bArr, int i, int i2) {
        ((C7566vF) this.c).f(bArr, i, i2, false);
    }

    @Override // defpackage.RC
    public int r(byte[] bArr, int i, int i2) {
        return ((C7566vF) this.c).r(bArr, i, i2);
    }

    @Override // defpackage.XR
    public void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((C7566vF) this.c).b(bArr, i, i2, false);
    }

    public void s(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        C0617Hr c0617Hr = (C0617Hr) this.c;
        if (c0617Hr != null) {
            c0617Hr.s(i - 64);
        }
    }

    public int t(int i) {
        C0617Hr c0617Hr = (C0617Hr) this.c;
        if (c0617Hr == null) {
            return i >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + c0617Hr.t(i - 64);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((C0617Hr) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((C0617Hr) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public void u() {
        if (((C0617Hr) this.c) == null) {
            this.c = new C0617Hr();
        }
    }

    public boolean v(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        u();
        return ((C0617Hr) this.c).v(i - 64);
    }

    @Override // defpackage.YR
    public InterfaceC1584Ub1 w(int i, int i2) {
        return ((YR) this.c).w(i, i2);
    }

    @Override // defpackage.YR
    public void x(CX0 cx0) {
        ((YR) this.c).x(new C7535v41(this, cx0, cx0));
    }

    public void y(int i, boolean z) {
        if (i >= 64) {
            u();
            ((C0617Hr) this.c).y(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            B(i);
        } else {
            s(i);
        }
        if (z2 || ((C0617Hr) this.c) != null) {
            u();
            ((C0617Hr) this.c).y(0, z2);
        }
    }

    public boolean z(int i) {
        if (i >= 64) {
            u();
            return ((C0617Hr) this.c).z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0617Hr c0617Hr = (C0617Hr) this.c;
        if (c0617Hr != null) {
            if (c0617Hr.v(0)) {
                B(63);
            }
            ((C0617Hr) this.c).z(0);
        }
        return z;
    }

    public /* synthetic */ C0617Hr(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ C0617Hr(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public C0617Hr(Clock clock) {
        this.a = 8;
        Preconditions.checkNotNull(clock);
        this.c = clock;
    }

    public C0617Hr(C8351zN0 c8351zN0) {
        this.a = 3;
        O90.f(c8351zN0, "source");
        this.c = c8351zN0;
        this.b = 262144L;
    }

    public C0617Hr(C7566vF c7566vF, long j) {
        this.a = 5;
        this.c = c7566vF;
        YN1.c(c7566vF.d >= j);
        this.b = j;
    }

    public C0617Hr() {
        this.a = 0;
        this.b = 0L;
    }
}
