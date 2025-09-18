package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: u61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11248u61 implements InterfaceC10736q61, Serializable {

    /* renamed from: a */
    public final Object f43525a;

    public C11248u61(Object obj) {
        this.f43525a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11248u61) {
            return AbstractC9984kE1.m22173a(this.f43525a, ((C11248u61) obj).f43525a);
        }
        return false;
    }

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        return this.f43525a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43525a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f43525a + ")";
    }
}
