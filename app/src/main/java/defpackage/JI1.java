package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class JI1 {
    public static final C8139yG a = new C8139yG("NONE");
    public static final C8139yG b = new C8139yG("PENDING");

    public static final C8161yN0 a(Z11 z11) {
        O90.f(z11, "<this>");
        return new C8161yN0(z11);
    }

    public static final C8351zN0 b(U21 u21) {
        O90.f(u21, "<this>");
        return new C8351zN0(u21);
    }

    public static final boolean c(AssertionError assertionError) {
        Logger logger = AbstractC7889wx0.a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC7538v51.p(message, "getsockname failed", false) : false;
    }

    public static final C7166t9 d(OutputStream outputStream) {
        Logger logger = AbstractC7889wx0.a;
        return new C7166t9(outputStream, 1, new C0334Ea1());
    }

    public static final C7166t9 e(Socket socket) throws IOException {
        Logger logger = AbstractC7889wx0.a;
        J21 j21 = new J21(socket);
        OutputStream outputStream = socket.getOutputStream();
        O90.e(outputStream, "getOutputStream(...)");
        return new C7166t9(j21, 0, new C7166t9(outputStream, 1, j21));
    }

    public static C7166t9 f(File file) {
        Logger logger = AbstractC7889wx0.a;
        O90.f(file, "<this>");
        return d(new FileOutputStream(file, false));
    }

    public static final C7357u9 g(InputStream inputStream) {
        Logger logger = AbstractC7889wx0.a;
        O90.f(inputStream, "<this>");
        return new C7357u9(inputStream, new C0334Ea1());
    }

    public static final C7357u9 h(Socket socket) throws IOException {
        Logger logger = AbstractC7889wx0.a;
        J21 j21 = new J21(socket);
        InputStream inputStream = socket.getInputStream();
        O90.e(inputStream, "getInputStream(...)");
        return new C7357u9(j21, new C7357u9(inputStream, j21));
    }
}
