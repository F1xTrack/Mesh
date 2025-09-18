package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class OO0 {

    /* renamed from: t */
    public static final List f8407t = Collections.emptyList();

    /* renamed from: a */
    public final View f8408a;

    /* renamed from: b */
    public WeakReference f8409b;

    /* renamed from: j */
    public int f8417j;

    /* renamed from: r */
    public RecyclerView f8425r;

    /* renamed from: s */
    public AbstractC10899rO0 f8426s;

    /* renamed from: c */
    public int f8410c = -1;

    /* renamed from: d */
    public int f8411d = -1;

    /* renamed from: e */
    public long f8412e = -1;

    /* renamed from: f */
    public int f8413f = -1;

    /* renamed from: g */
    public int f8414g = -1;

    /* renamed from: h */
    public OO0 f8415h = null;

    /* renamed from: i */
    public OO0 f8416i = null;

    /* renamed from: k */
    public final ArrayList f8418k = null;

    /* renamed from: l */
    public final List f8419l = null;

    /* renamed from: m */
    public int f8420m = 0;

    /* renamed from: n */
    public FO0 f8421n = null;

    /* renamed from: o */
    public boolean f8422o = false;

    /* renamed from: p */
    public int f8423p = 0;

    /* renamed from: q */
    public int f8424q = -1;

    public OO0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f8408a = view;
    }

    /* renamed from: a */
    public final void m6044a(int i) {
        this.f8417j = i | this.f8417j;
    }

    /* renamed from: b */
    public final int m6045b() {
        int i = this.f8414g;
        return i == -1 ? this.f8410c : i;
    }

    /* renamed from: c */
    public final List m6046c() {
        ArrayList arrayList;
        return ((this.f8417j & 1024) != 0 || (arrayList = this.f8418k) == null || arrayList.size() == 0) ? f8407t : this.f8419l;
    }

    /* renamed from: d */
    public final boolean m6047d(int i) {
        return (i & this.f8417j) != 0;
    }

    /* renamed from: e */
    public final boolean m6048e() {
        View view = this.f8408a;
        return (view.getParent() == null || view.getParent() == this.f8425r) ? false : true;
    }

    /* renamed from: f */
    public final boolean m6049f() {
        return (this.f8417j & 1) != 0;
    }

    /* renamed from: g */
    public final boolean m6050g() {
        return (this.f8417j & 4) != 0;
    }

    /* renamed from: h */
    public final boolean m6051h() {
        if ((this.f8417j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (!this.f8408a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m6052i() {
        return (this.f8417j & 8) != 0;
    }

    /* renamed from: j */
    public final boolean m6053j() {
        return this.f8421n != null;
    }

    /* renamed from: k */
    public final boolean m6054k() {
        return (this.f8417j & 256) != 0;
    }

    /* renamed from: l */
    public final boolean m6055l() {
        return (this.f8417j & 2) != 0;
    }

    /* renamed from: m */
    public final void m6056m(int i, boolean z) {
        if (this.f8411d == -1) {
            this.f8411d = this.f8410c;
        }
        if (this.f8414g == -1) {
            this.f8414g = this.f8410c;
        }
        if (z) {
            this.f8414g += i;
        }
        this.f8410c += i;
        View view = this.f8408a;
        if (view.getLayoutParams() != null) {
            ((AO0) view.getLayoutParams()).f184c = true;
        }
    }

    /* renamed from: n */
    public final void m6057n() {
        if (RecyclerView.f16450L1 && m6054k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f8417j = 0;
        this.f8410c = -1;
        this.f8411d = -1;
        this.f8412e = -1L;
        this.f8414g = -1;
        this.f8420m = 0;
        this.f8415h = null;
        this.f8416i = null;
        ArrayList arrayList = this.f8418k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f8417j &= -1025;
        this.f8423p = 0;
        this.f8424q = -1;
        RecyclerView.m10233l(this);
    }

    /* renamed from: o */
    public final void m6058o(boolean z) {
        int i = this.f8420m;
        int i2 = z ? i - 1 : i + 1;
        this.f8420m = i2;
        if (i2 < 0) {
            this.f8420m = 0;
            if (RecyclerView.f16450L1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z && i2 == 1) {
            this.f8417j |= 16;
        } else if (z && i2 == 0) {
            this.f8417j &= -17;
        }
        if (RecyclerView.f16451M1) {
            toString();
        }
    }

    /* renamed from: p */
    public final boolean m6059p() {
        return (this.f8417j & 128) != 0;
    }

    /* renamed from: q */
    public final boolean m6060q() {
        return (this.f8417j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM5762k.append(Integer.toHexString(hashCode()));
        sbM5762k.append(" position=");
        sbM5762k.append(this.f8410c);
        sbM5762k.append(" id=");
        sbM5762k.append(this.f8412e);
        sbM5762k.append(", oldPos=");
        sbM5762k.append(this.f8411d);
        sbM5762k.append(", pLpos:");
        sbM5762k.append(this.f8414g);
        StringBuilder sb = new StringBuilder(sbM5762k.toString());
        if (m6053j()) {
            sb.append(" scrap ");
            sb.append(this.f8422o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m6050g()) {
            sb.append(" invalid");
        }
        if (!m6049f()) {
            sb.append(" unbound");
        }
        if ((this.f8417j & 2) != 0) {
            sb.append(" update");
        }
        if (m6052i()) {
            sb.append(" removed");
        }
        if (m6059p()) {
            sb.append(" ignored");
        }
        if (m6054k()) {
            sb.append(" tmpDetached");
        }
        if (!m6051h()) {
            sb.append(" not recyclable(" + this.f8420m + ")");
        }
        if ((this.f8417j & 512) != 0 || m6050g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f8408a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
