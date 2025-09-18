package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class OL1 extends SQ1 {

    /* renamed from: d */
    public char f8375d;

    /* renamed from: e */
    public long f8376e;

    /* renamed from: f */
    public String f8377f;

    /* renamed from: g */
    public final C6792rx f8378g;

    /* renamed from: h */
    public final C6792rx f8379h;

    /* renamed from: i */
    public final C6792rx f8380i;

    /* renamed from: j */
    public final C6792rx f8381j;

    /* renamed from: k */
    public final C6792rx f8382k;

    /* renamed from: l */
    public final C6792rx f8383l;

    /* renamed from: m */
    public final C6792rx f8384m;

    /* renamed from: n */
    public final C6792rx f8385n;

    /* renamed from: o */
    public final C6792rx f8386o;

    public OL1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f8375d = (char) 0;
        this.f8376e = -1L;
        this.f8378g = new C6792rx(this, 6, false, false);
        this.f8379h = new C6792rx(this, 6, true, false);
        this.f8380i = new C6792rx(this, 6, false, true);
        this.f8381j = new C6792rx(this, 5, false, false);
        this.f8382k = new C6792rx(this, 5, true, false);
        this.f8383l = new C6792rx(this, 5, false, true);
        this.f8384m = new C6792rx(this, 4, false, false);
        this.f8385n = new C6792rx(this, 3, false, false);
        this.f8386o = new C6792rx(this, 2, false, false);
    }

    /* renamed from: A1 */
    public static String m6025A1(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strM6027z1 = m6027z1(obj, z);
        String strM6027z12 = m6027z1(obj2, z);
        String strM6027z13 = m6027z1(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM6027z1)) {
            sb.append(str2);
            sb.append(strM6027z1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM6027z12)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM6027z12);
        }
        if (!TextUtils.isEmpty(strM6027z13)) {
            sb.append(str3);
            sb.append(strM6027z13);
        }
        return sb.toString();
    }

    /* renamed from: B1 */
    public static C9744iM1 m6026B1(String str) {
        if (str == null) {
            return null;
        }
        return new C9744iM1(str);
    }

    /* renamed from: z1 */
    public static String m6027z1(Object obj, boolean z) {
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
            return obj instanceof C9744iM1 ? ((C9744iM1) obj).f29110a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = C9110dP1.class.getCanonicalName();
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

    /* renamed from: C1 */
    public final void m6028C1(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m6029D1(i)) {
            m6025A1(false, str, obj, obj2, obj3);
            m6034I1();
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        C11412vO1 c11412vO1 = ((C9110dP1) this.f11615b).f26040j;
        if (c11412vO1 == null) {
            m6034I1();
            return;
        }
        if (!c11412vO1.f10765c) {
            m6034I1();
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        c11412vO1.m25412E1(new RunnableC8843bM1(this, i, str, obj, obj2, obj3));
    }

    /* renamed from: D1 */
    public final boolean m6029D1(int i) {
        return Log.isLoggable(m6034I1(), i);
    }

    /* renamed from: E1 */
    public final C6792rx m6030E1() {
        return this.f8385n;
    }

    /* renamed from: F1 */
    public final C6792rx m6031F1() {
        return this.f8378g;
    }

    /* renamed from: G1 */
    public final C6792rx m6032G1() {
        return this.f8386o;
    }

    /* renamed from: H1 */
    public final C6792rx m6033H1() {
        return this.f8381j;
    }

    /* renamed from: I1 */
    public final String m6034I1() {
        String str;
        synchronized (this) {
            try {
                if (this.f8377f == null) {
                    String str2 = ((C9110dP1) this.f11615b).f26034d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f8377f = str2;
                }
                Preconditions.checkNotNull(this.f8377f);
                str = this.f8377f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // p000.SQ1
    /* renamed from: y1 */
    public final boolean mo6035y1() {
        return false;
    }
}
