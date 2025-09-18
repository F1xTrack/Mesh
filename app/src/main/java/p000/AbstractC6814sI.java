package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.swmansion.reanimated.BuildConfig;
import io.appmetrica.analytics.impl.C5043c9;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: sI */
/* loaded from: classes2.dex */
public abstract class AbstractC6814sI {

    /* renamed from: a */
    public static final /* synthetic */ int f42360a = 0;

    static {
        new C0664KX("kotlin.jvm.JvmName");
    }

    /* renamed from: a */
    public static /* synthetic */ void m24689a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case C5043c9.f31376L /* 40 */:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31376L /* 40 */:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31376L /* 40 */:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31375K /* 38 */:
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
            case C5043c9.f31376L /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31376L /* 40 */:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case C5043c9.f31375K /* 38 */:
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
            case C5043c9.f31376L /* 40 */:
            case C5043c9.f31377M /* 42 */:
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

    /* renamed from: b */
    public static void m24690b(InterfaceC7032vl interfaceC7032vl, LinkedHashSet linkedHashSet) {
        if (interfaceC7032vl == null) {
            m24689a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC7032vl)) {
            return;
        }
        Iterator it = interfaceC7032vl.mo2089x1().mo1222j().iterator();
        while (it.hasNext()) {
            InterfaceC7032vl interfaceC7032vlMo2089x1 = ((InterfaceC7032vl) it.next()).mo2089x1();
            m24690b(interfaceC7032vlMo2089x1, linkedHashSet);
            linkedHashSet.add(interfaceC7032vlMo2089x1);
        }
    }

    /* renamed from: c */
    public static InterfaceC6976us m24691c(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m24689a(45);
            throw null;
        }
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC7742Ig0.mo3797E();
        if (interfaceC8101Pd1Mo3797E == null) {
            m24689a(46);
            throw null;
        }
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC8101Pd1Mo3797E.mo1962a();
        if (interfaceC6976us != null) {
            return interfaceC6976us;
        }
        m24689a(47);
        throw null;
    }

    /* renamed from: d */
    public static InterfaceC7402Bs0 m24692d(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m24689a(21);
            throw null;
        }
        InterfaceC7402Bs0 interfaceC7402Bs0M24693e = m24693e(interfaceC0140CD);
        if (interfaceC7402Bs0M24693e != null) {
            return interfaceC7402Bs0M24693e;
        }
        m24689a(22);
        throw null;
    }

    /* renamed from: e */
    public static InterfaceC7402Bs0 m24693e(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m24689a(23);
            throw null;
        }
        while (interfaceC0140CD != null) {
            if (interfaceC0140CD instanceof InterfaceC7402Bs0) {
                return (InterfaceC7402Bs0) interfaceC0140CD;
            }
            if (interfaceC0140CD instanceof InterfaceC7780Iz0) {
                return ((C8524Xh0) ((InterfaceC7780Iz0) interfaceC0140CD)).f13922d;
            }
            interfaceC0140CD = interfaceC0140CD.mo423i();
        }
        return null;
    }

    /* renamed from: f */
    public static C7512Dv0 m24694f(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m24689a(82);
            throw null;
        }
        if (interfaceC0140CD instanceof JE0) {
            interfaceC0140CD = ((JE0) interfaceC0140CD).m123y1();
        }
        boolean z = interfaceC0140CD instanceof InterfaceC0266ED;
        C7512Dv0 c7512Dv0 = C7512Dv0.f2303f;
        if (z) {
            ((InterfaceC0266ED) interfaceC0140CD).mo422e().getClass();
        }
        return c7512Dv0;
    }

    /* renamed from: g */
    public static C0789MX m24695g(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD != null) {
            C0664KX c0664kxM24696h = m24696h(interfaceC0140CD);
            return c0664kxM24696h != null ? c0664kxM24696h.m4661i() : m24695g(interfaceC0140CD.mo423i()).m5388b(interfaceC0140CD.getName());
        }
        m24689a(2);
        throw null;
    }

    /* renamed from: h */
    public static C0664KX m24696h(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m24689a(5);
            throw null;
        }
        if ((interfaceC0140CD instanceof InterfaceC7402Bs0) || C6298kP.m22200f(interfaceC0140CD)) {
            return C0664KX.f6145c;
        }
        if (interfaceC0140CD instanceof InterfaceC7780Iz0) {
            return ((C8524Xh0) ((InterfaceC7780Iz0) interfaceC0140CD)).f13923e;
        }
        if (interfaceC0140CD instanceof InterfaceC11993zz0) {
            return ((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CD)).f494f;
        }
        return null;
    }

    /* renamed from: i */
    public static InterfaceC0140CD m24697i(InterfaceC0140CD interfaceC0140CD, Class cls, boolean z) {
        if (interfaceC0140CD == null) {
            return null;
        }
        if (z) {
            interfaceC0140CD = interfaceC0140CD.mo423i();
        }
        while (interfaceC0140CD != null) {
            if (cls.isInstance(interfaceC0140CD)) {
                return interfaceC0140CD;
            }
            interfaceC0140CD = interfaceC0140CD.mo423i();
        }
        return null;
    }

    /* renamed from: j */
    public static InterfaceC6976us m24698j(InterfaceC6976us interfaceC6976us) {
        if (interfaceC6976us == null) {
            m24689a(44);
            throw null;
        }
        Iterator it = interfaceC6976us.mo1439v().mo5276b().iterator();
        while (it.hasNext()) {
            InterfaceC6976us interfaceC6976usM24691c = m24691c((AbstractC7742Ig0) it.next());
            if (interfaceC6976usM24691c.mo1436l() != EnumC0118Bs.f1061b) {
                return interfaceC6976usM24691c;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m24699k(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD != null) {
            return m24702n(interfaceC0140CD, EnumC0118Bs.f1060a) && interfaceC0140CD.getName().equals(AbstractC9961k31.f36274a);
        }
        m24689a(34);
        throw null;
    }

    /* renamed from: l */
    public static boolean m24700l(InterfaceC0140CD interfaceC0140CD) {
        return m24702n(interfaceC0140CD, EnumC0118Bs.f1065f) && ((InterfaceC6976us) interfaceC0140CD).mo1440w();
    }

    /* renamed from: m */
    public static boolean m24701m(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD != null) {
            return m24702n(interfaceC0140CD, EnumC0118Bs.f1063d);
        }
        m24689a(36);
        throw null;
    }

    /* renamed from: n */
    public static boolean m24702n(InterfaceC0140CD interfaceC0140CD, EnumC0118Bs enumC0118Bs) {
        return (interfaceC0140CD instanceof InterfaceC6976us) && ((InterfaceC6976us) interfaceC0140CD).mo1436l() == enumC0118Bs;
    }

    /* renamed from: o */
    public static boolean m24703o(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m24689a(1);
            throw null;
        }
        while (interfaceC0140CD != null) {
            if (m24699k(interfaceC0140CD) || ((interfaceC0140CD instanceof InterfaceC0455HD) && ((InterfaceC0455HD) interfaceC0140CD).getVisibility() == AbstractC7066wI.f44765f)) {
                return true;
            }
            interfaceC0140CD = interfaceC0140CD.mo423i();
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m24704p(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC6976us interfaceC6976us) {
        if (abstractC7742Ig0 == null) {
            m24689a(30);
            throw null;
        }
        if (interfaceC6976us == null) {
            m24689a(31);
            throw null;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a == null) {
            return false;
        }
        InterfaceC0140CD interfaceC0140CDMo2089x1 = interfaceC0873NsMo1962a.mo2089x1();
        return (interfaceC0140CDMo2089x1 instanceof InterfaceC0873Ns) && interfaceC6976us.mo1439v().equals(((InterfaceC0873Ns) interfaceC0140CDMo2089x1).mo1439v());
    }

    /* renamed from: q */
    public static boolean m24705q(InterfaceC0140CD interfaceC0140CD) {
        return (m24702n(interfaceC0140CD, EnumC0118Bs.f1060a) || m24702n(interfaceC0140CD, EnumC0118Bs.f1061b)) && ((InterfaceC6976us) interfaceC0140CD).mo115f() == EnumC10575os0.f39324c;
    }

    /* renamed from: r */
    public static boolean m24706r(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC6976us interfaceC6976us) {
        if (abstractC7742Ig0 == null) {
            m24689a(32);
            throw null;
        }
        if (interfaceC6976us == null) {
            m24689a(33);
            throw null;
        }
        if (m24704p(abstractC7742Ig0, interfaceC6976us)) {
            return true;
        }
        Iterator it = abstractC7742Ig0.mo3797E().mo5276b().iterator();
        while (it.hasNext()) {
            if (m24706r((AbstractC7742Ig0) it.next(), interfaceC6976us)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m24707s(InterfaceC0140CD interfaceC0140CD) {
        return interfaceC0140CD != null && (interfaceC0140CD.mo423i() instanceof InterfaceC11993zz0);
    }

    /* renamed from: t */
    public static InterfaceC7158xl m24708t(InterfaceC7158xl interfaceC7158xl) {
        if (interfaceC7158xl == null) {
            m24689a(59);
            throw null;
        }
        while (interfaceC7158xl.mo116l() == 2) {
            Collection collectionMo1222j = interfaceC7158xl.mo1222j();
            if (collectionMo1222j.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC7158xl);
            }
            interfaceC7158xl = (InterfaceC7158xl) collectionMo1222j.iterator().next();
        }
        return interfaceC7158xl;
    }
}
