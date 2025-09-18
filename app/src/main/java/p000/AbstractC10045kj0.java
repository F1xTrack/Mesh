package p000;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: kj0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10045kj0 implements Iterator {

    /* renamed from: b */
    public int f36640b;

    /* renamed from: c */
    public Map.Entry f36641c;

    /* renamed from: e */
    public final /* synthetic */ AbstractMap f36643e;

    /* renamed from: a */
    public final /* synthetic */ int f36639a = 0;

    /* renamed from: d */
    public Map.Entry f36642d = null;

    public AbstractC10045kj0(C10301mj0 c10301mj0) {
        this.f36643e = c10301mj0;
        this.f36641c = (C10173lj0) ((C10173lj0) c10301mj0.f37854g).f37271i;
        this.f36640b = c10301mj0.f37852e;
    }

    /* renamed from: a */
    public C10173lj0 m22248a() {
        C10173lj0 c10173lj0 = (C10173lj0) this.f36641c;
        C10301mj0 c10301mj0 = (C10301mj0) this.f36643e;
        if (c10173lj0 == ((C10173lj0) c10301mj0.f37854g)) {
            throw new NoSuchElementException();
        }
        if (c10301mj0.f37852e != this.f36640b) {
            throw new ConcurrentModificationException();
        }
        this.f36641c = (C10173lj0) c10173lj0.f37271i;
        this.f36642d = c10173lj0;
        return c10173lj0;
    }

    /* renamed from: b */
    public C10173lj0 m22249b() {
        C10173lj0 c10173lj0 = (C10173lj0) this.f36641c;
        C10301mj0 c10301mj0 = (C10301mj0) this.f36643e;
        if (c10173lj0 == ((C10173lj0) c10301mj0.f37854g)) {
            throw new NoSuchElementException();
        }
        if (c10301mj0.f37852e != this.f36640b) {
            throw new ConcurrentModificationException();
        }
        this.f36641c = (C10173lj0) c10173lj0.f37271i;
        this.f36642d = c10173lj0;
        return c10173lj0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f36639a) {
            case 0:
                if (((C10173lj0) this.f36641c) != ((C10173lj0) ((C10301mj0) this.f36643e).f37854g)) {
                }
                break;
            default:
                if (((C10173lj0) this.f36641c) != ((C10173lj0) ((C10301mj0) this.f36643e).f37854g)) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f36639a) {
            case 0:
                return m22248a();
            default:
                return m22249b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f36639a) {
            case 0:
                C10173lj0 c10173lj0 = (C10173lj0) this.f36642d;
                if (c10173lj0 == null) {
                    throw new IllegalStateException();
                }
                C10301mj0 c10301mj0 = (C10301mj0) this.f36643e;
                c10301mj0.m22928e(c10173lj0, true);
                this.f36642d = null;
                this.f36640b = c10301mj0.f37852e;
                return;
            default:
                C10173lj0 c10173lj02 = (C10173lj0) this.f36642d;
                if (c10173lj02 == null) {
                    throw new IllegalStateException();
                }
                C10301mj0 c10301mj02 = (C10301mj0) this.f36643e;
                c10301mj02.m22929f(c10173lj02, true);
                this.f36642d = null;
                this.f36640b = c10301mj02.f37852e;
                return;
        }
    }

    public AbstractC10045kj0(C10301mj0 c10301mj0, byte b) {
        this.f36643e = c10301mj0;
        this.f36641c = (C10173lj0) ((C10173lj0) c10301mj0.f37854g).f37271i;
        this.f36640b = c10301mj0.f37852e;
    }
}
