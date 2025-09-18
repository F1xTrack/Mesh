package defpackage;

import java.util.Arrays;

/* renamed from: d30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3318d30 extends AbstractC1318Qr {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        try {
            this.i.c(this.b);
            int iR = 0;
            int i = 0;
            while (iR != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iR = this.i.r(this.j, i, 16384);
                if (iR != -1) {
                    i += iR;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i);
            }
            AbstractC4370iZ1.b(this.i);
        } catch (Throwable th) {
            AbstractC4370iZ1.b(this.i);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
        this.k = true;
    }
}
