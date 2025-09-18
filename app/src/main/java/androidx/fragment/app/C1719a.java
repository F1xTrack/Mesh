package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import p000.AbstractC11153tN0;
import p000.AbstractC1607ZX;
import p000.AbstractC6750rY;
import p000.AbstractC6956uY;
import p000.C10817ql0;
import p000.C6893tY;
import p000.InterfaceC4186hY;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C1719a extends AbstractC6956uY implements InterfaceC4186hY {

    /* renamed from: q */
    public final AbstractC1733o f16158q;

    /* renamed from: r */
    public boolean f16159r;

    /* renamed from: s */
    public int f16160s;

    public C1719a(AbstractC1733o abstractC1733o) {
        abstractC1733o.m10042F();
        AbstractC1607ZX abstractC1607ZX = abstractC1733o.f16232t;
        if (abstractC1607ZX != null) {
            abstractC1607ZX.f14957b.getClassLoader();
        }
        this.f43732a = new ArrayList();
        this.f43746o = false;
        this.f16160s = -1;
        this.f16158q = abstractC1733o;
    }

    @Override // p000.InterfaceC4186hY
    /* renamed from: a */
    public final boolean mo10012a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f43738g) {
            return true;
        }
        AbstractC1733o abstractC1733o = this.f16158q;
        if (abstractC1733o.f16216d == null) {
            abstractC1733o.f16216d = new ArrayList();
        }
        abstractC1733o.f16216d.add(this);
        return true;
    }

    @Override // p000.AbstractC6956uY
    /* renamed from: c */
    public final void mo10013c(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            AbstractC6750rY.m24400c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(AbstractC11153tN0.m24914z(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m25200b(new C6893tY(fragment, i2));
        fragment.mFragmentManager = this.f16158q;
    }

    /* renamed from: e */
    public final void m10014e(int i) {
        if (this.f43738g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.f43732a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6893tY c6893tY = (C6893tY) arrayList.get(i2);
                Fragment fragment = c6893tY.f43125b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c6893tY.f43125b);
                        int i3 = c6893tY.f43125b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final int m10015f(boolean z) {
        if (this.f16159r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C10817ql0());
            m10017h("  ", printWriter, true);
            printWriter.close();
        }
        this.f16159r = true;
        boolean z2 = this.f43738g;
        AbstractC1733o abstractC1733o = this.f16158q;
        if (z2) {
            this.f16160s = abstractC1733o.f16221i.getAndIncrement();
        } else {
            this.f16160s = -1;
        }
        abstractC1733o.m10086v(this, z);
        return this.f16160s;
    }

    /* renamed from: g */
    public final void m10016g() {
        if (this.f43738g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f16158q.m10089y(this, true);
    }

    /* renamed from: h */
    public final void m10017h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f43739h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16160s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16159r);
            if (this.f43737f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f43737f));
            }
            if (this.f43733b != 0 || this.f43734c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f43733b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f43734c));
            }
            if (this.f43735d != 0 || this.f43736e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f43735d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f43736e));
            }
            if (this.f43740i != 0 || this.f43741j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f43740i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f43741j);
            }
            if (this.f43742k != 0 || this.f43743l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f43742k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f43743l);
            }
        }
        ArrayList arrayList = this.f43732a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6893tY c6893tY = (C6893tY) arrayList.get(i);
            switch (c6893tY.f43124a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c6893tY.f43124a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c6893tY.f43125b);
            if (z) {
                if (c6893tY.f43127d != 0 || c6893tY.f43128e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c6893tY.f43127d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c6893tY.f43128e));
                }
                if (c6893tY.f43129f != 0 || c6893tY.f43130g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c6893tY.f43129f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c6893tY.f43130g));
                }
            }
        }
    }

    /* renamed from: i */
    public final C1719a m10018i(Fragment fragment) {
        AbstractC1733o abstractC1733o = fragment.mFragmentManager;
        if (abstractC1733o == null || abstractC1733o == this.f16158q) {
            m25200b(new C6893tY(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16160s >= 0) {
            sb.append(" #");
            sb.append(this.f16160s);
        }
        if (this.f43739h != null) {
            sb.append(" ");
            sb.append(this.f43739h);
        }
        sb.append("}");
        return sb.toString();
    }
}
