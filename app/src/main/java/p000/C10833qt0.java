package p000;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: qt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10833qt0 implements InterfaceC11312uc1 {

    /* renamed from: b */
    public final List f41235b;

    public C10833qt0(InterfaceC11312uc1... interfaceC11312uc1Arr) {
        if (interfaceC11312uc1Arr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f41235b = Arrays.asList(interfaceC11312uc1Arr);
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        Iterator it = this.f41235b.iterator();
        while (it.hasNext()) {
            ((InterfaceC11312uc1) it.next()).mo967a(messageDigest);
        }
    }

    @Override // p000.InterfaceC11312uc1
    /* renamed from: b */
    public final InterfaceC10011kS0 mo8829b(C11617x10 c11617x10, InterfaceC10011kS0 interfaceC10011kS0, int i, int i2) {
        Iterator it = this.f41235b.iterator();
        InterfaceC10011kS0 interfaceC10011kS02 = interfaceC10011kS0;
        while (it.hasNext()) {
            InterfaceC10011kS0 interfaceC10011kS0Mo8829b = ((InterfaceC11312uc1) it.next()).mo8829b(c11617x10, interfaceC10011kS02, i, i2);
            if (interfaceC10011kS02 != null && !interfaceC10011kS02.equals(interfaceC10011kS0) && !interfaceC10011kS02.equals(interfaceC10011kS0Mo8829b)) {
                interfaceC10011kS02.recycle();
            }
            interfaceC10011kS02 = interfaceC10011kS0Mo8829b;
        }
        return interfaceC10011kS02;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (obj instanceof C10833qt0) {
            return this.f41235b.equals(((C10833qt0) obj).f41235b);
        }
        return false;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f41235b.hashCode();
    }
}
