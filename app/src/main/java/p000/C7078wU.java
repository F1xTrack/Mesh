package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: wU */
/* loaded from: classes2.dex */
public final class C7078wU implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f44906a;

    /* renamed from: b */
    public final Iterator f44907b;

    /* renamed from: c */
    public int f44908c;

    /* renamed from: d */
    public Object f44909d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9127dY0 f44910e;

    public C7078wU(C7141xU c7141xU) {
        this.f44906a = 0;
        this.f44910e = c7141xU;
        this.f44907b = c7141xU.f45651a.iterator();
        this.f44908c = -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nZ] */
    /* renamed from: a */
    public void m25634a() {
        Object next;
        C7141xU c7141xU;
        do {
            Iterator it = this.f44907b;
            if (!it.hasNext()) {
                this.f44908c = 0;
                return;
            } else {
                next = it.next();
                c7141xU = (C7141xU) this.f44910e;
            }
        } while (((Boolean) c7141xU.f45653c.invoke(next)).booleanValue() != c7141xU.f45652b);
        this.f44909d = next;
        this.f44908c = 1;
    }

    /* renamed from: b */
    public void m25635b() {
        Iterator it = this.f44907b;
        if (it.hasNext()) {
            Object next = it.next();
            ((C0764M8) this.f44910e).getClass();
            if (((Boolean) XS0.f13766F.invoke(next)).booleanValue()) {
                this.f44908c = 1;
                this.f44909d = next;
                return;
            }
        }
        this.f44908c = 0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, nZ] */
    /* renamed from: c */
    public boolean m25636c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f44909d;
        if (it2 != null && it2.hasNext()) {
            this.f44908c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f44907b;
            if (!it3.hasNext()) {
                this.f44908c = 2;
                this.f44909d = null;
                return false;
            }
            Object next = it3.next();
            C1790bW c1790bW = (C1790bW) this.f44910e;
            it = (Iterator) c1790bW.f17055c.invoke(c1790bW.f17054b.invoke(next));
        } while (!it.hasNext());
        this.f44909d = it;
        this.f44908c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44906a) {
            case 0:
                if (this.f44908c == -1) {
                    m25634a();
                }
                return this.f44908c == 1;
            case 1:
                int i = this.f44908c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return m25636c();
            default:
                if (this.f44908c == -1) {
                    m25635b();
                }
                return this.f44908c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f44906a) {
            case 0:
                if (this.f44908c == -1) {
                    m25634a();
                }
                if (this.f44908c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f44909d;
                this.f44909d = null;
                this.f44908c = -1;
                return obj;
            case 1:
                int i = this.f44908c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !m25636c()) {
                    throw new NoSuchElementException();
                }
                this.f44908c = 0;
                Iterator it = (Iterator) this.f44909d;
                O90.m5965c(it);
                return it.next();
            default:
                if (this.f44908c == -1) {
                    m25635b();
                }
                if (this.f44908c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f44909d;
                this.f44909d = null;
                this.f44908c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44906a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7078wU(C1790bW c1790bW) {
        this.f44906a = 1;
        this.f44910e = c1790bW;
        this.f44907b = c1790bW.f17053a.iterator();
    }

    public C7078wU(C0764M8 c0764m8) {
        this.f44906a = 2;
        this.f44910e = c0764m8;
        this.f44907b = ((InterfaceC9127dY0) c0764m8.f6999b).iterator();
        this.f44908c = -1;
    }
}
