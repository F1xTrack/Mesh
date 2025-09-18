package p000;

import android.os.Bundle;

/* renamed from: pE1 */
/* loaded from: classes.dex */
public abstract class AbstractC10624pE1 {

    /* renamed from: a */
    public static final V70 f39956a;

    /* renamed from: b */
    public static final C9367fQ0 f39957b;

    /* renamed from: c */
    public static final C9367fQ0 f39958c;

    /* renamed from: d */
    public static final C9367fQ0 f39959d;

    /* renamed from: e */
    public static final C9367fQ0 f39960e;

    /* renamed from: f */
    public static final C9367fQ0 f39961f;

    static {
        int i = V70.f12378c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f39956a = V70.m8307t(15, objArr);
        N70 n70 = P70.f8867b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC9088dE1.m17509a(7, objArr2);
        f39957b = P70.m6232s(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC9088dE1.m17509a(3, objArr3);
        f39958c = P70.m6232s(3, objArr3);
        f39959d = P70.m6230C("_r", "_dbg");
        M70 m70 = new M70(4);
        m70.m3756b(AbstractC10766qL1.f40794a);
        m70.m3756b(AbstractC10766qL1.f40795b);
        f39960e = m70.m5273h();
        f39961f = P70.m6230C("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* renamed from: a */
    public static boolean m23661a(Bundle bundle, String str) {
        if (f39957b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        C9367fQ0 c9367fQ0 = f39959d;
        int size = c9367fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c9367fQ0.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m23662b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f39960e.contains(str2)) {
            return false;
        }
        C9367fQ0 c9367fQ0 = f39961f;
        int size = c9367fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c9367fQ0.get(i);
            i++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m23663c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m23664d(str) || bundle == null) {
            return false;
        }
        C9367fQ0 c9367fQ0 = f39959d;
        int size = c9367fQ0.size();
        int i = 0;
        while (i < size) {
            Object obj = c9367fQ0.get(i);
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

    /* renamed from: d */
    public static boolean m23664d(String str) {
        return !f39958c.contains(str);
    }
}
