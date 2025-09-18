package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ai0 */
/* loaded from: classes.dex */
public final class C2185ai0 extends S0 implements InterfaceC3442di0, RandomAccess {
    public final List b;

    static {
        new C2185ai0();
    }

    public C2185ai0(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.S0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // defpackage.S0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC7549v90
    public final InterfaceC7549v90 e(int i) {
        List list = this.b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C2185ai0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0362Ek) {
            C0362Ek c0362Ek = (C0362Ek) obj;
            c0362Ek.getClass();
            Charset charset = AbstractC7929x90.a;
            if (c0362Ek.size() == 0) {
                str = "";
            } else {
                str = new String(c0362Ek.b, c0362Ek.h(), c0362Ek.size(), charset);
            }
            int iH = c0362Ek.h();
            if (AbstractC7270th1.a.b(c0362Ek.b, iH, c0362Ek.size() + iH) == 0) {
                list.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC7929x90.a);
            C6507ph1 c6507ph1 = AbstractC7270th1.a;
            if (AbstractC7270th1.a.b(bArr, 0, bArr.length) == 0) {
                list.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.InterfaceC3442di0
    public final List n() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.InterfaceC3442di0
    public final InterfaceC3442di0 o() {
        return this.a ? new C6313og1(this) : this;
    }

    @Override // defpackage.InterfaceC3442di0
    public final Object p(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.S0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0362Ek)) {
            return new String((byte[]) objRemove, AbstractC7929x90.a);
        }
        C0362Ek c0362Ek = (C0362Ek) objRemove;
        c0362Ek.getClass();
        Charset charset = AbstractC7929x90.a;
        if (c0362Ek.size() == 0) {
            return "";
        }
        return new String(c0362Ek.b, c0362Ek.h(), c0362Ek.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0362Ek)) {
            return new String((byte[]) obj2, AbstractC7929x90.a);
        }
        C0362Ek c0362Ek = (C0362Ek) obj2;
        c0362Ek.getClass();
        Charset charset = AbstractC7929x90.a;
        if (c0362Ek.size() == 0) {
            return "";
        }
        return new String(c0362Ek.b, c0362Ek.h(), c0362Ek.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.InterfaceC3442di0
    public final void w(C0362Ek c0362Ek) {
        b();
        this.b.add(c0362Ek);
        ((AbstractList) this).modCount++;
    }

    public C2185ai0() {
        super(false);
        this.b = Collections.emptyList();
    }

    @Override // defpackage.S0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof InterfaceC3442di0) {
            collection = ((InterfaceC3442di0) collection).n();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C2185ai0(int i) {
        this(new ArrayList(i));
    }
}
