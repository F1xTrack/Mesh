package p000;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Collections;

/* renamed from: UV */
/* loaded from: classes.dex */
public final class C1290UV {

    /* renamed from: a */
    public final int f11818a;

    /* renamed from: b */
    public final int f11819b;

    /* renamed from: c */
    public final int f11820c;

    /* renamed from: d */
    public final int f11821d;

    /* renamed from: e */
    public final int f11822e;

    /* renamed from: f */
    public final int f11823f;

    /* renamed from: g */
    public final int f11824g;

    /* renamed from: h */
    public final int f11825h;

    /* renamed from: i */
    public final int f11826i;

    /* renamed from: j */
    public final long f11827j;

    /* renamed from: k */
    public final ES1 f11828k;

    /* renamed from: l */
    public final C7660Gr0 f11829l;

    public C1290UV(byte[] bArr, int i) {
        C0683Kq c0683Kq = new C0683Kq(bArr, bArr.length);
        c0683Kq.m4760t(i * 8);
        this.f11818a = c0683Kq.m4752l(16);
        this.f11819b = c0683Kq.m4752l(16);
        this.f11820c = c0683Kq.m4752l(24);
        this.f11821d = c0683Kq.m4752l(24);
        int iM4752l = c0683Kq.m4752l(20);
        this.f11822e = iM4752l;
        this.f11823f = m8077d(iM4752l);
        this.f11824g = c0683Kq.m4752l(3) + 1;
        int iM4752l2 = c0683Kq.m4752l(5) + 1;
        this.f11825h = iM4752l2;
        this.f11826i = m8076a(iM4752l2);
        this.f11827j = c0683Kq.m4754n(36);
        this.f11828k = null;
        this.f11829l = null;
    }

    /* renamed from: a */
    public static int m8076a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: d */
    public static int m8077d(int i) {
        switch (i) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public final long m8078b() {
        long j = this.f11827j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f11822e;
    }

    /* renamed from: c */
    public final C6686qX m8079c(byte[] bArr, C7660Gr0 c7660Gr0) {
        bArr[4] = -128;
        int i = this.f11821d;
        if (i <= 0) {
            i = -1;
        }
        C7660Gr0 c7660Gr02 = this.f11829l;
        if (c7660Gr02 != null) {
            c7660Gr0 = c7660Gr02.m3182b(c7660Gr0);
        }
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/flac");
        c6623pX.f40162m = i;
        c6623pX.f40175z = this.f11824g;
        c6623pX.f40141A = this.f11822e;
        c6623pX.f40142B = AbstractC7485Dh1.m1786A(this.f11825h);
        c6623pX.f40164o = Collections.singletonList(bArr);
        c6623pX.f40159j = c7660Gr0;
        return new C6686qX(c6623pX);
    }

    public C1290UV(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ES1 es1, C7660Gr0 c7660Gr0) {
        this.f11818a = i;
        this.f11819b = i2;
        this.f11820c = i3;
        this.f11821d = i4;
        this.f11822e = i5;
        this.f11823f = m8077d(i5);
        this.f11824g = i6;
        this.f11825h = i7;
        this.f11826i = m8076a(i7);
        this.f11827j = j;
        this.f11828k = es1;
        this.f11829l = c7660Gr0;
    }
}
