package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Iterator;

/* renamed from: Wz1 */
/* loaded from: classes.dex */
public final class C1812Wz1 implements InterfaceC0877Kz1, Iterable {
    public final String a;

    public C1812Wz1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1812Wz1) {
            return this.a.equals(((C1812Wz1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3913gA1(0, this);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return new C3913gA1(1, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x017f A[PHI: r0 r2 r7 r16
  0x017f: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v9 java.lang.String) binds: [B:387:0x017d, B:383:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:387:0x017d, B:383:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v6 java.lang.String) binds: [B:387:0x017d, B:383:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r16v5 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:387:0x017d, B:383:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01ac A[PHI: r0 r2 r3 r7 r16 r19
  0x01ac: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v6 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v3 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v3 java.lang.String) binds: [B:395:0x01aa, B:391:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0648  */
    @Override // defpackage.InterfaceC0877Kz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC0877Kz1 q(java.lang.String r23, defpackage.C6860rY0 r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1812Wz1.q(java.lang.String, rY0, java.util.ArrayList):Kz1");
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("\""), this.a, "\"");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return new C1812Wz1(this.a);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return this.a;
    }
}
