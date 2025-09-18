package defpackage;

/* renamed from: Dj */
/* loaded from: classes2.dex */
public abstract class AbstractC0281Dj {
    public static final C6344or a = new C6344or(-1, null, null, 0);
    public static final int b = KT1.c(32, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = KT1.c(10000, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final C8139yG d = new C8139yG("BUFFERED");
    public static final C8139yG e = new C8139yG("SHOULD_BUFFER");
    public static final C8139yG f = new C8139yG("S_RESUMING_BY_RCV");
    public static final C8139yG g = new C8139yG("RESUMING_BY_EB");
    public static final C8139yG h = new C8139yG("POISONED");
    public static final C8139yG i = new C8139yG("DONE_RCV");
    public static final C8139yG j = new C8139yG("INTERRUPTED_SEND");
    public static final C8139yG k = new C8139yG("INTERRUPTED_RCV");
    public static final C8139yG l = new C8139yG("CHANNEL_CLOSED");
    public static final C8139yG m = new C8139yG("SUSPEND");
    public static final C8139yG n = new C8139yG("SUSPEND_NO_WAITER");
    public static final C8139yG o = new C8139yG("FAILED");
    public static final C8139yG p = new C8139yG("NO_RECEIVE_RESULT");
    public static final C8139yG q = new C8139yG("CLOSE_HANDLER_CLOSED");
    public static final C8139yG r = new C8139yG("CLOSE_HANDLER_INVOKED");
    public static final C8139yG s = new C8139yG("NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0611Hp interfaceC0611Hp, Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        C8139yG c8139yGA = interfaceC0611Hp.a(obj, interfaceC6481pZ);
        if (c8139yGA == null) {
            return false;
        }
        interfaceC0611Hp.i(c8139yGA);
        return true;
    }
}
