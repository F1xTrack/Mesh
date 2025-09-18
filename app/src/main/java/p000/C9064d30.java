package p000;

import java.util.Arrays;

/* renamed from: d30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9064d30 extends AbstractC1061Qr {

    /* renamed from: j */
    public byte[] f25783j;

    /* renamed from: k */
    public volatile boolean f25784k;

    /* renamed from: l */
    public byte[] f25785l;

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        try {
            this.f9819i.mo2365c(this.f9812b);
            int iMo2367r = 0;
            int i = 0;
            while (iMo2367r != -1 && !this.f25784k) {
                byte[] bArr = this.f25783j;
                if (bArr.length < i + 16384) {
                    this.f25783j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iMo2367r = this.f9819i.mo2367r(this.f25783j, i, 16384);
                if (iMo2367r != -1) {
                    i += iMo2367r;
                }
            }
            if (!this.f25784k) {
                this.f25785l = Arrays.copyOf(this.f25783j, i);
            }
            AbstractC9770iZ1.m19065b(this.f9819i);
        } catch (Throwable th) {
            AbstractC9770iZ1.m19065b(this.f9819i);
            throw th;
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
        this.f25784k = true;
    }
}
