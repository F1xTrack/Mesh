package defpackage;

import java.io.Serializable;
import kotlin.Lazy;

/* renamed from: Eg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0352Eg1 implements Lazy, Serializable {
    public InterfaceC5908mZ a;
    public Object b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.b == C7304tt.g) {
            InterfaceC5908mZ interfaceC5908mZ = this.a;
            O90.c(interfaceC5908mZ);
            this.b = interfaceC5908mZ.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != C7304tt.g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
