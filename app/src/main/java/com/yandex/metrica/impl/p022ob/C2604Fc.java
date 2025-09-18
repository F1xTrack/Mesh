package com.yandex.metrica.impl.p022ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.Fc */
/* loaded from: classes2.dex */
public class C2604Fc extends AbstractC3194d0 {

    /* renamed from: b */
    private final C3259fd f21213b;

    public C2604Fc(AbstractC3194d0 abstractC3194d0, C3259fd c3259fd) {
        super(abstractC3194d0);
        this.f21213b = c3259fd;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3194d0
    /* renamed from: b */
    public void mo14130b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f21213b.mo14758b((C3259fd) location);
        }
    }
}
