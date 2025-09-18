package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class OL1 extends SQ1 {
    public char d;
    public long e;
    public String f;
    public final C6934rx g;
    public final C6934rx h;
    public final C6934rx i;
    public final C6934rx j;
    public final C6934rx k;
    public final C6934rx l;
    public final C6934rx m;
    public final C6934rx n;
    public final C6934rx o;

    public OL1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.d = (char) 0;
        this.e = -1L;
        this.g = new C6934rx(this, 6, false, false);
        this.h = new C6934rx(this, 6, true, false);
        this.i = new C6934rx(this, 6, false, true);
        this.j = new C6934rx(this, 5, false, false);
        this.k = new C6934rx(this, 5, true, false);
        this.l = new C6934rx(this, 5, false, true);
        this.m = new C6934rx(this, 4, false, false);
        this.n = new C6934rx(this, 3, false, false);
        this.o = new C6934rx(this, 2, false, false);
    }

    public static String A1(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strZ1 = z1(obj, z);
        String strZ12 = z1(obj2, z);
        String strZ13 = z1(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZ1)) {
            sb.append(str2);
            sb.append(strZ1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZ12)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZ12);
        }
        if (!TextUtils.isEmpty(strZ13)) {
            sb.append(str3);
            sb.append(strZ13);
        }
        return sb.toString();
    }

    public static C4331iM1 B1(String str) {
        if (str == null) {
            return null;
        }
        return new C4331iM1(str);
    }

    public static String z1(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C4331iM1 ? ((C4331iM1) obj).a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = C3386dP1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb.toString();
    }

    public final void C1(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && D1(i)) {
            A1(false, str, obj, obj2, obj3);
            I1();
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        C7595vO1 c7595vO1 = ((C3386dP1) this.b).j;
        if (c7595vO1 == null) {
            I1();
            return;
        }
        if (!c7595vO1.c) {
            I1();
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        c7595vO1.E1(new RunnableC2311bM1(this, i, str, obj, obj2, obj3));
    }

    public final boolean D1(int i) {
        return Log.isLoggable(I1(), i);
    }

    public final C6934rx E1() {
        return this.n;
    }

    public final C6934rx F1() {
        return this.g;
    }

    public final C6934rx G1() {
        return this.o;
    }

    public final C6934rx H1() {
        return this.j;
    }

    public final String I1() {
        String str;
        synchronized (this) {
            try {
                if (this.f == null) {
                    String str2 = ((C3386dP1) this.b).d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f = str2;
                }
                Preconditions.checkNotNull(this.f);
                str = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // defpackage.SQ1
    public final boolean y1() {
        return false;
    }
}
