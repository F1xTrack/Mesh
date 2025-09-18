package com.yandex.metrica.impl.ob;

import android.location.Location;

/* loaded from: classes2.dex */
public class Fc extends AbstractC2690d0 {
    private final C2753fd b;

    public Fc(AbstractC2690d0 abstractC2690d0, C2753fd c2753fd) {
        super(abstractC2690d0);
        this.b = c2753fd;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2690d0
    public void b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.b.b((C2753fd) location);
        }
    }
}
