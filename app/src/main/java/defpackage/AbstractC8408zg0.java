package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.swmansion.reanimated.BuildConfig;
import com.vk.push.core.base.AidlException;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: zg0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8408zg0 {
    public static final C1559Tt0 e = C1559Tt0.g("<built-ins module>");
    public C0231Cs0 a;
    public final C1688Vk0 b;
    public final C1454Sk0 c;
    public final C1922Yk0 d;

    public AbstractC8408zg0(C1922Yk0 c1922Yk0) {
        this.d = c1922Yk0;
        c1922Yk0.a(new C8028xg0(this, 0));
        this.b = new C1688Vk0(c1922Yk0, new C8028xg0(this, 1));
        this.c = c1922Yk0.b(new B(2, this));
    }

    public static boolean A(AbstractC0663Ig0 abstractC0663Ig0, MX mx) {
        if (abstractC0663Ig0 == null) {
            a(98);
            throw null;
        }
        if (mx != null) {
            return G(abstractC0663Ig0.E(), mx);
        }
        a(99);
        throw null;
    }

    public static boolean B(AbstractC0663Ig0 abstractC0663Ig0, MX mx) {
        if (mx != null) {
            return A(abstractC0663Ig0, mx) && !abstractC0663Ig0.G();
        }
        a(ModuleDescriptor.MODULE_VERSION);
        throw null;
    }

    public static boolean C(AZ az) {
        if (az.x1().getAnnotations().g(AbstractC6390p41.m)) {
            return true;
        }
        if (!(az instanceof CE0)) {
            return false;
        }
        CE0 ce0 = (CE0) az;
        boolean zS0 = ce0.s0();
        FE0 fe0C = ce0.c();
        JE0 je0D = ce0.d();
        if (fe0C != null && C(fe0C)) {
            if (!zS0) {
                return true;
            }
            if (je0D != null && C(je0D)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(AbstractC0663Ig0 abstractC0663Ig0, MX mx) {
        if (abstractC0663Ig0 == null) {
            a(106);
            throw null;
        }
        if (mx != null) {
            return !abstractC0663Ig0.G() && A(abstractC0663Ig0, mx);
        }
        a(107);
        throw null;
    }

    public static boolean E(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(137);
            throw null;
        }
        if (abstractC0663Ig0 != null) {
            return A(abstractC0663Ig0, AbstractC6390p41.b) && !AbstractC0112Be1.e(abstractC0663Ig0);
        }
        a(139);
        throw null;
    }

    public static boolean F(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(95);
            throw null;
        }
        if (!abstractC0663Ig0.G()) {
            InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
            if (interfaceC1087NsA instanceof InterfaceC7492us) {
                InterfaceC7492us interfaceC7492us = (InterfaceC7492us) interfaceC1087NsA;
                if (interfaceC7492us == null) {
                    a(97);
                    throw null;
                }
                if (t(interfaceC7492us) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean G(InterfaceC1200Pd1 interfaceC1200Pd1, MX mx) {
        if (interfaceC1200Pd1 == null) {
            a(102);
            throw null;
        }
        if (mx != null) {
            InterfaceC1087Ns interfaceC1087NsA = interfaceC1200Pd1.a();
            return (interfaceC1087NsA instanceof InterfaceC7492us) && b((InterfaceC7492us) interfaceC1087NsA, mx);
        }
        a(AidlException.HOST_IS_NOT_MASTER);
        throw null;
    }

    public static boolean H(InterfaceC1087Ns interfaceC1087Ns) {
        if (interfaceC1087Ns == null) {
            a(10);
            throw null;
        }
        for (InterfaceC1087Ns interfaceC1087NsI = interfaceC1087Ns; interfaceC1087NsI != null; interfaceC1087NsI = interfaceC1087NsI.i()) {
            if (interfaceC1087NsI instanceof InterfaceC8465zz0) {
                return ((AbstractC0096Az0) ((InterfaceC8465zz0) interfaceC1087NsI)).f.h(AbstractC6581q41.k);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
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
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C4473c9.K /* 38 */:
            case 39:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
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
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C4473c9.K /* 38 */:
            case 39:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
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
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C4473c9.K /* 38 */:
            case 39:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
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
            case C4473c9.J /* 35 */:
                objArr[1] = "getCollection";
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case C4473c9.K /* 38 */:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case C4473c9.L /* 40 */:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case C4473c9.M /* 42 */:
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
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C4473c9.K /* 38 */:
            case 39:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
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
            case C4473c9.J /* 35 */:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case 37:
            case C4473c9.K /* 38 */:
            case 39:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
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

    public static boolean b(InterfaceC7492us interfaceC7492us, MX mx) {
        if (interfaceC7492us == null) {
            a(104);
            throw null;
        }
        if (mx != null) {
            return interfaceC7492us.getName().equals(mx.f()) && mx.equals(AbstractC7002sI.g(interfaceC7492us));
        }
        a(105);
        throw null;
    }

    public static EnumC6988sD0 r(InterfaceC1087Ns interfaceC1087Ns) {
        if (interfaceC1087Ns == null) {
            a(78);
            throw null;
        }
        if (AbstractC6390p41.a0.contains(interfaceC1087Ns.getName())) {
            return (EnumC6988sD0) AbstractC6390p41.c0.get(AbstractC7002sI.g(interfaceC1087Ns));
        }
        return null;
    }

    public static EnumC6988sD0 t(InterfaceC7492us interfaceC7492us) {
        if (interfaceC7492us == null) {
            a(77);
            throw null;
        }
        if (AbstractC6390p41.Z.contains(interfaceC7492us.getName())) {
            return (EnumC6988sD0) AbstractC6390p41.b0.get(AbstractC7002sI.g(interfaceC7492us));
        }
        return null;
    }

    public static boolean x(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 != null) {
            return A(abstractC0663Ig0, AbstractC6390p41.a);
        }
        a(140);
        throw null;
    }

    public static boolean y(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 != null) {
            return A(abstractC0663Ig0, AbstractC6390p41.g);
        }
        a(89);
        throw null;
    }

    public static boolean z(CD cd) {
        if (cd != null) {
            return AbstractC7002sI.i(cd, C1840Xj.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(boolean z) {
        C1559Tt0 c1559Tt0 = e;
        O90.f(c1559Tt0, "moduleName");
        C1922Yk0 c1922Yk0 = this.d;
        C0231Cs0 c0231Cs0 = new C0231Cs0(c1559Tt0, c1922Yk0, this, 48);
        this.a = c0231Cs0;
        InterfaceC1606Uj.a.getClass();
        InterfaceC0174Bz0 interfaceC0174Bz0A = ((C1762Wj) ((InterfaceC1606Uj) C1528Tj.b.getValue())).a(c1922Yk0, this.a, l(), p(), d(), z);
        O90.f(interfaceC0174Bz0A, "providerForModuleContent");
        c0231Cs0.i = interfaceC0174Bz0A;
        C0231Cs0 c0231Cs02 = this.a;
        c0231Cs02.getClass();
        c0231Cs02.h = new C0481Fx1(J8.D(new C0231Cs0[]{c0231Cs02}));
    }

    public InterfaceC6384p3 d() {
        return TE.c;
    }

    public final X01 e() {
        X01 x01M = j("Any").m();
        if (x01M != null) {
            return x01M;
        }
        a(51);
        throw null;
    }

    public final AbstractC0663Ig0 f(AbstractC0663Ig0 abstractC0663Ig0) {
        C0074As c0074AsF;
        C0074As c0074As;
        InterfaceC7492us interfaceC7492usB;
        X01 x01M = null;
        if (abstractC0663Ig0 == null) {
            a(68);
            throw null;
        }
        if (y(abstractC0663Ig0)) {
            if (abstractC0663Ig0.u().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC0663Ig0 abstractC0663Ig0B = ((AbstractC6689qe1) abstractC0663Ig0.u().get(0)).b();
            if (abstractC0663Ig0B != null) {
                return abstractC0663Ig0B;
            }
            a(69);
            throw null;
        }
        AbstractC1521Tg1 abstractC1521Tg1G = AbstractC0112Be1.g(abstractC0663Ig0, false);
        AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) ((C8218yg0) this.b.invoke()).b.get(abstractC1521Tg1G);
        if (abstractC0663Ig02 != null) {
            return abstractC0663Ig02;
        }
        int i = AbstractC7002sI.a;
        InterfaceC1087Ns interfaceC1087NsA = abstractC1521Tg1G.E().a();
        InterfaceC0153Bs0 interfaceC0153Bs0E = interfaceC1087NsA == null ? null : AbstractC7002sI.e(interfaceC1087NsA);
        if (interfaceC0153Bs0E != null) {
            InterfaceC1087Ns interfaceC1087NsA2 = abstractC1521Tg1G.E().a();
            if (interfaceC1087NsA2 != null) {
                Set set = AbstractC1365Rg1.a;
                C1559Tt0 name = interfaceC1087NsA2.getName();
                O90.f(name, "name");
                if (AbstractC1365Rg1.d.contains(name) && (c0074AsF = AbstractC7384uI.f(interfaceC1087NsA2)) != null && (c0074As = (C0074As) AbstractC1365Rg1.b.get(c0074AsF)) != null && (interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0E, c0074As)) != null) {
                    x01M = interfaceC7492usB.m();
                }
            }
            if (x01M != null) {
                return x01M;
            }
        }
        throw new IllegalStateException("not array: " + abstractC0663Ig0);
    }

    public final X01 g(AbstractC1521Tg1 abstractC1521Tg1) {
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
        if (abstractC1521Tg1 != null) {
            return h(enumC4015gi1, abstractC1521Tg1, S20.b);
        }
        a(84);
        throw null;
    }

    public final X01 h(EnumC4015gi1 enumC4015gi1, AbstractC0663Ig0 abstractC0663Ig0, I5 i5) {
        if (abstractC0663Ig0 != null) {
            return NV1.y(AbstractC3988gZ1.e(i5), j("Array"), Collections.singletonList(new C6962s41(abstractC0663Ig0, enumC4015gi1)));
        }
        a(80);
        throw null;
    }

    public final InterfaceC7492us i(KX kx) {
        if (kx == null) {
            a(12);
            throw null;
        }
        C0231Cs0 c0231Cs0K = k();
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.a;
        InterfaceC7492us interfaceC7492usC = IZ1.c(c0231Cs0K, kx);
        if (interfaceC7492usC != null) {
            return interfaceC7492usC;
        }
        a(13);
        throw null;
    }

    public final InterfaceC7492us j(String str) {
        if (str != null) {
            return (InterfaceC7492us) this.c.invoke(C1559Tt0.e(str));
        }
        a(14);
        throw null;
    }

    public final C0231Cs0 k() {
        this.a.getClass();
        C0231Cs0 c0231Cs0 = this.a;
        if (c0231Cs0 != null) {
            return c0231Cs0;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new C1294Qj(this.d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final X01 m() {
        X01 x01O = o();
        if (x01O != null) {
            return x01O;
        }
        a(53);
        throw null;
    }

    public final X01 n() {
        X01 x01M = j("Nothing").m();
        if (x01M != null) {
            return x01M;
        }
        a(49);
        throw null;
    }

    public final X01 o() {
        X01 x01P = e().P(true);
        if (x01P != null) {
            return x01P;
        }
        a(52);
        throw null;
    }

    public InterfaceC7364uB0 p() {
        return OJ1.d;
    }

    public final X01 q(EnumC6988sD0 enumC6988sD0) {
        if (enumC6988sD0 == null) {
            a(74);
            throw null;
        }
        X01 x01 = (X01) ((C8218yg0) this.b.invoke()).a.get(enumC6988sD0);
        if (x01 != null) {
            return x01;
        }
        a(75);
        throw null;
    }

    public final X01 s(EnumC6988sD0 enumC6988sD0) {
        if (enumC6988sD0 == null) {
            a(54);
            throw null;
        }
        X01 x01M = j(enumC6988sD0.a.b()).m();
        if (x01M != null) {
            return x01M;
        }
        a(55);
        throw null;
    }

    public final X01 u() {
        X01 x01M = j("String").m();
        if (x01M != null) {
            return x01M;
        }
        a(66);
        throw null;
    }

    public final InterfaceC7492us v(int i) {
        return i(AbstractC6581q41.f.c(C1559Tt0.e(JZ.c.b + i)));
    }

    public final X01 w() {
        X01 x01M = j("Unit").m();
        if (x01M != null) {
            return x01M;
        }
        a(65);
        throw null;
    }
}
