package defpackage;

import android.content.Context;

/* renamed from: lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5781lu0 {
    public static boolean a;
    public static final String[] b = {"A0001", "ONE A2001", "ONE A2003", "ONE A2005", "ONE E1001", "ONE E1003", "ONE E1005", "ONEPLUS A3000", "ONEPLUS SM-A3000", "ONEPLUS A3003", "ONEPLUS A3010", "ONEPLUS A5000", "ONEPLUS A5010", "ONEPLUS A6000", "ONEPLUS A6003"};

    public static synchronized void a() {
        if (!a) {
            C3354dF.c("native-imagetranscoder");
            a = true;
        }
    }

    public static final void b(C1145Ol0 c1145Ol0, boolean z) {
        Context context = c1145Ol0.getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        S91 s91 = (S91) context;
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(s91, c1145Ol0.getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C0246Cx0(s91.b, c1145Ol0.getId(), 0, z));
        }
    }
}
