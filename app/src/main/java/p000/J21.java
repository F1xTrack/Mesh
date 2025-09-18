package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class J21 extends C6994v9 {

    /* renamed from: m */
    public final Socket f5288m;

    public J21(Socket socket) {
        this.f5288m = socket;
    }

    @Override // p000.C6994v9
    /* renamed from: k */
    public final void mo1159k() throws IOException {
        Socket socket = this.f5288m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!JI1.m4275c(e)) {
                throw e;
            }
            AbstractC11608wx0.f45176a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC11608wx0.f45176a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    /* renamed from: l */
    public final IOException m4143l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
