package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Ym0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1928Ym0 extends AbstractC2200an0 implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1928Ym0(C2391bn0 c2391bn0, int i) {
        super(c2391bn0);
        this.e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                a();
                int i = this.a;
                C2391bn0 c2391bn0 = (C2391bn0) this.d;
                if (i >= c2391bn0.f) {
                    throw new NoSuchElementException();
                }
                this.a = i + 1;
                this.b = i;
                C2006Zm0 c2006Zm0 = new C2006Zm0(c2391bn0, i);
                d();
                return c2006Zm0;
            case 1:
                a();
                int i2 = this.a;
                C2391bn0 c2391bn02 = (C2391bn0) this.d;
                if (i2 >= c2391bn02.f) {
                    throw new NoSuchElementException();
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = c2391bn02.a[i2];
                d();
                return obj;
            default:
                a();
                int i3 = this.a;
                C2391bn0 c2391bn03 = (C2391bn0) this.d;
                if (i3 >= c2391bn03.f) {
                    throw new NoSuchElementException();
                }
                this.a = i3 + 1;
                this.b = i3;
                Object[] objArr = c2391bn03.b;
                O90.c(objArr);
                Object obj2 = objArr[this.b];
                d();
                return obj2;
        }
    }
}
