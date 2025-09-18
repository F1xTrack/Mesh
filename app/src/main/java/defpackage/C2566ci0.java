package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ci0 */
/* loaded from: classes.dex */
public final class C2566ci0 extends T0 implements InterfaceC3823fi0, RandomAccess {
    public final ArrayList b;

    static {
        new C2566ci0(10).a = false;
    }

    public C2566ci0(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // defpackage.T0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC7739w90
    public final InterfaceC7739w90 e(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C2566ci0(arrayList2);
    }

    @Override // defpackage.InterfaceC3823fi0
    public final void f(C0440Fk c0440Fk) {
        b();
        this.b.add(c0440Fk);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0440Fk) {
            C0440Fk c0440Fk = (C0440Fk) obj;
            c0440Fk.getClass();
            Charset charset = AbstractC8309z90.a;
            if (c0440Fk.size() == 0) {
                str = "";
            } else {
                str = new String(c0440Fk.b, c0440Fk.d(), c0440Fk.size(), charset);
            }
            int iD = c0440Fk.d();
            if (AbstractC7461uh1.a.c(c0440Fk.b, iD, c0440Fk.size() + iD) == 0) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC8309z90.a);
            C6698qh1 c6698qh1 = AbstractC7461uh1.a;
            if (AbstractC7461uh1.a.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.InterfaceC3823fi0
    public final List n() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.InterfaceC3823fi0
    public final InterfaceC3823fi0 o() {
        return this.a ? new C6695qg1(this) : this;
    }

    @Override // defpackage.InterfaceC3823fi0
    public final Object p(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0440Fk)) {
            return new String((byte[]) objRemove, AbstractC8309z90.a);
        }
        C0440Fk c0440Fk = (C0440Fk) objRemove;
        c0440Fk.getClass();
        Charset charset = AbstractC8309z90.a;
        if (c0440Fk.size() == 0) {
            return "";
        }
        return new String(c0440Fk.b, c0440Fk.d(), c0440Fk.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0440Fk)) {
            return new String((byte[]) obj2, AbstractC8309z90.a);
        }
        C0440Fk c0440Fk = (C0440Fk) obj2;
        c0440Fk.getClass();
        Charset charset = AbstractC8309z90.a;
        if (c0440Fk.size() == 0) {
            return "";
        }
        return new String(c0440Fk.b, c0440Fk.d(), c0440Fk.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public C2566ci0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.T0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof InterfaceC3823fi0) {
            collection = ((InterfaceC3823fi0) collection).n();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
