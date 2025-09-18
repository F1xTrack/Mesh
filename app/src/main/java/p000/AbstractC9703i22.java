package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: i22 */
/* loaded from: classes.dex */
public abstract class AbstractC9703i22 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: a */
    public static final AbstractC10522oR1 m18934a(String str) {
        C11041sV0 c11041sV0 = C11041sV0.f42461d;
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return C11041sV0.f42464g;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return C11041sV0.f42462e;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return C11041sV0.f42459b;
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        return c11041sV0;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        return C11041sV0.f42463f;
                    }
                    break;
            }
        }
        if (str != null) {
            AbstractC3929dS.m17683p("ReactNative");
        }
        return c11041sV0;
    }

    /* renamed from: b */
    public static String m18935b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("<", str2, " threw ");
                    sbM26240q.append(e.getClass().getName());
                    sbM26240q.append(">");
                    string = sbM26240q.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
