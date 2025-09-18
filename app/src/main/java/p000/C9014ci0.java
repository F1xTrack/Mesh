package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ci0 */
/* loaded from: classes.dex */
public final class C9014ci0 extends AbstractC1196T0 implements InterfaceC9403fi0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f17694b;

    static {
        new C9014ci0(10).f11086a = false;
    }

    public C9014ci0(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m7506b();
        this.f17694b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1196T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f17694b.size(), collection);
    }

    @Override // p000.AbstractC1196T0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7506b();
        this.f17694b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC11508w90
    /* renamed from: e */
    public final InterfaceC11508w90 mo10442e(int i) {
        ArrayList arrayList = this.f17694b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C9014ci0(arrayList2);
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: f */
    public final void mo10830f(C0362Fk c0362Fk) {
        m7506b();
        this.f17694b.add(c0362Fk);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f17694b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0362Fk) {
            C0362Fk c0362Fk = (C0362Fk) obj;
            c0362Fk.getClass();
            Charset charset = AbstractC11889z90.f46666a;
            if (c0362Fk.size() == 0) {
                str = "";
            } else {
                str = new String(c0362Fk.f3406b, c0362Fk.m2765d(), c0362Fk.size(), charset);
            }
            int iM2765d = c0362Fk.m2765d();
            if (AbstractC11322uh1.f43795a.m24047c(c0362Fk.f3406b, iM2765d, c0362Fk.size() + iM2765d) == 0) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC11889z90.f46666a);
            C10810qh1 c10810qh1 = AbstractC11322uh1.f43795a;
            if (AbstractC11322uh1.f43795a.m24047c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: n */
    public final List mo10831n() {
        return Collections.unmodifiableList(this.f17694b);
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: o */
    public final InterfaceC9403fi0 mo10832o() {
        return this.f11086a ? new C10808qg1(this) : this;
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: p */
    public final Object mo10833p(int i) {
        return this.f17694b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7506b();
        Object objRemove = this.f17694b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0362Fk)) {
            return new String((byte[]) objRemove, AbstractC11889z90.f46666a);
        }
        C0362Fk c0362Fk = (C0362Fk) objRemove;
        c0362Fk.getClass();
        Charset charset = AbstractC11889z90.f46666a;
        if (c0362Fk.size() == 0) {
            return "";
        }
        return new String(c0362Fk.f3406b, c0362Fk.m2765d(), c0362Fk.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7506b();
        Object obj2 = this.f17694b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0362Fk)) {
            return new String((byte[]) obj2, AbstractC11889z90.f46666a);
        }
        C0362Fk c0362Fk = (C0362Fk) obj2;
        c0362Fk.getClass();
        Charset charset = AbstractC11889z90.f46666a;
        if (c0362Fk.size() == 0) {
            return "";
        }
        return new String(c0362Fk.f3406b, c0362Fk.m2765d(), c0362Fk.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17694b.size();
    }

    public C9014ci0(ArrayList arrayList) {
        this.f17694b = arrayList;
    }

    @Override // p000.AbstractC1196T0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m7506b();
        if (collection instanceof InterfaceC9403fi0) {
            collection = ((InterfaceC9403fi0) collection).mo10831n();
        }
        boolean zAddAll = this.f17694b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
