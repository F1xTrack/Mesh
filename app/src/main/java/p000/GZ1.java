package p000;

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

    /* renamed from: a */
    public static /* synthetic */ void m3084a(int i) {
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

    /* renamed from: g */
    public static C8473Wh1 m3085g(C8340Tt0 c8340Tt0, InterfaceC6976us interfaceC6976us) {
        if (c8340Tt0 == null) {
            m3084a(19);
            throw null;
        }
        if (interfaceC6976us == null) {
            m3084a(20);
            throw null;
        }
        Collection collectionMo1435g = interfaceC6976us.mo1435g();
        if (collectionMo1435g.size() != 1) {
            return null;
        }
        for (C8473Wh1 c8473Wh1 : ((C6707qs) collectionMo1435g.iterator().next()).mo1221f0()) {
            if (c8473Wh1.getName().equals(c8340Tt0)) {
                return c8473Wh1;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static LinkedHashSet m3086h(C8340Tt0 c8340Tt0, Collection collection, Collection collection2, InterfaceC6976us interfaceC6976us, InterfaceC1845cP interfaceC1845cP, C11229tz0 c11229tz0, boolean z) {
        if (c8340Tt0 == null) {
            m3084a(12);
            throw null;
        }
        if (collection == null) {
            m3084a(13);
            throw null;
        }
        if (interfaceC6976us == null) {
            m3084a(15);
            throw null;
        }
        if (interfaceC1845cP == null) {
            m3084a(16);
            throw null;
        }
        if (c11229tz0 == null) {
            m3084a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c11229tz0.m25061h(c8340Tt0, collection, collection2, interfaceC6976us, new C6734rI(interfaceC1845cP, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: i */
    public static LinkedHashSet m3087i(C8340Tt0 c8340Tt0, AbstractCollection abstractCollection, Collection collection, InterfaceC6976us interfaceC6976us, InterfaceC1845cP interfaceC1845cP, C11229tz0 c11229tz0) {
        if (c8340Tt0 == null) {
            m3084a(0);
            throw null;
        }
        if (interfaceC6976us == null) {
            m3084a(3);
            throw null;
        }
        if (interfaceC1845cP == null) {
            m3084a(4);
            throw null;
        }
        if (c11229tz0 != null) {
            return m3086h(c8340Tt0, abstractCollection, collection, interfaceC6976us, interfaceC1845cP, c11229tz0, false);
        }
        m3084a(5);
        throw null;
    }

    /* renamed from: j */
    public static LinkedHashSet m3088j(C8340Tt0 c8340Tt0, Collection collection, AbstractCollection abstractCollection, C11957zh0 c11957zh0, S20 s20, C11229tz0 c11229tz0) {
        if (c8340Tt0 == null) {
            m3084a(6);
            throw null;
        }
        if (collection == null) {
            m3084a(7);
            throw null;
        }
        if (c11957zh0 == null) {
            m3084a(9);
            throw null;
        }
        if (s20 == null) {
            m3084a(10);
            throw null;
        }
        if (c11229tz0 != null) {
            return m3086h(c8340Tt0, collection, abstractCollection, c11957zh0, s20, c11229tz0, true);
        }
        m3084a(11);
        throw null;
    }

    /* renamed from: b */
    public abstract Typeface mo3089b(Context context, C4185hX c4185hX, Resources resources, int i);

    /* renamed from: c */
    public abstract Typeface mo3090c(Context context, C6369lX[] c6369lXArr, int i);

    /* renamed from: d */
    public Typeface mo3091d(Context context, InputStream inputStream) {
        File fileM3509e = HZ1.m3509e(context);
        if (fileM3509e == null) {
            return null;
        }
        try {
            if (HZ1.m3508d(fileM3509e, inputStream)) {
                return Typeface.createFromFile(fileM3509e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM3509e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo3092e(Context context, Resources resources, int i, String str, int i2) {
        File fileM3509e = HZ1.m3509e(context);
        if (fileM3509e == null) {
            return null;
        }
        try {
            if (HZ1.m3507c(fileM3509e, resources, i)) {
                return Typeface.createFromFile(fileM3509e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM3509e.delete();
        }
    }

    /* renamed from: f */
    public C6369lX mo3093f(int i, C6369lX[] c6369lXArr) {
        new C7408Bv0(22);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C6369lX c6369lX = null;
        int i3 = Integer.MAX_VALUE;
        for (C6369lX c6369lX2 : c6369lXArr) {
            int iAbs = (Math.abs(c6369lX2.f37095c - i2) * 2) + (c6369lX2.f37096d == z ? 0 : 1);
            if (c6369lX == null || i3 > iAbs) {
                c6369lX = c6369lX2;
                i3 = iAbs;
            }
        }
        return c6369lX;
    }
}
