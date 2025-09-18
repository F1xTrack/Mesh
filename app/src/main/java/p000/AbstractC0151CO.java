package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: CO */
/* loaded from: classes.dex */
public abstract class AbstractC0151CO {

    /* renamed from: a */
    public final TextInputLayout f1350a;

    /* renamed from: b */
    public final C0088BO f1351b;

    /* renamed from: c */
    public final Context f1352c;

    /* renamed from: d */
    public final CheckableImageButton f1353d;

    public AbstractC0151CO(C0088BO c0088bo) {
        this.f1350a = c0088bo.f776a;
        this.f1351b = c0088bo;
        this.f1352c = c0088bo.getContext();
        this.f1353d = c0088bo.f782g;
    }

    /* renamed from: c */
    public int mo1162c() {
        return 0;
    }

    /* renamed from: d */
    public int mo1163d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo1164e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo1165f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo1166g() {
        return null;
    }

    /* renamed from: h */
    public C0267EE mo1167h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo1168i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo1169j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1170k() {
        return this instanceof C4237iM;
    }

    /* renamed from: l */
    public boolean mo1171l() {
        return false;
    }

    /* renamed from: q */
    public final void m1176q() {
        this.f1351b.m703f(false);
    }

    /* renamed from: a */
    public void mo1160a() {
    }

    /* renamed from: b */
    public void mo1161b() {
    }

    /* renamed from: r */
    public void mo1177r() {
    }

    /* renamed from: s */
    public void mo1178s() {
    }

    /* renamed from: m */
    public void mo1172m(EditText editText) {
    }

    /* renamed from: n */
    public void mo1173n(C1009Q1 c1009q1) {
    }

    /* renamed from: o */
    public void mo1174o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo1175p(boolean z) {
    }
}
