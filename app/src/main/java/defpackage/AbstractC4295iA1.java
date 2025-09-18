package defpackage;

/* renamed from: iA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4295iA1 {
    public static final C8139yG a = new C8139yG("COMPLETING_ALREADY");
    public static final C8139yG b = new C8139yG("COMPLETING_WAITING_CHILDREN");
    public static final C8139yG c = new C8139yG("COMPLETING_RETRY");
    public static final C8139yG d = new C8139yG("TOO_LATE_TO_CANCEL");
    public static final C8139yG e = new C8139yG("SEALED");
    public static final EN f = new EN(false);
    public static final EN g = new EN(true);
    public static Boolean h;

    public static final Object a(Object obj) {
        InterfaceC2268b80 interfaceC2268b80;
        C2458c80 c2458c80 = obj instanceof C2458c80 ? (C2458c80) obj : null;
        return (c2458c80 == null || (interfaceC2268b80 = c2458c80.a) == null) ? obj : interfaceC2268b80;
    }
}
