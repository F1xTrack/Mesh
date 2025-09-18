package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.eg */
/* loaded from: classes2.dex */
public final class C3236eg extends AbstractC3219e {

    /* renamed from: b */
    public boolean f23361b;

    /* renamed from: c */
    public int f23362c;

    /* renamed from: d */
    public int f23363d;

    /* renamed from: e */
    public int[] f23364e;

    public C3236eg() {
        m15851b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        c3141b.m15649b(1, this.f23361b);
        c3141b.m15659f(2, this.f23362c);
        c3141b.m15659f(3, this.f23363d);
        int[] iArr = this.f23364e;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f23364e;
            if (i >= iArr2.length) {
                return;
            }
            c3141b.m15654d(4, iArr2[i]);
            i++;
        }
    }

    /* renamed from: b */
    public C3236eg m15851b() {
        this.f23361b = false;
        this.f23362c = 0;
        this.f23363d = 0;
        this.f23364e = C3271g.f23456a;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15642c = C3141b.m15642c(3, this.f23363d) + C3141b.m15642c(2, this.f23362c) + C3141b.m15632a(1, this.f23361b);
        int[] iArr = this.f23364e;
        if (iArr == null || iArr.length <= 0) {
            return iM15642c;
        }
        int i = 0;
        int iM15626a = 0;
        while (true) {
            int[] iArr2 = this.f23364e;
            if (i < iArr2.length) {
                iM15626a += C3141b.m15626a(iArr2[i]);
                i++;
            } else {
                return iM15642c + iM15626a + iArr2.length;
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            if (iM15594l == 0) {
                break;
            }
            if (iM15594l == 8) {
                this.f23361b = c3115a.m15581c();
            } else if (iM15594l == 16) {
                this.f23362c = c3115a.m15590h();
            } else if (iM15594l == 24) {
                this.f23363d = c3115a.m15590h();
            } else if (iM15594l == 32) {
                int iM15952a = C3271g.m15952a(c3115a, 32);
                int[] iArr = this.f23364e;
                int length = iArr == null ? 0 : iArr.length;
                int i = iM15952a + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = c3115a.m15590h();
                    c3115a.m15594l();
                    length++;
                }
                iArr2[length] = c3115a.m15590h();
                this.f23364e = iArr2;
            } else if (iM15594l != 34) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15580c = c3115a.m15580c(c3115a.m15590h());
                int iM15578b = c3115a.m15578b();
                int i2 = 0;
                while (c3115a.m15575a() > 0) {
                    c3115a.m15590h();
                    i2++;
                }
                c3115a.m15585e(iM15578b);
                int[] iArr3 = this.f23364e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = c3115a.m15590h();
                    length2++;
                }
                this.f23364e = iArr4;
                c3115a.m15579b(iM15580c);
            }
        }
        return this;
    }
}
