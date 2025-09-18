package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableMap;
import java.util.Arrays;

/* renamed from: Ce1 */
/* loaded from: classes2.dex */
public final class C0190Ce1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public static final C0190Ce1 f = new C0190Ce1(1, 0);
    public static final C0190Ce1 g = new C0190Ce1(1, 1);
    public static final C0190Ce1 h = new C0190Ce1(1, 2);
    public static final C0190Ce1 i = new C0190Ce1(1, 3);
    public static final C0190Ce1 j = new C0190Ce1(1, 4);
    public static final C0190Ce1 k = new C0190Ce1(1, 5);
    public static final C0190Ce1 l = new C0190Ce1(1, 6);
    public static final C0190Ce1 m = new C0190Ce1(1, 7);
    public static final C0190Ce1 n = new C0190Ce1(1, 8);
    public static final C0190Ce1 o = new C0190Ce1(1, 9);
    public static final C0190Ce1 p = new C0190Ce1(1, 10);
    public static final C0190Ce1 q = new C0190Ce1(1, 11);
    public static final C0190Ce1 r = new C0190Ce1(1, 12);
    public static final C0190Ce1 s = new C0190Ce1(1, 13);
    public static final C0190Ce1 t = new C0190Ce1(1, 14);
    public static final C0190Ce1 u = new C0190Ce1(1, 15);
    public static final C0190Ce1 v = new C0190Ce1(1, 16);
    public static final C0190Ce1 w = new C0190Ce1(1, 17);
    public static final C0190Ce1 x = new C0190Ce1(1, 18);
    public static final C0190Ce1 y = new C0190Ce1(1, 19);
    public static final C0190Ce1 z = new C0190Ce1(1, 20);
    public static final C0190Ce1 A = new C0190Ce1(1, 21);
    public static final C0190Ce1 B = new C0190Ce1(1, 22);
    public static final C0190Ce1 C = new C0190Ce1(1, 23);
    public static final C0190Ce1 D = new C0190Ce1(1, 24);
    public static final C0190Ce1 E = new C0190Ce1(1, 25);
    public static final C0190Ce1 F = new C0190Ce1(1, 26);
    public static final C0190Ce1 G = new C0190Ce1(1, 27);
    public static final C0190Ce1 H = new C0190Ce1(1, 28);
    public static final C0190Ce1 I = new C0190Ce1(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0190Ce1(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        boolean z2 = true;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        switch (this.e) {
            case 0:
                AbstractC1521Tg1 abstractC1521Tg1 = (AbstractC1521Tg1) obj;
                O90.f(abstractC1521Tg1, "it");
                InterfaceC1087Ns interfaceC1087NsA = abstractC1521Tg1.E().a();
                if (interfaceC1087NsA != null) {
                    if (!(interfaceC1087NsA instanceof InterfaceC0499Gd1) && !(interfaceC1087NsA instanceof InterfaceC5925me1)) {
                        z2 = false;
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            case 1:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 2:
                O90.f((WritableMap) obj, "$this$null");
                return c1518Tf1;
            case 3:
                C6818rK0 c6818rK0 = (C6818rK0) obj;
                if (c6818rK0 != null) {
                    c6818rK0.J();
                }
                return c1518Tf1;
            case 4:
                C6818rK0 c6818rK02 = (C6818rK0) obj;
                if (c6818rK02 != null) {
                    c6818rK02.K();
                }
                return c1518Tf1;
            case 5:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new C6563q0(3, viewGroup);
                }
                return null;
            case 6:
                Throwable th = (Throwable) obj;
                O90.f(th, "it");
                return !(th instanceof CQ0) ? new AQ0(th) : (CQ0) th;
            case 7:
                O90.f((Throwable) obj, "it");
                return c1518Tf1;
            case 8:
                Exception exc = (Exception) obj;
                O90.f(exc, "it");
                return new PS0(RQ1.b(exc));
            case 9:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 10:
                Exception exc2 = (Exception) obj;
                O90.f(exc2, "it");
                return new PS0(RQ1.b(exc2));
            case 11:
                Exception exc3 = (Exception) obj;
                O90.f(exc3, "it");
                return new PS0(RQ1.b(exc3));
            case 12:
                String str = (String) obj;
                O90.f(str, "packageName");
                return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
            case 13:
                String str2 = (String) obj;
                O90.f(str2, "packageName");
                return new ComponentName(str2, "com.vk.push.pushsdk.ipc.PushService");
            case 14:
                Exception exc4 = (Exception) obj;
                O90.f(exc4, "it");
                return new PS0(RQ1.b(exc4));
            case 15:
                String str3 = (String) obj;
                O90.f(str3, "packageName");
                return new ComponentName(str3, "com.vk.push.authsdk.ipc.AuthService");
            case 16:
                Context context = (Context) obj;
                O90.f(context, "$this$$receiver");
                C3860fu1.a.getClass();
                return (InterfaceC3729fD) C3860fu1.h.getValue(context, C3860fu1.b[5]);
            case 17:
                C0546Gt0 c0546Gt0 = (C0546Gt0) obj;
                O90.f(c0546Gt0, "prefs");
                Object objB = c0546Gt0.b(new LC0("master_host_pub"));
                Object objB2 = c0546Gt0.b(new LC0("master_host_package"));
                if (objB == null || objB2 == null) {
                    return null;
                }
                return new C5204is1((String) objB2, (String) objB);
            case 18:
                O90.f((C1498Sz) obj, "it");
                return AbstractC5871mM1.a(new MC0[0]);
            case 19:
                Context context2 = (Context) obj;
                O90.f(context2, "$this$$receiver");
                C3860fu1.a.getClass();
                return (InterfaceC3729fD) C3860fu1.h.getValue(context2, C3860fu1.b[5]);
            case 20:
                Exception exc5 = (Exception) obj;
                O90.f(exc5, "it");
                return new PS0(RQ1.b(exc5));
            case 21:
                C0546Gt0 c0546Gt02 = (C0546Gt0) obj;
                O90.f(c0546Gt02, "prefs");
                String str4 = (String) c0546Gt02.b(new LC0("master_default_host"));
                if (str4 != null) {
                    return new C6349os1(str4);
                }
                return null;
            case 22:
                C0546Gt0 c0546Gt03 = (C0546Gt0) obj;
                O90.f(c0546Gt03, "prefs");
                Boolean bool = (Boolean) c0546Gt03.b(new LC0("test_mode_enabled"));
                return new C6546pu1(bool != null ? bool.booleanValue() : false);
            case 23:
                C0546Gt0 c0546Gt04 = (C0546Gt0) obj;
                O90.f(c0546Gt04, "prefs");
                Integer num = (Integer) c0546Gt04.b(new LC0("last_notification_id"));
                if (num != null) {
                    return new C1332Qv1(num.intValue());
                }
                return null;
            case 24:
                Context context3 = (Context) obj;
                O90.f(context3, "$this$$receiver");
                C3860fu1.a.getClass();
                return (InterfaceC3729fD) C3860fu1.e.getValue(context3, C3860fu1.b[2]);
            case 25:
                C0546Gt0 c0546Gt05 = (C0546Gt0) obj;
                O90.f(c0546Gt05, "prefs");
                String str5 = (String) c0546Gt05.b(new LC0("push_token"));
                if (str5 != null) {
                    return new C6155nr1(str5);
                }
                return null;
            case 26:
                Exception exc6 = (Exception) obj;
                O90.f(exc6, "it");
                return new PS0(RQ1.b(exc6));
            case 27:
                Context context4 = (Context) obj;
                O90.f(context4, "$this$$receiver");
                C3860fu1.a.getClass();
                return (InterfaceC3729fD) C3860fu1.e.getValue(context4, C3860fu1.b[2]);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C0546Gt0 c0546Gt06 = (C0546Gt0) obj;
                O90.f(c0546Gt06, "prefs");
                String str6 = (String) c0546Gt06.b(new LC0("last_delivered_push_token"));
                if (str6 == null) {
                    return null;
                }
                Boolean bool2 = (Boolean) c0546Gt06.b(new LC0("push_token_delivered_to_client_app"));
                return new C7491ur1(str6, bool2 != null ? bool2.booleanValue() : false);
            default:
                O90.f((C1498Sz) obj, "it");
                return AbstractC5871mM1.a(new MC0[0]);
        }
    }
}
