package p000;

import java.util.HashMap;

/* renamed from: wR */
/* loaded from: classes.dex */
public abstract class AbstractC7075wR {

    /* renamed from: a */
    public static final Object f44864a = new Object();

    /* renamed from: b */
    public static final HashMap f44865b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0617Jn m25617a(C0732Ld c0732Ld) {
        InterfaceC0617Jn interfaceC0617Jn;
        synchronized (f44864a) {
            interfaceC0617Jn = (InterfaceC0617Jn) f44865b.get(c0732Ld);
        }
        return interfaceC0617Jn == null ? InterfaceC0617Jn.f5693a : interfaceC0617Jn;
    }
}
