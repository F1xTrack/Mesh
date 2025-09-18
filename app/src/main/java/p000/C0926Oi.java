package p000;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: Oi */
/* loaded from: classes.dex */
public final class C0926Oi implements InterfaceC1540YT, InterfaceC9355fK0, InterfaceC9305ex0, InterfaceC11776yG0, InterfaceC8490Wq0 {

    /* renamed from: a */
    public final /* synthetic */ int f8574a;

    /* renamed from: b */
    public boolean f8575b;

    /* renamed from: c */
    public Object f8576c;

    public /* synthetic */ C0926Oi(int i, Object obj) {
        this.f8574a = i;
        this.f8576c = obj;
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: a */
    public void mo6117a(File file) {
        C4167hF c4167hF;
        C7295zw c7295zwM18786a;
        if (this.f8575b && (c7295zwM18786a = C4167hF.m18786a((c4167hF = (C4167hF) this.f8576c), file)) != null) {
            String str = c7295zwM18786a.f47104b;
            if (str != ".tmp") {
                ML1.m5338e(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            c4167hF.f28336e.getClass();
            if (jLastModified > System.currentTimeMillis() - C4167hF.f28330f) {
                return;
            }
        }
        file.delete();
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: b */
    public void mo6118b(File file) {
        if (this.f8575b || !file.equals(((C4167hF) this.f8576c).f28334c)) {
            return;
        }
        this.f8575b = true;
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: c */
    public void mo6119c(File file) {
        C4167hF c4167hF = (C4167hF) this.f8576c;
        if (!c4167hF.f28332a.equals(file) && !this.f8575b) {
            file.delete();
        }
        if (this.f8575b && file.equals(c4167hF.f28334c)) {
            this.f8575b = false;
        }
    }

    @Override // p000.InterfaceC11776yG0
    /* renamed from: d */
    public void mo2291d(C9723iC0 c9723iC0, int i) {
        boolean z = this.f8575b;
        StringBuilder sb = (StringBuilder) this.f8576c;
        if (z) {
            this.f8575b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    /* renamed from: e */
    public void m6120e(int i) {
        YN1.m9281f(!this.f8575b);
        ((SparseBooleanArray) this.f8576c).append(i, true);
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: f */
    public void mo1906f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        C6527o2 c6527o2;
        if (this.f8575b) {
            return;
        }
        this.f8575b = true;
        C9262eb1 c9262eb1 = (C9262eb1) this.f8576c;
        ActionMenuView actionMenuView = c9262eb1.f26763a.f27862a.f15889a;
        if (actionMenuView != null && (c6527o2 = actionMenuView.f15846t) != null) {
            c6527o2.m23311b();
            C6338l2 c6338l2 = c6527o2.f38709t;
            if (c6338l2 != null && c6338l2.m7121b()) {
                c6338l2.f10453i.dismiss();
            }
        }
        c9262eb1.f26764b.onPanelClosed(108, menuC7450Cq0);
        this.f8575b = false;
    }

    /* renamed from: g */
    public C1353VV m6121g() {
        YN1.m9281f(!this.f8575b);
        this.f8575b = true;
        return new C1353VV((SparseBooleanArray) this.f8576c);
    }

    /* renamed from: h */
    public HashMap m6122h() {
        if (!this.f8575b) {
            throw new IllegalStateException("Underlying map has already been built");
        }
        this.f8575b = false;
        return (HashMap) this.f8576c;
    }

    /* renamed from: i */
    public boolean m6123i() {
        return this.f8575b;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0036  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6124j(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            r0 = 1
            if (r8 == 0) goto L44
            if (r7 < 0) goto L44
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f8576c
            OJ1 r1 = (p000.OJ1) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.m6123i()
            return r7
        L17:
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L1b:
            if (r3 >= r7) goto L39
            if (r4 != r2) goto L39
            char r4 = r8.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            Oi r5 = p000.AbstractC10102l91.f36924a
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L37
        L34:
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r0 = r6.m6123i()
            goto L43
        L42:
            r0 = r1
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0926Oi.m6124j(int, java.lang.CharSequence):boolean");
    }

    /* renamed from: k */
    public void m6125k(Object obj, Serializable serializable) {
        if (!this.f8575b) {
            throw new IllegalStateException("Underlying map has already been built");
        }
        ((HashMap) this.f8576c).put(obj, serializable);
    }

    /* renamed from: l */
    public synchronized void m6126l(InterfaceC10011kS0 interfaceC10011kS0, boolean z) {
        try {
            if (this.f8575b || z) {
                ((Handler) this.f8576c).obtainMessage(1, interfaceC10011kS0).sendToTarget();
            } else {
                this.f8575b = true;
                interfaceC10011kS0.recycle();
                this.f8575b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: q0 */
    public boolean mo1907q0(MenuC7450Cq0 menuC7450Cq0) {
        ((C9262eb1) this.f8576c).f26764b.onMenuOpened(108, menuC7450Cq0);
        return true;
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        this.f8575b = true;
        C11287uQ0 c11287uQ0 = (C11287uQ0) this.f8576c;
        c11287uQ0.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c11287uQ0.f43693a;
        signInHubActivity.setResult(signInHubActivity.f18043i, signInHubActivity.f18044j);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.f8574a) {
            case 5:
                return "Metadata{mIsReversedHorizontal=" + this.f8575b + ", mIsReversedVertical=false, mLocation=" + ((Location) this.f8576c) + "}";
            case 6:
                return ((C11287uQ0) this.f8576c).toString();
            case 7:
                return this.f8575b ? "FALL_THROUGH" : String.valueOf(this.f8576c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0926Oi(int i, boolean z) {
        this.f8574a = i;
    }

    public /* synthetic */ C0926Oi(Object obj, boolean z, int i) {
        this.f8574a = i;
        this.f8576c = obj;
        this.f8575b = z;
    }

    public C0926Oi(int i) {
        this.f8574a = i;
        switch (i) {
            case 10:
                this.f8576c = new Handler(Looper.getMainLooper(), new C0421Gg(2));
                break;
            default:
                this.f8576c = new SparseBooleanArray();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0926Oi(OJ1 oj1, boolean z) {
        this(12, oj1);
        this.f8574a = 12;
        this.f8575b = z;
    }

    public C0926Oi(boolean z, String str) {
        this.f8574a = 11;
        this.f8575b = z;
        this.f8576c = str;
    }

    public C0926Oi(C11354ux1 c11354ux1, C11287uQ0 c11287uQ0) {
        this.f8574a = 6;
        this.f8575b = false;
        this.f8576c = c11287uQ0;
    }

    public C0926Oi(StringBuilder sb) {
        this.f8574a = 9;
        this.f8576c = sb;
        this.f8575b = true;
    }
}
