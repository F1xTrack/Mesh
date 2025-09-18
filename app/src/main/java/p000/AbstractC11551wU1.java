package p000;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* renamed from: wU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11551wU1 {
    /* renamed from: a */
    public static InterfaceC7298zz m25637a(InterfaceC7298zz interfaceC7298zz, InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        if (O90.m5963a(interfaceC7298zz.getKey(), interfaceC0062Az)) {
            return interfaceC7298zz;
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC0125Bz m25638b(InterfaceC7298zz interfaceC7298zz, InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        return O90.m5963a(interfaceC7298zz.getKey(), interfaceC0062Az) ? C0591JN.f5499a : interfaceC7298zz;
    }

    /* renamed from: c */
    public static InterfaceC0125Bz m25639c(InterfaceC7298zz interfaceC7298zz, InterfaceC0125Bz interfaceC0125Bz) {
        O90.m5968f(interfaceC0125Bz, "context");
        return interfaceC0125Bz == C0591JN.f5499a ? interfaceC7298zz : (InterfaceC0125Bz) interfaceC0125Bz.mo938j(interfaceC7298zz, C7173y.f45979i);
    }

    /* renamed from: d */
    public static final String m25640d(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = inputStreamReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
