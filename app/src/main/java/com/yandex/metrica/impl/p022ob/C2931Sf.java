package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Sf */
/* loaded from: classes2.dex */
public final class C2931Sf extends AbstractC3219e {

    /* renamed from: b */
    public byte[] f22307b;

    public C2931Sf() {
        m15120b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        if (Arrays.equals(this.f22307b, C3271g.f23459d)) {
            return;
        }
        c3141b.m15650b(1, this.f22307b);
    }

    /* renamed from: b */
    public C2931Sf m15120b() {
        this.f22307b = C3271g.f23459d;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        if (Arrays.equals(this.f22307b, C3271g.f23459d)) {
            return 0;
        }
        return C3141b.m15633a(1, this.f22307b);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            if (iM15594l == 0) {
                break;
            }
            if (iM15594l != 10) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f22307b = c3115a.m15582d();
            }
        }
        return this;
    }
}
