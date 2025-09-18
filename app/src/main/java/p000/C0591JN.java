package p000;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* renamed from: JN */
/* loaded from: classes2.dex */
public final class C0591JN implements InterfaceC0125Bz, Serializable {

    /* renamed from: a */
    public static final C0591JN f5499a = new C0591JN();

    @Override // p000.InterfaceC0125Bz
    /* renamed from: c */
    public final InterfaceC0125Bz mo935c(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        return this;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: f */
    public final InterfaceC0125Bz mo936f(InterfaceC0125Bz interfaceC0125Bz) {
        O90.m5968f(interfaceC0125Bz, "context");
        return interfaceC0125Bz;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: g */
    public final InterfaceC7298zz mo937g(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: j */
    public final Object mo938j(Object obj, Function2 function2) {
        return obj;
    }
}
