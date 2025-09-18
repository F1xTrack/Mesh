package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class EL1 {

    /* renamed from: b */
    public static final AtomicReference f2644b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f2645c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f2646d = new AtomicReference();

    /* renamed from: a */
    public final A61 f2647a;

    public EL1(A61 a61) {
        this.f2647a = a61;
    }

    /* renamed from: c */
    public static String m2161c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
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

    /* renamed from: a */
    public final String m2162a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f2647a.m55b()) {
            return bundle.toString();
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM26238o.length() != 8) {
                sbM26238o.append(", ");
            }
            sbM26238o.append(m2166f(str));
            sbM26238o.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Object obj = bundle.get(str);
            sbM26238o.append(obj instanceof Bundle ? m2165e(new Object[]{obj}) : obj instanceof Object[] ? m2165e((Object[]) obj) : obj instanceof ArrayList ? m2165e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbM26238o.append("}]");
        return sbM26238o.toString();
    }

    /* renamed from: b */
    public final String m2163b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f2647a.m55b() ? str : m2161c(str, AbstractC10638pL1.f40029c, AbstractC10638pL1.f40027a, f2644b);
    }

    /* renamed from: d */
    public final String m2164d(C11894zB1 c11894zB1) {
        A61 a61 = this.f2647a;
        if (!a61.m55b()) {
            return c11894zB1.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c11894zB1.f46719c);
        sb.append(",name=");
        sb.append(m2163b(c11894zB1.f46717a));
        sb.append(",params=");
        C10362nB1 c10362nB1 = c11894zB1.f46718b;
        sb.append(c10362nB1 == null ? null : !a61.m55b() ? c10362nB1.f38167a.toString() : m2162a(c10362nB1.m23098m0()));
        return sb.toString();
    }

    /* renamed from: e */
    public final String m2165e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("[");
        for (Object obj : objArr) {
            String strM2162a = obj instanceof Bundle ? m2162a((Bundle) obj) : String.valueOf(obj);
            if (strM2162a != null) {
                if (sbM26238o.length() != 1) {
                    sbM26238o.append(", ");
                }
                sbM26238o.append(strM2162a);
            }
        }
        sbM26238o.append("]");
        return sbM26238o.toString();
    }

    /* renamed from: f */
    public final String m2166f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f2647a.m55b() ? str : m2161c(str, AbstractC9998kL1.f36436b, AbstractC9998kL1.f36435a, f2645c);
    }

    /* renamed from: g */
    public final String m2167g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f2647a.m55b() ? str : str.startsWith("_exp_") ? AbstractC7222ym.m26234k("experiment_id(", str, ")") : m2161c(str, AbstractC10766qL1.f40795b, AbstractC10766qL1.f40794a, f2646d);
    }
}
