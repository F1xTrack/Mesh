package p000;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: Jl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7804Jl0 implements InterfaceC10819qm0 {
    @Override // p000.InterfaceC10819qm0
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C6809sD c6809sD = AbstractC7745Ih1.f5085a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC11201tl0.m24981c("Unable to load composition.", th);
    }
}
