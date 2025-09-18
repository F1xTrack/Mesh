package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.swmansion.reanimated.BuildConfig;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: sI */
/* loaded from: classes2.dex */
public abstract class AbstractC7002sI {
    public static final /* synthetic */ int a = 0;

    static {
        new KX("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C4473c9.L /* 40 */:
            case C4473c9.M /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C4473c9.L /* 40 */:
            case C4473c9.M /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 57:
            case 58:
            case 59:
            case 61:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C4473c9.L /* 40 */:
            case C4473c9.M /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case C4473c9.K /* 38 */:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case C4473c9.L /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case C4473c9.M /* 42 */:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C4473c9.L /* 40 */:
            case C4473c9.M /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case C4473c9.J /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case C4473c9.K /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case NativeMac.KEY_LENGTH /* 64 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C4473c9.L /* 40 */:
            case C4473c9.M /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(InterfaceC7662vl interfaceC7662vl, LinkedHashSet linkedHashSet) {
        if (interfaceC7662vl == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC7662vl)) {
            return;
        }
        Iterator it = interfaceC7662vl.x1().j().iterator();
        while (it.hasNext()) {
            InterfaceC7662vl interfaceC7662vlX1 = ((InterfaceC7662vl) it.next()).x1();
            b(interfaceC7662vlX1, linkedHashSet);
            linkedHashSet.add(interfaceC7662vlX1);
        }
    }

    public static InterfaceC7492us c(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(45);
            throw null;
        }
        InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC0663Ig0.E();
        if (interfaceC1200Pd1E == null) {
            a(46);
            throw null;
        }
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) interfaceC1200Pd1E.a();
        if (interfaceC7492us != null) {
            return interfaceC7492us;
        }
        a(47);
        throw null;
    }

    public static InterfaceC0153Bs0 d(CD cd) {
        if (cd == null) {
            a(21);
            throw null;
        }
        InterfaceC0153Bs0 interfaceC0153Bs0E = e(cd);
        if (interfaceC0153Bs0E != null) {
            return interfaceC0153Bs0E;
        }
        a(22);
        throw null;
    }

    public static InterfaceC0153Bs0 e(CD cd) {
        if (cd == null) {
            a(23);
            throw null;
        }
        while (cd != null) {
            if (cd instanceof InterfaceC0153Bs0) {
                return (InterfaceC0153Bs0) cd;
            }
            if (cd instanceof InterfaceC0720Iz0) {
                return ((C1835Xh0) ((InterfaceC0720Iz0) cd)).d;
            }
            cd = cd.i();
        }
        return null;
    }

    public static C0318Dv0 f(CD cd) {
        if (cd == null) {
            a(82);
            throw null;
        }
        if (cd instanceof JE0) {
            cd = ((JE0) cd).y1();
        }
        boolean z = cd instanceof ED;
        C0318Dv0 c0318Dv0 = C0318Dv0.f;
        if (z) {
            ((ED) cd).e().getClass();
        }
        return c0318Dv0;
    }

    public static MX g(CD cd) {
        if (cd != null) {
            KX kxH = h(cd);
            return kxH != null ? kxH.i() : g(cd.i()).b(cd.getName());
        }
        a(2);
        throw null;
    }

    public static KX h(CD cd) {
        if (cd == null) {
            a(5);
            throw null;
        }
        if ((cd instanceof InterfaceC0153Bs0) || C5496kP.f(cd)) {
            return KX.c;
        }
        if (cd instanceof InterfaceC0720Iz0) {
            return ((C1835Xh0) ((InterfaceC0720Iz0) cd)).e;
        }
        if (cd instanceof InterfaceC8465zz0) {
            return ((AbstractC0096Az0) ((InterfaceC8465zz0) cd)).f;
        }
        return null;
    }

    public static CD i(CD cd, Class cls, boolean z) {
        if (cd == null) {
            return null;
        }
        if (z) {
            cd = cd.i();
        }
        while (cd != null) {
            if (cls.isInstance(cd)) {
                return cd;
            }
            cd = cd.i();
        }
        return null;
    }

    public static InterfaceC7492us j(InterfaceC7492us interfaceC7492us) {
        if (interfaceC7492us == null) {
            a(44);
            throw null;
        }
        Iterator it = interfaceC7492us.v().b().iterator();
        while (it.hasNext()) {
            InterfaceC7492us interfaceC7492usC = c((AbstractC0663Ig0) it.next());
            if (interfaceC7492usC.l() != EnumC0152Bs.b) {
                return interfaceC7492usC;
            }
        }
        return null;
    }

    public static boolean k(CD cd) {
        if (cd != null) {
            return n(cd, EnumC0152Bs.a) && cd.getName().equals(AbstractC5431k31.a);
        }
        a(34);
        throw null;
    }

    public static boolean l(CD cd) {
        return n(cd, EnumC0152Bs.f) && ((InterfaceC7492us) cd).w();
    }

    public static boolean m(CD cd) {
        if (cd != null) {
            return n(cd, EnumC0152Bs.d);
        }
        a(36);
        throw null;
    }

    public static boolean n(CD cd, EnumC0152Bs enumC0152Bs) {
        return (cd instanceof InterfaceC7492us) && ((InterfaceC7492us) cd).l() == enumC0152Bs;
    }

    public static boolean o(CD cd) {
        if (cd == null) {
            a(1);
            throw null;
        }
        while (cd != null) {
            if (k(cd) || ((cd instanceof HD) && ((HD) cd).getVisibility() == AbstractC7765wI.f)) {
                return true;
            }
            cd = cd.i();
        }
        return false;
    }

    public static boolean p(AbstractC0663Ig0 abstractC0663Ig0, InterfaceC7492us interfaceC7492us) {
        if (abstractC0663Ig0 == null) {
            a(30);
            throw null;
        }
        if (interfaceC7492us == null) {
            a(31);
            throw null;
        }
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (interfaceC1087NsA == null) {
            return false;
        }
        CD cdX1 = interfaceC1087NsA.x1();
        return (cdX1 instanceof InterfaceC1087Ns) && interfaceC7492us.v().equals(((InterfaceC1087Ns) cdX1).v());
    }

    public static boolean q(CD cd) {
        return (n(cd, EnumC0152Bs.a) || n(cd, EnumC0152Bs.b)) && ((InterfaceC7492us) cd).f() == EnumC6348os0.c;
    }

    public static boolean r(AbstractC0663Ig0 abstractC0663Ig0, InterfaceC7492us interfaceC7492us) {
        if (abstractC0663Ig0 == null) {
            a(32);
            throw null;
        }
        if (interfaceC7492us == null) {
            a(33);
            throw null;
        }
        if (p(abstractC0663Ig0, interfaceC7492us)) {
            return true;
        }
        Iterator it = abstractC0663Ig0.E().b().iterator();
        while (it.hasNext()) {
            if (r((AbstractC0663Ig0) it.next(), interfaceC7492us)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(CD cd) {
        return cd != null && (cd.i() instanceof InterfaceC8465zz0);
    }

    public static InterfaceC8042xl t(InterfaceC8042xl interfaceC8042xl) {
        if (interfaceC8042xl == null) {
            a(59);
            throw null;
        }
        while (interfaceC8042xl.l() == 2) {
            Collection collectionJ = interfaceC8042xl.j();
            if (collectionJ.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC8042xl);
            }
            interfaceC8042xl = (InterfaceC8042xl) collectionJ.iterator().next();
        }
        return interfaceC8042xl;
    }
}
