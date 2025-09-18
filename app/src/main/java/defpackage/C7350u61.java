package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: u61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7350u61 implements InterfaceC6587q61, Serializable {
    public final Object a;

    public C7350u61(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7350u61) {
            return AbstractC5465kE1.a(this.a, ((C7350u61) obj).a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
