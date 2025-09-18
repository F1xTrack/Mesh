package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class IP1 {
    protected int zza;

    public static void b(Iterable iterable, List list) {
        Charset charset = BS1.a;
        iterable.getClass();
        if (iterable instanceof InterfaceC5892mT1) {
            List listM95zza = ((InterfaceC5892mT1) iterable).m95zza();
            InterfaceC5892mT1 interfaceC5892mT1 = (InterfaceC5892mT1) list;
            int size = list.size();
            for (Object obj : listM95zza) {
                if (obj == null) {
                    String strG = AbstractC8235ym.g(interfaceC5892mT1.size() - size, "Element at index ", " is null.");
                    for (int size2 = interfaceC5892mT1.size() - 1; size2 >= size; size2--) {
                        interfaceC5892mT1.remove(size2);
                    }
                    throw new NullPointerException(strG);
                }
                if (obj instanceof JQ1) {
                    interfaceC5892mT1.m96zza();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    JQ1.h(bArr, 0, bArr.length);
                    interfaceC5892mT1.m96zza();
                } else {
                    interfaceC5892mT1.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof HU1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof C2147aV1) {
                C2147aV1 c2147aV1 = (C2147aV1) list;
                int i = ((C2147aV1) list).c + size3;
                Object[] objArr = c2147aV1.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        c2147aV1.b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c2147aV1.b = Arrays.copyOf(c2147aV1.b, length);
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    AbstractC6271oS1.b(size4, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i2 = 0; i2 < size5; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                AbstractC6271oS1.b(size4, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public abstract int a(InterfaceC3404dV1 interfaceC3404dV1);

    public final byte[] c() {
        try {
            int iA = ((AbstractC6843rS1) this).a(null);
            byte[] bArr = new byte[iA];
            C3964gR1 c3964gR1 = new C3964gR1(bArr, iA);
            AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) this;
            TU1 tu1 = TU1.c;
            tu1.getClass();
            InterfaceC3404dV1 interfaceC3404dV1A = tu1.a(abstractC6843rS1.getClass());
            C6446pN0 c6446pN0 = c3964gR1.b;
            if (c6446pN0 == null) {
                c6446pN0 = new C6446pN0(c3964gR1);
            }
            interfaceC3404dV1A.g(abstractC6843rS1, c6446pN0);
            if (c3964gR1.k() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC8235ym.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
