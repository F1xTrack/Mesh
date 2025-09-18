package p000;

import java.io.Serializable;
import kotlin.Lazy;

/* renamed from: Eg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7535Eg1 implements Lazy, Serializable {

    /* renamed from: a */
    public InterfaceC6434mZ f2837a;

    /* renamed from: b */
    public Object f2838b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.f2838b == C6914tt.f43396g) {
            InterfaceC6434mZ interfaceC6434mZ = this.f2837a;
            O90.m5965c(interfaceC6434mZ);
            this.f2838b = interfaceC6434mZ.invoke();
            this.f2837a = null;
        }
        return this.f2838b;
    }

    public final String toString() {
        return this.f2838b != C6914tt.f43396g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
