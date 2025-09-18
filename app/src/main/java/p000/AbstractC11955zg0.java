package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.core.base.AidlException;
import com.swmansion.reanimated.BuildConfig;
import io.appmetrica.analytics.impl.C5043c9;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: zg0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11955zg0 {

    /* renamed from: e */
    public static final C8340Tt0 f46926e = C8340Tt0.m7800g("<built-ins module>");

    /* renamed from: a */
    public C7454Cs0 f46927a;

    /* renamed from: b */
    public final C8426Vk0 f46928b;

    /* renamed from: c */
    public final C8270Sk0 f46929c;

    /* renamed from: d */
    public final C8582Yk0 f46930d;

    public AbstractC11955zg0(C8582Yk0 c8582Yk0) {
        this.f46930d = c8582Yk0;
        c8582Yk0.m9349a(new C11701xg0(this, 0));
        this.f46928b = new C8426Vk0(c8582Yk0, new C11701xg0(this, 1));
        this.f46929c = c8582Yk0.m9350b(new C0063B(2, this));
    }

    /* renamed from: A */
    public static boolean m26482A(AbstractC7742Ig0 abstractC7742Ig0, C0789MX c0789mx) {
        if (abstractC7742Ig0 == null) {
            m26490a(98);
            throw null;
        }
        if (c0789mx != null) {
            return m26488G(abstractC7742Ig0.mo3797E(), c0789mx);
        }
        m26490a(99);
        throw null;
    }

    /* renamed from: B */
    public static boolean m26483B(AbstractC7742Ig0 abstractC7742Ig0, C0789MX c0789mx) {
        if (c0789mx != null) {
            return m26482A(abstractC7742Ig0, c0789mx) && !abstractC7742Ig0.mo3798G();
        }
        m26490a(ModuleDescriptor.MODULE_VERSION);
        throw null;
    }

    /* renamed from: C */
    public static boolean m26484C(InterfaceC0036AZ interfaceC0036AZ) {
        if (interfaceC0036AZ.mo2089x1().getAnnotations().mo3261g(AbstractC10604p41.f39815m)) {
            return true;
        }
        if (!(interfaceC0036AZ instanceof CE0)) {
            return false;
        }
        CE0 ce0 = (CE0) interfaceC0036AZ;
        boolean zMo2087s0 = ce0.mo2087s0();
        FE0 fe0Mo1121c = ce0.mo1121c();
        JE0 je0Mo1122d = ce0.mo1122d();
        if (fe0Mo1121c != null && m26484C(fe0Mo1121c)) {
            if (!zMo2087s0) {
                return true;
            }
            if (je0Mo1122d != null && m26484C(je0Mo1122d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m26485D(AbstractC7742Ig0 abstractC7742Ig0, C0789MX c0789mx) {
        if (abstractC7742Ig0 == null) {
            m26490a(106);
            throw null;
        }
        if (c0789mx != null) {
            return !abstractC7742Ig0.mo3798G() && m26482A(abstractC7742Ig0, c0789mx);
        }
        m26490a(107);
        throw null;
    }

    /* renamed from: E */
    public static boolean m26486E(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m26490a(137);
            throw null;
        }
        if (abstractC7742Ig0 != null) {
            return m26482A(abstractC7742Ig0, AbstractC10604p41.f39802b) && !AbstractC7375Be1.m787e(abstractC7742Ig0);
        }
        m26490a(139);
        throw null;
    }

    /* renamed from: F */
    public static boolean m26487F(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m26490a(95);
            throw null;
        }
        if (!abstractC7742Ig0.mo3798G()) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
            if (interfaceC0873NsMo1962a instanceof InterfaceC6976us) {
                InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC0873NsMo1962a;
                if (interfaceC6976us == null) {
                    m26490a(97);
                    throw null;
                }
                if (m26493t(interfaceC6976us) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m26488G(InterfaceC8101Pd1 interfaceC8101Pd1, C0789MX c0789mx) {
        if (interfaceC8101Pd1 == null) {
            m26490a(102);
            throw null;
        }
        if (c0789mx != null) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC8101Pd1.mo1962a();
            return (interfaceC0873NsMo1962a instanceof InterfaceC6976us) && m26491b((InterfaceC6976us) interfaceC0873NsMo1962a, c0789mx);
        }
        m26490a(AidlException.HOST_IS_NOT_MASTER);
        throw null;
    }

    /* renamed from: H */
    public static boolean m26489H(InterfaceC0873Ns interfaceC0873Ns) {
        if (interfaceC0873Ns == null) {
            m26490a(10);
            throw null;
        }
        for (InterfaceC0873Ns interfaceC0873NsMo423i = interfaceC0873Ns; interfaceC0873NsMo423i != null; interfaceC0873NsMo423i = interfaceC0873NsMo423i.mo423i()) {
            if (interfaceC0873NsMo423i instanceof InterfaceC11993zz0) {
                return ((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0873NsMo423i)).f494f.m4660h(AbstractC10732q41.f40587k);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m26490a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case C5043c9.f31374J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C5043c9.f31375K /* 38 */:
            case 39:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case C5043c9.f31374J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C5043c9.f31375K /* 38 */:
            case 39:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
            case 82:
            case 85:
            case 87:
            case 88:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case C5043c9.f31374J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C5043c9.f31375K /* 38 */:
            case 39:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
            case 105:
            case 107:
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case io.appmetrica.analytics.BuildConfig.API_LEVEL /* 115 */:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case C5043c9.f31374J /* 35 */:
                objArr[1] = "getCollection";
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case C5043c9.f31375K /* 38 */:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case C5043c9.f31376L /* 40 */:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case C5043c9.f31377M /* 42 */:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case NativeMac.KEY_LENGTH /* 64 */:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case C5043c9.f31374J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C5043c9.f31375K /* 38 */:
            case 39:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case io.appmetrica.analytics.BuildConfig.API_LEVEL /* 115 */:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case C5043c9.f31374J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C5043c9.f31375K /* 38 */:
            case 39:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case NativeMac.KEY_LENGTH /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static boolean m26491b(InterfaceC6976us interfaceC6976us, C0789MX c0789mx) {
        if (interfaceC6976us == null) {
            m26490a(104);
            throw null;
        }
        if (c0789mx != null) {
            return interfaceC6976us.getName().equals(c0789mx.m5392f()) && c0789mx.equals(AbstractC6814sI.m24695g(interfaceC6976us));
        }
        m26490a(105);
        throw null;
    }

    /* renamed from: r */
    public static EnumC11005sD0 m26492r(InterfaceC0873Ns interfaceC0873Ns) {
        if (interfaceC0873Ns == null) {
            m26490a(78);
            throw null;
        }
        if (AbstractC10604p41.f39801a0.contains(interfaceC0873Ns.getName())) {
            return (EnumC11005sD0) AbstractC10604p41.f39805c0.get(AbstractC6814sI.m24695g(interfaceC0873Ns));
        }
        return null;
    }

    /* renamed from: t */
    public static EnumC11005sD0 m26493t(InterfaceC6976us interfaceC6976us) {
        if (interfaceC6976us == null) {
            m26490a(77);
            throw null;
        }
        if (AbstractC10604p41.f39799Z.contains(interfaceC6976us.getName())) {
            return (EnumC11005sD0) AbstractC10604p41.f39803b0.get(AbstractC6814sI.m24695g(interfaceC6976us));
        }
        return null;
    }

    /* renamed from: x */
    public static boolean m26494x(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 != null) {
            return m26482A(abstractC7742Ig0, AbstractC10604p41.f39800a);
        }
        m26490a(140);
        throw null;
    }

    /* renamed from: y */
    public static boolean m26495y(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 != null) {
            return m26482A(abstractC7742Ig0, AbstractC10604p41.f39809g);
        }
        m26490a(89);
        throw null;
    }

    /* renamed from: z */
    public static boolean m26496z(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD != null) {
            return AbstractC6814sI.m24697i(interfaceC0140CD, C1493Xj.class, false) != null;
        }
        m26490a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: c */
    public final void m26497c(boolean z) {
        C8340Tt0 c8340Tt0 = f46926e;
        O90.m5968f(c8340Tt0, "moduleName");
        C8582Yk0 c8582Yk0 = this.f46930d;
        C7454Cs0 c7454Cs0 = new C7454Cs0(c8340Tt0, c8582Yk0, this, 48);
        this.f46927a = c7454Cs0;
        InterfaceC1304Uj.f11997a.getClass();
        InterfaceC7416Bz0 interfaceC7416Bz0M8839a = ((C1430Wj) ((InterfaceC1304Uj) C1241Tj.f11481b.getValue())).m8839a(c8582Yk0, this.f46927a, mo8087l(), mo8088p(), mo8086d(), z);
        O90.m5968f(interfaceC7416Bz0M8839a, "providerForModuleContent");
        c7454Cs0.f1739i = interfaceC7416Bz0M8839a;
        C7454Cs0 c7454Cs02 = this.f46927a;
        c7454Cs02.getClass();
        c7454Cs02.f1738h = new C7621Fx1(AbstractC0576J8.m4173D(new C7454Cs0[]{c7454Cs02}));
    }

    /* renamed from: d */
    public InterfaceC6593p3 mo8086d() {
        return C1210TE.f11208c;
    }

    /* renamed from: e */
    public final X01 m26498e() {
        X01 x01Mo1492m = m26503j("Any").mo1492m();
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        m26490a(51);
        throw null;
    }

    /* renamed from: f */
    public final AbstractC7742Ig0 m26499f(AbstractC7742Ig0 abstractC7742Ig0) {
        C0055As c0055AsM25153f;
        C0055As c0055As;
        InterfaceC6976us interfaceC6976usM17465b;
        X01 x01Mo1492m = null;
        if (abstractC7742Ig0 == null) {
            m26490a(68);
            throw null;
        }
        if (m26495y(abstractC7742Ig0)) {
            if (abstractC7742Ig0.mo3800u().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = ((AbstractC10804qe1) abstractC7742Ig0.mo3800u().get(0)).mo24038b();
            if (abstractC7742Ig0Mo24038b != null) {
                return abstractC7742Ig0Mo24038b;
            }
            m26490a(69);
            throw null;
        }
        AbstractC8315Tg1 abstractC8315Tg1M789g = AbstractC7375Be1.m789g(abstractC7742Ig0, false);
        AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) ((C11828yg0) this.f46928b.invoke()).f46414b.get(abstractC8315Tg1M789g);
        if (abstractC7742Ig02 != null) {
            return abstractC7742Ig02;
        }
        int i = AbstractC6814sI.f42360a;
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC8315Tg1M789g.mo3797E().mo1962a();
        InterfaceC7402Bs0 interfaceC7402Bs0M24693e = interfaceC0873NsMo1962a == null ? null : AbstractC6814sI.m24693e(interfaceC0873NsMo1962a);
        if (interfaceC7402Bs0M24693e != null) {
            InterfaceC0873Ns interfaceC0873NsMo1962a2 = abstractC8315Tg1M789g.mo3797E().mo1962a();
            if (interfaceC0873NsMo1962a2 != null) {
                Set set = AbstractC8211Rg1.f10374a;
                C8340Tt0 name = interfaceC0873NsMo1962a2.getName();
                O90.m5968f(name, "name");
                if (AbstractC8211Rg1.f10377d.contains(name) && (c0055AsM25153f = AbstractC6940uI.m25153f(interfaceC0873NsMo1962a2)) != null && (c0055As = (C0055As) AbstractC8211Rg1.f10375b.get(c0055AsM25153f)) != null && (interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0M24693e, c0055As)) != null) {
                    x01Mo1492m = interfaceC6976usM17465b.mo1492m();
                }
            }
            if (x01Mo1492m != null) {
                return x01Mo1492m;
            }
        }
        throw new IllegalStateException("not array: " + abstractC7742Ig0);
    }

    /* renamed from: g */
    public final X01 m26500g(AbstractC8315Tg1 abstractC8315Tg1) {
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
        if (abstractC8315Tg1 != null) {
            return m26501h(enumC9532gi1, abstractC8315Tg1, S20.f10539b);
        }
        m26490a(84);
        throw null;
    }

    /* renamed from: h */
    public final X01 m26501h(EnumC9532gi1 enumC9532gi1, AbstractC7742Ig0 abstractC7742Ig0, InterfaceC0510I5 interfaceC0510I5) {
        if (abstractC7742Ig0 != null) {
            return NV1.m5741y(AbstractC9514gZ1.m18584e(interfaceC0510I5), m26503j("Array"), Collections.singletonList(new C10988s41(abstractC7742Ig0, enumC9532gi1)));
        }
        m26490a(80);
        throw null;
    }

    /* renamed from: i */
    public final InterfaceC6976us m26502i(C0664KX c0664kx) {
        if (c0664kx == null) {
            m26490a(12);
            throw null;
        }
        C7454Cs0 c7454Cs0M26504k = m26504k();
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47094a;
        InterfaceC6976us interfaceC6976usM3937c = IZ1.m3937c(c7454Cs0M26504k, c0664kx);
        if (interfaceC6976usM3937c != null) {
            return interfaceC6976usM3937c;
        }
        m26490a(13);
        throw null;
    }

    /* renamed from: j */
    public final InterfaceC6976us m26503j(String str) {
        if (str != null) {
            return (InterfaceC6976us) this.f46929c.invoke(C8340Tt0.m7798e(str));
        }
        m26490a(14);
        throw null;
    }

    /* renamed from: k */
    public final C7454Cs0 m26504k() {
        this.f46927a.getClass();
        C7454Cs0 c7454Cs0 = this.f46927a;
        if (c7454Cs0 != null) {
            return c7454Cs0;
        }
        m26490a(7);
        throw null;
    }

    /* renamed from: l */
    public Iterable mo8087l() {
        List listSingletonList = Collections.singletonList(new C1053Qj(this.f46930d, m26504k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m26490a(5);
        throw null;
    }

    /* renamed from: m */
    public final X01 m26505m() {
        X01 x01M26507o = m26507o();
        if (x01M26507o != null) {
            return x01M26507o;
        }
        m26490a(53);
        throw null;
    }

    /* renamed from: n */
    public final X01 m26506n() {
        X01 x01Mo1492m = m26503j("Nothing").mo1492m();
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        m26490a(49);
        throw null;
    }

    /* renamed from: o */
    public final X01 m26507o() {
        X01 x01Mo250P = m26498e().mo250P(true);
        if (x01Mo250P != null) {
            return x01Mo250P;
        }
        m26490a(52);
        throw null;
    }

    /* renamed from: p */
    public InterfaceC11257uB0 mo8088p() {
        return OJ1.f8358d;
    }

    /* renamed from: q */
    public final X01 m26508q(EnumC11005sD0 enumC11005sD0) {
        if (enumC11005sD0 == null) {
            m26490a(74);
            throw null;
        }
        X01 x01 = (X01) ((C11828yg0) this.f46928b.invoke()).f46413a.get(enumC11005sD0);
        if (x01 != null) {
            return x01;
        }
        m26490a(75);
        throw null;
    }

    /* renamed from: s */
    public final X01 m26509s(EnumC11005sD0 enumC11005sD0) {
        if (enumC11005sD0 == null) {
            m26490a(54);
            throw null;
        }
        X01 x01Mo1492m = m26503j(enumC11005sD0.f42314a.m7801b()).mo1492m();
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        m26490a(55);
        throw null;
    }

    /* renamed from: u */
    public final X01 m26510u() {
        X01 x01Mo1492m = m26503j("String").mo1492m();
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        m26490a(66);
        throw null;
    }

    /* renamed from: v */
    public final InterfaceC6976us m26511v(int i) {
        return m26502i(AbstractC10732q41.f40582f.m4655c(C8340Tt0.m7798e(C0603JZ.f5603c.f6191b + i)));
    }

    /* renamed from: w */
    public final X01 m26512w() {
        X01 x01Mo1492m = m26503j("Unit").mo1492m();
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        m26490a(65);
        throw null;
    }
}
