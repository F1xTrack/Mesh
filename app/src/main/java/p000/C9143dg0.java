package p000;

import android.widget.EditText;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;

/* renamed from: dg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9143dg0 {

    /* renamed from: a */
    public final EditText f26203a;

    /* renamed from: b */
    public final C0788MW f26204b;

    /* renamed from: c */
    public int f26205c;

    /* renamed from: d */
    public int f26206d;

    /* renamed from: e */
    public int f26207e;

    /* renamed from: f */
    public final ViewTreeObserverOnPreDrawListenerC6651pz f26208f;

    public C9143dg0(EditText editText, C0788MW c0788mw) {
        O90.m5968f(editText, "editText");
        O90.m5968f(c0788mw, NotificationConstants.ACTION);
        this.f26203a = editText;
        this.f26204b = c0788mw;
        this.f26205c = -1;
        this.f26206d = -1;
        this.f26207e = -1;
        this.f26208f = new ViewTreeObserverOnPreDrawListenerC6651pz(1, this);
    }
}
