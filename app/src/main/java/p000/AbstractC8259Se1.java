package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: Se1 */
/* loaded from: classes2.dex */
public abstract class AbstractC8259Se1 {

    /* renamed from: a */
    public static final C7190yG f10889a = new C7190yG("REMOVED_TASK");

    /* renamed from: b */
    public static final C7190yG f10890b = new C7190yG("CLOSED_EMPTY");

    /* renamed from: a */
    public static final String m7402a(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            InterfaceC9127dY0 interfaceC9127dY0M18832k = AbstractC9639hY0.m18832k(type, C8207Re1.f10361a);
            StringBuilder sb = new StringBuilder();
            Iterator it = interfaceC9127dY0M18832k.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            sb.append(((Class) next).getName());
            int iM18827f = AbstractC9639hY0.m18827f(interfaceC9127dY0M18832k);
            if (iM18827f < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + iM18827f + '.').toString());
            }
            String string = "";
            if (iM18827f != 0) {
                int i = 1;
                if (iM18827f != 1) {
                    int length = "[]".length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder("[]".length() * iM18827f);
                            if (1 <= iM18827f) {
                                while (true) {
                                    sb2.append((CharSequence) "[]");
                                    if (i == iM18827f) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            string = sb2.toString();
                            O90.m5965c(string);
                        } else {
                            char cCharAt = "[]".charAt(0);
                            char[] cArr = new char[iM18827f];
                            for (int i2 = 0; i2 < iM18827f; i2++) {
                                cArr[i2] = cCharAt;
                            }
                            string = new String(cArr);
                        }
                    }
                } else {
                    string = "[]".toString();
                }
            }
            sb.append(string);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        O90.m5965c(name);
        return name;
    }

    /* renamed from: b */
    public static final Type m7403b(InterfaceC11317uf0 interfaceC11317uf0, boolean z) {
        InterfaceC9779ie0 interfaceC9779ie0Mo8539i = interfaceC11317uf0.mo8539i();
        if (interfaceC9779ie0Mo8539i instanceof InterfaceC11699xf0) {
            return new C7479De1((InterfaceC11699xf0) interfaceC9779ie0Mo8539i);
        }
        if (!(interfaceC9779ie0Mo8539i instanceof InterfaceC8412Vd0)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC11317uf0);
        }
        InterfaceC8412Vd0 interfaceC8412Vd0 = (InterfaceC8412Vd0) interfaceC9779ie0Mo8539i;
        Class clsM6214c = z ? P22.m6214c(interfaceC8412Vd0) : P22.m6213b(interfaceC8412Vd0);
        List listMo8538h = interfaceC11317uf0.mo8538h();
        if (listMo8538h.isEmpty()) {
            return clsM6214c;
        }
        if (!clsM6214c.isArray()) {
            return m7404c(listMo8538h, clsM6214c);
        }
        if (clsM6214c.getComponentType().isPrimitive()) {
            return clsM6214c;
        }
        C7376Bf0 c7376Bf0 = (C7376Bf0) AbstractC7167xu.m25974T(listMo8538h);
        if (c7376Bf0 == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC11317uf0);
        }
        EnumC7428Cf0 enumC7428Cf0 = c7376Bf0.f968a;
        int i = enumC7428Cf0 == null ? -1 : AbstractC8155Qe1.f9707a[enumC7428Cf0.ordinal()];
        if (i == -1 || i == 1) {
            return clsM6214c;
        }
        if (i != 2 && i != 3) {
            throw new C6838sg();
        }
        C11572wf0 c11572wf0 = c7376Bf0.f969b;
        O90.m5965c(c11572wf0);
        Type typeM7403b = m7403b(c11572wf0, false);
        return typeM7403b instanceof Class ? clsM6214c : new D00(typeM7403b);
    }

    /* renamed from: c */
    public static final C9335fA0 m7404c(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(m7408g((C7376Bf0) it.next()));
            }
            return new C9335fA0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list3));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m7408g((C7376Bf0) it2.next()));
            }
            return new C9335fA0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C9335fA0 c9335fA0M7404c = m7404c(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(listSubList));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m7408g((C7376Bf0) it3.next()));
        }
        return new C9335fA0(cls, c9335fA0M7404c, arrayList3);
    }

    /* renamed from: d */
    public static ColorStateList m7405d(Context context, C8539Xo1 c8539Xo1, int i) {
        int resourceId;
        ColorStateList colorStateListM17900b;
        TypedArray typedArray = (TypedArray) c8539Xo1.f13982c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM17900b = AbstractC3982eJ.m17900b(context, resourceId)) == null) ? c8539Xo1.m9120B(i) : colorStateListM17900b;
    }

    /* renamed from: e */
    public static ColorStateList m7406e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM17900b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM17900b = AbstractC3982eJ.m17900b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM17900b;
    }

    /* renamed from: f */
    public static Drawable m7407f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM26394b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM26394b = AbstractC11918zN1.m26394b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM26394b;
    }

    /* renamed from: g */
    public static final Type m7408g(C7376Bf0 c7376Bf0) {
        EnumC7428Cf0 enumC7428Cf0 = c7376Bf0.f968a;
        if (enumC7428Cf0 == null) {
            return C10950rn1.f41905c;
        }
        C11572wf0 c11572wf0 = c7376Bf0.f969b;
        O90.m5965c(c11572wf0);
        int iOrdinal = enumC7428Cf0.ordinal();
        if (iOrdinal == 0) {
            return m7403b(c11572wf0, true);
        }
        if (iOrdinal == 1) {
            return new C10950rn1(null, m7403b(c11572wf0, true));
        }
        if (iOrdinal == 2) {
            return new C10950rn1(m7403b(c11572wf0, true), null);
        }
        throw new C6838sg();
    }

    /* renamed from: h */
    public static boolean m7409h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
