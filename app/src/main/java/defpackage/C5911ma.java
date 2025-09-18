package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5911ma {
    public boolean a;
    public boolean b;
    public boolean c;

    public C5911ma(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public C6102na a() {
        if (this.a || !(this.b || this.c)) {
            return new C6102na(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.c || this.b) && this.a;
    }

    public void c(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC4314iH) it.next()).a();
            }
            AbstractC0759Jm0.f("ForceCloseDeferrableSurface");
        }
    }
}
