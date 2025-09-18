package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* renamed from: wU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7803wU1 {
    public static InterfaceC8464zz a(InterfaceC8464zz interfaceC8464zz, InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        if (O90.a(interfaceC8464zz.getKey(), interfaceC0095Az)) {
            return interfaceC8464zz;
        }
        return null;
    }

    public static InterfaceC0173Bz b(InterfaceC8464zz interfaceC8464zz, InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        return O90.a(interfaceC8464zz.getKey(), interfaceC0095Az) ? JN.a : interfaceC8464zz;
    }

    public static InterfaceC0173Bz c(InterfaceC8464zz interfaceC8464zz, InterfaceC0173Bz interfaceC0173Bz) {
        O90.f(interfaceC0173Bz, "context");
        return interfaceC0173Bz == JN.a ? interfaceC8464zz : (InterfaceC0173Bz) interfaceC0173Bz.j(interfaceC8464zz, C8087y.i);
    }

    public static final String d(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = inputStreamReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
