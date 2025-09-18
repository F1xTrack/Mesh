package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class LS0 implements InterfaceC5279jG0 {
    public final Set a;
    public final InterfaceC5279jG0 b;

    public LS0(Set set, InterfaceC5279jG0 interfaceC5279jG0) {
        this.a = set;
        this.b = interfaceC5279jG0;
    }

    @Override // defpackage.InterfaceC5279jG0
    public final void a(C6069nP c6069nP) {
        if (this.a.contains(FC.class)) {
            this.b.a(c6069nP);
            return;
        }
        throw new C7074sg("Attempting to publish an undeclared event " + c6069nP + ".");
    }
}
