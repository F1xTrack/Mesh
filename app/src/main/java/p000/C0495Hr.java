package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: Hr */
/* loaded from: classes.dex */
public final class C0495Hr implements InterfaceC7186yC, InterfaceC1475XR, InterfaceC1538YR, InterfaceC8348Tx0 {

    /* renamed from: a */
    public final /* synthetic */ int f4552a;

    /* renamed from: b */
    public long f4553b;

    /* renamed from: c */
    public Object f4554c;

    /* renamed from: A */
    public void m3609A() {
        this.f4553b = 0L;
        C0495Hr c0495Hr = (C0495Hr) this.f4554c;
        if (c0495Hr != null) {
            c0495Hr.m3609A();
        }
    }

    /* renamed from: B */
    public void m3610B(int i) {
        if (i < 64) {
            this.f4553b |= 1 << i;
        } else {
            m3631u();
            ((C0495Hr) this.f4554c).m3610B(i - 64);
        }
    }

    /* renamed from: C */
    public void m3611C(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f4554c) == null) {
            this.f4554c = exc;
            this.f4553b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f4553b) {
            Exception exc2 = (Exception) this.f4554c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f4554c;
            this.f4554c = null;
            throw exc3;
        }
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: I */
    public long mo3612I(long j, long j2) {
        return AbstractC7485Dh1.m1821f(((C1186Sr) this.f4554c).f11008e, j + this.f4553b, true);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: P */
    public boolean mo3613P() {
        return true;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: R */
    public long mo3614R() {
        return 0L;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: W */
    public long mo3615W(long j) {
        return ((C1186Sr) this.f4554c).f11004a;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: X */
    public long mo3616X(long j, long j2) {
        return ((C1186Sr) this.f4554c).f11004a;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: a */
    public long mo3617a(long j) {
        return ((C1186Sr) this.f4554c).f11008e[(int) j] - this.f4553b;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: b */
    public boolean mo3618b(byte[] bArr, int i, int i2, boolean z) {
        return ((C7000vF) this.f4554c).mo3618b(bArr, 0, i2, z);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: e */
    public long mo3619e(long j, long j2) {
        return ((C1186Sr) this.f4554c).f11007d[(int) j];
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: f */
    public boolean mo3620f(byte[] bArr, int i, int i2, boolean z) {
        return ((C7000vF) this.f4554c).mo3620f(bArr, i, i2, z);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: g */
    public long mo3621g(long j, long j2) {
        return 0L;
    }

    @Override // p000.InterfaceC1475XR
    public long getLength() {
        return ((C7000vF) this.f4554c).f44294c - this.f4553b;
    }

    @Override // p000.InterfaceC1475XR
    public long getPosition() {
        return ((C7000vF) this.f4554c).f44295d - this.f4553b;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: h */
    public long mo3622h(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: i */
    public C9481gJ0 mo3623i(long j) {
        return new C9481gJ0(((C1186Sr) this.f4554c).f11006c[(int) j], r0.f11005b[r8], null);
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: j */
    public long mo3624j() {
        return ((C7000vF) this.f4554c).mo3624j() - this.f4553b;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: k */
    public void mo3625k(int i) throws EOFException, InterruptedIOException {
        ((C7000vF) this.f4554c).m25375a(i, false);
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: m */
    public void mo3626m() {
        ((C7000vF) this.f4554c).f44297f = 0;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: n */
    public void mo3627n(int i) throws EOFException, InterruptedIOException {
        ((C7000vF) this.f4554c).mo3627n(i);
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        switch (this.f4552a) {
            case 7:
                ((HL1) this.f4554c).f4239c.set(this.f4553b);
                break;
            default:
                ((C10346n32) this.f4554c).f38068b.set(this.f4553b);
                break;
        }
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public void mo2003p() {
        ((InterfaceC1538YR) this.f4554c).mo2003p();
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: q */
    public void mo3628q(byte[] bArr, int i, int i2) {
        ((C7000vF) this.f4554c).mo3620f(bArr, i, i2, false);
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public int mo2367r(byte[] bArr, int i, int i2) {
        return ((C7000vF) this.f4554c).mo2367r(bArr, i, i2);
    }

    @Override // p000.InterfaceC1475XR
    public void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((C7000vF) this.f4554c).mo3618b(bArr, i, i2, false);
    }

    /* renamed from: s */
    public void m3629s(int i) {
        if (i < 64) {
            this.f4553b &= ~(1 << i);
            return;
        }
        C0495Hr c0495Hr = (C0495Hr) this.f4554c;
        if (c0495Hr != null) {
            c0495Hr.m3629s(i - 64);
        }
    }

    /* renamed from: t */
    public int m3630t(int i) {
        C0495Hr c0495Hr = (C0495Hr) this.f4554c;
        if (c0495Hr == null) {
            return i >= 64 ? Long.bitCount(this.f4553b) : Long.bitCount(this.f4553b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f4553b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f4553b) + c0495Hr.m3630t(i - 64);
    }

    public String toString() {
        switch (this.f4552a) {
            case 0:
                if (((C0495Hr) this.f4554c) == null) {
                    return Long.toBinaryString(this.f4553b);
                }
                return ((C0495Hr) this.f4554c).toString() + "xx" + Long.toBinaryString(this.f4553b);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m3631u() {
        if (((C0495Hr) this.f4554c) == null) {
            this.f4554c = new C0495Hr();
        }
    }

    /* renamed from: v */
    public boolean m3632v(int i) {
        if (i < 64) {
            return (this.f4553b & (1 << i)) != 0;
        }
        m3631u();
        return ((C0495Hr) this.f4554c).m3632v(i - 64);
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public InterfaceC8357Ub1 mo2005w(int i, int i2) {
        return ((InterfaceC1538YR) this.f4554c).mo2005w(i, i2);
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public void mo2006x(CX0 cx0) {
        ((InterfaceC1538YR) this.f4554c).mo2006x(new C11372v41(this, cx0, cx0));
    }

    /* renamed from: y */
    public void m3633y(int i, boolean z) {
        if (i >= 64) {
            m3631u();
            ((C0495Hr) this.f4554c).m3633y(i - 64, z);
            return;
        }
        long j = this.f4553b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f4553b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m3610B(i);
        } else {
            m3629s(i);
        }
        if (z2 || ((C0495Hr) this.f4554c) != null) {
            m3631u();
            ((C0495Hr) this.f4554c).m3633y(0, z2);
        }
    }

    /* renamed from: z */
    public boolean m3634z(int i) {
        if (i >= 64) {
            m3631u();
            return ((C0495Hr) this.f4554c).m3634z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f4553b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f4553b = j3;
        long j4 = j - 1;
        this.f4553b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0495Hr c0495Hr = (C0495Hr) this.f4554c;
        if (c0495Hr != null) {
            if (c0495Hr.m3632v(0)) {
                m3610B(63);
            }
            ((C0495Hr) this.f4554c).m3634z(0);
        }
        return z;
    }

    public /* synthetic */ C0495Hr(long j, Object obj, int i) {
        this.f4552a = i;
        this.f4553b = j;
        this.f4554c = obj;
    }

    public /* synthetic */ C0495Hr(Object obj, long j, int i) {
        this.f4552a = i;
        this.f4554c = obj;
        this.f4553b = j;
    }

    public C0495Hr(Clock clock) {
        this.f4552a = 8;
        Preconditions.checkNotNull(clock);
        this.f4554c = clock;
    }

    public C0495Hr(C11917zN0 c11917zN0) {
        this.f4552a = 3;
        O90.m5968f(c11917zN0, "source");
        this.f4554c = c11917zN0;
        this.f4553b = 262144L;
    }

    public C0495Hr(C7000vF c7000vF, long j) {
        this.f4552a = 5;
        this.f4554c = c7000vF;
        YN1.m9278c(c7000vF.f44295d >= j);
        this.f4553b = j;
    }

    public C0495Hr() {
        this.f4552a = 0;
        this.f4553b = 0L;
    }
}
