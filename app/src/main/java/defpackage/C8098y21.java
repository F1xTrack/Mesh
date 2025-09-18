package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: y21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8098y21 extends AbstractSet {
    public static final /* synthetic */ int c = 0;
    public Object a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.AbstractCollection, java.util.AbstractSet, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i = this.b;
        if (i == 0) {
            this.a = obj;
        } else if (i == 1) {
            if (O90.a(this.a, obj)) {
                return false;
            }
            this.a = new Object[]{this.a, obj};
        } else if (i < 5) {
            Object obj2 = this.a;
            O90.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (J8.e(objArr2, obj)) {
                return false;
            }
            int i2 = this.b;
            if (i2 == 4) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                O90.f(objArrCopyOf, "elements");
                ?? linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(objArrCopyOf.length));
                J8.B(objArrCopyOf, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                O90.e(objArrCopyOf2, "copyOf(...)");
                objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                objArr = objArrCopyOf2;
            }
            this.a = objArr;
        } else {
            Object obj3 = this.a;
            O90.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!AbstractC5543ke1.c(obj3).add(obj)) {
                return false;
            }
        }
        this.b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return O90.a(this.a, obj);
        }
        if (i < 5) {
            Object obj2 = this.a;
            O90.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return J8.e((Object[]) obj2, obj);
        }
        Object obj3 = this.a;
        O90.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new C4253hy0(1, this.a);
        }
        if (i < 5) {
            Object obj = this.a;
            O90.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C7908x21((Object[]) obj);
        }
        Object obj2 = this.a;
        O90.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return AbstractC5543ke1.c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }
}
