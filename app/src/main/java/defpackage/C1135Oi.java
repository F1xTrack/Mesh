package defpackage;

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
public final class C1135Oi implements YT, InterfaceC3751fK0, InterfaceC3677ex0, InterfaceC8140yG0, InterfaceC1784Wq0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ C1135Oi(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.YT
    public void a(File file) {
        C4117hF c4117hF;
        C8455zw c8455zwA;
        if (this.b && (c8455zwA = C4117hF.a((c4117hF = (C4117hF) this.c), file)) != null) {
            String str = c8455zwA.b;
            if (str != ".tmp") {
                ML1.e(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            c4117hF.e.getClass();
            if (jLastModified > System.currentTimeMillis() - C4117hF.f) {
                return;
            }
        }
        file.delete();
    }

    @Override // defpackage.YT
    public void b(File file) {
        if (this.b || !file.equals(((C4117hF) this.c).c)) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.YT
    public void c(File file) {
        C4117hF c4117hF = (C4117hF) this.c;
        if (!c4117hF.a.equals(file) && !this.b) {
            file.delete();
        }
        if (this.b && file.equals(c4117hF.c)) {
            this.b = false;
        }
    }

    @Override // defpackage.InterfaceC8140yG0
    public void d(C4300iC0 c4300iC0, int i) {
        boolean z = this.b;
        StringBuilder sb = (StringBuilder) this.c;
        if (z) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void e(int i) {
        YN1.f(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    @Override // defpackage.InterfaceC1784Wq0
    public void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        C6189o2 c6189o2;
        if (this.b) {
            return;
        }
        this.b = true;
        C3612eb1 c3612eb1 = (C3612eb1) this.c;
        ActionMenuView actionMenuView = c3612eb1.a.a.a;
        if (actionMenuView != null && (c6189o2 = actionMenuView.t) != null) {
            c6189o2.b();
            C5616l2 c5616l2 = c6189o2.t;
            if (c5616l2 != null && c5616l2.b()) {
                c5616l2.i.dismiss();
            }
        }
        c3612eb1.b.onPanelClosed(108, menuC0225Cq0);
        this.b = false;
    }

    public VV g() {
        YN1.f(!this.b);
        this.b = true;
        return new VV((SparseBooleanArray) this.c);
    }

    public HashMap h() {
        if (!this.b) {
            throw new IllegalStateException("Underlying map has already been built");
        }
        this.b = false;
        return (HashMap) this.c;
    }

    public boolean i() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            r0 = 1
            if (r8 == 0) goto L44
            if (r7 < 0) goto L44
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.c
            OJ1 r1 = (defpackage.OJ1) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.i()
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
            Oi r5 = defpackage.AbstractC5641l91.a
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
            boolean r0 = r6.i()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1135Oi.j(int, java.lang.CharSequence):boolean");
    }

    public void k(Object obj, Serializable serializable) {
        if (!this.b) {
            throw new IllegalStateException("Underlying map has already been built");
        }
        ((HashMap) this.c).put(obj, serializable);
    }

    public synchronized void l(InterfaceC5506kS0 interfaceC5506kS0, boolean z) {
        try {
            if (this.b || z) {
                ((Handler) this.c).obtainMessage(1, interfaceC5506kS0).sendToTarget();
            } else {
                this.b = true;
                interfaceC5506kS0.recycle();
                this.b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1784Wq0
    public boolean q0(MenuC0225Cq0 menuC0225Cq0) {
        ((C3612eb1) this.c).b.onMenuOpened(108, menuC0225Cq0);
        return true;
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        this.b = true;
        C7409uQ0 c7409uQ0 = (C7409uQ0) this.c;
        c7409uQ0.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c7409uQ0.a;
        signInHubActivity.setResult(signInHubActivity.i, signInHubActivity.j);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "Metadata{mIsReversedHorizontal=" + this.b + ", mIsReversedVertical=false, mLocation=" + ((Location) this.c) + "}";
            case 6:
                return ((C7409uQ0) this.c).toString();
            case 7:
                return this.b ? "FALL_THROUGH" : String.valueOf(this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1135Oi(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ C1135Oi(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public C1135Oi(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.c = new Handler(Looper.getMainLooper(), new C0506Gg(2));
                break;
            default:
                this.c = new SparseBooleanArray();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1135Oi(OJ1 oj1, boolean z) {
        this(12, oj1);
        this.a = 12;
        this.b = z;
    }

    public C1135Oi(boolean z, String str) {
        this.a = 11;
        this.b = z;
        this.c = str;
    }

    public C1135Oi(C7509ux1 c7509ux1, C7409uQ0 c7409uQ0) {
        this.a = 6;
        this.b = false;
        this.c = c7409uQ0;
    }

    public C1135Oi(StringBuilder sb) {
        this.a = 9;
        this.c = sb;
        this.b = true;
    }
}
