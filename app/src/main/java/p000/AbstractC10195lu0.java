package p000;

import android.content.Context;

/* renamed from: lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10195lu0 {

    /* renamed from: a */
    public static boolean f37351a;

    /* renamed from: b */
    public static final String[] f37352b = {"A0001", "ONE A2001", "ONE A2003", "ONE A2005", "ONE E1001", "ONE E1003", "ONE E1005", "ONEPLUS A3000", "ONEPLUS SM-A3000", "ONEPLUS A3003", "ONEPLUS A3010", "ONEPLUS A5000", "ONEPLUS A5010", "ONEPLUS A6000", "ONEPLUS A6003"};

    /* renamed from: a */
    public static synchronized void m22592a() {
        if (!f37351a) {
            C3916dF.m17513c("native-imagetranscoder");
            f37351a = true;
        }
    }

    /* renamed from: b */
    public static final void m22593b(C8064Ol0 c8064Ol0, boolean z) {
        Context context = c8064Ol0.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        S91 s91 = (S91) context;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, c8064Ol0.getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C7464Cx0(s91.f10603b, c8064Ol0.getId(), 0, z));
        }
    }
}
