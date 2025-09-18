package p000;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Arrays;

/* renamed from: Ce1 */
/* loaded from: classes2.dex */
public final class C7427Ce1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f1567e;

    /* renamed from: f */
    public static final C7427Ce1 f1546f = new C7427Ce1(1, 0);

    /* renamed from: g */
    public static final C7427Ce1 f1547g = new C7427Ce1(1, 1);

    /* renamed from: h */
    public static final C7427Ce1 f1548h = new C7427Ce1(1, 2);

    /* renamed from: i */
    public static final C7427Ce1 f1549i = new C7427Ce1(1, 3);

    /* renamed from: j */
    public static final C7427Ce1 f1550j = new C7427Ce1(1, 4);

    /* renamed from: k */
    public static final C7427Ce1 f1551k = new C7427Ce1(1, 5);

    /* renamed from: l */
    public static final C7427Ce1 f1552l = new C7427Ce1(1, 6);

    /* renamed from: m */
    public static final C7427Ce1 f1553m = new C7427Ce1(1, 7);

    /* renamed from: n */
    public static final C7427Ce1 f1554n = new C7427Ce1(1, 8);

    /* renamed from: o */
    public static final C7427Ce1 f1555o = new C7427Ce1(1, 9);

    /* renamed from: p */
    public static final C7427Ce1 f1556p = new C7427Ce1(1, 10);

    /* renamed from: q */
    public static final C7427Ce1 f1557q = new C7427Ce1(1, 11);

    /* renamed from: r */
    public static final C7427Ce1 f1558r = new C7427Ce1(1, 12);

    /* renamed from: s */
    public static final C7427Ce1 f1559s = new C7427Ce1(1, 13);

    /* renamed from: t */
    public static final C7427Ce1 f1560t = new C7427Ce1(1, 14);

    /* renamed from: u */
    public static final C7427Ce1 f1561u = new C7427Ce1(1, 15);

    /* renamed from: v */
    public static final C7427Ce1 f1562v = new C7427Ce1(1, 16);

    /* renamed from: w */
    public static final C7427Ce1 f1563w = new C7427Ce1(1, 17);

    /* renamed from: x */
    public static final C7427Ce1 f1564x = new C7427Ce1(1, 18);

    /* renamed from: y */
    public static final C7427Ce1 f1565y = new C7427Ce1(1, 19);

    /* renamed from: z */
    public static final C7427Ce1 f1566z = new C7427Ce1(1, 20);

    /* renamed from: A */
    public static final C7427Ce1 f1537A = new C7427Ce1(1, 21);

    /* renamed from: B */
    public static final C7427Ce1 f1538B = new C7427Ce1(1, 22);

    /* renamed from: C */
    public static final C7427Ce1 f1539C = new C7427Ce1(1, 23);

    /* renamed from: D */
    public static final C7427Ce1 f1540D = new C7427Ce1(1, 24);

    /* renamed from: E */
    public static final C7427Ce1 f1541E = new C7427Ce1(1, 25);

    /* renamed from: F */
    public static final C7427Ce1 f1542F = new C7427Ce1(1, 26);

    /* renamed from: G */
    public static final C7427Ce1 f1543G = new C7427Ce1(1, 27);

    /* renamed from: H */
    public static final C7427Ce1 f1544H = new C7427Ce1(1, 28);

    /* renamed from: I */
    public static final C7427Ce1 f1545I = new C7427Ce1(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7427Ce1(int i, int i2) {
        super(i);
        this.f1567e = i2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        boolean z = true;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        switch (this.f1567e) {
            case 0:
                AbstractC8315Tg1 abstractC8315Tg1 = (AbstractC8315Tg1) obj;
                O90.m5968f(abstractC8315Tg1, "it");
                InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC8315Tg1.mo3797E().mo1962a();
                if (interfaceC0873NsMo1962a != null) {
                    if (!(interfaceC0873NsMo1962a instanceof InterfaceC7633Gd1) && !(interfaceC0873NsMo1962a instanceof InterfaceC10292me1)) {
                        z = false;
                    }
                    z = z;
                }
                return Boolean.valueOf(z);
            case 1:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 2:
                O90.m5968f((WritableMap) obj, "$this$null");
                return c8313Tf1;
            case 3:
                C10891rK0 c10891rK0 = (C10891rK0) obj;
                if (c10891rK0 != null) {
                    c10891rK0.m24295J();
                }
                return c8313Tf1;
            case 4:
                C10891rK0 c10891rK02 = (C10891rK0) obj;
                if (c10891rK02 != null) {
                    c10891rK02.m24296K();
                }
                return c8313Tf1;
            case 5:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new C6653q0(3, viewGroup);
                }
                return null;
            case 6:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "it");
                return !(th instanceof CQ0) ? new AQ0(th) : (CQ0) th;
            case 7:
                O90.m5968f((Throwable) obj, "it");
                return c8313Tf1;
            case 8:
                Exception exc = (Exception) obj;
                O90.m5968f(exc, "it");
                return new PS0(RQ1.m7015b(exc));
            case 9:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 10:
                Exception exc2 = (Exception) obj;
                O90.m5968f(exc2, "it");
                return new PS0(RQ1.m7015b(exc2));
            case 11:
                Exception exc3 = (Exception) obj;
                O90.m5968f(exc3, "it");
                return new PS0(RQ1.m7015b(exc3));
            case 12:
                String str = (String) obj;
                O90.m5968f(str, "packageName");
                return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
            case 13:
                String str2 = (String) obj;
                O90.m5968f(str2, "packageName");
                return new ComponentName(str2, "com.vk.push.pushsdk.ipc.PushService");
            case 14:
                Exception exc4 = (Exception) obj;
                O90.m5968f(exc4, "it");
                return new PS0(RQ1.m7015b(exc4));
            case 15:
                String str3 = (String) obj;
                O90.m5968f(str3, "packageName");
                return new ComponentName(str3, "com.vk.push.authsdk.ipc.AuthService");
            case 16:
                Context context = (Context) obj;
                O90.m5968f(context, "$this$$receiver");
                C9428fu1.f27451a.getClass();
                return (InterfaceC4039fD) C9428fu1.f27458h.getValue(context, C9428fu1.f27452b[5]);
            case 17:
                C7664Gt0 c7664Gt0 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt0, "prefs");
                Object objM3186b = c7664Gt0.m3186b(new LC0("master_host_pub"));
                Object objM3186b2 = c7664Gt0.m3186b(new LC0("master_host_package"));
                if (objM3186b == null || objM3186b2 == null) {
                    return null;
                }
                return new C9808is1((String) objM3186b2, (String) objM3186b);
            case 18:
                O90.m5968f((C1194Sz) obj, "it");
                return AbstractC10256mM1.m22812a(new MC0[0]);
            case 19:
                Context context2 = (Context) obj;
                O90.m5968f(context2, "$this$$receiver");
                C9428fu1.f27451a.getClass();
                return (InterfaceC4039fD) C9428fu1.f27458h.getValue(context2, C9428fu1.f27452b[5]);
            case 20:
                Exception exc5 = (Exception) obj;
                O90.m5968f(exc5, "it");
                return new PS0(RQ1.m7015b(exc5));
            case 21:
                C7664Gt0 c7664Gt02 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt02, "prefs");
                String str4 = (String) c7664Gt02.m3186b(new LC0("master_default_host"));
                if (str4 != null) {
                    return new C10576os1(str4);
                }
                return null;
            case 22:
                C7664Gt0 c7664Gt03 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt03, "prefs");
                Boolean bool = (Boolean) c7664Gt03.m3186b(new LC0("test_mode_enabled"));
                return new C10708pu1(bool != null ? bool.booleanValue() : false);
            case 23:
                C7664Gt0 c7664Gt04 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt04, "prefs");
                Integer num = (Integer) c7664Gt04.m3186b(new LC0("last_notification_id"));
                if (num != null) {
                    return new C8189Qv1(num.intValue());
                }
                return null;
            case 24:
                Context context3 = (Context) obj;
                O90.m5968f(context3, "$this$$receiver");
                C9428fu1.f27451a.getClass();
                return (InterfaceC4039fD) C9428fu1.f27455e.getValue(context3, C9428fu1.f27452b[2]);
            case 25:
                C7664Gt0 c7664Gt05 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt05, "prefs");
                String str5 = (String) c7664Gt05.m3186b(new LC0("push_token"));
                if (str5 != null) {
                    return new C10446nr1(str5);
                }
                return null;
            case 26:
                Exception exc6 = (Exception) obj;
                O90.m5968f(exc6, "it");
                return new PS0(RQ1.m7015b(exc6));
            case 27:
                Context context4 = (Context) obj;
                O90.m5968f(context4, "$this$$receiver");
                C9428fu1.f27451a.getClass();
                return (InterfaceC4039fD) C9428fu1.f27455e.getValue(context4, C9428fu1.f27452b[2]);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C7664Gt0 c7664Gt06 = (C7664Gt0) obj;
                O90.m5968f(c7664Gt06, "prefs");
                String str6 = (String) c7664Gt06.m3186b(new LC0("last_delivered_push_token"));
                if (str6 == null) {
                    return null;
                }
                Boolean bool2 = (Boolean) c7664Gt06.m3186b(new LC0("push_token_delivered_to_client_app"));
                return new C11342ur1(str6, bool2 != null ? bool2.booleanValue() : false);
            default:
                O90.m5968f((C1194Sz) obj, "it");
                return AbstractC10256mM1.m22812a(new MC0[0]);
        }
    }
}
