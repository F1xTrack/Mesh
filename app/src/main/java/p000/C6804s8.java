package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: s8 */
/* loaded from: classes.dex */
public final class C6804s8 implements Iterator {

    /* renamed from: a */
    public int f42272a;

    /* renamed from: b */
    public int f42273b;

    /* renamed from: c */
    public boolean f42274c;

    /* renamed from: d */
    public final /* synthetic */ int f42275d;

    /* renamed from: e */
    public final /* synthetic */ Object f42276e;

    public C6804s8(int i) {
        this.f42272a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42273b < this.f42272a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM4827i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f42273b;
        switch (this.f42275d) {
            case 0:
                objM4827i = ((C7119x8) this.f42276e).m4827i(i);
                break;
            case 1:
                objM4827i = ((C7119x8) this.f42276e).m4831m(i);
                break;
            default:
                objM4827i = ((C0135C8) this.f42276e).f1222b[i];
                break;
        }
        this.f42273b++;
        this.f42274c = true;
        return objM4827i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f42274c) {
            throw new IllegalStateException();
        }
        int i = this.f42273b - 1;
        this.f42273b = i;
        switch (this.f42275d) {
            case 0:
                ((C7119x8) this.f42276e).mo4829k(i);
                break;
            case 1:
                ((C7119x8) this.f42276e).mo4829k(i);
                break;
            default:
                ((C0135C8) this.f42276e).m992k(i);
                break;
        }
        this.f42272a--;
        this.f42274c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6804s8(C7119x8 c7119x8, int i) {
        this(c7119x8.f6450c);
        this.f42275d = i;
        switch (i) {
            case 1:
                this.f42276e = c7119x8;
                this(c7119x8.f6450c);
                break;
            default:
                this.f42276e = c7119x8;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6804s8(C0135C8 c0135c8) {
        this(c0135c8.f1223c);
        this.f42275d = 2;
        this.f42276e = c0135c8;
    }
}
