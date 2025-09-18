package p000;

import java.util.Iterator;

/* renamed from: bM */
/* loaded from: classes2.dex */
public final class C1780bM implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f16985a = 0;

    /* renamed from: b */
    public final Iterator f16986b;

    /* renamed from: c */
    public int f16987c;

    public C1780bM(Iterator it) {
        O90.m5968f(it, "iterator");
        this.f16986b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f16985a) {
            case 0:
                break;
            default:
                return this.f16986b.hasNext();
        }
        while (true) {
            int i = this.f16987c;
            it = this.f16986b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f16987c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f16985a) {
            case 0:
                break;
            default:
                int i = this.f16987c;
                this.f16987c = i + 1;
                if (i >= 0) {
                    return new C9843j80(i, this.f16986b.next());
                }
                AbstractC7230yu.m26279j();
                throw null;
        }
        while (true) {
            int i2 = this.f16987c;
            it = this.f16986b;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f16987c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16985a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1780bM(C1842cM c1842cM) {
        this.f16986b = c1842cM.f17448a.iterator();
        this.f16987c = c1842cM.f17449b;
    }
}
