package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GZ1 {
    public GZ1() {
        new ConcurrentHashMap();
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static C1758Wh1 g(C1559Tt0 c1559Tt0, InterfaceC7492us interfaceC7492us) {
        if (c1559Tt0 == null) {
            a(19);
            throw null;
        }
        if (interfaceC7492us == null) {
            a(20);
            throw null;
        }
        Collection collectionG = interfaceC7492us.g();
        if (collectionG.size() != 1) {
            return null;
        }
        for (C1758Wh1 c1758Wh1 : ((C6729qs) collectionG.iterator().next()).f0()) {
            if (c1758Wh1.getName().equals(c1559Tt0)) {
                return c1758Wh1;
            }
        }
        return null;
    }

    public static LinkedHashSet h(C1559Tt0 c1559Tt0, Collection collection, Collection collection2, InterfaceC7492us interfaceC7492us, InterfaceC2508cP interfaceC2508cP, C7323tz0 c7323tz0, boolean z) {
        if (c1559Tt0 == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (interfaceC7492us == null) {
            a(15);
            throw null;
        }
        if (interfaceC2508cP == null) {
            a(16);
            throw null;
        }
        if (c7323tz0 == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c7323tz0.h(c1559Tt0, collection, collection2, interfaceC7492us, new C6811rI(interfaceC2508cP, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet i(C1559Tt0 c1559Tt0, AbstractCollection abstractCollection, Collection collection, InterfaceC7492us interfaceC7492us, InterfaceC2508cP interfaceC2508cP, C7323tz0 c7323tz0) {
        if (c1559Tt0 == null) {
            a(0);
            throw null;
        }
        if (interfaceC7492us == null) {
            a(3);
            throw null;
        }
        if (interfaceC2508cP == null) {
            a(4);
            throw null;
        }
        if (c7323tz0 != null) {
            return h(c1559Tt0, abstractCollection, collection, interfaceC7492us, interfaceC2508cP, c7323tz0, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet j(C1559Tt0 c1559Tt0, Collection collection, AbstractCollection abstractCollection, C8411zh0 c8411zh0, S20 s20, C7323tz0 c7323tz0) {
        if (c1559Tt0 == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (c8411zh0 == null) {
            a(9);
            throw null;
        }
        if (s20 == null) {
            a(10);
            throw null;
        }
        if (c7323tz0 != null) {
            return h(c1559Tt0, collection, abstractCollection, c8411zh0, s20, c7323tz0, true);
        }
        a(11);
        throw null;
    }

    public abstract Typeface b(Context context, C4171hX c4171hX, Resources resources, int i);

    public abstract Typeface c(Context context, C5711lX[] c5711lXArr, int i);

    public Typeface d(Context context, InputStream inputStream) {
        File fileE = HZ1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (HZ1.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File fileE = HZ1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (HZ1.c(fileE, resources, i)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public C5711lX f(int i, C5711lX[] c5711lXArr) {
        new C0162Bv0(22);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C5711lX c5711lX = null;
        int i3 = Integer.MAX_VALUE;
        for (C5711lX c5711lX2 : c5711lXArr) {
            int iAbs = (Math.abs(c5711lX2.c - i2) * 2) + (c5711lX2.d == z ? 0 : 1);
            if (c5711lX == null || i3 > iAbs) {
                c5711lX = c5711lX2;
                i3 = iAbs;
            }
        }
        return c5711lX;
    }
}
