package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Kf */
/* loaded from: classes2.dex */
public final class C2732Kf extends AbstractC3219e {

    /* renamed from: d */
    private static volatile C2732Kf[] f21586d;

    /* renamed from: b */
    public byte[] f21587b;

    /* renamed from: c */
    public byte[] f21588c;

    public C2732Kf() {
        m14478b();
    }

    /* renamed from: c */
    public static C2732Kf[] m14477c() {
        if (f21586d == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f21586d == null) {
                        f21586d = new C2732Kf[0];
                    }
                } finally {
                }
            }
        }
        return f21586d;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        byte[] bArr = this.f21587b;
        byte[] bArr2 = C3271g.f23459d;
        if (!Arrays.equals(bArr, bArr2)) {
            c3141b.m15650b(1, this.f21587b);
        }
        if (Arrays.equals(this.f21588c, bArr2)) {
            return;
        }
        c3141b.m15650b(2, this.f21588c);
    }

    /* renamed from: b */
    public C2732Kf m14478b() {
        byte[] bArr = C3271g.f23459d;
        this.f21587b = bArr;
        this.f21588c = bArr;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        byte[] bArr = this.f21587b;
        byte[] bArr2 = C3271g.f23459d;
        int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f21587b) : 0;
        return !Arrays.equals(this.f21588c, bArr2) ? iM15633a + C3141b.m15633a(2, this.f21588c) : iM15633a;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            if (iM15594l == 0) {
                break;
            }
            if (iM15594l == 10) {
                this.f21587b = c3115a.m15582d();
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f21588c = c3115a.m15582d();
            }
        }
        return this;
    }
}
