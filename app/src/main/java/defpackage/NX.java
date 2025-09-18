package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.Scopes;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public abstract /* synthetic */ class NX {
    public static int[] a;

    public static CM a(InterfaceC5361jh1 interfaceC5361jh1) {
        CM cm = (CM) interfaceC5361jh1.q(M60.z0, CM.c);
        cm.getClass();
        return cm;
    }

    public static int b(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Integer) interfaceC5361jh1.q(M60.y0, 0)).intValue();
    }

    public static void c(I50 i50, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = i50.getChildCount(view) - 1; childCount >= 0; childCount--) {
            i50.removeViewAt(view, childCount);
        }
    }

    public static AbstractC2038Zx d(ReactApplicationContext reactApplicationContext, String str) {
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
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return new XJ(reactApplicationContext, 3);
            case 1:
                XJ xj = new XJ(reactApplicationContext, 4);
                xj.b = new Intent("com.facebook.stories.ADD_TO_STORY");
                return xj;
            case 2:
                return new J00(reactApplicationContext);
            case 3:
                return new XJ(reactApplicationContext, 2);
            case 4:
                return new XJ(reactApplicationContext, 13);
            case 5:
                return new XJ(reactApplicationContext, 16);
            case 6:
                return new XJ(reactApplicationContext, 15);
            case 7:
                return new XJ(reactApplicationContext, 6);
            case 8:
                XJ xj2 = new XJ(reactApplicationContext, 7);
                xj2.b = new Intent("com.instagram.share.ADD_TO_STORY");
                return xj2;
            case 9:
                return new XJ(reactApplicationContext, 5);
            case 10:
                return new XJ(reactApplicationContext, 1);
            case 11:
                return new XJ(reactApplicationContext, 10);
            case 12:
                return new XJ(reactApplicationContext, 9);
            case 13:
                return new XJ(reactApplicationContext, 11);
            case 14:
                C7039sU0 c7039sU0 = new C7039sU0(reactApplicationContext);
                c7039sU0.f = reactApplicationContext;
                return c7039sU0;
            case 15:
                return new XJ(reactApplicationContext, 8);
            case 16:
                return new XJ(reactApplicationContext, 12);
            case 17:
                return new XJ(reactApplicationContext, 14);
            case 18:
                return new XJ(reactApplicationContext, 0);
            default:
                return null;
        }
    }

    public static /* synthetic */ boolean e(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return C6735qu.B(i) + i2 + i3 + i4;
    }

    public static String g(long j, String str) {
        return str + j;
    }

    public static String h(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String i(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ String j(CharSequence[] charSequenceArr) {
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

    public static StringBuilder k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void l(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        O90.m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void m(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(O90.i(str));
        O90.m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static void n(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    public static void o(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HMSLog.e(str, sb.toString());
    }

    public static void p(String str, int i) {
        AbstractC6789rA1.h(str + i);
    }

    public static /* synthetic */ void q(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC8235ym.i(str, " must not be null"));
        O90.m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String r(int i) {
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

    public static /* synthetic */ String s(int i) {
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

    public static /* synthetic */ String t(int i) {
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

    public static /* synthetic */ int u(String str) {
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

    public static /* synthetic */ int v(String str) {
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

    public static /* synthetic */ int w(String str) {
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

    public static /* synthetic */ int x(String str) {
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
