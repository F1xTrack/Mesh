package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class AF1 extends HB1 implements RandomAccess, FF1 {
    public final List b;

    static {
        new AF1();
    }

    public AF1(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.b = arrayList;
    }

    @Override // defpackage.FF1
    public final void U(C8129yC1 c8129yC1) {
        zza();
        this.b.add(c8129yC1);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.HB1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof FF1) {
            collection = ((FF1) collection).m();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.YE1
    public final YE1 c(int i) {
        List list = this.b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new AF1(arrayList);
    }

    @Override // defpackage.HB1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public final String get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C8129yC1)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC3356dF1.a);
            C4122hG1 c4122hG1 = AbstractC2114aK1.a;
            int length = bArr.length;
            AbstractC2114aK1.a.getClass();
            if (C4122hG1.c(bArr, 0, length)) {
                list.set(i, str2);
            }
            return str2;
        }
        C8129yC1 c8129yC1 = (C8129yC1) obj;
        Charset charset = AbstractC3356dF1.a;
        if (c8129yC1.h() == 0) {
            str = "";
        } else {
            str = new String(c8129yC1.b, 0, c8129yC1.h(), charset);
        }
        int iH = c8129yC1.h();
        AbstractC2114aK1.a.getClass();
        if (C4122hG1.c(c8129yC1.b, 0, iH)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // defpackage.FF1
    public final Object l(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.FF1
    public final List m() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.HB1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C8129yC1)) {
            return new String((byte[]) objRemove, AbstractC3356dF1.a);
        }
        C8129yC1 c8129yC1 = (C8129yC1) objRemove;
        Charset charset = AbstractC3356dF1.a;
        if (c8129yC1.h() == 0) {
            return "";
        }
        return new String(c8129yC1.b, 0, c8129yC1.h(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C8129yC1)) {
            return new String((byte[]) obj2, AbstractC3356dF1.a);
        }
        C8129yC1 c8129yC1 = (C8129yC1) obj2;
        Charset charset = AbstractC3356dF1.a;
        if (c8129yC1.h() == 0) {
            return "";
        }
        return new String(c8129yC1.b, 0, c8129yC1.h(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.FF1
    public final FF1 zze() {
        return this.a ? new ZI1(this) : this;
    }

    public AF1(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public AF1() {
        super(false);
        this.b = Collections.emptyList();
    }

    @Override // defpackage.HB1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
