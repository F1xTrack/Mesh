package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class JI1 {

    /* renamed from: a */
    public static final C7190yG f5445a = new C7190yG("NONE");

    /* renamed from: b */
    public static final C7190yG f5446b = new C7190yG("PENDING");

    /* renamed from: a */
    public static final C11790yN0 m4273a(Z11 z11) {
        O90.m5968f(z11, "<this>");
        return new C11790yN0(z11);
    }

    /* renamed from: b */
    public static final C11917zN0 m4274b(U21 u21) {
        O90.m5968f(u21, "<this>");
        return new C11917zN0(u21);
    }

    /* renamed from: c */
    public static final boolean m4275c(AssertionError assertionError) {
        Logger logger = AbstractC11608wx0.f45176a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC11374v51.m25351p(message, "getsockname failed", false) : false;
    }

    /* renamed from: d */
    public static final C6868t9 m4276d(OutputStream outputStream) {
        Logger logger = AbstractC11608wx0.f45176a;
        return new C6868t9(outputStream, 1, new C7523Ea1());
    }

    /* renamed from: e */
    public static final C6868t9 m4277e(Socket socket) throws IOException {
        Logger logger = AbstractC11608wx0.f45176a;
        J21 j21 = new J21(socket);
        OutputStream outputStream = socket.getOutputStream();
        O90.m5967e(outputStream, "getOutputStream(...)");
        return new C6868t9(j21, 0, new C6868t9(outputStream, 1, j21));
    }

    /* renamed from: f */
    public static C6868t9 m4278f(File file) {
        Logger logger = AbstractC11608wx0.f45176a;
        O90.m5968f(file, "<this>");
        return m4276d(new FileOutputStream(file, false));
    }

    /* renamed from: g */
    public static final C6931u9 m4279g(InputStream inputStream) {
        Logger logger = AbstractC11608wx0.f45176a;
        O90.m5968f(inputStream, "<this>");
        return new C6931u9(inputStream, new C7523Ea1());
    }

    /* renamed from: h */
    public static final C6931u9 m4280h(Socket socket) throws IOException {
        Logger logger = AbstractC11608wx0.f45176a;
        J21 j21 = new J21(socket);
        InputStream inputStream = socket.getInputStream();
        O90.m5967e(inputStream, "getInputStream(...)");
        return new C6931u9(j21, new C6931u9(inputStream, j21));
    }
}
