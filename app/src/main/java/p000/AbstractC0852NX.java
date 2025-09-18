package p000;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.Scopes;

/* renamed from: NX */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0852NX {

    /* renamed from: a */
    public static int[] f7856a;

    /* renamed from: a */
    public static C0149CM m5752a(InterfaceC9914jh1 interfaceC9914jh1) {
        C0149CM c0149cm = (C0149CM) interfaceC9914jh1.mo4792q(M60.f6994z0, C0149CM.f1328c);
        c0149cm.getClass();
        return c0149cm;
    }

    /* renamed from: b */
    public static int m5753b(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Integer) interfaceC9914jh1.mo4792q(M60.f6993y0, 0)).intValue();
    }

    /* renamed from: c */
    public static void m5754c(I50 i50, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = i50.getChildCount(view) - 1; childCount >= 0; childCount--) {
            i50.removeViewAt(view, childCount);
        }
    }

    /* renamed from: d */
    public static AbstractC1633Zx m5755d(ReactApplicationContext reactApplicationContext, String str) {
        int i;
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("facebook")) {
            i = 1;
        } else if (str.equals("facebookstories")) {
            i = 2;
        } else if (str.equals("generic")) {
            i = 3;
        } else if (str.equals("pagesmanager")) {
            i = 4;
        } else if (str.equals("twitter")) {
            i = 5;
        } else if (str.equals("whatsapp")) {
            i = 6;
        } else if (str.equals("whatsappbusiness")) {
            i = 7;
        } else if (str.equals("instagram")) {
            i = 8;
        } else if (str.equals("instagramstories")) {
            i = 9;
        } else if (str.equals("googleplus")) {
            i = 10;
        } else if (str.equals(Scopes.EMAIL)) {
            i = 11;
        } else if (str.equals("pinterest")) {
            i = 12;
        } else if (str.equals("messenger")) {
            i = 13;
        } else if (str.equals("snapchat")) {
            i = 14;
        } else if (str.equals("sms")) {
            i = 15;
        } else if (str.equals("linkedin")) {
            i = 16;
        } else if (str.equals("telegram")) {
            i = 17;
        } else if (str.equals("viber")) {
            i = 18;
        } else {
            if (!str.equals("discord")) {
                throw new IllegalArgumentException("No enum constant cl.json.RNShareImpl.SHARES.".concat(str));
            }
            i = 19;
        }
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
                return new C1467XJ(reactApplicationContext, 3);
            case 1:
                C1467XJ c1467xj = new C1467XJ(reactApplicationContext, 4);
                c1467xj.f15236b = new Intent("com.facebook.stories.ADD_TO_STORY");
                return c1467xj;
            case 2:
                return new J00(reactApplicationContext);
            case 3:
                return new C1467XJ(reactApplicationContext, 2);
            case 4:
                return new C1467XJ(reactApplicationContext, 13);
            case 5:
                return new C1467XJ(reactApplicationContext, 16);
            case 6:
                return new C1467XJ(reactApplicationContext, 15);
            case 7:
                return new C1467XJ(reactApplicationContext, 6);
            case 8:
                C1467XJ c1467xj2 = new C1467XJ(reactApplicationContext, 7);
                c1467xj2.f15236b = new Intent("com.instagram.share.ADD_TO_STORY");
                return c1467xj2;
            case 9:
                return new C1467XJ(reactApplicationContext, 5);
            case 10:
                return new C1467XJ(reactApplicationContext, 1);
            case 11:
                return new C1467XJ(reactApplicationContext, 10);
            case 12:
                return new C1467XJ(reactApplicationContext, 9);
            case 13:
                return new C1467XJ(reactApplicationContext, 11);
            case 14:
                C11039sU0 c11039sU0 = new C11039sU0(reactApplicationContext);
                c11039sU0.f42457f = reactApplicationContext;
                return c11039sU0;
            case 15:
                return new C1467XJ(reactApplicationContext, 8);
            case 16:
                return new C1467XJ(reactApplicationContext, 12);
            case 17:
                return new C1467XJ(reactApplicationContext, 14);
            case 18:
                return new C1467XJ(reactApplicationContext, 0);
            default:
                return null;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m5756e(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    /* renamed from: f */
    public static int m5757f(int i, int i2, int i3, int i4) {
        return C6709qu.m24080B(i) + i2 + i3 + i4;
    }

    /* renamed from: g */
    public static String m5758g(long j, String str) {
        return str + j;
    }

    /* renamed from: h */
    public static String m5759h(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: i */
    public static String m5760i(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: j */
    public static /* synthetic */ String m5761j(CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append((CharSequence) HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static StringBuilder m5762k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: l */
    public static /* synthetic */ void m5763l(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        O90.m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: m */
    public static /* synthetic */ void m5764m(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(O90.m5971i(str));
        O90.m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: n */
    public static void m5765n(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    /* renamed from: o */
    public static void m5766o(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HMSLog.m12620e(str, sb.toString());
    }

    /* renamed from: p */
    public static void m5767p(String str, int i) {
        AbstractC10872rA1.m24175h(str + i);
    }

    /* renamed from: q */
    public static /* synthetic */ void m5768q(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC7222ym.m26232i(str, " must not be null"));
        O90.m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: r */
    public static /* synthetic */ String m5769r(int i) {
        switch (i) {
            case 1:
                return "facebook";
            case 2:
                return "facebookstories";
            case 3:
                return "generic";
            case 4:
                return "pagesmanager";
            case 5:
                return "twitter";
            case 6:
                return "whatsapp";
            case 7:
                return "whatsappbusiness";
            case 8:
                return "instagram";
            case 9:
                return "instagramstories";
            case 10:
                return "googleplus";
            case 11:
                return Scopes.EMAIL;
            case 12:
                return "pinterest";
            case 13:
                return "messenger";
            case 14:
                return "snapchat";
            case 15:
                return "sms";
            case 16:
                return "linkedin";
            case 17:
                return "telegram";
            case 18:
                return "viber";
            case 19:
                return "discord";
            default:
                throw null;
        }
    }

    /* renamed from: s */
    public static /* synthetic */ String m5770s(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* renamed from: t */
    public static /* synthetic */ String m5771t(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* renamed from: u */
    public static /* synthetic */ int m5772u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SPINNER")) {
            return 1;
        }
        if (str.equals("DEFAULT")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.reactcommunity.rndatetimepicker.RNDatePickerDisplay.".concat(str));
    }

    /* renamed from: v */
    public static /* synthetic */ int m5773v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEFAULT")) {
            return 1;
        }
        if (str.equals("KEYBOARD")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.reactcommunity.rndatetimepicker.RNMaterialInputMode.".concat(str));
    }

    /* renamed from: w */
    public static /* synthetic */ int m5774w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SPINNER")) {
            return 1;
        }
        if (str.equals("DEFAULT")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.reactcommunity.rndatetimepicker.RNTimePickerDisplay.".concat(str));
    }

    /* renamed from: x */
    public static /* synthetic */ int m5775x(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("Audio")) {
            return 1;
        }
        if (str.equals("Image")) {
            return 2;
        }
        if (str.equals("Video")) {
            return 3;
        }
        if (str.equals("Download")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.ReactNativeBlobUtil.ReactNativeBlobUtilMediaCollection.MediaType.".concat(str));
    }
}
