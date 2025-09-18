package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* renamed from: d12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3312d12 {
    public static boolean a(String str, byte[] bArr) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable c3909g90 = new C3909g90(0, bArr.length - 1, 1);
        if (!(c3909g90 instanceof Collection) || !((Collection) c3909g90).isEmpty()) {
            Iterator it = c3909g90.iterator();
            while (((C3718f90) it).c) {
                int iA = ((C3718f90) it).a();
                if (((byte) str.charAt(iA)) != bArr[iA]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final InterfaceC7492us b(InterfaceC0153Bs0 interfaceC0153Bs0, C0074As c0074As) {
        O90.f(interfaceC0153Bs0, "<this>");
        O90.f(c0074As, "classId");
        InterfaceC1087Ns interfaceC1087NsC = c(interfaceC0153Bs0, c0074As);
        if (interfaceC1087NsC instanceof InterfaceC7492us) {
            return (InterfaceC7492us) interfaceC1087NsC;
        }
        return null;
    }

    public static final InterfaceC1087Ns c(InterfaceC0153Bs0 interfaceC0153Bs0, C0074As c0074As) {
        O90.f(interfaceC0153Bs0, "<this>");
        O90.f(c0074As, "classId");
        if (interfaceC0153Bs0.q(AbstractC7174tB1.a) != null) {
            throw new ClassCastException();
        }
        KX kxG = c0074As.g();
        O90.e(kxG, "getPackageFqName(...)");
        InterfaceC0720Iz0 interfaceC0720Iz0C0 = interfaceC0153Bs0.C0(kxG);
        List listE = c0074As.h().a.e();
        C1913Yh0 c1913Yh0 = ((C1835Xh0) interfaceC0720Iz0C0).h;
        Object objA = AbstractC8069xu.A(listE);
        O90.e(objA, "first(...)");
        InterfaceC1087Ns interfaceC1087NsC = c1913Yh0.c((C1559Tt0) objA, EnumC8453zv0.g);
        if (interfaceC1087NsC == null) {
            return null;
        }
        for (C1559Tt0 c1559Tt0 : listE.subList(1, listE.size())) {
            if (!(interfaceC1087NsC instanceof InterfaceC7492us)) {
                return null;
            }
            InterfaceC5578kq0 interfaceC5578kq0I0 = ((InterfaceC7492us) interfaceC1087NsC).I0();
            O90.c(c1559Tt0);
            InterfaceC1087Ns interfaceC1087NsC2 = interfaceC5578kq0I0.c(c1559Tt0, EnumC8453zv0.g);
            interfaceC1087NsC = interfaceC1087NsC2 instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsC2 : null;
            if (interfaceC1087NsC == null) {
                return null;
            }
        }
        return interfaceC1087NsC;
    }

    public static final InterfaceC7492us d(InterfaceC0153Bs0 interfaceC0153Bs0, C0074As c0074As, T71 t71) {
        O90.f(interfaceC0153Bs0, "<this>");
        O90.f(c0074As, "classId");
        O90.f(t71, "notFoundClasses");
        InterfaceC7492us interfaceC7492usB = b(interfaceC0153Bs0, c0074As);
        return interfaceC7492usB != null ? interfaceC7492usB : t71.B(c0074As, AbstractC4175hY0.n(AbstractC4175hY0.l(AbstractC4175hY0.k(c0074As, C8371zU.a), C5284jI.y)));
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) (b & 65535));
        }
        String string = sb.toString();
        O90.e(string, "str.toString()");
        return string;
    }

    public static void f(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i3 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new Pair(Integer.valueOf((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8)), Integer.valueOf(((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public static Pair h(InputStream inputStream) throws IOException {
        f(inputStream);
        if ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) != 47) {
            return null;
        }
        int i = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2 = inputStream.read();
        return new Pair(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 2) | ((i2 & 192) >> 6)) + 1));
    }
}
