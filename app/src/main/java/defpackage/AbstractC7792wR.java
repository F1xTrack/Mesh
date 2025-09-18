package defpackage;

import java.util.HashMap;

/* renamed from: wR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7792wR {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static InterfaceC0761Jn a(C0887Ld c0887Ld) {
        InterfaceC0761Jn interfaceC0761Jn;
        synchronized (a) {
            interfaceC0761Jn = (InterfaceC0761Jn) b.get(c0887Ld);
        }
        return interfaceC0761Jn == null ? InterfaceC0761Jn.a : interfaceC0761Jn;
    }
}
