package defpackage;

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
public abstract class AbstractC1437Se1 {
    public static final C8139yG a = new C8139yG("REMOVED_TASK");
    public static final C8139yG b = new C8139yG("CLOSED_EMPTY");

    public static final String a(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            InterfaceC3412dY0 interfaceC3412dY0K = AbstractC4175hY0.k(type, C1359Re1.a);
            StringBuilder sb = new StringBuilder();
            Iterator it = interfaceC3412dY0K.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            sb.append(((Class) next).getName());
            int iF = AbstractC4175hY0.f(interfaceC3412dY0K);
            if (iF < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + iF + '.').toString());
            }
            String string = "";
            if (iF != 0) {
                int i = 1;
                if (iF != 1) {
                    int length = "[]".length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder("[]".length() * iF);
                            if (1 <= iF) {
                                while (true) {
                                    sb2.append((CharSequence) "[]");
                                    if (i == iF) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            string = sb2.toString();
                            O90.c(string);
                        } else {
                            char cCharAt = "[]".charAt(0);
                            char[] cArr = new char[iF];
                            for (int i2 = 0; i2 < iF; i2++) {
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
        O90.c(name);
        return name;
    }

    public static final Type b(InterfaceC7454uf0 interfaceC7454uf0, boolean z) {
        InterfaceC4384ie0 interfaceC4384ie0I = interfaceC7454uf0.i();
        if (interfaceC4384ie0I instanceof InterfaceC8025xf0) {
            return new C0268De1((InterfaceC8025xf0) interfaceC4384ie0I);
        }
        if (!(interfaceC4384ie0I instanceof InterfaceC1667Vd0)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC7454uf0);
        }
        InterfaceC1667Vd0 interfaceC1667Vd0 = (InterfaceC1667Vd0) interfaceC4384ie0I;
        Class clsC = z ? P22.c(interfaceC1667Vd0) : P22.b(interfaceC1667Vd0);
        List listH = interfaceC7454uf0.h();
        if (listH.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return c(listH, clsC);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        C0114Bf0 c0114Bf0 = (C0114Bf0) AbstractC8069xu.T(listH);
        if (c0114Bf0 == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC7454uf0);
        }
        EnumC0192Cf0 enumC0192Cf0 = c0114Bf0.a;
        int i = enumC0192Cf0 == null ? -1 : AbstractC1281Qe1.a[enumC0192Cf0.ordinal()];
        if (i == -1 || i == 1) {
            return clsC;
        }
        if (i != 2 && i != 3) {
            throw new C7074sg();
        }
        C7835wf0 c7835wf0 = c0114Bf0.b;
        O90.c(c7835wf0);
        Type typeB = b(c7835wf0, false);
        return typeB instanceof Class ? clsC : new D00(typeB);
    }

    public static final C3721fA0 c(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((C0114Bf0) it.next()));
            }
            return new C3721fA0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list3));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((C0114Bf0) it2.next()));
            }
            return new C3721fA0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C3721fA0 c3721fA0C = c(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(listSubList));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((C0114Bf0) it3.next()));
        }
        return new C3721fA0(cls, c3721fA0C, arrayList3);
    }

    public static ColorStateList d(Context context, C1857Xo1 c1857Xo1, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) c1857Xo1.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = AbstractC3556eJ.b(context, resourceId)) == null) ? c1857Xo1.B(i) : colorStateListB;
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = AbstractC3556eJ.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static Drawable f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableB = AbstractC8352zN1.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableB;
    }

    public static final Type g(C0114Bf0 c0114Bf0) {
        EnumC0192Cf0 enumC0192Cf0 = c0114Bf0.a;
        if (enumC0192Cf0 == null) {
            return C6906rn1.c;
        }
        C7835wf0 c7835wf0 = c0114Bf0.b;
        O90.c(c7835wf0);
        int iOrdinal = enumC0192Cf0.ordinal();
        if (iOrdinal == 0) {
            return b(c7835wf0, true);
        }
        if (iOrdinal == 1) {
            return new C6906rn1(null, b(c7835wf0, true));
        }
        if (iOrdinal == 2) {
            return new C6906rn1(b(c7835wf0, true), null);
        }
        throw new C7074sg();
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
