package p000;

/* renamed from: Dj */
/* loaded from: classes2.dex */
public abstract class AbstractC0235Dj {

    /* renamed from: a */
    public static final C6578or f2187a = new C6578or(-1, null, null, 0);

    /* renamed from: b */
    public static final int f2188b = KT1.m4651c(32, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c */
    public static final int f2189c = KT1.m4651c(10000, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d */
    public static final C7190yG f2190d = new C7190yG("BUFFERED");

    /* renamed from: e */
    public static final C7190yG f2191e = new C7190yG("SHOULD_BUFFER");

    /* renamed from: f */
    public static final C7190yG f2192f = new C7190yG("S_RESUMING_BY_RCV");

    /* renamed from: g */
    public static final C7190yG f2193g = new C7190yG("RESUMING_BY_EB");

    /* renamed from: h */
    public static final C7190yG f2194h = new C7190yG("POISONED");

    /* renamed from: i */
    public static final C7190yG f2195i = new C7190yG("DONE_RCV");

    /* renamed from: j */
    public static final C7190yG f2196j = new C7190yG("INTERRUPTED_SEND");

    /* renamed from: k */
    public static final C7190yG f2197k = new C7190yG("INTERRUPTED_RCV");

    /* renamed from: l */
    public static final C7190yG f2198l = new C7190yG("CHANNEL_CLOSED");

    /* renamed from: m */
    public static final C7190yG f2199m = new C7190yG("SUSPEND");

    /* renamed from: n */
    public static final C7190yG f2200n = new C7190yG("SUSPEND_NO_WAITER");

    /* renamed from: o */
    public static final C7190yG f2201o = new C7190yG("FAILED");

    /* renamed from: p */
    public static final C7190yG f2202p = new C7190yG("NO_RECEIVE_RESULT");

    /* renamed from: q */
    public static final C7190yG f2203q = new C7190yG("CLOSE_HANDLER_CLOSED");

    /* renamed from: r */
    public static final C7190yG f2204r = new C7190yG("CLOSE_HANDLER_INVOKED");

    /* renamed from: s */
    public static final C7190yG f2205s = new C7190yG("NO_CLOSE_CAUSE");

    /* renamed from: a */
    public static final boolean m1857a(InterfaceC0493Hp interfaceC0493Hp, Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        C7190yG c7190yGMo3596a = interfaceC0493Hp.mo3596a(obj, interfaceC6625pZ);
        if (c7190yGMo3596a == null) {
            return false;
        }
        interfaceC0493Hp.mo3598i(c7190yGMo3596a);
        return true;
    }
}
