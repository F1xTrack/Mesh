package defpackage;

import android.os.Bundle;

/* renamed from: pE1 */
/* loaded from: classes.dex */
public abstract class AbstractC6420pE1 {
    public static final V70 a;
    public static final C3769fQ0 b;
    public static final C3769fQ0 c;
    public static final C3769fQ0 d;
    public static final C3769fQ0 e;
    public static final C3769fQ0 f;

    static {
        int i = V70.c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        a = V70.t(15, objArr);
        N70 n70 = P70.b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC3353dE1.a(7, objArr2);
        b = P70.s(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC3353dE1.a(3, objArr3);
        c = P70.s(3, objArr3);
        d = P70.C("_r", "_dbg");
        M70 m70 = new M70(4);
        m70.b(AbstractC6632qL1.a);
        m70.b(AbstractC6632qL1.b);
        e = m70.h();
        f = P70.C("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        C3769fQ0 c3769fQ0 = d;
        int size = c3769fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c3769fQ0.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        C3769fQ0 c3769fQ0 = f;
        int size = c3769fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c3769fQ0.get(i);
            i++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        C3769fQ0 c3769fQ0 = d;
        int size = c3769fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c3769fQ0.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.getClass();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean d(String str) {
        return !c.contains(str);
    }
}
