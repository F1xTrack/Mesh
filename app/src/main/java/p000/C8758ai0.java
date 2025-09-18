package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ai0 */
/* loaded from: classes.dex */
public final class C8758ai0 extends AbstractC1133S0 implements InterfaceC9147di0, RandomAccess {

    /* renamed from: b */
    public final List f15633b;

    static {
        new C8758ai0();
    }

    public C8758ai0(ArrayList arrayList) {
        super(true);
        this.f15633b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m7144b();
        this.f15633b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f15633b.size(), collection);
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7144b();
        this.f15633b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC11381v90
    /* renamed from: e */
    public final InterfaceC11381v90 mo9686e(int i) {
        List list = this.f15633b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C8758ai0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.f15633b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0299Ek) {
            C0299Ek c0299Ek = (C0299Ek) obj;
            c0299Ek.getClass();
            Charset charset = AbstractC11635x90.f45425a;
            if (c0299Ek.size() == 0) {
                str = "";
            } else {
                str = new String(c0299Ek.f2872b, c0299Ek.mo1303h(), c0299Ek.size(), charset);
            }
            int iMo1303h = c0299Ek.mo1303h();
            if (AbstractC11194th1.f43222a.m23838b(c0299Ek.f2872b, iMo1303h, c0299Ek.size() + iMo1303h) == 0) {
                list.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC11635x90.f45425a);
            C10682ph1 c10682ph1 = AbstractC11194th1.f43222a;
            if (AbstractC11194th1.f43222a.m23838b(bArr, 0, bArr.length) == 0) {
                list.set(i, str);
            }
        }
        return str;
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: n */
    public final List mo9785n() {
        return Collections.unmodifiableList(this.f15633b);
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: o */
    public final InterfaceC9147di0 mo9786o() {
        return this.f10523a ? new C10552og1(this) : this;
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: p */
    public final Object mo9787p(int i) {
        return this.f15633b.get(i);
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7144b();
        Object objRemove = this.f15633b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0299Ek)) {
            return new String((byte[]) objRemove, AbstractC11635x90.f45425a);
        }
        C0299Ek c0299Ek = (C0299Ek) objRemove;
        c0299Ek.getClass();
        Charset charset = AbstractC11635x90.f45425a;
        if (c0299Ek.size() == 0) {
            return "";
        }
        return new String(c0299Ek.f2872b, c0299Ek.mo1303h(), c0299Ek.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7144b();
        Object obj2 = this.f15633b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0299Ek)) {
            return new String((byte[]) obj2, AbstractC11635x90.f45425a);
        }
        C0299Ek c0299Ek = (C0299Ek) obj2;
        c0299Ek.getClass();
        Charset charset = AbstractC11635x90.f45425a;
        if (c0299Ek.size() == 0) {
            return "";
        }
        return new String(c0299Ek.f2872b, c0299Ek.mo1303h(), c0299Ek.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15633b.size();
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: w */
    public final void mo9788w(C0299Ek c0299Ek) {
        m7144b();
        this.f15633b.add(c0299Ek);
        ((AbstractList) this).modCount++;
    }

    public C8758ai0() {
        super(false);
        this.f15633b = Collections.emptyList();
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m7144b();
        if (collection instanceof InterfaceC9147di0) {
            collection = ((InterfaceC9147di0) collection).mo9785n();
        }
        boolean zAddAll = this.f15633b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C8758ai0(int i) {
        this(new ArrayList(i));
    }
}
