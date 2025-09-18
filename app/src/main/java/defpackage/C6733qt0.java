package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: qt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6733qt0 implements InterfaceC7446uc1 {
    public final List b;

    public C6733qt0(InterfaceC7446uc1... interfaceC7446uc1Arr) {
        if (interfaceC7446uc1Arr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = Arrays.asList(interfaceC7446uc1Arr);
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC7446uc1) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.InterfaceC7446uc1
    public final InterfaceC5506kS0 b(C7903x10 c7903x10, InterfaceC5506kS0 interfaceC5506kS0, int i, int i2) {
        Iterator it = this.b.iterator();
        InterfaceC5506kS0 interfaceC5506kS02 = interfaceC5506kS0;
        while (it.hasNext()) {
            InterfaceC5506kS0 interfaceC5506kS0B = ((InterfaceC7446uc1) it.next()).b(c7903x10, interfaceC5506kS02, i, i2);
            if (interfaceC5506kS02 != null && !interfaceC5506kS02.equals(interfaceC5506kS0) && !interfaceC5506kS02.equals(interfaceC5506kS0B)) {
                interfaceC5506kS02.recycle();
            }
            interfaceC5506kS02 = interfaceC5506kS0B;
        }
        return interfaceC5506kS02;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (obj instanceof C6733qt0) {
            return this.b.equals(((C6733qt0) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.b.hashCode();
    }
}
