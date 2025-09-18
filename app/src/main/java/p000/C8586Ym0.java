package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Ym0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8586Ym0 extends AbstractC8768an0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: e */
    public final /* synthetic */ int f14514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8586Ym0(C8896bn0 c8896bn0, int i) {
        super(c8896bn0);
        this.f14514e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14514e) {
            case 0:
                m9813a();
                int i = this.f15692a;
                C8896bn0 c8896bn0 = (C8896bn0) this.f15695d;
                if (i >= c8896bn0.f17150f) {
                    throw new NoSuchElementException();
                }
                this.f15692a = i + 1;
                this.f15693b = i;
                C8638Zm0 c8638Zm0 = new C8638Zm0(c8896bn0, i);
                m9816d();
                return c8638Zm0;
            case 1:
                m9813a();
                int i2 = this.f15692a;
                C8896bn0 c8896bn02 = (C8896bn0) this.f15695d;
                if (i2 >= c8896bn02.f17150f) {
                    throw new NoSuchElementException();
                }
                this.f15692a = i2 + 1;
                this.f15693b = i2;
                Object obj = c8896bn02.f17145a[i2];
                m9816d();
                return obj;
            default:
                m9813a();
                int i3 = this.f15692a;
                C8896bn0 c8896bn03 = (C8896bn0) this.f15695d;
                if (i3 >= c8896bn03.f17150f) {
                    throw new NoSuchElementException();
                }
                this.f15692a = i3 + 1;
                this.f15693b = i3;
                Object[] objArr = c8896bn03.f17146b;
                O90.m5965c(objArr);
                Object obj2 = objArr[this.f15693b];
                m9816d();
                return obj2;
        }
    }
}
