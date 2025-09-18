package p000;

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

    /* renamed from: b */
    public static void m3855b(Iterable iterable, List list) {
        Charset charset = BS1.f826a;
        iterable.getClass();
        if (iterable instanceof InterfaceC10270mT1) {
            List listM26689zza = ((InterfaceC10270mT1) iterable).m26689zza();
            InterfaceC10270mT1 interfaceC10270mT1 = (InterfaceC10270mT1) list;
            int size = list.size();
            for (Object obj : listM26689zza) {
                if (obj == null) {
                    String strM26230g = AbstractC7222ym.m26230g(interfaceC10270mT1.size() - size, "Element at index ", " is null.");
                    for (int size2 = interfaceC10270mT1.size() - 1; size2 >= size; size2--) {
                        interfaceC10270mT1.remove(size2);
                    }
                    throw new NullPointerException(strM26230g);
                }
                if (obj instanceof JQ1) {
                    interfaceC10270mT1.m26690zza();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    JQ1.m4318h(bArr, 0, bArr.length);
                    interfaceC10270mT1.m26690zza();
                } else {
                    interfaceC10270mT1.add((String) obj);
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
            } else if (list instanceof C8733aV1) {
                C8733aV1 c8733aV1 = (C8733aV1) list;
                int i = ((C8733aV1) list).f15541c + size3;
                Object[] objArr = c8733aV1.f15540b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        c8733aV1.f15540b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c8733aV1.f15540b = Arrays.copyOf(c8733aV1.f15540b, length);
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    AbstractC10524oS1.m23410b(size4, list);
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
                AbstractC10524oS1.m23410b(size4, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    /* renamed from: a */
    public abstract int mo3856a(InterfaceC9122dV1 interfaceC9122dV1);

    /* renamed from: c */
    public final byte[] m3857c() {
        try {
            int iMo3856a = ((AbstractC10908rS1) this).mo3856a(null);
            byte[] bArr = new byte[iMo3856a];
            C9498gR1 c9498gR1 = new C9498gR1(bArr, iMo3856a);
            AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) this;
            TU1 tu1 = TU1.f11400c;
            tu1.getClass();
            InterfaceC9122dV1 interfaceC9122dV1M7696a = tu1.m7696a(abstractC10908rS1.getClass());
            C10641pN0 c10641pN0 = c9498gR1.f27801b;
            if (c10641pN0 == null) {
                c10641pN0 = new C10641pN0(c9498gR1);
            }
            interfaceC9122dV1M7696a.mo17699g(abstractC10908rS1, c10641pN0);
            if (c9498gR1.m18553k() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC7222ym.m26234k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
