package defpackage;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: Jl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0756Jl0 implements InterfaceC6712qm0 {
    @Override // defpackage.InterfaceC6712qm0
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C6987sD c6987sD = AbstractC0667Ih1.a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC7281tl0.c("Unable to load composition.", th);
    }
}
