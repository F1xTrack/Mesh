package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class EL1 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final A61 a;

    public EL1(A61 a61) {
        this.a = a61;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.b()) {
            return bundle.toString();
        }
        StringBuilder sbO = AbstractC8235ym.o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbO.length() != 8) {
                sbO.append(", ");
            }
            sbO.append(f(str));
            sbO.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Object obj = bundle.get(str);
            sbO.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbO.append("}]");
        return sbO.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : c(str, AbstractC6441pL1.c, AbstractC6441pL1.a, b);
    }

    public final String d(C8316zB1 c8316zB1) {
        A61 a61 = this.a;
        if (!a61.b()) {
            return c8316zB1.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c8316zB1.c);
        sb.append(",name=");
        sb.append(b(c8316zB1.a));
        sb.append(",params=");
        C6029nB1 c6029nB1 = c8316zB1.b;
        sb.append(c6029nB1 == null ? null : !a61.b() ? c6029nB1.a.toString() : a(c6029nB1.m0()));
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbO = AbstractC8235ym.o("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sbO.length() != 1) {
                    sbO.append(", ");
                }
                sbO.append(strA);
            }
        }
        sbO.append("]");
        return sbO.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : c(str, AbstractC5486kL1.b, AbstractC5486kL1.a, c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : str.startsWith("_exp_") ? AbstractC8235ym.k("experiment_id(", str, ")") : c(str, AbstractC6632qL1.b, AbstractC6632qL1.a, d);
    }
}
