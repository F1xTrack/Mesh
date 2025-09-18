package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class J21 extends C7548v9 {
    public final Socket m;

    public J21(Socket socket) {
        this.m = socket;
    }

    @Override // defpackage.C7548v9
    public final void k() throws IOException {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!JI1.c(e)) {
                throw e;
            }
            AbstractC7889wx0.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC7889wx0.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
