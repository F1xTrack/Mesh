package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* renamed from: d12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9060d12 {
    /* renamed from: a */
    public static boolean m17464a(String str, byte[] bArr) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable c9461g90 = new C9461g90(0, bArr.length - 1, 1);
        if (!(c9461g90 instanceof Collection) || !((Collection) c9461g90).isEmpty()) {
            Iterator it = c9461g90.iterator();
            while (((C9333f90) it).f27092c) {
                int iM18193a = ((C9333f90) it).m18193a();
                if (((byte) str.charAt(iM18193a)) != bArr[iM18193a]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final InterfaceC6976us m17465b(InterfaceC7402Bs0 interfaceC7402Bs0, C0055As c0055As) {
        O90.m5968f(interfaceC7402Bs0, "<this>");
        O90.m5968f(c0055As, "classId");
        InterfaceC0873Ns interfaceC0873NsM17466c = m17466c(interfaceC7402Bs0, c0055As);
        if (interfaceC0873NsM17466c instanceof InterfaceC6976us) {
            return (InterfaceC6976us) interfaceC0873NsM17466c;
        }
        return null;
    }

    /* renamed from: c */
    public static final InterfaceC0873Ns m17466c(InterfaceC7402Bs0 interfaceC7402Bs0, C0055As c0055As) {
        O90.m5968f(interfaceC7402Bs0, "<this>");
        O90.m5968f(c0055As, "classId");
        if (interfaceC7402Bs0.mo898q(AbstractC11130tB1.f42918a) != null) {
            throw new ClassCastException();
        }
        C0664KX c0664kxM363g = c0055As.m363g();
        O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
        InterfaceC7780Iz0 interfaceC7780Iz0Mo895C0 = interfaceC7402Bs0.mo895C0(c0664kxM363g);
        List listM5391e = c0055As.m364h().f6146a.m5391e();
        C8576Yh0 c8576Yh0 = ((C8524Xh0) interfaceC7780Iz0Mo895C0).f13926h;
        Object objM25955A = AbstractC7167xu.m25955A(listM5391e);
        O90.m5967e(objM25955A, "first(...)");
        InterfaceC0873Ns interfaceC0873NsMo1770c = c8576Yh0.mo1770c((C8340Tt0) objM25955A, EnumC11985zv0.f47100g);
        if (interfaceC0873NsMo1770c == null) {
            return null;
        }
        for (C8340Tt0 c8340Tt0 : listM5391e.subList(1, listM5391e.size())) {
            if (!(interfaceC0873NsMo1770c instanceof InterfaceC6976us)) {
                return null;
            }
            InterfaceC10059kq0 interfaceC10059kq0Mo1486I0 = ((InterfaceC6976us) interfaceC0873NsMo1770c).mo1486I0();
            O90.m5965c(c8340Tt0);
            InterfaceC0873Ns interfaceC0873NsMo1770c2 = interfaceC10059kq0Mo1486I0.mo1770c(c8340Tt0, EnumC11985zv0.f47100g);
            interfaceC0873NsMo1770c = interfaceC0873NsMo1770c2 instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1770c2 : null;
            if (interfaceC0873NsMo1770c == null) {
                return null;
            }
        }
        return interfaceC0873NsMo1770c;
    }

    /* renamed from: d */
    public static final InterfaceC6976us m17467d(InterfaceC7402Bs0 interfaceC7402Bs0, C0055As c0055As, T71 t71) {
        O90.m5968f(interfaceC7402Bs0, "<this>");
        O90.m5968f(c0055As, "classId");
        O90.m5968f(t71, "notFoundClasses");
        InterfaceC6976us interfaceC6976usM17465b = m17465b(interfaceC7402Bs0, c0055As);
        return interfaceC6976usM17465b != null ? interfaceC6976usM17465b : t71.m7556B(c0055As, AbstractC9639hY0.m18835n(AbstractC9639hY0.m18833l(AbstractC9639hY0.m18832k(c0055As, C7267zU.f46846a), C6228jI.f35047y)));
    }

    /* renamed from: e */
    public static String m17468e(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) (b & 65535));
        }
        String string = sb.toString();
        O90.m5967e(string, "str.toString()");
        return string;
    }

    /* renamed from: f */
    public static void m17469f(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    /* renamed from: g */
    public static Pair m17470g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i3 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new Pair(Integer.valueOf((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8)), Integer.valueOf(((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    /* renamed from: h */
    public static Pair m17471h(InputStream inputStream) throws IOException {
        m17469f(inputStream);
        if ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) != 47) {
            return null;
        }
        int i = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2 = inputStream.read();
        return new Pair(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 2) | ((i2 & 192) >> 6)) + 1));
    }
}
